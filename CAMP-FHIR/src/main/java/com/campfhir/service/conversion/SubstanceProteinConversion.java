package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceProtein;
public class SubstanceProteinConversion 
{
	public org.hl7.fhir.r4.model.SubstanceProtein SubstanceProteins(SubstanceProtein s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceProtein substanceprotein = new org.hl7.fhir.r4.model.SubstanceProtein();

		/******************** id ********************************************************************************/
		substanceprotein.setId(s.getId());

		/******************** SbstncProtein_DisulfideLinkage ********************************************************************************/
		if(s.getSbstncProteinDisulfideLinkage() != null) {
			substanceprotein.addDisulfideLinkage(s.getSbstncProteinDisulfideLinkage());
		}
		/******************** SbstncProtein_NmbrOfSubunts ********************************************************************************/
		if(s.getSbstncProteinNmbrOfSubunts() != null) {
			substanceprotein.setNumberOfSubunits(Integer.parseInt(s.getSbstncProteinNmbrOfSubunts()));
		}
		/******************** substanceproteinsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsequencetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substanceprotein.setSequenceType(substanceproteinsequencetype);

		/******************** substanceproteinsequencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceproteinsequencetypecoding =  new org.hl7.fhir.r4.model.Coding();
		substanceproteinsequencetype.addCoding(substanceproteinsequencetypecoding);

		/******************** SbstncProtein_SqncTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgCd() != null) {
			substanceproteinsequencetypecoding.setCode(s.getSbstncProteinSqncTypCdgCd());
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgDsply() != null) {
			substanceproteinsequencetypecoding.setDisplay(s.getSbstncProteinSqncTypCdgDsply());
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgSys() != null) {
			substanceproteinsequencetypecoding.setSystem(s.getSbstncProteinSqncTypCdgSys());
		}
		/******************** SbstncProtein_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgUsrSltd() != null) {
			substanceproteinsequencetypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncProteinSqncTypCdgUsrSltd()));
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgVrsn() != null) {
			substanceproteinsequencetypecoding.setVersion(s.getSbstncProteinSqncTypCdgVrsn());
		}
		/******************** SbstncProtein_SqncTyp_Txt ********************************************************************************/
		if(s.getSbstncProteinSqncTypTxt() != null) {
			substanceproteinsequencetype.setText(s.getSbstncProteinSqncTypTxt());
		}
		/******************** substanceproteinsubunit ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent substanceproteinsubunit =  new org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent();
		substanceprotein.addSubunit(substanceproteinsubunit);

		/******************** SbstncProtein_Subunt_CtrminalModification ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModification() != null) {
			substanceproteinsubunit.setCTerminalModification(s.getSbstncProteinSubuntCtrminalModification());
		}
		/******************** substanceproteinsubunitcterminalmodificationid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceproteinsubunitcterminalmodificationid =  new org.hl7.fhir.r4.model.Identifier();
		substanceproteinsubunit.setCTerminalModificationId(substanceproteinsubunitcterminalmodificationid);

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Assigner ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdAssigner() != null) {
			substanceproteinsubunitcterminalmodificationid.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncProteinSubuntCtrminalModificationIdAssigner()));
		}
		/******************** substanceproteinsubunitcterminalmodificationidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceproteinsubunitcterminalmodificationidperiod =  new org.hl7.fhir.r4.model.Period();
		substanceproteinsubunitcterminalmodificationid.setPeriod(substanceproteinsubunitcterminalmodificationidperiod);

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Prd_End ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncProtein_Subunt_CtrminalModificationId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncProtein_Subunt_CtrminalModificationId_Prd_Enddate = SbstncProtein_Subunt_CtrminalModificationId_Prd_Endsdf.parse(s.getSbstncProteinSubuntCtrminalModificationIdPrdEnd());
			substanceproteinsubunitcterminalmodificationidperiod.setEnd(SbstncProtein_Subunt_CtrminalModificationId_Prd_Enddate);
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Prd_Strt ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncProtein_Subunt_CtrminalModificationId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncProtein_Subunt_CtrminalModificationId_Prd_Strtdate = SbstncProtein_Subunt_CtrminalModificationId_Prd_Strtsdf.parse(s.getSbstncProteinSubuntCtrminalModificationIdPrdStrt());
			substanceproteinsubunitcterminalmodificationidperiod.setStart(SbstncProtein_Subunt_CtrminalModificationId_Prd_Strtdate);
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdSys() != null) {
			substanceproteinsubunitcterminalmodificationid.setSystem(s.getSbstncProteinSubuntCtrminalModificationIdSys());
		}
		/******************** substanceproteinsubunitcterminalmodificationidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsubunitcterminalmodificationidtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substanceproteinsubunitcterminalmodificationid.setType(substanceproteinsubunitcterminalmodificationidtype);

		/******************** substanceproteinsubunitcterminalmodificationidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceproteinsubunitcterminalmodificationidtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substanceproteinsubunitcterminalmodificationidtype.addCoding(substanceproteinsubunitcterminalmodificationidtypecoding);

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgCd() != null) {
			substanceproteinsubunitcterminalmodificationidtypecoding.setCode(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgCd());
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgDsply() != null) {
			substanceproteinsubunitcterminalmodificationidtypecoding.setDisplay(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgDsply());
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgSys() != null) {
			substanceproteinsubunitcterminalmodificationidtypecoding.setSystem(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgSys());
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd() != null) {
			substanceproteinsubunitcterminalmodificationidtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd()));
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn() != null) {
			substanceproteinsubunitcterminalmodificationidtypecoding.setVersion(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn());
		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Txt ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypTxt() != null) {
			substanceproteinsubunitcterminalmodificationidtype.setText(s.getSbstncProteinSubuntCtrminalModificationIdTypTxt());
		}
		/******************** substanceproteinsubunitcterminalmodificationiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substanceproteinsubunitcterminalmodificationiduse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substanceproteinsubunitcterminalmodificationid.setUse(substanceproteinsubunitcterminalmodificationiduse.fromCode(s.getSbstncProteinSubuntCtrminalModificationIdUse()));

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Vl ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdVl() != null) {
			substanceproteinsubunitcterminalmodificationid.setValue(s.getSbstncProteinSubuntCtrminalModificationIdVl());
		}
		/******************** SbstncProtein_Subunt_Length ********************************************************************************/
		if(s.getSbstncProteinSubuntLength() != null) {
			substanceproteinsubunit.setLength(Integer.parseInt(s.getSbstncProteinSubuntLength()));
		}
		/******************** SbstncProtein_Subunt_NtrminalModification ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModification() != null) {
			substanceproteinsubunit.setNTerminalModification(s.getSbstncProteinSubuntNtrminalModification());
		}
		/******************** substanceproteinsubunitnterminalmodificationid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceproteinsubunitnterminalmodificationid =  new org.hl7.fhir.r4.model.Identifier();
		substanceproteinsubunit.setNTerminalModificationId(substanceproteinsubunitnterminalmodificationid);

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Assigner ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdAssigner() != null) {
			substanceproteinsubunitnterminalmodificationid.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSbstncProteinSubuntNtrminalModificationIdAssigner()));
		}
		/******************** substanceproteinsubunitnterminalmodificationidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceproteinsubunitnterminalmodificationidperiod =  new org.hl7.fhir.r4.model.Period();
		substanceproteinsubunitnterminalmodificationid.setPeriod(substanceproteinsubunitnterminalmodificationidperiod);

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Prd_End ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdPrdEnd() != null) {
			java.text.SimpleDateFormat SbstncProtein_Subunt_NtrminalModificationId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncProtein_Subunt_NtrminalModificationId_Prd_Enddate = SbstncProtein_Subunt_NtrminalModificationId_Prd_Endsdf.parse(s.getSbstncProteinSubuntNtrminalModificationIdPrdEnd());
			substanceproteinsubunitnterminalmodificationidperiod.setEnd(SbstncProtein_Subunt_NtrminalModificationId_Prd_Enddate);
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Prd_Strt ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdPrdStrt() != null) {
			java.text.SimpleDateFormat SbstncProtein_Subunt_NtrminalModificationId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncProtein_Subunt_NtrminalModificationId_Prd_Strtdate = SbstncProtein_Subunt_NtrminalModificationId_Prd_Strtsdf.parse(s.getSbstncProteinSubuntNtrminalModificationIdPrdStrt());
			substanceproteinsubunitnterminalmodificationidperiod.setStart(SbstncProtein_Subunt_NtrminalModificationId_Prd_Strtdate);
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdSys() != null) {
			substanceproteinsubunitnterminalmodificationid.setSystem(s.getSbstncProteinSubuntNtrminalModificationIdSys());
		}
		/******************** substanceproteinsubunitnterminalmodificationidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsubunitnterminalmodificationidtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		substanceproteinsubunitnterminalmodificationid.setType(substanceproteinsubunitnterminalmodificationidtype);

		/******************** substanceproteinsubunitnterminalmodificationidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceproteinsubunitnterminalmodificationidtypecoding =  new org.hl7.fhir.r4.model.Coding();
		substanceproteinsubunitnterminalmodificationidtype.addCoding(substanceproteinsubunitnterminalmodificationidtypecoding);

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgCd() != null) {
			substanceproteinsubunitnterminalmodificationidtypecoding.setCode(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgCd());
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgDsply() != null) {
			substanceproteinsubunitnterminalmodificationidtypecoding.setDisplay(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgDsply());
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgSys() != null) {
			substanceproteinsubunitnterminalmodificationidtypecoding.setSystem(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgSys());
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd() != null) {
			substanceproteinsubunitnterminalmodificationidtypecoding.setUserSelected(Boolean.parseBoolean(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd()));
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn() != null) {
			substanceproteinsubunitnterminalmodificationidtypecoding.setVersion(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn());
		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Txt ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypTxt() != null) {
			substanceproteinsubunitnterminalmodificationidtype.setText(s.getSbstncProteinSubuntNtrminalModificationIdTypTxt());
		}
		/******************** substanceproteinsubunitnterminalmodificationiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory substanceproteinsubunitnterminalmodificationiduse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		substanceproteinsubunitnterminalmodificationid.setUse(substanceproteinsubunitnterminalmodificationiduse.fromCode(s.getSbstncProteinSubuntNtrminalModificationIdUse()));

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Vl ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdVl() != null) {
			substanceproteinsubunitnterminalmodificationid.setValue(s.getSbstncProteinSubuntNtrminalModificationIdVl());
		}
		/******************** SbstncProtein_Subunt_Sqnc ********************************************************************************/
		if(s.getSbstncProteinSubuntSqnc() != null) {
			substanceproteinsubunit.setSequence(s.getSbstncProteinSubuntSqnc());
		}
		/******************** substanceproteinsubunitsequenceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substanceproteinsubunitsequenceattachment =  new org.hl7.fhir.r4.model.Attachment();
		substanceproteinsubunit.setSequenceAttachment(substanceproteinsubunitsequenceattachment);

		/******************** SbstncProtein_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntCntntTyp() != null) {
			substanceproteinsubunitsequenceattachment.setContentType(s.getSbstncProteinSubuntSqncAttchmntCntntTyp());
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntCreation() != null) {
			java.text.SimpleDateFormat SbstncProtein_Subunt_SqncAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SbstncProtein_Subunt_SqncAttchmnt_Creationdate = SbstncProtein_Subunt_SqncAttchmnt_Creationsdf.parse(s.getSbstncProteinSubuntSqncAttchmntCreation());
			substanceproteinsubunitsequenceattachment.setCreation(SbstncProtein_Subunt_SqncAttchmnt_Creationdate);
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntData() != null) {
			substanceproteinsubunitsequenceattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncProteinSubuntSqncAttchmntData()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntHash() != null) {
			substanceproteinsubunitsequenceattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(s.getSbstncProteinSubuntSqncAttchmntHash()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntLnguage() != null) {
			substanceproteinsubunitsequenceattachment.setLanguage(s.getSbstncProteinSubuntSqncAttchmntLnguage());
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntSz() != null) {
			substanceproteinsubunitsequenceattachment.setSize(Integer.parseInt(s.getSbstncProteinSubuntSqncAttchmntSz()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntTtl() != null) {
			substanceproteinsubunitsequenceattachment.setTitle(s.getSbstncProteinSubuntSqncAttchmntTtl());
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntUrl() != null) {
			substanceproteinsubunitsequenceattachment.setUrl(s.getSbstncProteinSubuntSqncAttchmntUrl());
		}
		/******************** SbstncProtein_Subunt_Subunt ********************************************************************************/
		if(s.getSbstncProteinSubuntSubunt() != null) {
			substanceproteinsubunit.setSubunit(Integer.parseInt(s.getSbstncProteinSubuntSubunt()));
		}
		return substanceprotein;
	}
}
