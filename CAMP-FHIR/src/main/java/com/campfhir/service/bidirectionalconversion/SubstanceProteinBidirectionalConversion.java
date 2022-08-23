package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceProtein;
public class SubstanceProteinBidirectionalConversion 
{
	public SubstanceProtein SubstanceProteins(org.hl7.fhir.r4.model.SubstanceProtein substanceprotein) throws ParseException
	{
		 main.java.com.campfhir.model.SubstanceProtein s = new  main.java.com.campfhir.model.SubstanceProtein();

		/******************** id ********************************************************************************/
		s.setId(substanceprotein.getIdElement().getIdPart());

		/******************** SbstncProtein_NmbrOfSubunts ********************************************************************************/
		if(substanceprotein.hasNumberOfSubunits()) {

			s.addSbstncProteinNmbrOfSubunts(String.valueOf(substanceprotein.getNumberOfSubunits()));
		} else {
			s.addSbstncProteinNmbrOfSubunts("NULL");
		}


		/******************** SbstncProtein_DisulfideLinkage ********************************************************************************/
		if(substanceprotein.hasDisulfideLinkage()) {

			String  array = "[";
			for(int incr=0; incr<substanceprotein.getDisulfideLinkage().size(); incr++) {
				array = array + substanceprotein.getDisulfideLinkage().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSbstncProteinDisulfideLinkage(array);

		} else {
			s.addSbstncProteinDisulfideLinkage("NULL");
		}


		/******************** substanceproteinsequencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsequencetype = substanceprotein.getSequenceType();

		/******************** SbstncProtein_SqncTyp_Txt ********************************************************************************/
		if(substanceproteinsequencetype.hasText()) {

			s.addSbstncProteinSqncTypTxt(String.valueOf(substanceproteinsequencetype.getText()));
		} else {
			s.addSbstncProteinSqncTypTxt("NULL");
		}


		/******************** substanceproteinsequencetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substanceproteinsequencetypecodinglist = substanceproteinsequencetype.getCoding();
		for(int substanceproteinsequencetypecodingi = 0; substanceproteinsequencetypecodingi<substanceproteinsequencetypecodinglist.size();substanceproteinsequencetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substanceproteinsequencetypecoding = substanceproteinsequencetypecodinglist.get(substanceproteinsequencetypecodingi);

		/******************** SbstncProtein_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(substanceproteinsequencetypecodingi == 0) {s.addSbstncProteinSqncTypCdgDsply("[");}
		if(substanceproteinsequencetypecoding.hasDisplay()) {

			s.addSbstncProteinSqncTypCdgDsply(String.valueOf(substanceproteinsequencetypecoding.getDisplay()));
		} else {
			s.addSbstncProteinSqncTypCdgDsply("NULL");
		}

		if(substanceproteinsequencetypecodingi == substanceproteinsequencetypecodinglist.size()-1) {s.addSbstncProteinSqncTypCdgDsply("]");}


		/******************** SbstncProtein_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(substanceproteinsequencetypecodingi == 0) {s.addSbstncProteinSqncTypCdgVrsn("[");}
		if(substanceproteinsequencetypecoding.hasVersion()) {

			s.addSbstncProteinSqncTypCdgVrsn(String.valueOf(substanceproteinsequencetypecoding.getVersion()));
		} else {
			s.addSbstncProteinSqncTypCdgVrsn("NULL");
		}

		if(substanceproteinsequencetypecodingi == substanceproteinsequencetypecodinglist.size()-1) {s.addSbstncProteinSqncTypCdgVrsn("]");}


		/******************** SbstncProtein_SqncTyp_Cdg_Cd ********************************************************************************/
		if(substanceproteinsequencetypecodingi == 0) {s.addSbstncProteinSqncTypCdgCd("[");}
		if(substanceproteinsequencetypecoding.hasCode()) {

			s.addSbstncProteinSqncTypCdgCd(String.valueOf(substanceproteinsequencetypecoding.getCode()));
		} else {
			s.addSbstncProteinSqncTypCdgCd("NULL");
		}

		if(substanceproteinsequencetypecodingi == substanceproteinsequencetypecodinglist.size()-1) {s.addSbstncProteinSqncTypCdgCd("]");}


		/******************** SbstncProtein_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(substanceproteinsequencetypecodingi == 0) {s.addSbstncProteinSqncTypCdgUsrSltd("[");}
		if(substanceproteinsequencetypecoding.hasUserSelected()) {

			s.addSbstncProteinSqncTypCdgUsrSltd(String.valueOf(substanceproteinsequencetypecoding.getUserSelected()));
		} else {
			s.addSbstncProteinSqncTypCdgUsrSltd("NULL");
		}

		if(substanceproteinsequencetypecodingi == substanceproteinsequencetypecodinglist.size()-1) {s.addSbstncProteinSqncTypCdgUsrSltd("]");}


		/******************** SbstncProtein_SqncTyp_Cdg_Sys ********************************************************************************/
		if(substanceproteinsequencetypecodingi == 0) {s.addSbstncProteinSqncTypCdgSys("[");}
		if(substanceproteinsequencetypecoding.hasSystem()) {

			s.addSbstncProteinSqncTypCdgSys(String.valueOf(substanceproteinsequencetypecoding.getSystem()));
		} else {
			s.addSbstncProteinSqncTypCdgSys("NULL");
		}

		if(substanceproteinsequencetypecodingi == substanceproteinsequencetypecodinglist.size()-1) {s.addSbstncProteinSqncTypCdgSys("]");}


		 };
		/******************** substanceproteinsubunit ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent> substanceproteinsubunitlist = substanceprotein.getSubunit();
		for(int substanceproteinsubuniti = 0; substanceproteinsubuniti<substanceproteinsubunitlist.size();substanceproteinsubuniti++ ) {
		org.hl7.fhir.r4.model.SubstanceProtein.SubstanceProteinSubunitComponent  substanceproteinsubunit = substanceproteinsubunitlist.get(substanceproteinsubuniti);

		/******************** SbstncProtein_Subunt_Length ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntLength("[");}
		if(substanceproteinsubunit.hasLength()) {

			s.addSbstncProteinSubuntLength(String.valueOf(substanceproteinsubunit.getLength()));
		} else {
			s.addSbstncProteinSubuntLength("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntLength("]");}


		/******************** SbstncProtein_Subunt_Sqnc ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqnc("[");}
		if(substanceproteinsubunit.hasSequence()) {

			s.addSbstncProteinSubuntSqnc(String.valueOf(substanceproteinsubunit.getSequence()));
		} else {
			s.addSbstncProteinSubuntSqnc("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqnc("]");}


		/******************** SbstncProtein_Subunt_CtrminalModification ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModification("[");}
		if(substanceproteinsubunit.hasCTerminalModification()) {

			s.addSbstncProteinSubuntCtrminalModification(String.valueOf(substanceproteinsubunit.getCTerminalModification()));
		} else {
			s.addSbstncProteinSubuntCtrminalModification("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModification("]");}


		/******************** substanceproteinsubunitsequenceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment substanceproteinsubunitsequenceattachment = substanceproteinsubunit.getSequenceAttachment();

		/******************** SbstncProtein_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntSz("[");}
		if(substanceproteinsubunitsequenceattachment.hasSize()) {

			s.addSbstncProteinSubuntSqncAttchmntSz(String.valueOf(substanceproteinsubunitsequenceattachment.getSize()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntSz("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntSz("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntLnguage("[");}
		if(substanceproteinsubunitsequenceattachment.hasLanguage()) {

			s.addSbstncProteinSubuntSqncAttchmntLnguage(String.valueOf(substanceproteinsubunitsequenceattachment.getLanguage()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntLnguage("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntLnguage("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntCntntTyp("[");}
		if(substanceproteinsubunitsequenceattachment.hasContentType()) {

			s.addSbstncProteinSubuntSqncAttchmntCntntTyp(String.valueOf(substanceproteinsubunitsequenceattachment.getContentType()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntCntntTyp("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntCntntTyp("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntHash("[");}
		if(substanceproteinsubunitsequenceattachment.hasHash()) {

			s.addSbstncProteinSubuntSqncAttchmntHash(new String(substanceproteinsubunitsequenceattachment.getHash()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntHash("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntHash("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntData("[");}
		if(substanceproteinsubunitsequenceattachment.hasData()) {

			s.addSbstncProteinSubuntSqncAttchmntData(new String(substanceproteinsubunitsequenceattachment.getData()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntData("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntData("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntCreation("[");}
		if(substanceproteinsubunitsequenceattachment.hasCreation()) {

			s.addSbstncProteinSubuntSqncAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceproteinsubunitsequenceattachment.getCreation())+"\"");
		} else {
			s.addSbstncProteinSubuntSqncAttchmntCreation("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntCreation("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntTtl("[");}
		if(substanceproteinsubunitsequenceattachment.hasTitle()) {

			s.addSbstncProteinSubuntSqncAttchmntTtl(String.valueOf(substanceproteinsubunitsequenceattachment.getTitle()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntTtl("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntTtl("]");}


		/******************** SbstncProtein_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntSqncAttchmntUrl("[");}
		if(substanceproteinsubunitsequenceattachment.hasUrl()) {

			s.addSbstncProteinSubuntSqncAttchmntUrl(String.valueOf(substanceproteinsubunitsequenceattachment.getUrl()));
		} else {
			s.addSbstncProteinSubuntSqncAttchmntUrl("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntSqncAttchmntUrl("]");}


		/******************** SbstncProtein_Subunt_NtrminalModification ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModification("[");}
		if(substanceproteinsubunit.hasNTerminalModification()) {

			s.addSbstncProteinSubuntNtrminalModification(String.valueOf(substanceproteinsubunit.getNTerminalModification()));
		} else {
			s.addSbstncProteinSubuntNtrminalModification("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModification("]");}


		/******************** substanceproteinsubunitnterminalmodificationid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceproteinsubunitnterminalmodificationid = substanceproteinsubunit.getNTerminalModificationId();

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Vl ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModificationIdVl("[");}
		if(substanceproteinsubunitnterminalmodificationid.hasValue()) {

			s.addSbstncProteinSubuntNtrminalModificationIdVl(String.valueOf(substanceproteinsubunitnterminalmodificationid.getValue()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdVl("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdVl("]");}


		/******************** substanceproteinsubunitnterminalmodificationidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsubunitnterminalmodificationidtype = substanceproteinsubunitnterminalmodificationid.getType();

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Txt ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModificationIdTypTxt("[");}
		if(substanceproteinsubunitnterminalmodificationidtype.hasText()) {

			s.addSbstncProteinSubuntNtrminalModificationIdTypTxt(String.valueOf(substanceproteinsubunitnterminalmodificationidtype.getText()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdTypTxt("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdTypTxt("]");}


		/******************** substanceproteinsubunitnterminalmodificationidtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substanceproteinsubunitnterminalmodificationidtypecodinglist = substanceproteinsubunitnterminalmodificationidtype.getCoding();
		for(int substanceproteinsubunitnterminalmodificationidtypecodingi = 0; substanceproteinsubunitnterminalmodificationidtypecodingi<substanceproteinsubunitnterminalmodificationidtypecodinglist.size();substanceproteinsubunitnterminalmodificationidtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substanceproteinsubunitnterminalmodificationidtypecoding = substanceproteinsubunitnterminalmodificationidtypecodinglist.get(substanceproteinsubunitnterminalmodificationidtypecodingi);

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgDsply("[[");}
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasDisplay()) {

			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgDsply(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getDisplay()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgDsply("NULL");
		}

		if(substanceproteinsubunitnterminalmodificationidtypecodingi == substanceproteinsubunitnterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgDsply("]]");}


		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn("[[");}
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasVersion()) {

			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getVersion()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn("NULL");
		}

		if(substanceproteinsubunitnterminalmodificationidtypecodingi == substanceproteinsubunitnterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn("]]");}


		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgCd("[[");}
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasCode()) {

			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgCd(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getCode()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgCd("NULL");
		}

		if(substanceproteinsubunitnterminalmodificationidtypecodingi == substanceproteinsubunitnterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgCd("]]");}


		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd("[[");}
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasUserSelected()) {

			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getUserSelected()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd("NULL");
		}

		if(substanceproteinsubunitnterminalmodificationidtypecodingi == substanceproteinsubunitnterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd("]]");}


		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(substanceproteinsubunitnterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgSys("[[");}
		if(substanceproteinsubunitnterminalmodificationidtypecoding.hasSystem()) {

			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgSys(String.valueOf(substanceproteinsubunitnterminalmodificationidtypecoding.getSystem()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdTypCdgSys("NULL");
		}

		if(substanceproteinsubunitnterminalmodificationidtypecodingi == substanceproteinsubunitnterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdTypCdgSys("]]");}


		 };
		/******************** substanceproteinsubunitnterminalmodificationidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceproteinsubunitnterminalmodificationidperiod = substanceproteinsubunitnterminalmodificationid.getPeriod();

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Prd_Strt ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModificationIdPrdStrt("[");}
		if(substanceproteinsubunitnterminalmodificationidperiod.hasStart()) {

			s.addSbstncProteinSubuntNtrminalModificationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceproteinsubunitnterminalmodificationidperiod.getStart())+"\"");
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdPrdStrt("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdPrdStrt("]");}


		/******************** SbstncProtein_Subunt_NtrminalModificationId_Prd_End ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModificationIdPrdEnd("[");}
		if(substanceproteinsubunitnterminalmodificationidperiod.hasEnd()) {

			s.addSbstncProteinSubuntNtrminalModificationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceproteinsubunitnterminalmodificationidperiod.getEnd())+"\"");
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdPrdEnd("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdPrdEnd("]");}


		/******************** substanceproteinsubunitnterminalmodificationiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceproteinsubunitnterminalmodificationiduse = substanceproteinsubunitnterminalmodificationid.getUse();
		if(substanceproteinsubunitnterminalmodificationiduse!=null) {
		if(substanceproteinsubuniti == 0) {

		s.addSbstncProteinSubuntNtrminalModificationIdUse("[");		}
			s.addSbstncProteinSubuntNtrminalModificationIdUse(substanceproteinsubunitnterminalmodificationiduse.toCode());
		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {

		s.addSbstncProteinSubuntNtrminalModificationIdUse("]");		}

		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdUse("NULL");
		}

		/******************** SbstncProtein_Subunt_NtrminalModificationId_Assigner ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModificationIdAssigner("[");}
		if(substanceproteinsubunitnterminalmodificationid.hasAssigner()) {

			if(substanceproteinsubunitnterminalmodificationid.getAssigner().getReference() != null) {
			s.addSbstncProteinSubuntNtrminalModificationIdAssigner(substanceproteinsubunitnterminalmodificationid.getAssigner().getReference());
			}
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdAssigner("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdAssigner("]");}


		/******************** SbstncProtein_Subunt_NtrminalModificationId_Sys ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntNtrminalModificationIdSys("[");}
		if(substanceproteinsubunitnterminalmodificationid.hasSystem()) {

			s.addSbstncProteinSubuntNtrminalModificationIdSys(String.valueOf(substanceproteinsubunitnterminalmodificationid.getSystem()));
		} else {
			s.addSbstncProteinSubuntNtrminalModificationIdSys("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntNtrminalModificationIdSys("]");}


		/******************** substanceproteinsubunitcterminalmodificationid ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier substanceproteinsubunitcterminalmodificationid = substanceproteinsubunit.getCTerminalModificationId();

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Vl ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModificationIdVl("[");}
		if(substanceproteinsubunitcterminalmodificationid.hasValue()) {

			s.addSbstncProteinSubuntCtrminalModificationIdVl(String.valueOf(substanceproteinsubunitcterminalmodificationid.getValue()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdVl("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdVl("]");}


		/******************** substanceproteinsubunitcterminalmodificationidtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept substanceproteinsubunitcterminalmodificationidtype = substanceproteinsubunitcterminalmodificationid.getType();

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Txt ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModificationIdTypTxt("[");}
		if(substanceproteinsubunitcterminalmodificationidtype.hasText()) {

			s.addSbstncProteinSubuntCtrminalModificationIdTypTxt(String.valueOf(substanceproteinsubunitcterminalmodificationidtype.getText()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdTypTxt("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdTypTxt("]");}


		/******************** substanceproteinsubunitcterminalmodificationidtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> substanceproteinsubunitcterminalmodificationidtypecodinglist = substanceproteinsubunitcterminalmodificationidtype.getCoding();
		for(int substanceproteinsubunitcterminalmodificationidtypecodingi = 0; substanceproteinsubunitcterminalmodificationidtypecodingi<substanceproteinsubunitcterminalmodificationidtypecodinglist.size();substanceproteinsubunitcterminalmodificationidtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  substanceproteinsubunitcterminalmodificationidtypecoding = substanceproteinsubunitcterminalmodificationidtypecodinglist.get(substanceproteinsubunitcterminalmodificationidtypecodingi);

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgDsply("[[");}
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasDisplay()) {

			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgDsply(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getDisplay()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgDsply("NULL");
		}

		if(substanceproteinsubunitcterminalmodificationidtypecodingi == substanceproteinsubunitcterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgDsply("]]");}


		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn("[[");}
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasVersion()) {

			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getVersion()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn("NULL");
		}

		if(substanceproteinsubunitcterminalmodificationidtypecodingi == substanceproteinsubunitcterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn("]]");}


		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgCd("[[");}
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasCode()) {

			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgCd(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getCode()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgCd("NULL");
		}

		if(substanceproteinsubunitcterminalmodificationidtypecodingi == substanceproteinsubunitcterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgCd("]]");}


		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd("[[");}
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasUserSelected()) {

			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getUserSelected()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd("NULL");
		}

		if(substanceproteinsubunitcterminalmodificationidtypecodingi == substanceproteinsubunitcterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd("]]");}


		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(substanceproteinsubunitcterminalmodificationidtypecodingi == 0) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgSys("[[");}
		if(substanceproteinsubunitcterminalmodificationidtypecoding.hasSystem()) {

			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgSys(String.valueOf(substanceproteinsubunitcterminalmodificationidtypecoding.getSystem()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdTypCdgSys("NULL");
		}

		if(substanceproteinsubunitcterminalmodificationidtypecodingi == substanceproteinsubunitcterminalmodificationidtypecodinglist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdTypCdgSys("]]");}


		 };
		/******************** substanceproteinsubunitcterminalmodificationidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period substanceproteinsubunitcterminalmodificationidperiod = substanceproteinsubunitcterminalmodificationid.getPeriod();

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Prd_Strt ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModificationIdPrdStrt("[");}
		if(substanceproteinsubunitcterminalmodificationidperiod.hasStart()) {

			s.addSbstncProteinSubuntCtrminalModificationIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceproteinsubunitcterminalmodificationidperiod.getStart())+"\"");
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdPrdStrt("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdPrdStrt("]");}


		/******************** SbstncProtein_Subunt_CtrminalModificationId_Prd_End ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModificationIdPrdEnd("[");}
		if(substanceproteinsubunitcterminalmodificationidperiod.hasEnd()) {

			s.addSbstncProteinSubuntCtrminalModificationIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(substanceproteinsubunitcterminalmodificationidperiod.getEnd())+"\"");
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdPrdEnd("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdPrdEnd("]");}


		/******************** substanceproteinsubunitcterminalmodificationiduse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse substanceproteinsubunitcterminalmodificationiduse = substanceproteinsubunitcterminalmodificationid.getUse();
		if(substanceproteinsubunitcterminalmodificationiduse!=null) {
		if(substanceproteinsubuniti == 0) {

		s.addSbstncProteinSubuntCtrminalModificationIdUse("[");		}
			s.addSbstncProteinSubuntCtrminalModificationIdUse(substanceproteinsubunitcterminalmodificationiduse.toCode());
		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {

		s.addSbstncProteinSubuntCtrminalModificationIdUse("]");		}

		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdUse("NULL");
		}

		/******************** SbstncProtein_Subunt_CtrminalModificationId_Assigner ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModificationIdAssigner("[");}
		if(substanceproteinsubunitcterminalmodificationid.hasAssigner()) {

			if(substanceproteinsubunitcterminalmodificationid.getAssigner().getReference() != null) {
			s.addSbstncProteinSubuntCtrminalModificationIdAssigner(substanceproteinsubunitcterminalmodificationid.getAssigner().getReference());
			}
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdAssigner("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdAssigner("]");}


		/******************** SbstncProtein_Subunt_CtrminalModificationId_Sys ********************************************************************************/
		if(substanceproteinsubuniti == 0) {s.addSbstncProteinSubuntCtrminalModificationIdSys("[");}
		if(substanceproteinsubunitcterminalmodificationid.hasSystem()) {

			s.addSbstncProteinSubuntCtrminalModificationIdSys(String.valueOf(substanceproteinsubunitcterminalmodificationid.getSystem()));
		} else {
			s.addSbstncProteinSubuntCtrminalModificationIdSys("NULL");
		}

		if(substanceproteinsubuniti == substanceproteinsubunitlist.size()-1) {s.addSbstncProteinSubuntCtrminalModificationIdSys("]");}


		 };
		return s;
	}
}
