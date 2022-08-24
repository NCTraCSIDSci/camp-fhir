package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstancePolymer;
public class SubstancePolymerConversion 
{
	public org.hl7.fhir.r4.model.SubstancePolymer SubstancePolymers(SubstancePolymer s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstancePolymer substancepolymer = new org.hl7.fhir.r4.model.SubstancePolymer();

		/******************** id ********************************************************************************/
		substancepolymer.setId(s.getId());

		/******************** SbstncPlymr_Cls__Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrClsCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrClsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getClass_().getCoding().size() < i0+1) { substancepolymer.getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getClass_().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Cls__Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrClsCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrClsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getClass_().getCoding().size() < i0+1) { substancepolymer.getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getClass_().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Cls__Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrClsCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrClsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getClass_().getCoding().size() < i0+1) { substancepolymer.getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getClass_().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Cls__Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrClsCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrClsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getClass_().getCoding().size() < i0+1) { substancepolymer.getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getClass_().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncPlymr_Cls__Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrClsCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrClsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getClass_().getCoding().size() < i0+1) { substancepolymer.getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getClass_().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Cls__Txt ********************************************************************************/
		if(s.getSbstncPlymrClsTxt() != null ) {

			if(s.getSbstncPlymrClsTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncPlymrClsTxt()==null) {} else {
			substancepolymer.getClass_().setText(s.getSbstncPlymrClsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrCopolymerConnectivityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getCopolymerConnectivity().size() < i0+1) { substancepolymer.addCopolymerConnectivity(); }
				String[] arrayi1 = s.getSbstncPlymrCopolymerConnectivityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getCopolymerConnectivity().get(i0).getCoding().size() < i1+1) { substancepolymer.getCopolymerConnectivity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getCopolymerConnectivity().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrCopolymerConnectivityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getCopolymerConnectivity().size() < i0+1) { substancepolymer.addCopolymerConnectivity(); }
				String[] arrayi1 = s.getSbstncPlymrCopolymerConnectivityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getCopolymerConnectivity().get(i0).getCoding().size() < i1+1) { substancepolymer.getCopolymerConnectivity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getCopolymerConnectivity().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrCopolymerConnectivityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getCopolymerConnectivity().size() < i0+1) { substancepolymer.addCopolymerConnectivity(); }
				String[] arrayi1 = s.getSbstncPlymrCopolymerConnectivityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getCopolymerConnectivity().get(i0).getCoding().size() < i1+1) { substancepolymer.getCopolymerConnectivity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getCopolymerConnectivity().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrCopolymerConnectivityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getCopolymerConnectivity().size() < i0+1) { substancepolymer.addCopolymerConnectivity(); }
				String[] arrayi1 = s.getSbstncPlymrCopolymerConnectivityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getCopolymerConnectivity().get(i0).getCoding().size() < i1+1) { substancepolymer.getCopolymerConnectivity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getCopolymerConnectivity().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_CopolymerConnectivity_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrCopolymerConnectivityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getCopolymerConnectivity().size() < i0+1) { substancepolymer.addCopolymerConnectivity(); }
				String[] arrayi1 = s.getSbstncPlymrCopolymerConnectivityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getCopolymerConnectivity().get(i0).getCoding().size() < i1+1) { substancepolymer.getCopolymerConnectivity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getCopolymerConnectivity().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_CopolymerConnectivity_Txt ********************************************************************************/
		if(s.getSbstncPlymrCopolymerConnectivityTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrCopolymerConnectivityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getCopolymerConnectivity().size() < i0+1) { substancepolymer.addCopolymerConnectivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getCopolymerConnectivity().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Geometry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrGeometryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getGeometry().getCoding().size() < i0+1) { substancepolymer.getGeometry().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getGeometry().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Geometry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrGeometryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getGeometry().getCoding().size() < i0+1) { substancepolymer.getGeometry().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getGeometry().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Geometry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrGeometryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getGeometry().getCoding().size() < i0+1) { substancepolymer.getGeometry().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getGeometry().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Geometry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrGeometryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getGeometry().getCoding().size() < i0+1) { substancepolymer.getGeometry().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getGeometry().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncPlymr_Geometry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrGeometryCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrGeometryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getGeometry().getCoding().size() < i0+1) { substancepolymer.getGeometry().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getGeometry().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Geometry_Txt ********************************************************************************/
		if(s.getSbstncPlymrGeometryTxt() != null ) {

			if(s.getSbstncPlymrGeometryTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncPlymrGeometryTxt()==null) {} else {
			substancepolymer.getGeometry().setText(s.getSbstncPlymrGeometryTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncPlymr_Modification ********************************************************************************/
		if(s.getSbstncPlymrModification() != null ) {

				for( String currListStrSplit : s.getSbstncPlymrModification().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			substancepolymer.addModification(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStRtioTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStRtioTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).getRatioType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStRtioTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStRtioTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).getRatioType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStRtioTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStRtioTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).getRatioType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStRtioTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStRtioTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).getRatioType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStRtioTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStRtioTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).getRatioType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getRatioType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_RtioTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStRtioTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStRtioTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getMonomerSet().get(i0).getRatioType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntStrgTyp() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().setAmount(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTxt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().setAmountText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}

		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getAmountType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getHighLimit().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getHighLimit().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getHighLimit().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getHighLimit().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getHighLimit().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getLowLimit().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getLowLimit().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getLowLimit().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getLowLimit().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getAmount().getReferenceRange().getLowLimit().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_IsDefining ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlIsDefining() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlIsDefining().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlIsDefining().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).setIsDefining(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Mtrl_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlMtrlTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getMaterial().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					String[] arrayi2 = s.getSbstncPlymrMonomerStStrtingMtrlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().size() < i2+1) { substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_MonomerSt_StrtingMtrl_Typ_Txt ********************************************************************************/
		if(s.getSbstncPlymrMonomerStStrtingMtrlTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrMonomerStStrtingMtrlTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getMonomerSet().size() < i0+1) { substancepolymer.addMonomerSet(); }
				String[] arrayi1 = s.getSbstncPlymrMonomerStStrtingMtrlTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getMonomerSet().get(i0).getStartingMaterial().size() < i1+1) { substancepolymer.getMonomerSet().get(i0).addStartingMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getMonomerSet().get(i0).getStartingMaterial().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_AverageMoleclrFrmula ********************************************************************************/
		if(s.getSbstncPlymrRptAverageMoleclrFrmula() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptAverageMoleclrFrmula().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getRepeat().get(i0).setAverageMolecularFormula(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncPlymr_Rpt_NmbrOfUnts ********************************************************************************/
		if(s.getSbstncPlymrRptNmbrOfUnts() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptNmbrOfUnts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getRepeat().get(i0).setNumberOfUnits(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntySys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntQntyVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngHiVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		return SubstancePolymers_Extended(s, substancepolymer); 
	}
	public org.hl7.fhir.r4.model.SubstancePolymer SubstancePolymers_Extended(SubstancePolymer s, org.hl7.fhir.r4.model.SubstancePolymer substancepolymer) throws ParseException
	{
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntRngLwVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntStrgTyp() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().setAmount(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTxt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().setAmountText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}

		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntAmntTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getAmountType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getHighLimit().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getHighLimit().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getHighLimit().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getHighLimit().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getHighLimit().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getLowLimit().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getLowLimit().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getLowLimit().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getLowLimit().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getAmount().getReferenceRange().getLowLimit().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountQuantity().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountQuantity().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountQuantity().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntQnty_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountQuantity().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getHigh().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getHigh().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getHigh().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Hi_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getHigh().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getLow().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getLow().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getLow().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntRng_Lw_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountRange().getLow().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntStrgTyp ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntStrgTyp() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().setAmount(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTxt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().setAmountText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}

		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_AmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getAmountType().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getHighLimit().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getHighLimit().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getHighLimit().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getHighLimit().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_HiLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngHiLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getHighLimit().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getLowLimit().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Cmprtr ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getLowLimit().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getLowLimit().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Unt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getLowLimit().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Amnt_RfrncRng_LwLmt_Vl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnAmntRfrncRngLwLmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getAmount().getReferenceRange().getLowLimit().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_DgrOfPlymrstn_Degree_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntDgrOfPlymrstnDegreeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addDegreeOfPolymerisation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getDegreeOfPolymerisation().get(i2).getDegree().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_OrientationOfPlymrisation_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntOrientationOfPlymrisationTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntOrientationOfPlymrisationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getOrientationOfPolymerisation().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_RptUnt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntRptUnt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntRptUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntRptUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).setRepeatUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setContentType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Creation ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setCreation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Data ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setData(arrayi2[i2].replace("[","").replace("]","").replace("\"","").getBytes()); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Hash ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setHash(arrayi2[i2].replace("[","").replace("]","").replace("\"","").getBytes()); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setLanguage(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Sz ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setSize(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Ttl ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setTitle(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Attchmnt_Url ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getAttachment().setUrl(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Representation ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnRepresentation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).setRepresentation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						String[] arrayi3 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().size() < i3+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUnt_StrctrlRprsnttn_Typ_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnit().size() < i1+1) { substancepolymer.getRepeat().get(i0).addRepeatUnit(); }
					String[] arrayi2 = s.getSbstncPlymrRptRptUntStrctrlRprsnttnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().size() < i2+1) { substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).addStructuralRepresentation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnit().get(i1).getStructuralRepresentation().get(i2).getType().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().size() < i1+1) { substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().size() < i1+1) { substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().size() < i1+1) { substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().size() < i1+1) { substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				String[] arrayi1 = s.getSbstncPlymrRptRptUntAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().size() < i1+1) { substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncPlymr_Rpt_RptUntAmntTyp_Txt ********************************************************************************/
		if(s.getSbstncPlymrRptRptUntAmntTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncPlymrRptRptUntAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancepolymer.getRepeat().size() < i0+1) { substancepolymer.addRepeat(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancepolymer.getRepeat().get(i0).getRepeatUnitAmountType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return substancepolymer;
	}
}
