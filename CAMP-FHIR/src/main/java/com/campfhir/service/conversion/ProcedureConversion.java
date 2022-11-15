package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Procedure;
public class ProcedureConversion 
{
	public org.hl7.fhir.r4.model.Procedure Procedures(Procedure p) throws ParseException
	{
		org.hl7.fhir.r4.model.Procedure procedure = new org.hl7.fhir.r4.model.Procedure();

		/******************** id ********************************************************************************/
		procedure.setId(p.getId());

		/******************** Prcdr_Asserter ********************************************************************************/
		if(p.getPrcdrAsserter() != null ) {

			if(p.getPrcdrAsserter().replace("[","").replace("]","").equals("NULL") | p.getPrcdrAsserter()==null) {} else {
			procedure.setAsserter(new org.hl7.fhir.r4.model.Reference(p.getPrcdrAsserter().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_BasedOn ********************************************************************************/
		if(p.getPrcdrBasedOn() != null ) {

				for( String currListStrSplit : p.getPrcdrBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Prcdr_BodySite_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrBodySiteCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getBodySite().size() < i0+1) { procedure.addBodySite(); }
				String[] arrayi1 = p.getPrcdrBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getBodySite().get(i0).getCoding().size() < i1+1) { procedure.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getBodySite().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_BodySite_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrBodySiteCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getBodySite().size() < i0+1) { procedure.addBodySite(); }
				String[] arrayi1 = p.getPrcdrBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getBodySite().get(i0).getCoding().size() < i1+1) { procedure.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getBodySite().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_BodySite_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrBodySiteCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getBodySite().size() < i0+1) { procedure.addBodySite(); }
				String[] arrayi1 = p.getPrcdrBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getBodySite().get(i0).getCoding().size() < i1+1) { procedure.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getBodySite().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getBodySite().size() < i0+1) { procedure.addBodySite(); }
				String[] arrayi1 = p.getPrcdrBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getBodySite().get(i0).getCoding().size() < i1+1) { procedure.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getBodySite().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_BodySite_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getBodySite().size() < i0+1) { procedure.addBodySite(); }
				String[] arrayi1 = p.getPrcdrBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getBodySite().get(i0).getCoding().size() < i1+1) { procedure.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getBodySite().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_BodySite_Txt ********************************************************************************/
		if(p.getPrcdrBodySiteTxt() != null ) {

			String[] arrayi0 = p.getPrcdrBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getBodySite().size() < i0+1) { procedure.addBodySite(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getBodySite().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Ctgry_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrCtgryCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCategory().getCoding().size() < i0+1) { procedure.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCategory().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Ctgry_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrCtgryCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCategory().getCoding().size() < i0+1) { procedure.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCategory().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Ctgry_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrCtgryCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCategory().getCoding().size() < i0+1) { procedure.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCategory().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCategory().getCoding().size() < i0+1) { procedure.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCategory().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrCtgryCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCategory().getCoding().size() < i0+1) { procedure.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCategory().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Ctgry_Txt ********************************************************************************/
		if(p.getPrcdrCtgryTxt() != null ) {

			if(p.getPrcdrCtgryTxt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrCtgryTxt()==null) {} else {
			procedure.getCategory().setText(p.getPrcdrCtgryTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrCdCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCode().getCoding().size() < i0+1) { procedure.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCode().getCoding().size() < i0+1) { procedure.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrCdCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCode().getCoding().size() < i0+1) { procedure.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCode().getCoding().size() < i0+1) { procedure.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getCode().getCoding().size() < i0+1) { procedure.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Cd_Txt ********************************************************************************/
		if(p.getPrcdrCdTxt() != null ) {

			if(p.getPrcdrCdTxt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrCdTxt()==null) {} else {
			procedure.getCode().setText(p.getPrcdrCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_Complication_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrComplicationCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrComplicationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getComplication().size() < i0+1) { procedure.addComplication(); }
				String[] arrayi1 = p.getPrcdrComplicationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getComplication().get(i0).getCoding().size() < i1+1) { procedure.getComplication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getComplication().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Complication_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrComplicationCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrComplicationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getComplication().size() < i0+1) { procedure.addComplication(); }
				String[] arrayi1 = p.getPrcdrComplicationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getComplication().get(i0).getCoding().size() < i1+1) { procedure.getComplication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getComplication().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Complication_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrComplicationCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrComplicationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getComplication().size() < i0+1) { procedure.addComplication(); }
				String[] arrayi1 = p.getPrcdrComplicationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getComplication().get(i0).getCoding().size() < i1+1) { procedure.getComplication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getComplication().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Complication_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrComplicationCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrComplicationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getComplication().size() < i0+1) { procedure.addComplication(); }
				String[] arrayi1 = p.getPrcdrComplicationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getComplication().get(i0).getCoding().size() < i1+1) { procedure.getComplication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getComplication().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_Complication_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrComplicationCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrComplicationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getComplication().size() < i0+1) { procedure.addComplication(); }
				String[] arrayi1 = p.getPrcdrComplicationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getComplication().get(i0).getCoding().size() < i1+1) { procedure.getComplication().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getComplication().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Complication_Txt ********************************************************************************/
		if(p.getPrcdrComplicationTxt() != null ) {

			String[] arrayi0 = p.getPrcdrComplicationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getComplication().size() < i0+1) { procedure.addComplication(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getComplication().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_ComplicationDtl ********************************************************************************/
		if(p.getPrcdrComplicationDtl() != null ) {

				for( String currListStrSplit : p.getPrcdrComplicationDtl().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addComplicationDetail(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Prcdr_Enc ********************************************************************************/
		if(p.getPrcdrEnc() != null ) {

			if(p.getPrcdrEnc().replace("[","").replace("]","").equals("NULL") | p.getPrcdrEnc()==null) {} else {
			procedure.setEncounter(new org.hl7.fhir.r4.model.Reference(p.getPrcdrEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				String[] arrayi1 = p.getPrcdrFocalDvcActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFocalDevice().get(i0).getAction().getCoding().size() < i1+1) { procedure.getFocalDevice().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFocalDevice().get(i0).getAction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				String[] arrayi1 = p.getPrcdrFocalDvcActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFocalDevice().get(i0).getAction().getCoding().size() < i1+1) { procedure.getFocalDevice().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFocalDevice().get(i0).getAction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				String[] arrayi1 = p.getPrcdrFocalDvcActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFocalDevice().get(i0).getAction().getCoding().size() < i1+1) { procedure.getFocalDevice().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFocalDevice().get(i0).getAction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				String[] arrayi1 = p.getPrcdrFocalDvcActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFocalDevice().get(i0).getAction().getCoding().size() < i1+1) { procedure.getFocalDevice().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFocalDevice().get(i0).getAction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_FocalDvc_Actn_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrFocalDvcActnCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				String[] arrayi1 = p.getPrcdrFocalDvcActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFocalDevice().get(i0).getAction().getCoding().size() < i1+1) { procedure.getFocalDevice().get(i0).getAction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFocalDevice().get(i0).getAction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FocalDvc_Actn_Txt ********************************************************************************/
		if(p.getPrcdrFocalDvcActnTxt() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcActnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getFocalDevice().get(i0).getAction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_FocalDvc_Manipulated ********************************************************************************/
		if(p.getPrcdrFocalDvcManipulated() != null ) {

			String[] arrayi0 = p.getPrcdrFocalDvcManipulated().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFocalDevice().size() < i0+1) { procedure.addFocalDevice(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getFocalDevice().get(i0).setManipulated(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_FollowUp_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrFollowUpCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrFollowUpCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFollowUp().size() < i0+1) { procedure.addFollowUp(); }
				String[] arrayi1 = p.getPrcdrFollowUpCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFollowUp().get(i0).getCoding().size() < i1+1) { procedure.getFollowUp().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFollowUp().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FollowUp_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrFollowUpCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrFollowUpCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFollowUp().size() < i0+1) { procedure.addFollowUp(); }
				String[] arrayi1 = p.getPrcdrFollowUpCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFollowUp().get(i0).getCoding().size() < i1+1) { procedure.getFollowUp().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFollowUp().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FollowUp_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrFollowUpCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrFollowUpCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFollowUp().size() < i0+1) { procedure.addFollowUp(); }
				String[] arrayi1 = p.getPrcdrFollowUpCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFollowUp().get(i0).getCoding().size() < i1+1) { procedure.getFollowUp().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFollowUp().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FollowUp_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrFollowUpCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrFollowUpCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFollowUp().size() < i0+1) { procedure.addFollowUp(); }
				String[] arrayi1 = p.getPrcdrFollowUpCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFollowUp().get(i0).getCoding().size() < i1+1) { procedure.getFollowUp().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFollowUp().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_FollowUp_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrFollowUpCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrFollowUpCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFollowUp().size() < i0+1) { procedure.addFollowUp(); }
				String[] arrayi1 = p.getPrcdrFollowUpCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getFollowUp().get(i0).getCoding().size() < i1+1) { procedure.getFollowUp().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getFollowUp().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_FollowUp_Txt ********************************************************************************/
		if(p.getPrcdrFollowUpTxt() != null ) {

			String[] arrayi0 = p.getPrcdrFollowUpTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getFollowUp().size() < i0+1) { procedure.addFollowUp(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getFollowUp().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Id_Assigner ********************************************************************************/
		if(p.getPrcdrIdAssigner() != null ) {

			String[] arrayi0 = p.getPrcdrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Id_Prd_End ********************************************************************************/
		if(p.getPrcdrIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPrcdrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Id_Prd_Strt ********************************************************************************/
		if(p.getPrcdrIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPrcdrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Id_Sys ********************************************************************************/
		if(p.getPrcdrIdSys() != null ) {

			String[] arrayi0 = p.getPrcdrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				String[] arrayi1 = p.getPrcdrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { procedure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				String[] arrayi1 = p.getPrcdrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { procedure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				String[] arrayi1 = p.getPrcdrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { procedure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				String[] arrayi1 = p.getPrcdrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { procedure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				String[] arrayi1 = p.getPrcdrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { procedure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Id_Typ_Txt ********************************************************************************/
		if(p.getPrcdrIdTypTxt() != null ) {

			String[] arrayi0 = p.getPrcdrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Id_Use ********************************************************************************/
		if(p.getPrcdrIdUse() != null ) {

			String[] arrayi0 = p.getPrcdrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Id_Vl ********************************************************************************/
		if(p.getPrcdrIdVl() != null ) {

			String[] arrayi0 = p.getPrcdrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getIdentifier().size() < i0+1) { procedure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_InstantiatesCanonical ********************************************************************************/
		if(p.getPrcdrInstantiatesCanonical() != null ) {

				for( String currListStrSplit : p.getPrcdrInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Prcdr_InstantiatesUri ********************************************************************************/
		if(p.getPrcdrInstantiatesUri() != null ) {

				for( String currListStrSplit : p.getPrcdrInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Prcdr_Lctn ********************************************************************************/
		if(p.getPrcdrLctn() != null ) {

			if(p.getPrcdrLctn().replace("[","").replace("]","").equals("NULL") | p.getPrcdrLctn()==null) {} else {
			procedure.setLocation(new org.hl7.fhir.r4.model.Reference(p.getPrcdrLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_Nt_AthrRfrnc ********************************************************************************/
		if(p.getPrcdrNtAthrRfrnc() != null ) {

			String[] arrayi0 = p.getPrcdrNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getNote().size() < i0+1) { procedure.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Nt_AthrStrgTyp ********************************************************************************/
		if(p.getPrcdrNtAthrStrgTyp() != null ) {

			String[] arrayi0 = p.getPrcdrNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getNote().size() < i0+1) { procedure.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Nt_Txt ********************************************************************************/
		if(p.getPrcdrNtTxt() != null ) {

			String[] arrayi0 = p.getPrcdrNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getNote().size() < i0+1) { procedure.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Nt_Time ********************************************************************************/
		if(p.getPrcdrNtTime() != null ) {

			String[] arrayi0 = p.getPrcdrNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getNote().size() < i0+1) { procedure.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Outcome_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrOutcomeCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrOutcomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getOutcome().getCoding().size() < i0+1) { procedure.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getOutcome().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Outcome_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrOutcomeCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrOutcomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getOutcome().getCoding().size() < i0+1) { procedure.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getOutcome().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Outcome_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrOutcomeCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrOutcomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getOutcome().getCoding().size() < i0+1) { procedure.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getOutcome().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrOutcomeCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrOutcomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getOutcome().getCoding().size() < i0+1) { procedure.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getOutcome().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Outcome_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrOutcomeCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrOutcomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getOutcome().getCoding().size() < i0+1) { procedure.getOutcome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getOutcome().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Outcome_Txt ********************************************************************************/
		if(p.getPrcdrOutcomeTxt() != null ) {

			if(p.getPrcdrOutcomeTxt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrOutcomeTxt()==null) {} else {
			procedure.getOutcome().setText(p.getPrcdrOutcomeTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PartOf ********************************************************************************/
		if(p.getPrcdrPartOf() != null ) {

				for( String currListStrSplit : p.getPrcdrPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Prcdr_PerformedAge_Cd ********************************************************************************/
		if(p.getPrcdrPerformedAgeCd() != null ) {

			if(p.getPrcdrPerformedAgeCd().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedAgeCd()==null) {} else {
			procedure.getPerformedAge().setCode(p.getPrcdrPerformedAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedAge_Cmprtr ********************************************************************************/
		if(p.getPrcdrPerformedAgeCmprtr() != null ) {

			if(p.getPrcdrPerformedAgeCmprtr().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedAgeCmprtr()==null) {} else {
			procedure.getPerformedAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(p.getPrcdrPerformedAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_PerformedAge_Sys ********************************************************************************/
		if(p.getPrcdrPerformedAgeSys() != null ) {

			if(p.getPrcdrPerformedAgeSys().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedAgeSys()==null) {} else {
			procedure.getPerformedAge().setSystem(p.getPrcdrPerformedAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedAge_Unt ********************************************************************************/
		if(p.getPrcdrPerformedAgeUnt() != null ) {

			if(p.getPrcdrPerformedAgeUnt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedAgeUnt()==null) {} else {
			procedure.getPerformedAge().setUnit(p.getPrcdrPerformedAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedAge_Vl ********************************************************************************/
		if(p.getPrcdrPerformedAgeVl() != null ) {

			if(p.getPrcdrPerformedAgeVl().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedAgeVl()==null) {} else {
			procedure.getPerformedAge().setValue((new java.math.BigDecimal((p.getPrcdrPerformedAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Prcdr_PerformedDtTimeTyp ********************************************************************************/
		if(p.getPrcdrPerformedDtTimeTyp() != null ) {

			if(p.getPrcdrPerformedDtTimeTyp().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedDtTimeTyp()==null) {} else {
			procedure.setPerformed(new org.hl7.fhir.r4.model.DateTimeType(p.getPrcdrPerformedDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_PerformedPrd_End ********************************************************************************/
		if(p.getPrcdrPerformedPrdEnd() != null ) {

			if(p.getPrcdrPerformedPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedPrdEnd()==null) {} else {
			procedure.getPerformedPeriod().setEnd(p.getPrcdrPerformedPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrcdrPerformedPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_PerformedPrd_Strt ********************************************************************************/
		if(p.getPrcdrPerformedPrdStrt() != null ) {

			if(p.getPrcdrPerformedPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedPrdStrt()==null) {} else {
			procedure.getPerformedPeriod().setStart(p.getPrcdrPerformedPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrcdrPerformedPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_PerformedRng_Hi_Cd ********************************************************************************/
		if(p.getPrcdrPerformedRngHiCd() != null ) {

			if(p.getPrcdrPerformedRngHiCd().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngHiCd()==null) {} else {
			procedure.getPerformedRange().getHigh().setCode(p.getPrcdrPerformedRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedRng_Hi_Cmprtr ********************************************************************************/
		if(p.getPrcdrPerformedRngHiCmprtr() != null ) {

			if(p.getPrcdrPerformedRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngHiCmprtr()==null) {} else {
			procedure.getPerformedRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(p.getPrcdrPerformedRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_PerformedRng_Hi_Sys ********************************************************************************/
		if(p.getPrcdrPerformedRngHiSys() != null ) {

			if(p.getPrcdrPerformedRngHiSys().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngHiSys()==null) {} else {
			procedure.getPerformedRange().getHigh().setSystem(p.getPrcdrPerformedRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedRng_Hi_Unt ********************************************************************************/
		if(p.getPrcdrPerformedRngHiUnt() != null ) {

			if(p.getPrcdrPerformedRngHiUnt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngHiUnt()==null) {} else {
			procedure.getPerformedRange().getHigh().setUnit(p.getPrcdrPerformedRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedRng_Hi_Vl ********************************************************************************/
		if(p.getPrcdrPerformedRngHiVl() != null ) {

			if(p.getPrcdrPerformedRngHiVl().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngHiVl()==null) {} else {
			procedure.getPerformedRange().getHigh().setValue((new java.math.BigDecimal((p.getPrcdrPerformedRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Prcdr_PerformedRng_Lw_Cd ********************************************************************************/
		if(p.getPrcdrPerformedRngLwCd() != null ) {

			if(p.getPrcdrPerformedRngLwCd().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngLwCd()==null) {} else {
			procedure.getPerformedRange().getLow().setCode(p.getPrcdrPerformedRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedRng_Lw_Cmprtr ********************************************************************************/
		if(p.getPrcdrPerformedRngLwCmprtr() != null ) {

			if(p.getPrcdrPerformedRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngLwCmprtr()==null) {} else {
			procedure.getPerformedRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(p.getPrcdrPerformedRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_PerformedRng_Lw_Sys ********************************************************************************/
		if(p.getPrcdrPerformedRngLwSys() != null ) {

			if(p.getPrcdrPerformedRngLwSys().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngLwSys()==null) {} else {
			procedure.getPerformedRange().getLow().setSystem(p.getPrcdrPerformedRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedRng_Lw_Unt ********************************************************************************/
		if(p.getPrcdrPerformedRngLwUnt() != null ) {

			if(p.getPrcdrPerformedRngLwUnt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngLwUnt()==null) {} else {
			procedure.getPerformedRange().getLow().setUnit(p.getPrcdrPerformedRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_PerformedRng_Lw_Vl ********************************************************************************/
		if(p.getPrcdrPerformedRngLwVl() != null ) {

			if(p.getPrcdrPerformedRngLwVl().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedRngLwVl()==null) {} else {
			procedure.getPerformedRange().getLow().setValue((new java.math.BigDecimal((p.getPrcdrPerformedRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Prcdr_PerformedStrgTyp ********************************************************************************/
		if(p.getPrcdrPerformedStrgTyp() != null ) {

			if(p.getPrcdrPerformedStrgTyp().replace("[","").replace("]","").equals("NULL") | p.getPrcdrPerformedStrgTyp()==null) {} else {
			procedure.setPerformed(new org.hl7.fhir.r4.model.StringType(p.getPrcdrPerformedStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_Prfrmr_Actor ********************************************************************************/
		if(p.getPrcdrPrfrmrActor() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getPerformer().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				String[] arrayi1 = p.getPrcdrPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { procedure.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getPerformer().get(i0).getFunction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				String[] arrayi1 = p.getPrcdrPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { procedure.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getPerformer().get(i0).getFunction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				String[] arrayi1 = p.getPrcdrPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { procedure.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getPerformer().get(i0).getFunction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				String[] arrayi1 = p.getPrcdrPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { procedure.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getPerformer().get(i0).getFunction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				String[] arrayi1 = p.getPrcdrPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { procedure.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getPerformer().get(i0).getFunction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_Prfrmr_Function_Txt ********************************************************************************/
		if(p.getPrcdrPrfrmrFunctionTxt() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getPerformer().get(i0).getFunction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_Prfrmr_OnBehalfOf ********************************************************************************/
		if(p.getPrcdrPrfrmrOnBehalfOf() != null ) {

			String[] arrayi0 = p.getPrcdrPrfrmrOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getPerformer().size() < i0+1) { procedure.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getPerformer().get(i0).setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_RsnCd_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrRsnCdCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getReasonCode().size() < i0+1) { procedure.addReasonCode(); }
				String[] arrayi1 = p.getPrcdrRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getReasonCode().get(i0).getCoding().size() < i1+1) { procedure.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_RsnCd_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrRsnCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getReasonCode().size() < i0+1) { procedure.addReasonCode(); }
				String[] arrayi1 = p.getPrcdrRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getReasonCode().get(i0).getCoding().size() < i1+1) { procedure.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_RsnCd_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrRsnCdCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getReasonCode().size() < i0+1) { procedure.addReasonCode(); }
				String[] arrayi1 = p.getPrcdrRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getReasonCode().get(i0).getCoding().size() < i1+1) { procedure.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getReasonCode().size() < i0+1) { procedure.addReasonCode(); }
				String[] arrayi1 = p.getPrcdrRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getReasonCode().get(i0).getCoding().size() < i1+1) { procedure.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getReasonCode().size() < i0+1) { procedure.addReasonCode(); }
				String[] arrayi1 = p.getPrcdrRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getReasonCode().get(i0).getCoding().size() < i1+1) { procedure.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_RsnCd_Txt ********************************************************************************/
		if(p.getPrcdrRsnCdTxt() != null ) {

			String[] arrayi0 = p.getPrcdrRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getReasonCode().size() < i0+1) { procedure.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_RsnRfrnc ********************************************************************************/
		if(p.getPrcdrRsnRfrnc() != null ) {

				for( String currListStrSplit : p.getPrcdrRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Prcdr_Recorder ********************************************************************************/
		if(p.getPrcdrRecorder() != null ) {

			if(p.getPrcdrRecorder().replace("[","").replace("]","").equals("NULL") | p.getPrcdrRecorder()==null) {} else {
			procedure.setRecorder(new org.hl7.fhir.r4.model.Reference(p.getPrcdrRecorder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_Rpt ********************************************************************************/
		if(p.getPrcdrRpt() != null ) {

				for( String currListStrSplit : p.getPrcdrRpt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addReport(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Prcdr_Sts ********************************************************************************/
		if(p.getPrcdrSts() != null ) {

			if(p.getPrcdrSts().replace("[","").replace("]","").equals("NULL") | p.getPrcdrSts()==null) {} else {
			procedure.setStatus(new org.hl7.fhir.r4.model.Procedure.ProcedureStatusEnumFactory().fromCode(p.getPrcdrSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_StsRsn_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrStsRsnCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getStatusReason().getCoding().size() < i0+1) { procedure.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_StsRsn_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrStsRsnCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getStatusReason().getCoding().size() < i0+1) { procedure.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_StsRsn_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrStsRsnCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getStatusReason().getCoding().size() < i0+1) { procedure.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getStatusReason().getCoding().size() < i0+1) { procedure.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Prcdr_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getStatusReason().getCoding().size() < i0+1) { procedure.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_StsRsn_Txt ********************************************************************************/
		if(p.getPrcdrStsRsnTxt() != null ) {

			if(p.getPrcdrStsRsnTxt().replace("[","").replace("]","").equals("NULL") | p.getPrcdrStsRsnTxt()==null) {} else {
			procedure.getStatusReason().setText(p.getPrcdrStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Prcdr_Sbjct ********************************************************************************/
		if(p.getPrcdrSbjct() != null ) {

			if(p.getPrcdrSbjct().replace("[","").replace("]","").equals("NULL") | p.getPrcdrSbjct()==null) {} else {
			procedure.setSubject(new org.hl7.fhir.r4.model.Reference(p.getPrcdrSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Prcdr_UsedCd_Cdg_Cd ********************************************************************************/
		if(p.getPrcdrUsedCdCdgCd() != null ) {

			String[] arrayi0 = p.getPrcdrUsedCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getUsedCode().size() < i0+1) { procedure.addUsedCode(); }
				String[] arrayi1 = p.getPrcdrUsedCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getUsedCode().get(i0).getCoding().size() < i1+1) { procedure.getUsedCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getUsedCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_UsedCd_Cdg_Dsply ********************************************************************************/
		if(p.getPrcdrUsedCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPrcdrUsedCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getUsedCode().size() < i0+1) { procedure.addUsedCode(); }
				String[] arrayi1 = p.getPrcdrUsedCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getUsedCode().get(i0).getCoding().size() < i1+1) { procedure.getUsedCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getUsedCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_UsedCd_Cdg_Sys ********************************************************************************/
		if(p.getPrcdrUsedCdCdgSys() != null ) {

			String[] arrayi0 = p.getPrcdrUsedCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getUsedCode().size() < i0+1) { procedure.addUsedCode(); }
				String[] arrayi1 = p.getPrcdrUsedCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getUsedCode().get(i0).getCoding().size() < i1+1) { procedure.getUsedCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getUsedCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_UsedCd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrcdrUsedCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrcdrUsedCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getUsedCode().size() < i0+1) { procedure.addUsedCode(); }
				String[] arrayi1 = p.getPrcdrUsedCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getUsedCode().get(i0).getCoding().size() < i1+1) { procedure.getUsedCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getUsedCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Prcdr_UsedCd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrcdrUsedCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrcdrUsedCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getUsedCode().size() < i0+1) { procedure.addUsedCode(); }
				String[] arrayi1 = p.getPrcdrUsedCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(procedure.getUsedCode().get(i0).getCoding().size() < i1+1) { procedure.getUsedCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {procedure.getUsedCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Prcdr_UsedCd_Txt ********************************************************************************/
		if(p.getPrcdrUsedCdTxt() != null ) {

			String[] arrayi0 = p.getPrcdrUsedCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(procedure.getUsedCode().size() < i0+1) { procedure.addUsedCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {procedure.getUsedCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Prcdr_UsedRfrnc ********************************************************************************/
		if(p.getPrcdrUsedRfrnc() != null ) {

				for( String currListStrSplit : p.getPrcdrUsedRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			procedure.addUsedReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}


		}
		return procedure;
	}
}
