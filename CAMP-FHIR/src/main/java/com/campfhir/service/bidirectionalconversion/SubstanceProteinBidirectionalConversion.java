package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceProtein;
public class SubstanceProteinBidirectionalConversion 
{
	public SubstanceProtein SubstanceProteins(org.hl7.fhir.r4.model.SubstanceProtein substanceprotein) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceProtein s = new  main.java.com.campfhir.model.SubstanceProtein();

		/******************** id ********************************************************************************/
		substanceprotein.setId(s.getId());

		/******************** substanceproteinsubunit ********************************************************************************/
		org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent substanceproteinsubunit = substanceprotein.getSubunitFirstRep();

		/******************** SbstncProtein_Subunt_Length ********************************************************************************/
		if(substanceproteinsubunit.hasLength()) {
			s.setSbstncProteinSubuntLength(String.valueOf(substanceproteinsubunit.getLength()));
		}
		/******************** substanceproteinsubunitnterminalmodificationid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceproteinsubunitnterminalmodificationid = substanceproteinsubunit.getNTerminalModificationId();

		/******************** SbstncProtein_Subunt_NTrminalModificationId_Vl ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationid.hasValue()) {
			s.setSbstncProteinSubuntNtrminalModificationIdVl(String.valueOf(substanceproteinsubunitnterminalmodificationid.getValue()));
		}
		/******************** substanceproteinsubunitnterminalmodificationidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsubunitnterminalmodificationidtype = substanceproteinsubunitnterminalmodificationid.getType();

		/******************** substanceproteinsubunitnterminalmodificationidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceproteinsubunitnterminalmodificationidtypecoding = substanceproteinsubunitnterminalmodificationidtype.getCodingFirstRep();

		/******************** SbstncProtein_Subunt_NTrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasDisplay()) {
			s.setSbstncProteinSubuntNtrminalModificationIdTypCdgDsply(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getDisplay()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasVersion()) {
			s.setSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getVersion()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasCode()) {
			s.setSbstncProteinSubuntNtrminalModificationIdTypCdgCd(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getCode()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasSystem()) {
			s.setSbstncProteinSubuntNtrminalModificationIdTypCdgSys(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getSystem()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasUserSelected()) {
			s.setSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getUserSelected()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Typ_Txt ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtype.hasText()) {
			s.setSbstncProteinSubuntNtrminalModificationIdTypTxt(String.valueOf(substanceproteinsubunitnterminalmodificationidtype.getText()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Sys ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationid.hasSystem()) {
			s.setSbstncProteinSubuntNtrminalModificationIdSys(String.valueOf(substanceproteinsubunitnterminalmodificationid.getSystem()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Assigner ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationid.hasAssigner()) {
			s.setSbstncProteinSubuntNtrminalModificationIdAssigner(String.valueOf(substanceproteinsubunitnterminalmodificationid.getAssigner()));
		}
		/******************** substanceproteinsubunitnterminalmodificationidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceproteinsubunitnterminalmodificationidperiod = substanceproteinsubunitnterminalmodificationid.getPeriod();

		/******************** SbstncProtein_Subunt_NTrminalModificationId_Prd_End ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidperiod.hasEnd()) {
			s.setSbstncProteinSubuntNtrminalModificationIdPrdEnd(String.valueOf(substanceproteinsubunitnterminalmodificationidperiod.getEnd()));
		}
		/******************** SbstncProtein_Subunt_NTrminalModificationId_Prd_Strt ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidperiod.hasStart()) {
			s.setSbstncProteinSubuntNtrminalModificationIdPrdStrt(String.valueOf(substanceproteinsubunitnterminalmodificationidperiod.getStart()));
		}
		/******************** substanceproteinsubunitnterminalmodificationiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceproteinsubunitnterminalmodificationiduse = substanceproteinsubunitnterminalmodificationid.getUse();
		s.setSbstncProteinSubuntNtrminalModificationIdUse(substanceproteinsubunitnterminalmodificationiduse.toCode());

		/******************** substanceproteinsubunitsequenceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substanceproteinsubunitsequenceattachment = substanceproteinsubunit.getSequenceAttachment();

		/******************** SbstncProtein_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasSize()) {
			s.setSbstncProteinSubuntSqncAttchmntSz(String.valueOf(substanceproteinsubunitsequenceattachment.getSize()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasLanguage()) {
			s.setSbstncProteinSubuntSqncAttchmntLnguage(String.valueOf(substanceproteinsubunitsequenceattachment.getLanguage()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasContentType()) {
			s.setSbstncProteinSubuntSqncAttchmntCntntTyp(String.valueOf(substanceproteinsubunitsequenceattachment.getContentType()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasUrl()) {
			s.setSbstncProteinSubuntSqncAttchmntUrl(String.valueOf(substanceproteinsubunitsequenceattachment.getUrl()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasTitle()) {
			s.setSbstncProteinSubuntSqncAttchmntTtl(String.valueOf(substanceproteinsubunitsequenceattachment.getTitle()));
		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasHash()) {
			s.setSbstncProteinSubuntSqncAttchmntHash(String.valueOf(substanceproteinsubunitsequenceattachment.getHash()));
		}

		/******************** SbstncProtein_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasData()) {
			s.setSbstncProteinSubuntSqncAttchmntData(String.valueOf(substanceproteinsubunitsequenceattachment.getData()));
		}

		/******************** SbstncProtein_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(substanceproteinsubunitsequenceattachment.hasCreation()) {
			s.setSbstncProteinSubuntSqncAttchmntCreation(String.valueOf(substanceproteinsubunitsequenceattachment.getCreation()));
		}
		/******************** substanceproteinsubunitcterminalmodificationid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceproteinsubunitcterminalmodificationid = substanceproteinsubunit.getCTerminalModificationId();

		/******************** SbstncProtein_Subunt_CTrminalModificationId_Vl ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationid.hasValue()) {
			s.setSbstncProteinSubuntCtrminalModificationIdVl(String.valueOf(substanceproteinsubunitcterminalmodificationid.getValue()));
		}
		/******************** substanceproteinsubunitcterminalmodificationidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsubunitcterminalmodificationidtype = substanceproteinsubunitcterminalmodificationid.getType();

		/******************** substanceproteinsubunitcterminalmodificationidtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceproteinsubunitcterminalmodificationidtypecoding = substanceproteinsubunitcterminalmodificationidtype.getCodingFirstRep();

		/******************** SbstncProtein_Subunt_CTrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasDisplay()) {
			s.setSbstncProteinSubuntCtrminalModificationIdTypCdgDsply(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getDisplay()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasVersion()) {
			s.setSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getVersion()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasCode()) {
			s.setSbstncProteinSubuntCtrminalModificationIdTypCdgCd(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getCode()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasSystem()) {
			s.setSbstncProteinSubuntCtrminalModificationIdTypCdgSys(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getSystem()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasUserSelected()) {
			s.setSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getUserSelected()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Typ_Txt ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtype.hasText()) {
			s.setSbstncProteinSubuntCtrminalModificationIdTypTxt(String.valueOf(substanceproteinsubunitcterminalmodificationidtype.getText()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Sys ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationid.hasSystem()) {
			s.setSbstncProteinSubuntCtrminalModificationIdSys(String.valueOf(substanceproteinsubunitcterminalmodificationid.getSystem()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Assigner ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationid.hasAssigner()) {
			s.setSbstncProteinSubuntCtrminalModificationIdAssigner(String.valueOf(substanceproteinsubunitcterminalmodificationid.getAssigner()));
		}
		/******************** substanceproteinsubunitcterminalmodificationidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceproteinsubunitcterminalmodificationidperiod = substanceproteinsubunitcterminalmodificationid.getPeriod();

		/******************** SbstncProtein_Subunt_CTrminalModificationId_Prd_End ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidperiod.hasEnd()) {
			s.setSbstncProteinSubuntCtrminalModificationIdPrdEnd(String.valueOf(substanceproteinsubunitcterminalmodificationidperiod.getEnd()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModificationId_Prd_Strt ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidperiod.hasStart()) {
			s.setSbstncProteinSubuntCtrminalModificationIdPrdStrt(String.valueOf(substanceproteinsubunitcterminalmodificationidperiod.getStart()));
		}
		/******************** substanceproteinsubunitcterminalmodificationiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceproteinsubunitcterminalmodificationiduse = substanceproteinsubunitcterminalmodificationid.getUse();
		s.setSbstncProteinSubuntCtrminalModificationIdUse(substanceproteinsubunitcterminalmodificationiduse.toCode());

		/******************** SbstncProtein_Subunt_NTrminalModification ********************************************************************************/
		if(substanceproteinsubunit.hasNTerminalModification()) {
			s.setSbstncProteinSubuntNtrminalModification(String.valueOf(substanceproteinsubunit.getNTerminalModification()));
		}
		/******************** SbstncProtein_Subunt_CTrminalModification ********************************************************************************/
		if(substanceproteinsubunit.hasCTerminalModification()) {
			s.setSbstncProteinSubuntCtrminalModification(String.valueOf(substanceproteinsubunit.getCTerminalModification()));
		}
		/******************** SbstncProtein_Subunt_Sqnc ********************************************************************************/
		if(substanceproteinsubunit.hasSequence()) {
			s.setSbstncProteinSubuntSqnc(String.valueOf(substanceproteinsubunit.getSequence()));
		}
		/******************** substanceproteinsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsequencetype = substanceprotein.getSequenceType();

		/******************** substanceproteinsequencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding substanceproteinsequencetypecoding = substanceproteinsequencetype.getCodingFirstRep();

		/******************** SbstncProtein_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(substanceproteinsequencetypecoding.hasDisplay()) {
			s.setSbstncProteinSqncTypCdgDsply(String.valueOf(substanceproteinsequencetypecoding.getDisplay()));
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(substanceproteinsequencetypecoding.hasVersion()) {
			s.setSbstncProteinSqncTypCdgVrsn(String.valueOf(substanceproteinsequencetypecoding.getVersion()));
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Cd ********************************************************************************/
		if(substanceproteinsequencetypecoding.hasCode()) {
			s.setSbstncProteinSqncTypCdgCd(String.valueOf(substanceproteinsequencetypecoding.getCode()));
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Sys ********************************************************************************/
		if(substanceproteinsequencetypecoding.hasSystem()) {
			s.setSbstncProteinSqncTypCdgSys(String.valueOf(substanceproteinsequencetypecoding.getSystem()));
		}
		/******************** SbstncProtein_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(substanceproteinsequencetypecoding.hasUserSelected()) {
			s.setSbstncProteinSqncTypCdgUsrSltd(String.valueOf(substanceproteinsequencetypecoding.getUserSelected()));
		}
		/******************** SbstncProtein_SqncTyp_Txt ********************************************************************************/
		if(substanceproteinsequencetype.hasText()) {
			s.setSbstncProteinSqncTypTxt(String.valueOf(substanceproteinsequencetype.getText()));
		}
		/******************** SbstncProtein_NmbrOfSubunts ********************************************************************************/
		if(substanceprotein.hasNumberOfSubunits()) {
			s.setSbstncProteinNmbrOfSubunts(String.valueOf(substanceprotein.getNumberOfSubunits()));
		}
		return s;
	}
}
