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
		if(s.getSbstncProteinDisulfideLinkage() != null ) {

				for( String currListStrSplit : s.getSbstncProteinDisulfideLinkage().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			substanceprotein.addDisulfideLinkage(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SbstncProtein_NmbrOfSubunts ********************************************************************************/
		if(s.getSbstncProteinNmbrOfSubunts() != null ) {

			if(s.getSbstncProteinNmbrOfSubunts().replace("[","").replace("]","").equals("NULL") | s.getSbstncProteinNmbrOfSubunts()==null) {} else {
			substanceprotein.setNumberOfSubunits(Integer.parseInt(s.getSbstncProteinNmbrOfSubunts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SbstncProtein_SqncTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSqncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSequenceType().getCoding().size() < i0+1) { substanceprotein.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSequenceType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncProteinSqncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSequenceType().getCoding().size() < i0+1) { substanceprotein.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSequenceType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_SqncTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncProteinSqncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSequenceType().getCoding().size() < i0+1) { substanceprotein.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSequenceType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSqncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSequenceType().getCoding().size() < i0+1) { substanceprotein.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSequenceType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncProteinSqncTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncProteinSqncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSequenceType().getCoding().size() < i0+1) { substanceprotein.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSequenceType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_SqncTyp_Txt ********************************************************************************/
		if(s.getSbstncProteinSqncTypTxt() != null ) {

			if(s.getSbstncProteinSqncTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncProteinSqncTypTxt()==null) {} else {
			substanceprotein.getSequenceType().setText(s.getSbstncProteinSqncTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncProtein_Subunt_CtrminalModification ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModification() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModification().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).setCTerminalModification(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Assigner ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Prd_End ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Prd_Strt ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdSys() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntCtrminalModificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Typ_Txt ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Use ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdUse() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_CtrminalModificationId_Vl ********************************************************************************/
		if(s.getSbstncProteinSubuntCtrminalModificationIdVl() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntCtrminalModificationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getCTerminalModificationId().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_Length ********************************************************************************/
		if(s.getSbstncProteinSubuntLength() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntLength().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).setLength(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModification ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModification() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModification().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).setNTerminalModification(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Assigner ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Prd_End ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Prd_Strt ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdSys() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				String[] arrayi1 = s.getSbstncProteinSubuntNtrminalModificationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().size() < i1+1) { substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Typ_Txt ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Use ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdUse() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_NtrminalModificationId_Vl ********************************************************************************/
		if(s.getSbstncProteinSubuntNtrminalModificationIdVl() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntNtrminalModificationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getNTerminalModificationId().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_Sqnc ********************************************************************************/
		if(s.getSbstncProteinSubuntSqnc() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).setSequence(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntCntntTyp() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntCreation() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntData() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntHash() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntLnguage() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntSz() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntTtl() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(s.getSbstncProteinSubuntSqncAttchmntUrl() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSqncAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).getSequenceAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncProtein_Subunt_Subunt ********************************************************************************/
		if(s.getSbstncProteinSubuntSubunt() != null ) {

			String[] arrayi0 = s.getSbstncProteinSubuntSubunt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substanceprotein.getSubunit().size() < i0+1) { substanceprotein.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substanceprotein.getSubunit().get(i0).setSubunit(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return substanceprotein;
	}
}
