package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Observation;
public class ObservationConversion 
{
	public org.hl7.fhir.r4.model.Observation Observations(Observation o) throws ParseException
	{
		org.hl7.fhir.r4.model.Observation observation = new org.hl7.fhir.r4.model.Observation();

		/******************** id ********************************************************************************/
		observation.setId(o.getId());

		/******************** Obsrvtn_BasedOn ********************************************************************************/
		if(o.getObsrvtnBasedOn() != null ) {

				for( String currListStrSplit : o.getObsrvtnBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_BodySite_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getBodySite().getCoding().size() < i0+1) { observation.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getBodySite().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getBodySite().getCoding().size() < i0+1) { observation.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getBodySite().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_BodySite_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getBodySite().getCoding().size() < i0+1) { observation.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getBodySite().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getBodySite().getCoding().size() < i0+1) { observation.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getBodySite().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getBodySite().getCoding().size() < i0+1) { observation.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getBodySite().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_BodySite_Txt ********************************************************************************/
		if(o.getObsrvtnBodySiteTxt() != null ) {

			if(o.getObsrvtnBodySiteTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnBodySiteTxt()==null) {} else {
			observation.getBodySite().setText(o.getObsrvtnBodySiteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCtgryCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCategory().size() < i0+1) { observation.addCategory(); }
				String[] arrayi1 = o.getObsrvtnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getCategory().get(i0).getCoding().size() < i1+1) { observation.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCtgryCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCategory().size() < i0+1) { observation.addCategory(); }
				String[] arrayi1 = o.getObsrvtnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getCategory().get(i0).getCoding().size() < i1+1) { observation.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCtgryCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCategory().size() < i0+1) { observation.addCategory(); }
				String[] arrayi1 = o.getObsrvtnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getCategory().get(i0).getCoding().size() < i1+1) { observation.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCategory().size() < i0+1) { observation.addCategory(); }
				String[] arrayi1 = o.getObsrvtnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getCategory().get(i0).getCoding().size() < i1+1) { observation.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCategory().size() < i0+1) { observation.addCategory(); }
				String[] arrayi1 = o.getObsrvtnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getCategory().get(i0).getCoding().size() < i1+1) { observation.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Ctgry_Txt ********************************************************************************/
		if(o.getObsrvtnCtgryTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCategory().size() < i0+1) { observation.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCdCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCode().getCoding().size() < i0+1) { observation.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCdCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCode().getCoding().size() < i0+1) { observation.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCdCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCode().getCoding().size() < i0+1) { observation.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCode().getCoding().size() < i0+1) { observation.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCdCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getCode().getCoding().size() < i0+1) { observation.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnCdTxt() != null ) {

			if(o.getObsrvtnCdTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnCdTxt()==null) {} else {
			observation.getCode().setText(o.getObsrvtnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getCode().getCoding().size() < i1+1) { observation.getComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getCode().getCoding().size() < i1+1) { observation.getComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getCode().getCoding().size() < i1+1) { observation.getComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getCode().getCoding().size() < i1+1) { observation.getComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getCode().getCoding().size() < i1+1) { observation.getComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntCdTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntDataAbsentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntDataAbsentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getDataAbsentReason().getCoding().size() < i1+1) { observation.getComponent().get(i0).getDataAbsentReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getDataAbsentReason().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntDataAbsentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntDataAbsentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getDataAbsentReason().getCoding().size() < i1+1) { observation.getComponent().get(i0).getDataAbsentReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getDataAbsentReason().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntDataAbsentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntDataAbsentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getDataAbsentReason().getCoding().size() < i1+1) { observation.getComponent().get(i0).getDataAbsentReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getDataAbsentReason().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntDataAbsentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntDataAbsentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getDataAbsentReason().getCoding().size() < i1+1) { observation.getComponent().get(i0).getDataAbsentReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getDataAbsentReason().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntDataAbsentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntDataAbsentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getDataAbsentReason().getCoding().size() < i1+1) { observation.getComponent().get(i0).getDataAbsentReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getDataAbsentReason().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntDataAbsentRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getDataAbsentReason().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntInterpretationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntInterpretationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getInterpretation().size() < i1+1) { observation.getComponent().get(i0).addInterpretation(); }
					String[] arrayi2 = o.getObsrvtnCmpntInterpretationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().size() < i2+1) { observation.getComponent().get(i0).getInterpretation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntInterpretationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntInterpretationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getInterpretation().size() < i1+1) { observation.getComponent().get(i0).addInterpretation(); }
					String[] arrayi2 = o.getObsrvtnCmpntInterpretationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().size() < i2+1) { observation.getComponent().get(i0).getInterpretation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntInterpretationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntInterpretationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getInterpretation().size() < i1+1) { observation.getComponent().get(i0).addInterpretation(); }
					String[] arrayi2 = o.getObsrvtnCmpntInterpretationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().size() < i2+1) { observation.getComponent().get(i0).getInterpretation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntInterpretationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntInterpretationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getInterpretation().size() < i1+1) { observation.getComponent().get(i0).addInterpretation(); }
					String[] arrayi2 = o.getObsrvtnCmpntInterpretationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().size() < i2+1) { observation.getComponent().get(i0).getInterpretation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntInterpretationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntInterpretationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getInterpretation().size() < i1+1) { observation.getComponent().get(i0).addInterpretation(); }
					String[] arrayi2 = o.getObsrvtnCmpntInterpretationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().size() < i2+1) { observation.getComponent().get(i0).getInterpretation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getInterpretation().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntInterpretationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntInterpretationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getInterpretation().size() < i1+1) { observation.getComponent().get(i0).addInterpretation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getInterpretation().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAgeLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAgeLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAge().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).addAppliesTo(); }
						String[] arrayi3 = o.getObsrvtnCmpntRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().size() < i3+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).addAppliesTo(); }
						String[] arrayi3 = o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().size() < i3+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).addAppliesTo(); }
						String[] arrayi3 = o.getObsrvtnCmpntRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().size() < i3+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).addAppliesTo(); }
						String[] arrayi3 = o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().size() < i3+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).addAppliesTo(); }
						String[] arrayi3 = o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().size() < i3+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).addAppliesTo(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getAppliesTo().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					String[] arrayi2 = o.getObsrvtnCmpntRfrncRngTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().size() < i2+1) { observation.getComponent().get(i0).getReferenceRange().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntRfrncRngTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntRfrncRngTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getReferenceRange().size() < i1+1) { observation.getComponent().get(i0).addReferenceRange(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getReferenceRange().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_VlBooleanTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlBooleanTyp() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { observation.getComponent().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { observation.getComponent().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { observation.getComponent().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { observation.getComponent().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				String[] arrayi1 = o.getObsrvtnCmpntVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getComponent().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { observation.getComponent().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getComponent().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlDtTimeTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlDtTimeTyp() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlIntegerTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlIntegerTyp() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlPrd_End ********************************************************************************/
		if(o.getObsrvtnCmpntVlPrdEnd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValuePeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlPrd_Strt ********************************************************************************/
		if(o.getObsrvtnCmpntVlPrdStrt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValuePeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntySys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Data ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataData() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Dimensions ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataDimensions() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataDimensions().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().setDimensions(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Factor ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataFactor() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().setFactor((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_LwerLmt ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataLwerLmt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataLwerLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().setLowerLimit((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginCd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataOriginCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().getOrigin().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Cmprtr ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataOriginCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().getOrigin().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginSys() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataOriginSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().getOrigin().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataOriginUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().getOrigin().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginVl() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataOriginVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().getOrigin().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Prd ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataPrd() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_UpperLmt ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataUpperLmt() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlSampledDataUpperLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).getValueSampledData().setUpperLimit((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlStrgTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlStrgTyp() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).setValue(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Cmpnt_VlTimeTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlTimeTyp() != null ) {

			String[] arrayi0 = o.getObsrvtnCmpntVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getComponent().size() < i0+1) { observation.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getComponent().get(i0).setValue(new org.hl7.fhir.r4.model.TimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDataAbsentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getDataAbsentReason().getCoding().size() < i0+1) { observation.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getDataAbsentReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDataAbsentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getDataAbsentReason().getCoding().size() < i0+1) { observation.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getDataAbsentReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDataAbsentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getDataAbsentReason().getCoding().size() < i0+1) { observation.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getDataAbsentReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDataAbsentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getDataAbsentReason().getCoding().size() < i0+1) { observation.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getDataAbsentReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDataAbsentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getDataAbsentReason().getCoding().size() < i0+1) { observation.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getDataAbsentReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_DataAbsentRsn_Txt ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnTxt() != null ) {

			if(o.getObsrvtnDataAbsentRsnTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDataAbsentRsnTxt()==null) {} else {
			observation.getDataAbsentReason().setText(o.getObsrvtnDataAbsentRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_DerivedFrom ********************************************************************************/
		if(o.getObsrvtnDerivedFrom() != null ) {

				for( String currListStrSplit : o.getObsrvtnDerivedFrom().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.addDerivedFrom(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_Dvc ********************************************************************************/
		if(o.getObsrvtnDvc() != null ) {

			if(o.getObsrvtnDvc().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDvc()==null) {} else {
			observation.setDevice(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDvc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveDtTimeTyp ********************************************************************************/
		if(o.getObsrvtnEfctiveDtTimeTyp() != null ) {

			if(o.getObsrvtnEfctiveDtTimeTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveDtTimeTyp()==null) {} else {
			observation.setEffective(new org.hl7.fhir.r4.model.DateTimeType(o.getObsrvtnEfctiveDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveInstantTyp ********************************************************************************/
		if(o.getObsrvtnEfctiveInstantTyp() != null ) {

			if(o.getObsrvtnEfctiveInstantTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveInstantTyp()==null) {} else {
			observation.setEffective(new org.hl7.fhir.r4.model.InstantType(o.getObsrvtnEfctiveInstantTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctivePrd_End ********************************************************************************/
		if(o.getObsrvtnEfctivePrdEnd() != null ) {

			if(o.getObsrvtnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctivePrdEnd()==null) {} else {
			observation.getEffectivePeriod().setEnd(o.getObsrvtnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctivePrd_Strt ********************************************************************************/
		if(o.getObsrvtnEfctivePrdStrt() != null ) {

			if(o.getObsrvtnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctivePrdStrt()==null) {} else {
			observation.getEffectivePeriod().setStart(o.getObsrvtnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getEffectiveTiming().getCode().getCoding().size() < i0+1) { observation.getEffectiveTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getEffectiveTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getEffectiveTiming().getCode().getCoding().size() < i0+1) { observation.getEffectiveTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getEffectiveTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getEffectiveTiming().getCode().getCoding().size() < i0+1) { observation.getEffectiveTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getEffectiveTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getEffectiveTiming().getCode().getCoding().size() < i0+1) { observation.getEffectiveTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getEffectiveTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getEffectiveTiming().getCode().getCoding().size() < i0+1) { observation.getEffectiveTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getEffectiveTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdTxt() != null ) {

			if(o.getObsrvtnEfctiveTmgCdTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgCdTxt()==null) {} else {
			observation.getEffectiveTiming().getCode().setText(o.getObsrvtnEfctiveTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Evnt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgEvnt() != null ) {

				for( String currListStrSplit : o.getObsrvtnEfctiveTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.getEffectiveTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsDurationCd() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsDurationCd()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsDuration().setCode(o.getObsrvtnEfctiveTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsDurationCmprtr() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsDurationCmprtr()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnEfctiveTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsDurationSys() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsDurationSys()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsDuration().setSystem(o.getObsrvtnEfctiveTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsDurationUnt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsDurationUnt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsDuration().setUnit(o.getObsrvtnEfctiveTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsDurationVl() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsDurationVl()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((o.getObsrvtnEfctiveTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsPrdEnd() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsPrdEnd()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsPeriod().setEnd(o.getObsrvtnEfctiveTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnEfctiveTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsPrdStrt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsPrdStrt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsPeriod().setStart(o.getObsrvtnEfctiveTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnEfctiveTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiCd() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngHiCd()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().setCode(o.getObsrvtnEfctiveTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiCmprtr() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngHiCmprtr()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnEfctiveTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiSys() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngHiSys()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().setSystem(o.getObsrvtnEfctiveTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiUnt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngHiUnt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().setUnit(o.getObsrvtnEfctiveTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiVl() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngHiVl()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((o.getObsrvtnEfctiveTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwCd() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngLwCd()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().setCode(o.getObsrvtnEfctiveTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwCmprtr() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngLwCmprtr()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnEfctiveTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwSys() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngLwSys()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().setSystem(o.getObsrvtnEfctiveTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwUnt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngLwUnt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().setUnit(o.getObsrvtnEfctiveTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwVl() != null ) {

			if(o.getObsrvtnEfctiveTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptBndsRngLwVl()==null) {} else {
			observation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((o.getObsrvtnEfctiveTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptCnt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptCnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptCnt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setCount(Integer.parseInt(o.getObsrvtnEfctiveTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptCntMx() != null ) {

			if(o.getObsrvtnEfctiveTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptCntMx()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setCountMax(Integer.parseInt(o.getObsrvtnEfctiveTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Duration ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptDuration() != null ) {

			if(o.getObsrvtnEfctiveTmgRptDuration().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptDuration()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setDuration((Double.parseDouble((o.getObsrvtnEfctiveTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptDurationMx() != null ) {

			if(o.getObsrvtnEfctiveTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptDurationMx()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setDurationMax((Double.parseDouble((o.getObsrvtnEfctiveTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_DurationUnt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptDurationUnt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptDurationUnt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(o.getObsrvtnEfctiveTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptFrqncy() != null ) {

			if(o.getObsrvtnEfctiveTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptFrqncy()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setFrequency(Integer.parseInt(o.getObsrvtnEfctiveTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptFrqncyMx() != null ) {

			if(o.getObsrvtnEfctiveTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptFrqncyMx()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setFrequencyMax(Integer.parseInt(o.getObsrvtnEfctiveTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Off ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptOff() != null ) {

			if(o.getObsrvtnEfctiveTmgRptOff().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptOff()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setOffset(Integer.parseInt(o.getObsrvtnEfctiveTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Prd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptPrd() != null ) {

			if(o.getObsrvtnEfctiveTmgRptPrd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptPrd()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setPeriod((new java.math.BigDecimal((o.getObsrvtnEfctiveTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptPrdMx() != null ) {

			if(o.getObsrvtnEfctiveTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptPrdMx()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((o.getObsrvtnEfctiveTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_PrdUnt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptPrdUnt() != null ) {

			if(o.getObsrvtnEfctiveTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEfctiveTmgRptPrdUnt()==null) {} else {
			observation.getEffectiveTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(o.getObsrvtnEfctiveTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : o.getObsrvtnEfctiveTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.getEffectiveTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Obsrvtn_Enc ********************************************************************************/
		if(o.getObsrvtnEnc() != null ) {

			if(o.getObsrvtnEnc().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnEnc()==null) {} else {
			observation.setEncounter(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_Focus ********************************************************************************/
		if(o.getObsrvtnFocus() != null ) {

				for( String currListStrSplit : o.getObsrvtnFocus().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.addFocus(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_HasMmbr ********************************************************************************/
		if(o.getObsrvtnHasMmbr() != null ) {

				for( String currListStrSplit : o.getObsrvtnHasMmbr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.addHasMember(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_Id_Assigner ********************************************************************************/
		if(o.getObsrvtnIdAssigner() != null ) {

			String[] arrayi0 = o.getObsrvtnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Id_Prd_End ********************************************************************************/
		if(o.getObsrvtnIdPrdEnd() != null ) {

			String[] arrayi0 = o.getObsrvtnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Id_Prd_Strt ********************************************************************************/
		if(o.getObsrvtnIdPrdStrt() != null ) {

			String[] arrayi0 = o.getObsrvtnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Id_Sys ********************************************************************************/
		if(o.getObsrvtnIdSys() != null ) {

			String[] arrayi0 = o.getObsrvtnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnIdTypCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnIdTypCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnIdTypCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Id_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnIdTypTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Id_Use ********************************************************************************/
		if(o.getObsrvtnIdUse() != null ) {

			String[] arrayi0 = o.getObsrvtnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Id_Vl ********************************************************************************/
		if(o.getObsrvtnIdVl() != null ) {

			String[] arrayi0 = o.getObsrvtnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getIdentifier().size() < i0+1) { observation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Interpretation_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnInterpretationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getInterpretation().size() < i0+1) { observation.addInterpretation(); }
				String[] arrayi1 = o.getObsrvtnInterpretationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getInterpretation().get(i0).getCoding().size() < i1+1) { observation.getInterpretation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getInterpretation().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Interpretation_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnInterpretationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getInterpretation().size() < i0+1) { observation.addInterpretation(); }
				String[] arrayi1 = o.getObsrvtnInterpretationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getInterpretation().get(i0).getCoding().size() < i1+1) { observation.getInterpretation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getInterpretation().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Interpretation_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnInterpretationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getInterpretation().size() < i0+1) { observation.addInterpretation(); }
				String[] arrayi1 = o.getObsrvtnInterpretationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getInterpretation().get(i0).getCoding().size() < i1+1) { observation.getInterpretation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getInterpretation().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnInterpretationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getInterpretation().size() < i0+1) { observation.addInterpretation(); }
				String[] arrayi1 = o.getObsrvtnInterpretationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getInterpretation().get(i0).getCoding().size() < i1+1) { observation.getInterpretation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getInterpretation().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnInterpretationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getInterpretation().size() < i0+1) { observation.addInterpretation(); }
				String[] arrayi1 = o.getObsrvtnInterpretationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getInterpretation().get(i0).getCoding().size() < i1+1) { observation.getInterpretation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getInterpretation().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_Interpretation_Txt ********************************************************************************/
		if(o.getObsrvtnInterpretationTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnInterpretationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getInterpretation().size() < i0+1) { observation.addInterpretation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getInterpretation().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Issued ********************************************************************************/
		if(o.getObsrvtnIssued() != null ) {

			if(o.getObsrvtnIssued().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnIssued()==null) {} else {
			observation.setIssued(o.getObsrvtnIssued().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnIssued()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnIssued().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_Mthd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnMthdCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getMethod().getCoding().size() < i0+1) { observation.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Mthd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnMthdCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getMethod().getCoding().size() < i0+1) { observation.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Mthd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnMthdCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getMethod().getCoding().size() < i0+1) { observation.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getMethod().getCoding().size() < i0+1) { observation.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnMthdCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getMethod().getCoding().size() < i0+1) { observation.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Mthd_Txt ********************************************************************************/
		if(o.getObsrvtnMthdTxt() != null ) {

			if(o.getObsrvtnMthdTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnMthdTxt()==null) {} else {
			observation.getMethod().setText(o.getObsrvtnMthdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_Nt_AthrRfrnc ********************************************************************************/
		if(o.getObsrvtnNtAthrRfrnc() != null ) {

			String[] arrayi0 = o.getObsrvtnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getNote().size() < i0+1) { observation.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Nt_AthrStrgTyp ********************************************************************************/
		if(o.getObsrvtnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = o.getObsrvtnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getNote().size() < i0+1) { observation.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_Nt_Txt ********************************************************************************/
		if(o.getObsrvtnNtTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getNote().size() < i0+1) { observation.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Nt_Time ********************************************************************************/
		if(o.getObsrvtnNtTime() != null ) {

			String[] arrayi0 = o.getObsrvtnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getNote().size() < i0+1) { observation.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_PartOf ********************************************************************************/
		if(o.getObsrvtnPartOf() != null ) {

				for( String currListStrSplit : o.getObsrvtnPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_Prfrmr ********************************************************************************/
		if(o.getObsrvtnPrfrmr() != null ) {

				for( String currListStrSplit : o.getObsrvtnPrfrmr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observation.addPerformer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAgeLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getAge().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getAppliesTo().size() < i1+1) { observation.getReferenceRange().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnRfrncRngAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observation.getReferenceRange().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getAppliesTo().size() < i1+1) { observation.getReferenceRange().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnRfrncRngAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observation.getReferenceRange().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getAppliesTo().size() < i1+1) { observation.getReferenceRange().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnRfrncRngAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observation.getReferenceRange().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getAppliesTo().size() < i1+1) { observation.getReferenceRange().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnRfrncRngAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observation.getReferenceRange().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getAppliesTo().size() < i1+1) { observation.getReferenceRange().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnRfrncRngAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observation.getReferenceRange().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observation.getReferenceRange().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getAppliesTo().size() < i1+1) { observation.getReferenceRange().get(i0).addAppliesTo(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getReferenceRange().get(i0).getAppliesTo().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Txt ********************************************************************************/
		if(o.getObsrvtnRfrncRngTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getType().getCoding().size() < i1+1) { observation.getReferenceRange().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getReferenceRange().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getType().getCoding().size() < i1+1) { observation.getReferenceRange().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getReferenceRange().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getType().getCoding().size() < i1+1) { observation.getReferenceRange().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getReferenceRange().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getType().getCoding().size() < i1+1) { observation.getReferenceRange().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getReferenceRange().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				String[] arrayi1 = o.getObsrvtnRfrncRngTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observation.getReferenceRange().get(i0).getType().getCoding().size() < i1+1) { observation.getReferenceRange().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observation.getReferenceRange().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Obsrvtn_RfrncRng_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnRfrncRngTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getReferenceRange().size() < i0+1) { observation.addReferenceRange(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getReferenceRange().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_Spcmn ********************************************************************************/
		if(o.getObsrvtnSpcmn() != null ) {

			if(o.getObsrvtnSpcmn().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnSpcmn()==null) {} else {
			observation.setSpecimen(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnSpcmn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_Sts ********************************************************************************/
		if(o.getObsrvtnSts() != null ) {

			if(o.getObsrvtnSts().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnSts()==null) {} else {
			observation.setStatus(new org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory().fromCode(o.getObsrvtnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_Sbjct ********************************************************************************/
		if(o.getObsrvtnSbjct() != null ) {

			if(o.getObsrvtnSbjct().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnSbjct()==null) {} else {
			observation.setSubject(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlBooleanTyp ********************************************************************************/
		if(o.getObsrvtnVlBooleanTyp() != null ) {

			if(o.getObsrvtnVlBooleanTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlBooleanTyp()==null) {} else {
			observation.setValue(new org.hl7.fhir.r4.model.BooleanType(o.getObsrvtnVlBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getValueCodeableConcept().getCoding().size() < i0+1) { observation.getValueCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getValueCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getValueCodeableConcept().getCoding().size() < i0+1) { observation.getValueCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getValueCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getValueCodeableConcept().getCoding().size() < i0+1) { observation.getValueCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getValueCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getValueCodeableConcept().getCoding().size() < i0+1) { observation.getValueCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getValueCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observation.getValueCodeableConcept().getCoding().size() < i0+1) { observation.getValueCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observation.getValueCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Obsrvtn_VlCdbleCncpt_Txt ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptTxt() != null ) {

			if(o.getObsrvtnVlCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlCdbleCncptTxt()==null) {} else {
			observation.getValueCodeableConcept().setText(o.getObsrvtnVlCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlDtTimeTyp ********************************************************************************/
		if(o.getObsrvtnVlDtTimeTyp() != null ) {

			if(o.getObsrvtnVlDtTimeTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlDtTimeTyp()==null) {} else {
			observation.setValue(new org.hl7.fhir.r4.model.DateTimeType(o.getObsrvtnVlDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlIntegerTyp ********************************************************************************/
		if(o.getObsrvtnVlIntegerTyp() != null ) {

			if(o.getObsrvtnVlIntegerTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlIntegerTyp()==null) {} else {
			observation.setValue(new org.hl7.fhir.r4.model.IntegerType(o.getObsrvtnVlIntegerTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlPrd_End ********************************************************************************/
		if(o.getObsrvtnVlPrdEnd() != null ) {

			if(o.getObsrvtnVlPrdEnd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlPrdEnd()==null) {} else {
			observation.getValuePeriod().setEnd(o.getObsrvtnVlPrdEnd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnVlPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlPrd_Strt ********************************************************************************/
		if(o.getObsrvtnVlPrdStrt() != null ) {

			if(o.getObsrvtnVlPrdStrt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlPrdStrt()==null) {} else {
			observation.getValuePeriod().setStart(o.getObsrvtnVlPrdStrt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getObsrvtnVlPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlQnty_Cd ********************************************************************************/
		if(o.getObsrvtnVlQntyCd() != null ) {

			if(o.getObsrvtnVlQntyCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlQntyCd()==null) {} else {
			observation.getValueQuantity().setCode(o.getObsrvtnVlQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlQnty_Cmprtr ********************************************************************************/
		if(o.getObsrvtnVlQntyCmprtr() != null ) {

			if(o.getObsrvtnVlQntyCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlQntyCmprtr()==null) {} else {
			observation.getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnVlQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlQnty_Sys ********************************************************************************/
		if(o.getObsrvtnVlQntySys() != null ) {

			if(o.getObsrvtnVlQntySys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlQntySys()==null) {} else {
			observation.getValueQuantity().setSystem(o.getObsrvtnVlQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlQnty_Unt ********************************************************************************/
		if(o.getObsrvtnVlQntyUnt() != null ) {

			if(o.getObsrvtnVlQntyUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlQntyUnt()==null) {} else {
			observation.getValueQuantity().setUnit(o.getObsrvtnVlQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlQnty_Vl ********************************************************************************/
		if(o.getObsrvtnVlQntyVl() != null ) {

			if(o.getObsrvtnVlQntyVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlQntyVl()==null) {} else {
			observation.getValueQuantity().setValue((new java.math.BigDecimal((o.getObsrvtnVlQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnVlRngHiCd() != null ) {

			if(o.getObsrvtnVlRngHiCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngHiCd()==null) {} else {
			observation.getValueRange().getHigh().setCode(o.getObsrvtnVlRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRng_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnVlRngHiCmprtr() != null ) {

			if(o.getObsrvtnVlRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngHiCmprtr()==null) {} else {
			observation.getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnVlRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnVlRngHiSys() != null ) {

			if(o.getObsrvtnVlRngHiSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngHiSys()==null) {} else {
			observation.getValueRange().getHigh().setSystem(o.getObsrvtnVlRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnVlRngHiUnt() != null ) {

			if(o.getObsrvtnVlRngHiUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngHiUnt()==null) {} else {
			observation.getValueRange().getHigh().setUnit(o.getObsrvtnVlRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnVlRngHiVl() != null ) {

			if(o.getObsrvtnVlRngHiVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngHiVl()==null) {} else {
			observation.getValueRange().getHigh().setValue((new java.math.BigDecimal((o.getObsrvtnVlRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnVlRngLwCd() != null ) {

			if(o.getObsrvtnVlRngLwCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngLwCd()==null) {} else {
			observation.getValueRange().getLow().setCode(o.getObsrvtnVlRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRng_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnVlRngLwCmprtr() != null ) {

			if(o.getObsrvtnVlRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngLwCmprtr()==null) {} else {
			observation.getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnVlRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnVlRngLwSys() != null ) {

			if(o.getObsrvtnVlRngLwSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngLwSys()==null) {} else {
			observation.getValueRange().getLow().setSystem(o.getObsrvtnVlRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnVlRngLwUnt() != null ) {

			if(o.getObsrvtnVlRngLwUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngLwUnt()==null) {} else {
			observation.getValueRange().getLow().setUnit(o.getObsrvtnVlRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnVlRngLwVl() != null ) {

			if(o.getObsrvtnVlRngLwVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRngLwVl()==null) {} else {
			observation.getValueRange().getLow().setValue((new java.math.BigDecimal((o.getObsrvtnVlRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrCd() != null ) {

			if(o.getObsrvtnVlRtioDnmntrCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioDnmntrCd()==null) {} else {
			observation.getValueRatio().getDenominator().setCode(o.getObsrvtnVlRtioDnmntrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrCmprtr() != null ) {

			if(o.getObsrvtnVlRtioDnmntrCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioDnmntrCmprtr()==null) {} else {
			observation.getValueRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnVlRtioDnmntrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrSys() != null ) {

			if(o.getObsrvtnVlRtioDnmntrSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioDnmntrSys()==null) {} else {
			observation.getValueRatio().getDenominator().setSystem(o.getObsrvtnVlRtioDnmntrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrUnt() != null ) {

			if(o.getObsrvtnVlRtioDnmntrUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioDnmntrUnt()==null) {} else {
			observation.getValueRatio().getDenominator().setUnit(o.getObsrvtnVlRtioDnmntrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrVl() != null ) {

			if(o.getObsrvtnVlRtioDnmntrVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioDnmntrVl()==null) {} else {
			observation.getValueRatio().getDenominator().setValue((new java.math.BigDecimal((o.getObsrvtnVlRtioDnmntrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrCd() != null ) {

			if(o.getObsrvtnVlRtioNmrtrCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioNmrtrCd()==null) {} else {
			observation.getValueRatio().getNumerator().setCode(o.getObsrvtnVlRtioNmrtrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrCmprtr() != null ) {

			if(o.getObsrvtnVlRtioNmrtrCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioNmrtrCmprtr()==null) {} else {
			observation.getValueRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnVlRtioNmrtrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrSys() != null ) {

			if(o.getObsrvtnVlRtioNmrtrSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioNmrtrSys()==null) {} else {
			observation.getValueRatio().getNumerator().setSystem(o.getObsrvtnVlRtioNmrtrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrUnt() != null ) {

			if(o.getObsrvtnVlRtioNmrtrUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioNmrtrUnt()==null) {} else {
			observation.getValueRatio().getNumerator().setUnit(o.getObsrvtnVlRtioNmrtrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrVl() != null ) {

			if(o.getObsrvtnVlRtioNmrtrVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlRtioNmrtrVl()==null) {} else {
			observation.getValueRatio().getNumerator().setValue((new java.math.BigDecimal((o.getObsrvtnVlRtioNmrtrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlSampledData_Data ********************************************************************************/
		if(o.getObsrvtnVlSampledDataData() != null ) {

			if(o.getObsrvtnVlSampledDataData().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataData()==null) {} else {
			observation.getValueSampledData().setData(o.getObsrvtnVlSampledDataData().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlSampledData_Dimensions ********************************************************************************/
		if(o.getObsrvtnVlSampledDataDimensions() != null ) {

			if(o.getObsrvtnVlSampledDataDimensions().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataDimensions()==null) {} else {
			observation.getValueSampledData().setDimensions(Integer.parseInt(o.getObsrvtnVlSampledDataDimensions().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlSampledData_Factor ********************************************************************************/
		if(o.getObsrvtnVlSampledDataFactor() != null ) {

			if(o.getObsrvtnVlSampledDataFactor().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataFactor()==null) {} else {
			observation.getValueSampledData().setFactor((Double.parseDouble((o.getObsrvtnVlSampledDataFactor().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlSampledData_LwerLmt ********************************************************************************/
		if(o.getObsrvtnVlSampledDataLwerLmt() != null ) {

			if(o.getObsrvtnVlSampledDataLwerLmt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataLwerLmt()==null) {} else {
			observation.getValueSampledData().setLowerLimit((Double.parseDouble((o.getObsrvtnVlSampledDataLwerLmt().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlSampledData_Origin_Cd ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginCd() != null ) {

			if(o.getObsrvtnVlSampledDataOriginCd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataOriginCd()==null) {} else {
			observation.getValueSampledData().getOrigin().setCode(o.getObsrvtnVlSampledDataOriginCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlSampledData_Origin_Cmprtr ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginCmprtr() != null ) {

			if(o.getObsrvtnVlSampledDataOriginCmprtr().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataOriginCmprtr()==null) {} else {
			observation.getValueSampledData().getOrigin().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(o.getObsrvtnVlSampledDataOriginCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlSampledData_Origin_Sys ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginSys() != null ) {

			if(o.getObsrvtnVlSampledDataOriginSys().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataOriginSys()==null) {} else {
			observation.getValueSampledData().getOrigin().setSystem(o.getObsrvtnVlSampledDataOriginSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlSampledData_Origin_Unt ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginUnt() != null ) {

			if(o.getObsrvtnVlSampledDataOriginUnt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataOriginUnt()==null) {} else {
			observation.getValueSampledData().getOrigin().setUnit(o.getObsrvtnVlSampledDataOriginUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Obsrvtn_VlSampledData_Origin_Vl ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginVl() != null ) {

			if(o.getObsrvtnVlSampledDataOriginVl().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataOriginVl()==null) {} else {
			observation.getValueSampledData().getOrigin().setValue((new java.math.BigDecimal((o.getObsrvtnVlSampledDataOriginVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlSampledData_Prd ********************************************************************************/
		if(o.getObsrvtnVlSampledDataPrd() != null ) {

			if(o.getObsrvtnVlSampledDataPrd().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataPrd()==null) {} else {
			observation.getValueSampledData().setPeriod((new java.math.BigDecimal((o.getObsrvtnVlSampledDataPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlSampledData_UpperLmt ********************************************************************************/
		if(o.getObsrvtnVlSampledDataUpperLmt() != null ) {

			if(o.getObsrvtnVlSampledDataUpperLmt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlSampledDataUpperLmt()==null) {} else {
			observation.getValueSampledData().setUpperLimit((new java.math.BigDecimal((o.getObsrvtnVlSampledDataUpperLmt().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Obsrvtn_VlStrgTyp ********************************************************************************/
		if(o.getObsrvtnVlStrgTyp() != null ) {

			if(o.getObsrvtnVlStrgTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlStrgTyp()==null) {} else {
			observation.setValue(new org.hl7.fhir.r4.model.StringType(o.getObsrvtnVlStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Obsrvtn_VlTimeTyp ********************************************************************************/
		if(o.getObsrvtnVlTimeTyp() != null ) {

			if(o.getObsrvtnVlTimeTyp().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnVlTimeTyp()==null) {} else {
			observation.setValue(new org.hl7.fhir.r4.model.TimeType(o.getObsrvtnVlTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return observation;
	}
}

