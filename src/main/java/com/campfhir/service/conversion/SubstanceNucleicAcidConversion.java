package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceNucleicAcid;
public class SubstanceNucleicAcidConversion 
{
	public org.hl7.fhir.r4.model.SubstanceNucleicAcid SubstanceNucleicAcids(SubstanceNucleicAcid s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceNucleicAcid substancenucleicacid = new org.hl7.fhir.r4.model.SubstanceNucleicAcid();

		/******************** id ********************************************************************************/
		substancenucleicacid.setId(s.getId());

		/******************** SbstncNclicAcid_AreaOfHybridisation ********************************************************************************/
		if(s.getSbstncNclicAcidAreaOfHybridisation() != null ) {

			if(s.getSbstncNclicAcidAreaOfHybridisation().replace("[","").replace("]","").equals("NULL") | s.getSbstncNclicAcidAreaOfHybridisation()==null) {} else {
			substancenucleicacid.setAreaOfHybridisation(s.getSbstncNclicAcidAreaOfHybridisation().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncNclicAcid_NmbrOfSubunts ********************************************************************************/
		if(s.getSbstncNclicAcidNmbrOfSubunts() != null ) {

			if(s.getSbstncNclicAcidNmbrOfSubunts().replace("[","").replace("]","").equals("NULL") | s.getSbstncNclicAcidNmbrOfSubunts()==null) {} else {
			substancenucleicacid.setNumberOfSubunits(Integer.parseInt(s.getSbstncNclicAcidNmbrOfSubunts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidOligoNucleotideTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getOligoNucleotideType().getCoding().size() < i0+1) { substancenucleicacid.getOligoNucleotideType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getOligoNucleotideType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidOligoNucleotideTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getOligoNucleotideType().getCoding().size() < i0+1) { substancenucleicacid.getOligoNucleotideType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getOligoNucleotideType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidOligoNucleotideTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getOligoNucleotideType().getCoding().size() < i0+1) { substancenucleicacid.getOligoNucleotideType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getOligoNucleotideType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidOligoNucleotideTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getOligoNucleotideType().getCoding().size() < i0+1) { substancenucleicacid.getOligoNucleotideType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getOligoNucleotideType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidOligoNucleotideTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getOligoNucleotideType().getCoding().size() < i0+1) { substancenucleicacid.getOligoNucleotideType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getOligoNucleotideType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_OligoNucleotideTyp_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidOligoNucleotideTypTxt() != null ) {

			if(s.getSbstncNclicAcidOligoNucleotideTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncNclicAcidOligoNucleotideTypTxt()==null) {} else {
			substancenucleicacid.getOligoNucleotideType().setText(s.getSbstncNclicAcidOligoNucleotideTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSqncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSequenceType().getCoding().size() < i0+1) { substancenucleicacid.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSequenceType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSqncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSequenceType().getCoding().size() < i0+1) { substancenucleicacid.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSequenceType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSqncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSequenceType().getCoding().size() < i0+1) { substancenucleicacid.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSequenceType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSqncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSequenceType().getCoding().size() < i0+1) { substancenucleicacid.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSequenceType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncNclicAcid_SqncTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSqncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSequenceType().getCoding().size() < i0+1) { substancenucleicacid.getSequenceType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSequenceType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_SqncTyp_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSqncTypTxt() != null ) {

			if(s.getSbstncNclicAcidSqncTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncNclicAcidSqncTypTxt()==null) {} else {
			substancenucleicacid.getSequenceType().setText(s.getSbstncNclicAcidSqncTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntFivePrimeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntFivePrimeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getFivePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntFivePrimeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntFivePrimeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getFivePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntFivePrimeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntFivePrimeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getFivePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntFivePrimeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntFivePrimeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getFivePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntFivePrimeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntFivePrimeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getFivePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getFivePrime().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_FivePrime_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntFivePrimeTxt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntFivePrimeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getFivePrime().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_Length ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLength() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLength().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).setLength(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Connectivity ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageConnectivity() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageConnectivity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageConnectivity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).setConnectivity(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Assigner ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_End ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntLinkageIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Use ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdUse() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Id_Vl ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageIdVl() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).getIdentifier().setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_Nm ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageNm() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Linkage_ResidueSite ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntLinkageResidueSite() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntLinkageResidueSite().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntLinkageResidueSite().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getLinkage().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addLinkage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getLinkage().get(i1).setResidueSite(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sqnc ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqnc() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).setSequence(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_CntntTyp ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntCntntTyp() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Creation ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntCreation() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Data ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntData() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Hash ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntHash() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Lnguage ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntLnguage() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Sz ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntSz() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Ttl ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntTtl() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_SqncAttchmnt_Url ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSqncAttchmntUrl() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSqncAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSequenceAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_Subunt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSubunt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSubunt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).setSubunit(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Assigner ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_End ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntSugarIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntSugarIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntSugarIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntSugarIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					String[] arrayi2 = s.getSbstncNclicAcidSubuntSugarIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Use ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdUse() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Id_Vl ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarIdVl() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).getIdentifier().setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_Nm ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarNm() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_Sugar_ResidueSite ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntSugarResidueSite() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntSugarResidueSite().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntSugarResidueSite().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getSugar().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).addSugar(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getSugar().get(i1).setResidueSite(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Cd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntThreePrimeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntThreePrimeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getThreePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntThreePrimeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntThreePrimeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getThreePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Sys ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntThreePrimeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntThreePrimeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getThreePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntThreePrimeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntThreePrimeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getThreePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntThreePrimeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				String[] arrayi1 = s.getSbstncNclicAcidSubuntThreePrimeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().size() < i1+1) { substancenucleicacid.getSubunit().get(i0).getThreePrime().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancenucleicacid.getSubunit().get(i0).getThreePrime().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncNclicAcid_Subunt_ThreePrime_Txt ********************************************************************************/
		if(s.getSbstncNclicAcidSubuntThreePrimeTxt() != null ) {

			String[] arrayi0 = s.getSbstncNclicAcidSubuntThreePrimeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancenucleicacid.getSubunit().size() < i0+1) { substancenucleicacid.addSubunit(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancenucleicacid.getSubunit().get(i0).getThreePrime().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return substancenucleicacid;
	}
}
