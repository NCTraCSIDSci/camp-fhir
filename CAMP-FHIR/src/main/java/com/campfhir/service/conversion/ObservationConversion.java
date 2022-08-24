<<<<<<< HEAD
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
=======
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

		/******************** Obs_BasedOn ********************************************************************************/
		if(o.getObsBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference ObsBasedOnref = new org.hl7.fhir.r4.model.Reference();
			observation.addBasedOn(ObsBasedOnref.setReference(o.getObsBasedOn()));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetbodysite = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setBodySite(observationsetbodysite);


		org.hl7.fhir.r4.model.Coding observationsetbodysiteaddcoding = observationsetbodysite.addCoding();

		/******************** Obs_BodySite_Coding_Code ********************************************************************************/
		if(o.getObsBodySiteCodingCode() != null) {
			observationsetbodysiteaddcoding.setCode(o.getObsBodySiteCodingCode());
		}
		/******************** Obs_BodySite_Coding_Display ********************************************************************************/
		if(o.getObsBodySiteCodingDisplay() != null) {
			observationsetbodysiteaddcoding.setDisplay(o.getObsBodySiteCodingDisplay());
		}
		/******************** Obs_BodySite_Coding_System ********************************************************************************/
		if(o.getObsBodySiteCodingSystem() != null) {
			observationsetbodysiteaddcoding.setSystem(o.getObsBodySiteCodingSystem());
		}
		/******************** Obs_BodySite_Coding_Usrslt ********************************************************************************/
		if(o.getObsBodySiteCodingUsrslt() != null) {
			observationsetbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsBodySiteCodingUsrslt()));
		}
		/******************** Obs_BodySite_Coding_Version ********************************************************************************/
		if(o.getObsBodySiteCodingVersion() != null) {
			observationsetbodysiteaddcoding.setVersion(o.getObsBodySiteCodingVersion());
		}
		/******************** Obs_BodySite_Text ********************************************************************************/
		if(o.getObsBodySiteText() != null) {
			observationsetbodysite.setText(o.getObsBodySiteText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcategory = observation.addCategory();


		org.hl7.fhir.r4.model.Coding observationaddcategoryaddcoding = observationaddcategory.addCoding();

		/******************** Obs_Category_Coding_Code ********************************************************************************/
		if(o.getObsCategoryCodingCode() != null) {
			observationaddcategoryaddcoding.setCode(o.getObsCategoryCodingCode());
		}
		/******************** Obs_Category_Coding_Display ********************************************************************************/
		if(o.getObsCategoryCodingDisplay() != null) {
			observationaddcategoryaddcoding.setDisplay(o.getObsCategoryCodingDisplay());
		}
		/******************** Obs_Category_Coding_System ********************************************************************************/
		if(o.getObsCategoryCodingSystem() != null) {
			observationaddcategoryaddcoding.setSystem(o.getObsCategoryCodingSystem());
		}
		/******************** Obs_Category_Coding_Usrslt ********************************************************************************/
		if(o.getObsCategoryCodingUsrslt() != null) {
			observationaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsCategoryCodingUsrslt()));
		}
		/******************** Obs_Category_Coding_Version ********************************************************************************/
		if(o.getObsCategoryCodingVersion() != null) {
			observationaddcategoryaddcoding.setVersion(o.getObsCategoryCodingVersion());
		}
		/******************** Obs_Category_Text ********************************************************************************/
		if(o.getObsCategoryText() != null) {
			observationaddcategory.setText(o.getObsCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setCode(observationsetcode);


		org.hl7.fhir.r4.model.Coding observationsetcodeaddcoding = observationsetcode.addCoding();

		/******************** Obs_Code_Coding_Code ********************************************************************************/
		if(o.getObsCodeCodingCode() != null) {
			observationsetcodeaddcoding.setCode(o.getObsCodeCodingCode());
		}
		/******************** Obs_Code_Coding_Display ********************************************************************************/
		if(o.getObsCodeCodingDisplay() != null) {
			observationsetcodeaddcoding.setDisplay(o.getObsCodeCodingDisplay());
		}
		/******************** Obs_Code_Coding_System ********************************************************************************/
		if(o.getObsCodeCodingSystem() != null) {
			observationsetcodeaddcoding.setSystem(o.getObsCodeCodingSystem());
		}
		/******************** Obs_Code_Coding_Usrslt ********************************************************************************/
		if(o.getObsCodeCodingUsrslt() != null) {
			observationsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsCodeCodingUsrslt()));
		}
		/******************** Obs_Code_Coding_Version ********************************************************************************/
		if(o.getObsCodeCodingVersion() != null) {
			observationsetcodeaddcoding.setVersion(o.getObsCodeCodingVersion());
		}
		/******************** Obs_Code_Text ********************************************************************************/
		if(o.getObsCodeText() != null) {
			observationsetcode.setText(o.getObsCodeText());
		}

		org.hl7.fhir.r4.model.Observation.ObservationComponentComponent observationaddcomponent = observation.addComponent();


		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponent.setCode(observationaddcomponentsetcode);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetcodeaddcoding = observationaddcomponentsetcode.addCoding();

		/******************** Obs_Component_Code_Coding_Code ********************************************************************************/
		if(o.getObsComponentCodeCodingCode() != null) {
			observationaddcomponentsetcodeaddcoding.setCode(o.getObsComponentCodeCodingCode());
		}
		/******************** Obs_Component_Code_Coding_Display ********************************************************************************/
		if(o.getObsComponentCodeCodingDisplay() != null) {
			observationaddcomponentsetcodeaddcoding.setDisplay(o.getObsComponentCodeCodingDisplay());
		}
		/******************** Obs_Component_Code_Coding_System ********************************************************************************/
		if(o.getObsComponentCodeCodingSystem() != null) {
			observationaddcomponentsetcodeaddcoding.setSystem(o.getObsComponentCodeCodingSystem());
		}
		/******************** Obs_Component_Code_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentCodeCodingUsrslt() != null) {
			observationaddcomponentsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentCodeCodingUsrslt()));
		}
		/******************** Obs_Component_Code_Coding_Version ********************************************************************************/
		if(o.getObsComponentCodeCodingVersion() != null) {
			observationaddcomponentsetcodeaddcoding.setVersion(o.getObsComponentCodeCodingVersion());
		}
		/******************** Obs_Component_Code_Text ********************************************************************************/
		if(o.getObsComponentCodeText() != null) {
			observationaddcomponentsetcode.setText(o.getObsComponentCodeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetdataabsentreason = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponent.setDataAbsentReason(observationaddcomponentsetdataabsentreason);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetdataabsentreasonaddcoding = observationaddcomponentsetdataabsentreason.addCoding();

		/******************** Obs_Component_DataAbsentReason_Coding_Code ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingCode() != null) { 
			observationaddcomponentsetdataabsentreasonaddcoding.setCode(o.getObsComponentDataAbsentReasonCodingCode());
		}
		/******************** Obs_Component_DataAbsentReason_Coding_Display ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingDisplay() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setDisplay(o.getObsComponentDataAbsentReasonCodingDisplay());
		}
		/******************** Obs_Component_DataAbsentReason_Coding_System ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingSystem() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setSystem(o.getObsComponentDataAbsentReasonCodingSystem());
		}
		/******************** Obs_Component_DataAbsentReason_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingUsrslt() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentDataAbsentReasonCodingUsrslt()));
		}
		/******************** Obs_Component_DataAbsentReason_Coding_Version ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingVersion() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setVersion(o.getObsComponentDataAbsentReasonCodingVersion());
		}
		/******************** Obs_Component_DataAbsentReason_Text ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonText() != null) {
			observationaddcomponentsetdataabsentreason.setText(o.getObsComponentDataAbsentReasonText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddinterpretation = observationaddcomponent.addInterpretation();


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddinterpretationaddcoding = observationaddcomponentaddinterpretation.addCoding();

		/******************** Obs_Component_Interpretation_Coding_Code ********************************************************************************/
		if(o.getObsComponentInterpretationCodingCode() != null) {
			observationaddcomponentaddinterpretationaddcoding.setCode(o.getObsComponentInterpretationCodingCode());
		}
		/******************** Obs_Component_Interpretation_Coding_Display ********************************************************************************/
		if(o.getObsComponentInterpretationCodingDisplay() != null) {
			observationaddcomponentaddinterpretationaddcoding.setDisplay(o.getObsComponentInterpretationCodingDisplay());
		}
		/******************** Obs_Component_Interpretation_Coding_System ********************************************************************************/
		if(o.getObsComponentInterpretationCodingSystem() != null) {
			observationaddcomponentaddinterpretationaddcoding.setSystem(o.getObsComponentInterpretationCodingSystem());
		}
		/******************** Obs_Component_Interpretation_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentInterpretationCodingUsrslt() != null) {
			observationaddcomponentaddinterpretationaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentInterpretationCodingUsrslt()));
		}
		/******************** Obs_Component_Interpretation_Coding_Version ********************************************************************************/
		if(o.getObsComponentInterpretationCodingVersion() != null) {
			observationaddcomponentaddinterpretationaddcoding.setVersion(o.getObsComponentInterpretationCodingVersion());
		}
		/******************** Obs_Component_Interpretation_Text ********************************************************************************/
		if(o.getObsComponentInterpretationText() != null) {
			observationaddcomponentaddinterpretation.setText(o.getObsComponentInterpretationText());
		}

		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationaddcomponentaddreferencerange = observationaddcomponent.addReferenceRange();


		org.hl7.fhir.r4.model.Range observationaddcomponentaddreferencerangesetage = new org.hl7.fhir.r4.model.Range();
		observationaddcomponentaddreferencerange.setAge(observationaddcomponentaddreferencerangesetage);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetagesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerangesetage.setHigh(observationaddcomponentaddreferencerangesetagesethigh);

		/******************** Obs_Component_ReferenceRange_Age_High_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighCode() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setCode(o.getObsComponentReferenceRangeAgeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetagesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_Age_High_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighCompartrCode() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setComparator(observationaddcomponentaddreferencerangesetagesethighsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeAgeHighCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_Age_High_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighSystem() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setSystem(o.getObsComponentReferenceRangeAgeHighSystem());
		}
		/******************** Obs_Component_ReferenceRange_Age_High_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighUnit() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setUnit(o.getObsComponentReferenceRangeAgeHighUnit());
		}
		/******************** Obs_Component_ReferenceRange_Age_High_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighValue() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setValue(Double.parseDouble((o.getObsComponentReferenceRangeAgeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetagesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerangesetage.setLow(observationaddcomponentaddreferencerangesetagesetlow);

		/******************** Obs_Component_ReferenceRange_Age_Low_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowCode() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setCode(o.getObsComponentReferenceRangeAgeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetagesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_Age_Low_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowCompartrCode() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setComparator(observationaddcomponentaddreferencerangesetagesetlowsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeAgeLowCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_Age_Low_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowSystem() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setSystem(o.getObsComponentReferenceRangeAgeLowSystem());
		}
		/******************** Obs_Component_ReferenceRange_Age_Low_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowUnit() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setUnit(o.getObsComponentReferenceRangeAgeLowUnit());
		}
		/******************** Obs_Component_ReferenceRange_Age_Low_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowValue() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setValue(Double.parseDouble((o.getObsComponentReferenceRangeAgeLowValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddreferencerangeaddappliesto = observationaddcomponentaddreferencerange.addAppliesTo();


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddreferencerangeaddappliestoaddcoding = observationaddcomponentaddreferencerangeaddappliesto.addCoding();

		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingCode() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setCode(o.getObsComponentReferenceRangeAppliesToCodingCode());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Display ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingDisplay() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setDisplay(o.getObsComponentReferenceRangeAppliesToCodingDisplay());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingSystem() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setSystem(o.getObsComponentReferenceRangeAppliesToCodingSystem());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingUsrslt() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentReferenceRangeAppliesToCodingUsrslt()));
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Version ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingVersion() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setVersion(o.getObsComponentReferenceRangeAppliesToCodingVersion());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Text ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToText() != null) {
			observationaddcomponentaddreferencerangeaddappliesto.setText(o.getObsComponentReferenceRangeAppliesToText());
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerange.setHigh(observationaddcomponentaddreferencerangesethigh);

		/******************** Obs_Component_ReferenceRange_High_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighCode() != null) {
			observationaddcomponentaddreferencerangesethigh.setCode(o.getObsComponentReferenceRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_High_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighCompartrCode() != null) {
			observationaddcomponentaddreferencerangesethigh.setComparator(observationaddcomponentaddreferencerangesethighsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeHighCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_High_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighSystem() != null) {
			observationaddcomponentaddreferencerangesethigh.setSystem(o.getObsComponentReferenceRangeHighSystem());
		}
		/******************** Obs_Component_ReferenceRange_High_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighUnit() != null) {
			observationaddcomponentaddreferencerangesethigh.setUnit(o.getObsComponentReferenceRangeHighUnit());
		}
		/******************** Obs_Component_ReferenceRange_High_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighValue() != null) {
			observationaddcomponentaddreferencerangesethigh.setValue(Double.parseDouble((o.getObsComponentReferenceRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerange.setLow(observationaddcomponentaddreferencerangesetlow);

		/******************** Obs_Component_ReferenceRange_Low_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowCode() != null) {
			observationaddcomponentaddreferencerangesetlow.setCode(o.getObsComponentReferenceRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_Low_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowCompartrCode() != null) {
			observationaddcomponentaddreferencerangesetlow.setComparator(observationaddcomponentaddreferencerangesetlowsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeLowCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_Low_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowSystem() != null) {
			observationaddcomponentaddreferencerangesetlow.setSystem(o.getObsComponentReferenceRangeLowSystem());
		}
		/******************** Obs_Component_ReferenceRange_Low_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowUnit() != null) {
			observationaddcomponentaddreferencerangesetlow.setUnit(o.getObsComponentReferenceRangeLowUnit());
		}
		/******************** Obs_Component_ReferenceRange_Low_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowValue() != null) {
			observationaddcomponentaddreferencerangesetlow.setValue(Double.parseDouble((o.getObsComponentReferenceRangeLowValue())));
		}
		/******************** Obs_Component_ReferenceRange_Text ********************************************************************************/
		if(o.getObsComponentReferenceRangeText() != null) {
			observationaddcomponentaddreferencerange.setText(o.getObsComponentReferenceRangeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddreferencerangesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponentaddreferencerange.setType(observationaddcomponentaddreferencerangesettype);


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddreferencerangesettypeaddcoding = observationaddcomponentaddreferencerangesettype.addCoding();

		/******************** Obs_Component_ReferenceRange_Type_Coding_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingCode() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setCode(o.getObsComponentReferenceRangeTypeCodingCode());
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_Display ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingDisplay() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setDisplay(o.getObsComponentReferenceRangeTypeCodingDisplay());
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingSystem() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setSystem(o.getObsComponentReferenceRangeTypeCodingSystem());
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingUsrslt() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentReferenceRangeTypeCodingUsrslt()));
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_Version ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingVersion() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setVersion(o.getObsComponentReferenceRangeTypeCodingVersion());
		}
		/******************** Obs_Component_ReferenceRange_Type_Text ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeText() != null) {
			observationaddcomponentaddreferencerangesettype.setText(o.getObsComponentReferenceRangeTypeText());
		}
		/******************** Observation_Component_ValueBoolean ********************************************************************************/
		if(o.getObservationComponentValueBoolean() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.BooleanType(o.getObservationComponentValueBoolean()));
		}

		if( o.getObsComponentValueCodeableConceptCodingCode() != null || o.getObsComponentValueCodeableConceptCodingDisplay() != null || o.getObsComponentValueCodeableConceptCodingSystem() != null || o.getObsComponentValueCodeableConceptCodingUsrslt() != null || o.getObsComponentValueCodeableConceptCodingVersion() != null || o.getObsComponentValueCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetvalueCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			observationaddcomponent.setValue(observationaddcomponentsetvalueCodeableConcept);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetvalueCodeableConceptaddcoding = observationaddcomponentsetvalueCodeableConcept.addCoding();

		/******************** Obs_Component_Value_CodeableConcept_Coding_Code ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingCode() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setCode(o.getObsComponentValueCodeableConceptCodingCode());
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_Display ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingDisplay() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setDisplay(o.getObsComponentValueCodeableConceptCodingDisplay());
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_System ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingSystem() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setSystem(o.getObsComponentValueCodeableConceptCodingSystem());
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingUsrslt() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentValueCodeableConceptCodingUsrslt()));
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_Version ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingVersion() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setVersion(o.getObsComponentValueCodeableConceptCodingVersion());
		}
		/******************** Obs_Component_Value_CodeableConcept_Text ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptText() != null) {
			observationaddcomponentsetvalueCodeableConcept.setText(o.getObsComponentValueCodeableConceptText());
		}
		}
		/******************** Observation_Component_ValueDateTime ********************************************************************************/
		if(o.getObservationComponentValueDateTime() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.DateTimeType(o.getObservationComponentValueDateTime()));
		}
		/******************** Observation_Component_ValueInteger ********************************************************************************/
		if(o.getObservationComponentValueInteger() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.IntegerType(o.getObservationComponentValueInteger()));
		}

		if( o.getObsComponentValuePeriodEnd() != null || o.getObsComponentValuePeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationaddcomponentsetvaluePeriod = new org.hl7.fhir.r4.model.Period();
			observationaddcomponent.setValue(observationaddcomponentsetvaluePeriod);

		/******************** Obs_Component_Value_Period_End ********************************************************************************/
		if(o.getObsComponentValuePeriodEnd() != null) {
			java.text.SimpleDateFormat ObsComponentValuePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsComponentValuePeriodEnddate = ObsComponentValuePeriodEndsdf.parse(o.getObsComponentValuePeriodEnd());
			observationaddcomponentsetvaluePeriod.setEnd(ObsComponentValuePeriodEnddate);
		}
		/******************** Obs_Component_Value_Period_Start ********************************************************************************/
		if(o.getObsComponentValuePeriodStart() != null) {
			java.text.SimpleDateFormat ObsComponentValuePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsComponentValuePeriodStartdate = ObsComponentValuePeriodStartsdf.parse(o.getObsComponentValuePeriodStart());
			observationaddcomponentsetvaluePeriod.setStart(ObsComponentValuePeriodStartdate);
		}
		}

		if( o.getObsComponentValueQuantityCode() != null || o.getObsComponentValueQuantityCompartrCode() != null || o.getObsComponentValueQuantitySystem() != null || o.getObsComponentValueQuantityUnit() != null || o.getObsComponentValueQuantityValue() != null ) {
			org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueQuantity = new org.hl7.fhir.r4.model.Quantity();
			observationaddcomponent.setValue(observationaddcomponentsetvalueQuantity);

		/******************** Obs_Component_Value_Quantity_Code ********************************************************************************/
		if(o.getObsComponentValueQuantityCode() != null) {
			observationaddcomponentsetvalueQuantity.setCode(o.getObsComponentValueQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueQuantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Quantity_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueQuantityCompartrCode() != null) {
			observationaddcomponentsetvalueQuantity.setComparator(observationaddcomponentsetvalueQuantitysetcomparatorEnumFactory.fromCode(o.getObsComponentValueQuantityCompartrCode()));

		}
		/******************** Obs_Component_Value_Quantity_System ********************************************************************************/
		if(o.getObsComponentValueQuantitySystem() != null) {
			observationaddcomponentsetvalueQuantity.setSystem(o.getObsComponentValueQuantitySystem());
		}
		/******************** Obs_Component_Value_Quantity_Unit ********************************************************************************/
		if(o.getObsComponentValueQuantityUnit() != null) {
			observationaddcomponentsetvalueQuantity.setUnit(o.getObsComponentValueQuantityUnit());
		}
		/******************** Obs_Component_Value_Quantity_Value ********************************************************************************/
		if(o.getObsComponentValueQuantityValue() != null) {
			observationaddcomponentsetvalueQuantity.setValue(Double.parseDouble((o.getObsComponentValueQuantityValue())));
		}
		}

		if( o.getObsComponentValueRangeHighCode() != null || o.getObsComponentValueRangeHighCompartrCode() != null || o.getObsComponentValueRangeHighSystem() != null || o.getObsComponentValueRangeHighUnit() != null || o.getObsComponentValueRangeHighValue() != null || o.getObsComponentValueRangeLowCode() != null || o.getObsComponentValueRangeLowCompartrCode() != null || o.getObsComponentValueRangeLowSystem() != null || o.getObsComponentValueRangeLowUnit() != null || o.getObsComponentValueRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range observationaddcomponentsetvalueRange = new org.hl7.fhir.r4.model.Range();
			observationaddcomponent.setValue(observationaddcomponentsetvalueRange);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRange.setHigh(observationaddcomponentsetvalueRangesethigh);

		/******************** Obs_Component_Value_Range_High_Code ********************************************************************************/
		if(o.getObsComponentValueRangeHighCode() != null) {
			observationaddcomponentsetvalueRangesethigh.setCode(o.getObsComponentValueRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Range_High_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRangeHighCompartrCode() != null) {
			observationaddcomponentsetvalueRangesethigh.setComparator(observationaddcomponentsetvalueRangesethighsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRangeHighCompartrCode()));

		}
		/******************** Obs_Component_Value_Range_High_System ********************************************************************************/
		if(o.getObsComponentValueRangeHighSystem() != null) {
			observationaddcomponentsetvalueRangesethigh.setSystem(o.getObsComponentValueRangeHighSystem());
		}
		/******************** Obs_Component_Value_Range_High_Unit ********************************************************************************/
		if(o.getObsComponentValueRangeHighUnit() != null) {
			observationaddcomponentsetvalueRangesethigh.setUnit(o.getObsComponentValueRangeHighUnit());
		}
		/******************** Obs_Component_Value_Range_High_Value ********************************************************************************/
		if(o.getObsComponentValueRangeHighValue() != null) {
			observationaddcomponentsetvalueRangesethigh.setValue(Double.parseDouble((o.getObsComponentValueRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRange.setLow(observationaddcomponentsetvalueRangesetlow);

		/******************** Obs_Component_Value_Range_Low_Code ********************************************************************************/
		if(o.getObsComponentValueRangeLowCode() != null) {
			observationaddcomponentsetvalueRangesetlow.setCode(o.getObsComponentValueRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Range_Low_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRangeLowCompartrCode() != null) {
			observationaddcomponentsetvalueRangesetlow.setComparator(observationaddcomponentsetvalueRangesetlowsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRangeLowCompartrCode()));

		}
		/******************** Obs_Component_Value_Range_Low_System ********************************************************************************/
		if(o.getObsComponentValueRangeLowSystem() != null) {
			observationaddcomponentsetvalueRangesetlow.setSystem(o.getObsComponentValueRangeLowSystem());
		}
		/******************** Obs_Component_Value_Range_Low_Unit ********************************************************************************/
		if(o.getObsComponentValueRangeLowUnit() != null) {
			observationaddcomponentsetvalueRangesetlow.setUnit(o.getObsComponentValueRangeLowUnit());
		}
		/******************** Obs_Component_Value_Range_Low_Value ********************************************************************************/
		if(o.getObsComponentValueRangeLowValue() != null) {
			observationaddcomponentsetvalueRangesetlow.setValue(Double.parseDouble((o.getObsComponentValueRangeLowValue())));
		}
		}

		if( o.getObsComponentValueRatioDenomCode() != null || o.getObsComponentValueRatioDenomCompartrCode() != null || o.getObsComponentValueRatioDenomSystem() != null || o.getObsComponentValueRatioDenomUnit() != null || o.getObsComponentValueRatioDenomValue() != null || o.getObsComponentValueRatioNumeratorCode() != null || o.getObsComponentValueRatioNumeratorCompartrCode() != null || o.getObsComponentValueRatioNumeratorSystem() != null || o.getObsComponentValueRatioNumeratorUnit() != null || o.getObsComponentValueRatioNumeratorValue() != null ) {
			org.hl7.fhir.r4.model.Ratio observationaddcomponentsetvalueRatio = new org.hl7.fhir.r4.model.Ratio();
			observationaddcomponent.setValue(observationaddcomponentsetvalueRatio);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRatiosetdenominator = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRatio.setDenominator(observationaddcomponentsetvalueRatiosetdenominator);

		/******************** Obs_Component_Value_Ratio_Denom_Code ********************************************************************************/
		if(o.getObsComponentValueRatioDenomCode() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setCode(o.getObsComponentValueRatioDenomCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRatiosetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Ratio_Denom_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRatioDenomCompartrCode() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setComparator(observationaddcomponentsetvalueRatiosetdenominatorsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRatioDenomCompartrCode()));

		}
		/******************** Obs_Component_Value_Ratio_Denom_System ********************************************************************************/
		if(o.getObsComponentValueRatioDenomSystem() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setSystem(o.getObsComponentValueRatioDenomSystem());
		}
		/******************** Obs_Component_Value_Ratio_Denom_Unit ********************************************************************************/
		if(o.getObsComponentValueRatioDenomUnit() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setUnit(o.getObsComponentValueRatioDenomUnit());
		}
		/******************** Obs_Component_Value_Ratio_Denom_Value ********************************************************************************/
		if(o.getObsComponentValueRatioDenomValue() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setValue(Double.parseDouble((o.getObsComponentValueRatioDenomValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRatiosetnumerator = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRatio.setNumerator(observationaddcomponentsetvalueRatiosetnumerator);

		/******************** Obs_Component_Value_Ratio_Numerator_Code ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorCode() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setCode(o.getObsComponentValueRatioNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRatiosetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Ratio_Numerator_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorCompartrCode() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setComparator(observationaddcomponentsetvalueRatiosetnumeratorsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRatioNumeratorCompartrCode()));

		}
		/******************** Obs_Component_Value_Ratio_Numerator_System ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorSystem() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setSystem(o.getObsComponentValueRatioNumeratorSystem());
		}
		/******************** Obs_Component_Value_Ratio_Numerator_Unit ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorUnit() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setUnit(o.getObsComponentValueRatioNumeratorUnit());
		}
		/******************** Obs_Component_Value_Ratio_Numerator_Value ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorValue() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setValue(Double.parseDouble((o.getObsComponentValueRatioNumeratorValue())));
		}
		}

		if( o.getObsComponentValueSampledDataData() != null || o.getObsComponentValueSampledDataDimensions() != null || o.getObsComponentValueSampledDataFactor() != null || o.getObsComponentValueSampledDataLowerLimit() != null || o.getObsComponentValueSampledDataOriginCode() != null || o.getObsComponentValueSampledDataOriginCompartrCode() != null || o.getObsComponentValueSampledDataOriginSystem() != null || o.getObsComponentValueSampledDataOriginUnit() != null || o.getObsComponentValueSampledDataOriginValue() != null || o.getObsComponentValueSampledDataPeriod() != null || o.getObsComponentValueSampledDataUpperLimit() != null ) {
			org.hl7.fhir.r4.model.SampledData observationaddcomponentsetvalueSampledData = new org.hl7.fhir.r4.model.SampledData();
			observationaddcomponent.setValue(observationaddcomponentsetvalueSampledData);

		/******************** Obs_Component_Value_SampledData_Data ********************************************************************************/
		if(o.getObsComponentValueSampledDataData() != null) {
			observationaddcomponentsetvalueSampledData.setData(o.getObsComponentValueSampledDataData());
		}
		/******************** Obs_Component_Value_SampledData_Dimensions ********************************************************************************/
		if(o.getObsComponentValueSampledDataDimensions() != null) {
			observationaddcomponentsetvalueSampledData.setDimensions(Integer.parseInt(o.getObsComponentValueSampledDataDimensions()));
		}
		/******************** Obs_Component_Value_SampledData_Factor ********************************************************************************/
		if(o.getObsComponentValueSampledDataFactor() != null) {
			observationaddcomponentsetvalueSampledData.setFactor(Double.parseDouble((o.getObsComponentValueSampledDataFactor())));
		}
		/******************** Obs_Component_Value_SampledData_LowerLimit ********************************************************************************/
		if(o.getObsComponentValueSampledDataLowerLimit() != null) {
			observationaddcomponentsetvalueSampledData.setLowerLimit(Double.parseDouble((o.getObsComponentValueSampledDataLowerLimit())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueSampledDatasetorigin = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueSampledData.setOrigin(observationaddcomponentsetvalueSampledDatasetorigin);

		/******************** Obs_Component_Value_SampledData_Origin_Code ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginCode() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setCode(o.getObsComponentValueSampledDataOriginCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueSampledDatasetoriginsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_SampledData_Origin_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginCompartrCode() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setComparator(observationaddcomponentsetvalueSampledDatasetoriginsetcomparatorEnumFactory.fromCode(o.getObsComponentValueSampledDataOriginCompartrCode()));

		}
		/******************** Obs_Component_Value_SampledData_Origin_System ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginSystem() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setSystem(o.getObsComponentValueSampledDataOriginSystem());
		}
		/******************** Obs_Component_Value_SampledData_Origin_Unit ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginUnit() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setUnit(o.getObsComponentValueSampledDataOriginUnit());
		}
		/******************** Obs_Component_Value_SampledData_Origin_Value ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginValue() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setValue(Double.parseDouble((o.getObsComponentValueSampledDataOriginValue())));
		}
		/******************** Obs_Component_Value_SampledData_Period ********************************************************************************/
		if(o.getObsComponentValueSampledDataPeriod() != null) {
			observationaddcomponentsetvalueSampledData.setPeriod(Double.parseDouble((o.getObsComponentValueSampledDataPeriod())));
		}
		/******************** Obs_Component_Value_SampledData_UpperLimit ********************************************************************************/
		if(o.getObsComponentValueSampledDataUpperLimit() != null) {
			observationaddcomponentsetvalueSampledData.setUpperLimit(Double.parseDouble((o.getObsComponentValueSampledDataUpperLimit())));
		}
		}
		/******************** Observation_Component_ValueString ********************************************************************************/
		if(o.getObservationComponentValueString() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.StringType(o.getObservationComponentValueString()));
		}
		/******************** Observation_Component_ValueTime ********************************************************************************/
		if(o.getObservationComponentValueTime() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.TimeType(o.getObservationComponentValueTime()));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetdataabsentreason = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setDataAbsentReason(observationsetdataabsentreason);


		org.hl7.fhir.r4.model.Coding observationsetdataabsentreasonaddcoding = observationsetdataabsentreason.addCoding();

		/******************** Obs_DataAbsentReason_Coding_Code ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingCode() != null) {
			observationsetdataabsentreasonaddcoding.setCode(o.getObsDataAbsentReasonCodingCode());
		}
		/******************** Obs_DataAbsentReason_Coding_Display ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingDisplay() != null) {
			observationsetdataabsentreasonaddcoding.setDisplay(o.getObsDataAbsentReasonCodingDisplay());
		}
		/******************** Obs_DataAbsentReason_Coding_System ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingSystem() != null) {
			observationsetdataabsentreasonaddcoding.setSystem(o.getObsDataAbsentReasonCodingSystem());
		}
		/******************** Obs_DataAbsentReason_Coding_Usrslt ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingUsrslt() != null) {
			observationsetdataabsentreasonaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsDataAbsentReasonCodingUsrslt()));
		}
		/******************** Obs_DataAbsentReason_Coding_Version ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingVersion() != null) {
			observationsetdataabsentreasonaddcoding.setVersion(o.getObsDataAbsentReasonCodingVersion());
		}
		/******************** Obs_DataAbsentReason_Text ********************************************************************************/
		if(o.getObsDataAbsentReasonText() != null) {
			observationsetdataabsentreason.setText(o.getObsDataAbsentReasonText());
		}
		/******************** Obs_DerivedFrom ********************************************************************************/
		if(o.getObsDerivedFrom() != null) {
			org.hl7.fhir.r4.model.Reference ObsDerivedFromref = new org.hl7.fhir.r4.model.Reference();
			observation.addDerivedFrom(ObsDerivedFromref.setReference(o.getObsDerivedFrom()));
		}
		/******************** Obs_Device ********************************************************************************/
		if(o.getObsDevice() != null) {
			org.hl7.fhir.r4.model.Reference ObsDeviceref = new org.hl7.fhir.r4.model.Reference();
			observation.setDevice(ObsDeviceref.setReference(o.getObsDevice()));
		}
		/******************** Observation_EffectiveDateTime ********************************************************************************/
		if(o.getObservationEffectiveDateTime() != null) {
			observation.setEffective(new org.hl7.fhir.r4.model.DateTimeType(o.getObservationEffectiveDateTime()));
		}
		/******************** Observation_EffectiveInstant ********************************************************************************/
		if(o.getObservationEffectiveInstant() != null) {
			observation.setEffective(new org.hl7.fhir.r4.model.InstantType(o.getObservationEffectiveInstant()));
		}

		if( o.getObsEffectivePeriodEnd() != null || o.getObsEffectivePeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationseteffectivePeriod = new org.hl7.fhir.r4.model.Period();
			observation.setEffective(observationseteffectivePeriod);

		/******************** Obs_Effective_Period_End ********************************************************************************/
		if(o.getObsEffectivePeriodEnd() != null) {
			java.text.SimpleDateFormat ObsEffectivePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectivePeriodEnddate = ObsEffectivePeriodEndsdf.parse(o.getObsEffectivePeriodEnd());
			observationseteffectivePeriod.setEnd(ObsEffectivePeriodEnddate);
		}
		/******************** Obs_Effective_Period_Start ********************************************************************************/
		if(o.getObsEffectivePeriodStart() != null) {
			java.text.SimpleDateFormat ObsEffectivePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectivePeriodStartdate = ObsEffectivePeriodStartsdf.parse(o.getObsEffectivePeriodStart());
			observationseteffectivePeriod.setStart(ObsEffectivePeriodStartdate);
		}
		}

		if( o.getObsEffectiveTimingCodeCodingCode() != null || o.getObsEffectiveTimingCodeCodingDisplay() != null || o.getObsEffectiveTimingCodeCodingSystem() != null || o.getObsEffectiveTimingCodeCodingUsrslt() != null || o.getObsEffectiveTimingCodeCodingVersion() != null || o.getObsEffectiveTimingCodeText() != null || o.getObsEffectiveTimingEvent() != null || o.getObsEffectiveTimingRepeatBoundsDurationCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationSystem() != null || o.getObsEffectiveTimingRepeatBoundsDurationUnit() != null || o.getObsEffectiveTimingRepeatBoundsDurationValue() != null || o.getObsEffectiveTimingRepeatBoundsPeriodEnd() != null || o.getObsEffectiveTimingRepeatBoundsPeriodStart() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighValue() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowValue() != null || o.getObsEffectiveTimingRepeatCount() != null || o.getObsEffectiveTimingRepeatCountMax() != null || o.getObsEffectiveTimingRepeatDayOfWeekCode() != null || o.getObsEffectiveTimingRepeatDuration() != null || o.getObsEffectiveTimingRepeatDurationMax() != null || o.getObsEffectiveTimingRepeatDurationUnitCode() != null || o.getObsEffectiveTimingRepeatFrequency() != null || o.getObsEffectiveTimingRepeatFrequencyMax() != null || o.getObsEffectiveTimingRepeatOff() != null || o.getObsEffectiveTimingRepeatPeriod() != null || o.getObsEffectiveTimingRepeatPeriodMax() != null || o.getObsEffectiveTimingRepeatPeriodUnitCode() != null || o.getObsEffectiveTimingRepeatTimeOfDay() != null || o.getObsEffectiveTimingRepeatWhenCode() != null ) {
			org.hl7.fhir.r4.model.Timing observationseteffectiveTiming = new org.hl7.fhir.r4.model.Timing();
			observation.setEffective(observationseteffectiveTiming);


		org.hl7.fhir.r4.model.CodeableConcept observationseteffectiveTimingsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observationseteffectiveTiming.setCode(observationseteffectiveTimingsetcode);


		org.hl7.fhir.r4.model.Coding observationseteffectiveTimingsetcodeaddcoding = observationseteffectiveTimingsetcode.addCoding();

		/******************** Obs_Effective_Timing_Code_Coding_Code ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingCode() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setCode(o.getObsEffectiveTimingCodeCodingCode());
		}
		/******************** Obs_Effective_Timing_Code_Coding_Display ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingDisplay() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setDisplay(o.getObsEffectiveTimingCodeCodingDisplay());
		}
		/******************** Obs_Effective_Timing_Code_Coding_System ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingSystem() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setSystem(o.getObsEffectiveTimingCodeCodingSystem());
		}
		/******************** Obs_Effective_Timing_Code_Coding_Usrslt ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingUsrslt() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsEffectiveTimingCodeCodingUsrslt()));
		}
		/******************** Obs_Effective_Timing_Code_Coding_Version ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingVersion() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setVersion(o.getObsEffectiveTimingCodeCodingVersion());
		}
		/******************** Obs_Effective_Timing_Code_Text ********************************************************************************/
		if(o.getObsEffectiveTimingCodeText() != null) {
			observationseteffectiveTimingsetcode.setText(o.getObsEffectiveTimingCodeText());
		}
		/******************** Obs_Effective_Timing_Event ********************************************************************************/
		if(o.getObsEffectiveTimingEvent() != null) {
			java.text.SimpleDateFormat ObsEffectiveTimingEventsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectiveTimingEventdate = ObsEffectiveTimingEventsdf.parse(o.getObsEffectiveTimingEvent());
			observationseteffectiveTiming.addEvent(ObsEffectiveTimingEventdate);
		}

		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent observationseteffectiveTimingsetrepeat = new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		observationseteffectiveTiming.setRepeat(observationseteffectiveTimingsetrepeat);


		if( o.getObsEffectiveTimingRepeatBoundsDurationCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationSystem() != null || o.getObsEffectiveTimingRepeatBoundsDurationUnit() != null || o.getObsEffectiveTimingRepeatBoundsDurationValue() != null ) {
			org.hl7.fhir.r4.model.Duration observationseteffectiveTimingsetrepeatsetboundsDuration = new org.hl7.fhir.r4.model.Duration();
			observationseteffectiveTimingsetrepeat.setBounds(observationseteffectiveTimingsetrepeatsetboundsDuration);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setCode(o.getObsEffectiveTimingRepeatBoundsDurationCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationseteffectiveTimingsetrepeatsetboundsDurationsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Compartr_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setComparator(observationseteffectiveTimingsetrepeatsetboundsDurationsetcomparatorEnumFactory.fromCode(o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode()));

		} 
		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_System ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationSystem() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setSystem(o.getObsEffectiveTimingRepeatBoundsDurationSystem());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Unit ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationUnit() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setUnit(o.getObsEffectiveTimingRepeatBoundsDurationUnit());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Value ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationValue() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setValue(Double.parseDouble((o.getObsEffectiveTimingRepeatBoundsDurationValue())));
		}
		}

		if( o.getObsEffectiveTimingRepeatBoundsPeriodEnd() != null || o.getObsEffectiveTimingRepeatBoundsPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationseteffectiveTimingsetrepeatsetboundsPeriod = new org.hl7.fhir.r4.model.Period();
			observationseteffectiveTimingsetrepeat.setBounds(observationseteffectiveTimingsetrepeatsetboundsPeriod);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Period_End ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsPeriodEnd() != null) {
			java.text.SimpleDateFormat ObsEffectiveTimingRepeatBoundsPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectiveTimingRepeatBoundsPeriodEnddate = ObsEffectiveTimingRepeatBoundsPeriodEndsdf.parse(o.getObsEffectiveTimingRepeatBoundsPeriodEnd());
			observationseteffectiveTimingsetrepeatsetboundsPeriod.setEnd(ObsEffectiveTimingRepeatBoundsPeriodEnddate);
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Period_Start ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsPeriodStart() != null) {
			java.text.SimpleDateFormat ObsEffectiveTimingRepeatBoundsPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectiveTimingRepeatBoundsPeriodStartdate = ObsEffectiveTimingRepeatBoundsPeriodStartsdf.parse(o.getObsEffectiveTimingRepeatBoundsPeriodStart());
			observationseteffectiveTimingsetrepeatsetboundsPeriod.setStart(ObsEffectiveTimingRepeatBoundsPeriodStartdate);
		}
		}

		if( o.getObsEffectiveTimingRepeatBoundsRangeHighCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighValue() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range observationseteffectiveTimingsetrepeatsetboundsRange = new org.hl7.fhir.r4.model.Range();
			observationseteffectiveTimingsetrepeat.setBounds(observationseteffectiveTimingsetrepeatsetboundsRange);


		org.hl7.fhir.r4.model.Quantity observationseteffectiveTimingsetrepeatsetboundsRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationseteffectiveTimingsetrepeatsetboundsRange.setHigh(observationseteffectiveTimingsetrepeatsetboundsRangesethigh);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setCode(o.getObsEffectiveTimingRepeatBoundsRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationseteffectiveTimingsetrepeatsetboundsRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Compartr_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setComparator(observationseteffectiveTimingsetrepeatsetboundsRangesethighsetcomparatorEnumFactory.fromCode(o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_System ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighSystem() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setSystem(o.getObsEffectiveTimingRepeatBoundsRangeHighSystem());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Unit ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighUnit() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setUnit(o.getObsEffectiveTimingRepeatBoundsRangeHighUnit());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Value ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighValue() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setValue(Double.parseDouble((o.getObsEffectiveTimingRepeatBoundsRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationseteffectiveTimingsetrepeatsetboundsRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationseteffectiveTimingsetrepeatsetboundsRange.setLow(observationseteffectiveTimingsetrepeatsetboundsRangesetlow);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setCode(o.getObsEffectiveTimingRepeatBoundsRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationseteffectiveTimingsetrepeatsetboundsRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Compartr_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setComparator(observationseteffectiveTimingsetrepeatsetboundsRangesetlowsetcomparatorEnumFactory.fromCode(o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_System ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowSystem() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setSystem(o.getObsEffectiveTimingRepeatBoundsRangeLowSystem());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Unit ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowUnit() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setUnit(o.getObsEffectiveTimingRepeatBoundsRangeLowUnit());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Value ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowValue() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setValue(Double.parseDouble((o.getObsEffectiveTimingRepeatBoundsRangeLowValue())));
		}
		}
		/******************** Obs_Effective_Timing_Repeat_Count ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatCount() != null) {
			observationseteffectiveTimingsetrepeat.setCount(Integer.parseInt(o.getObsEffectiveTimingRepeatCount()));
		}
		/******************** Obs_Effective_Timing_Repeat_CountMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatCountMax() != null) {
			observationseteffectiveTimingsetrepeat.setCountMax(Integer.parseInt(o.getObsEffectiveTimingRepeatCountMax()));
		}

		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory observationseteffectiveTimingsetrepeatadddayofweekEnumFactory = new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_DayOfWeek_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDayOfWeekCode() != null) {
			observationseteffectiveTimingsetrepeat.addDayOfWeek(observationseteffectiveTimingsetrepeatadddayofweekEnumFactory.fromCode(o.getObsEffectiveTimingRepeatDayOfWeekCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Duration ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDuration() != null) {
			observationseteffectiveTimingsetrepeat.setDuration(Double.parseDouble((o.getObsEffectiveTimingRepeatDuration())));
		}
		/******************** Obs_Effective_Timing_Repeat_DurationMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDurationMax() != null) {
			observationseteffectiveTimingsetrepeat.setDurationMax(Double.parseDouble((o.getObsEffectiveTimingRepeatDurationMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory observationseteffectiveTimingsetrepeatsetdurationunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_DurationUnit_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDurationUnitCode() != null) {
			observationseteffectiveTimingsetrepeat.setDurationUnit(observationseteffectiveTimingsetrepeatsetdurationunitEnumFactory.fromCode(o.getObsEffectiveTimingRepeatDurationUnitCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Frequency ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatFrequency() != null) {
			observationseteffectiveTimingsetrepeat.setFrequency(Integer.parseInt(o.getObsEffectiveTimingRepeatFrequency()));
		}
		/******************** Obs_Effective_Timing_Repeat_FrequencyMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatFrequencyMax() != null) {
			observationseteffectiveTimingsetrepeat.setFrequencyMax(Integer.parseInt(o.getObsEffectiveTimingRepeatFrequencyMax()));
		}
		/******************** Obs_Effective_Timing_Repeat_Off ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatOff() != null) {
			observationseteffectiveTimingsetrepeat.setOffset(Integer.parseInt(o.getObsEffectiveTimingRepeatOff()));
		}
		/******************** Obs_Effective_Timing_Repeat_Period ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatPeriod() != null) {
			observationseteffectiveTimingsetrepeat.setPeriod(Double.parseDouble((o.getObsEffectiveTimingRepeatPeriod())));
		}
		/******************** Obs_Effective_Timing_Repeat_PeriodMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatPeriodMax() != null) {
			observationseteffectiveTimingsetrepeat.setPeriodMax(Double.parseDouble((o.getObsEffectiveTimingRepeatPeriodMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory observationseteffectiveTimingsetrepeatsetperiodunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_PeriodUnit_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatPeriodUnitCode() != null) {
			observationseteffectiveTimingsetrepeat.setPeriodUnit(observationseteffectiveTimingsetrepeatsetperiodunitEnumFactory.fromCode(o.getObsEffectiveTimingRepeatPeriodUnitCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_TimeOfDay ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatTimeOfDay() != null) {
			observationseteffectiveTimingsetrepeat.addTimeOfDay(o.getObsEffectiveTimingRepeatTimeOfDay());
		}

		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory observationseteffectiveTimingsetrepeataddwhenEnumFactory = new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_When_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatWhenCode() != null) {
			observationseteffectiveTimingsetrepeat.addWhen(observationseteffectiveTimingsetrepeataddwhenEnumFactory.fromCode(o.getObsEffectiveTimingRepeatWhenCode()));

		}
		}
		/******************** Obs_Enc ********************************************************************************/
		if(o.getObsEnc() != null) {
			org.hl7.fhir.r4.model.Reference ObsEncref = new org.hl7.fhir.r4.model.Reference();
			observation.setEncounter(ObsEncref.setReference(o.getObsEnc()));
		}
		/******************** Obs_Focus ********************************************************************************/
		if(o.getObsFocus() != null) {
			org.hl7.fhir.r4.model.Reference ObsFocusref = new org.hl7.fhir.r4.model.Reference();
			observation.addFocus(ObsFocusref.setReference(o.getObsFocus()));
		}
		/******************** Obs_HasMember ********************************************************************************/
		if(o.getObsHasMember() != null) {
			org.hl7.fhir.r4.model.Reference ObsHasMemberref = new org.hl7.fhir.r4.model.Reference();
			observation.addHasMember(ObsHasMemberref.setReference(o.getObsHasMember()));
		}

		org.hl7.fhir.r4.model.Identifier observationaddidentifier = observation.addIdentifier();

		/******************** Obs_Id_Assigner ********************************************************************************/
		if(o.getObsIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ObsIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			observationaddidentifier.setAssigner(ObsIdAssignerref.setReference(o.getObsIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period observationaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		observationaddidentifier.setPeriod(observationaddidentifiersetperiod);

		/******************** Obs_Id_Period_End ********************************************************************************/
		if(o.getObsIdPeriodEnd() != null) {
			java.text.SimpleDateFormat ObsIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsIdPeriodEnddate = ObsIdPeriodEndsdf.parse(o.getObsIdPeriodEnd());
			observationaddidentifiersetperiod.setEnd(ObsIdPeriodEnddate);
		}
		/******************** Obs_Id_Period_Start ********************************************************************************/
		if(o.getObsIdPeriodStart() != null) {
			java.text.SimpleDateFormat ObsIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsIdPeriodStartdate = ObsIdPeriodStartsdf.parse(o.getObsIdPeriodStart());
			observationaddidentifiersetperiod.setStart(ObsIdPeriodStartdate);
		}
		/******************** Obs_Id_System ********************************************************************************/
		if(o.getObsIdSystem() != null) {
			observationaddidentifier.setSystem(o.getObsIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddidentifier.setType(observationaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding observationaddidentifiersettypeaddcoding = observationaddidentifiersettype.addCoding();

		/******************** Obs_Id_Type_Coding_Code ********************************************************************************/
		if(o.getObsIdTypeCodingCode() != null) {
			observationaddidentifiersettypeaddcoding.setCode(o.getObsIdTypeCodingCode());
		}
		/******************** Obs_Id_Type_Coding_Display ********************************************************************************/
		if(o.getObsIdTypeCodingDisplay() != null) {
			observationaddidentifiersettypeaddcoding.setDisplay(o.getObsIdTypeCodingDisplay());
		}
		/******************** Obs_Id_Type_Coding_System ********************************************************************************/
		if(o.getObsIdTypeCodingSystem() != null) {
			observationaddidentifiersettypeaddcoding.setSystem(o.getObsIdTypeCodingSystem());
		}
		/******************** Obs_Id_Type_Coding_Usrslt ********************************************************************************/
		if(o.getObsIdTypeCodingUsrslt() != null) {
			observationaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsIdTypeCodingUsrslt()));
		}
		/******************** Obs_Id_Type_Coding_Version ********************************************************************************/
		if(o.getObsIdTypeCodingVersion() != null) {
			observationaddidentifiersettypeaddcoding.setVersion(o.getObsIdTypeCodingVersion());
		}
		/******************** Obs_Id_Type_Text ********************************************************************************/
		if(o.getObsIdTypeText() != null) {
			observationaddidentifiersettype.setText(o.getObsIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory observationaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Obs_Id_Use_Code ********************************************************************************/
		if(o.getObsIdUseCode() != null) {
			observationaddidentifier.setUse(observationaddidentifiersetuseEnumFactory.fromCode(o.getObsIdUseCode()));

		}
		/******************** Obs_Id_Value ********************************************************************************/
		if(o.getObsIdValue() != null) {
			observationaddidentifier.setValue(o.getObsIdValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddinterpretation = observation.addInterpretation();


		org.hl7.fhir.r4.model.Coding observationaddinterpretationaddcoding = observationaddinterpretation.addCoding();

		/******************** Obs_Interpretation_Coding_Code ********************************************************************************/
		if(o.getObsInterpretationCodingCode() != null) {
			observationaddinterpretationaddcoding.setCode(o.getObsInterpretationCodingCode());
		}
		/******************** Obs_Interpretation_Coding_Display ********************************************************************************/
		if(o.getObsInterpretationCodingDisplay() != null) {
			observationaddinterpretationaddcoding.setDisplay(o.getObsInterpretationCodingDisplay());
		}
		/******************** Obs_Interpretation_Coding_System ********************************************************************************/
		if(o.getObsInterpretationCodingSystem() != null) {
			observationaddinterpretationaddcoding.setSystem(o.getObsInterpretationCodingSystem());
		}
		/******************** Obs_Interpretation_Coding_Usrslt ********************************************************************************/
		if(o.getObsInterpretationCodingUsrslt() != null) {
			observationaddinterpretationaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsInterpretationCodingUsrslt()));
		}
		/******************** Obs_Interpretation_Coding_Version ********************************************************************************/
		if(o.getObsInterpretationCodingVersion() != null) {
			observationaddinterpretationaddcoding.setVersion(o.getObsInterpretationCodingVersion());
		}
		/******************** Obs_Interpretation_Text ********************************************************************************/
		if(o.getObsInterpretationText() != null) {
			observationaddinterpretation.setText(o.getObsInterpretationText());
		}
		/******************** Obs_Issued ********************************************************************************/
		if(o.getObsIssued() != null) {
			java.text.SimpleDateFormat ObsIssuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsIssueddate = ObsIssuedsdf.parse(o.getObsIssued());
			observation.setIssued(ObsIssueddate);
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetmethod = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setMethod(observationsetmethod);


		org.hl7.fhir.r4.model.Coding observationsetmethodaddcoding = observationsetmethod.addCoding();

		/******************** Obs_Method_Coding_Code ********************************************************************************/
		if(o.getObsMethodCodingCode() != null) {
			observationsetmethodaddcoding.setCode(o.getObsMethodCodingCode());
		}
		/******************** Obs_Method_Coding_Display ********************************************************************************/
		if(o.getObsMethodCodingDisplay() != null) {
			observationsetmethodaddcoding.setDisplay(o.getObsMethodCodingDisplay());
		}
		/******************** Obs_Method_Coding_System ********************************************************************************/
		if(o.getObsMethodCodingSystem() != null) {
			observationsetmethodaddcoding.setSystem(o.getObsMethodCodingSystem());
		}
		/******************** Obs_Method_Coding_Usrslt ********************************************************************************/
		if(o.getObsMethodCodingUsrslt() != null) {
			observationsetmethodaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsMethodCodingUsrslt()));
		}
		/******************** Obs_Method_Coding_Version ********************************************************************************/
		if(o.getObsMethodCodingVersion() != null) {
			observationsetmethodaddcoding.setVersion(o.getObsMethodCodingVersion());
		}
		/******************** Obs_Method_Text ********************************************************************************/
		if(o.getObsMethodText() != null) {
			observationsetmethod.setText(o.getObsMethodText());
		}

		org.hl7.fhir.r4.model.Annotation observationaddnote = observation.addNote();

		/******************** Observation_Note_AuthorReference ********************************************************************************/
		if(o.getObservationNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference ObservationNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			observationaddnote.setAuthor(ObservationNoteAuthorReferenceref.setReference(o.getObservationNoteAuthorReference()));
		}
		/******************** Observation_Note_AuthorString ********************************************************************************/
		if(o.getObservationNoteAuthorString() != null) {
			observationaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(o.getObservationNoteAuthorString()));
		}
		/******************** Obs_Note_Text ********************************************************************************/
		if(o.getObsNoteText() != null) {
			observationaddnote.setText(o.getObsNoteText());
		}
		/******************** Obs_Note_Time ********************************************************************************/
		if(o.getObsNoteTime() != null) {
			java.text.SimpleDateFormat ObsNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsNoteTimedate = ObsNoteTimesdf.parse(o.getObsNoteTime());
			observationaddnote.setTime(ObsNoteTimedate);
		}
		/******************** Obs_PartOf ********************************************************************************/
		if(o.getObsPartOf() != null) {
			org.hl7.fhir.r4.model.Reference ObsPartOfref = new org.hl7.fhir.r4.model.Reference();
			observation.addPartOf(ObsPartOfref.setReference(o.getObsPartOf()));
		}
		/******************** Obs_Performer ********************************************************************************/
		if(o.getObsPerformer() != null) {
			org.hl7.fhir.r4.model.Reference ObsPerformerref = new org.hl7.fhir.r4.model.Reference();
			observation.addPerformer(ObsPerformerref.setReference(o.getObsPerformer()));
		}

		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationaddreferencerange = observation.addReferenceRange();


		org.hl7.fhir.r4.model.Range observationaddreferencerangesetage = new org.hl7.fhir.r4.model.Range();
		observationaddreferencerange.setAge(observationaddreferencerangesetage);


		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetagesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerangesetage.setHigh(observationaddreferencerangesetagesethigh);

		/******************** Obs_ReferenceRange_Age_High_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighCode() != null) {
			observationaddreferencerangesetagesethigh.setCode(o.getObsReferenceRangeAgeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetagesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_Age_High_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighCompartrCode() != null) {
			observationaddreferencerangesetagesethigh.setComparator(observationaddreferencerangesetagesethighsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeAgeHighCompartrCode()));

		}
		/******************** Obs_ReferenceRange_Age_High_System ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighSystem() != null) {
			observationaddreferencerangesetagesethigh.setSystem(o.getObsReferenceRangeAgeHighSystem());
		}
		/******************** Obs_ReferenceRange_Age_High_Unit ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighUnit() != null) {
			observationaddreferencerangesetagesethigh.setUnit(o.getObsReferenceRangeAgeHighUnit());
		}
		/******************** Obs_ReferenceRange_Age_High_Value ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighValue() != null) {
			observationaddreferencerangesetagesethigh.setValue(Double.parseDouble((o.getObsReferenceRangeAgeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetagesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerangesetage.setLow(observationaddreferencerangesetagesetlow);

		/******************** Obs_ReferenceRange_Age_Low_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowCode() != null) {
			observationaddreferencerangesetagesetlow.setCode(o.getObsReferenceRangeAgeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetagesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_Age_Low_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowCompartrCode() != null) {
			observationaddreferencerangesetagesetlow.setComparator(observationaddreferencerangesetagesetlowsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeAgeLowCompartrCode()));

		}
		/******************** Obs_ReferenceRange_Age_Low_System ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowSystem() != null) {
			observationaddreferencerangesetagesetlow.setSystem(o.getObsReferenceRangeAgeLowSystem());
		}
		/******************** Obs_ReferenceRange_Age_Low_Unit ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowUnit() != null) {
			observationaddreferencerangesetagesetlow.setUnit(o.getObsReferenceRangeAgeLowUnit());
		}
		/******************** Obs_ReferenceRange_Age_Low_Value ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowValue() != null) {
			observationaddreferencerangesetagesetlow.setValue(Double.parseDouble((o.getObsReferenceRangeAgeLowValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddreferencerangeaddappliesto = observationaddreferencerange.addAppliesTo();


		org.hl7.fhir.r4.model.Coding observationaddreferencerangeaddappliestoaddcoding = observationaddreferencerangeaddappliesto.addCoding();

		/******************** Obs_ReferenceRange_AppliesTo_Coding_Code ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingCode() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setCode(o.getObsReferenceRangeAppliesToCodingCode());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_Display ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingDisplay() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setDisplay(o.getObsReferenceRangeAppliesToCodingDisplay());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_System ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingSystem() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setSystem(o.getObsReferenceRangeAppliesToCodingSystem());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_Usrslt ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingUsrslt() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsReferenceRangeAppliesToCodingUsrslt()));
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_Version ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingVersion() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setVersion(o.getObsReferenceRangeAppliesToCodingVersion());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Text ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToText() != null) {
			observationaddreferencerangeaddappliesto.setText(o.getObsReferenceRangeAppliesToText());
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerange.setHigh(observationaddreferencerangesethigh);

		/******************** Obs_ReferenceRange_High_Code ********************************************************************************/
		if(o.getObsReferenceRangeHighCode() != null) {
			observationaddreferencerangesethigh.setCode(o.getObsReferenceRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_High_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeHighCompartrCode() != null) {
			observationaddreferencerangesethigh.setComparator(observationaddreferencerangesethighsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeHighCompartrCode()));

		}
		/******************** Obs_ReferenceRange_High_System ********************************************************************************/
		if(o.getObsReferenceRangeHighSystem() != null) {
			observationaddreferencerangesethigh.setSystem(o.getObsReferenceRangeHighSystem());
		}
		/******************** Obs_ReferenceRange_High_Unit ********************************************************************************/
		if(o.getObsReferenceRangeHighUnit() != null) {
			observationaddreferencerangesethigh.setUnit(o.getObsReferenceRangeHighUnit());
		}
		/******************** Obs_ReferenceRange_High_Value ********************************************************************************/
		if(o.getObsReferenceRangeHighValue() != null) {
			observationaddreferencerangesethigh.setValue(Double.parseDouble((o.getObsReferenceRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerange.setLow(observationaddreferencerangesetlow);

		/******************** Obs_ReferenceRange_Low_Code ********************************************************************************/
		if(o.getObsReferenceRangeLowCode() != null) {
			observationaddreferencerangesetlow.setCode(o.getObsReferenceRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_Low_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeLowCompartrCode() != null) {
			observationaddreferencerangesetlow.setComparator(observationaddreferencerangesetlowsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeLowCompartrCode()));

		}
		/******************** Obs_ReferenceRange_Low_System ********************************************************************************/
		if(o.getObsReferenceRangeLowSystem() != null) {
			observationaddreferencerangesetlow.setSystem(o.getObsReferenceRangeLowSystem());
		}
		/******************** Obs_ReferenceRange_Low_Unit ********************************************************************************/
		if(o.getObsReferenceRangeLowUnit() != null) {
			observationaddreferencerangesetlow.setUnit(o.getObsReferenceRangeLowUnit());
		}
		/******************** Obs_ReferenceRange_Low_Value ********************************************************************************/
		if(o.getObsReferenceRangeLowValue() != null) {
			observationaddreferencerangesetlow.setValue(Double.parseDouble((o.getObsReferenceRangeLowValue())));
		}
		/******************** Obs_ReferenceRange_Text ********************************************************************************/
		if(o.getObsReferenceRangeText() != null) {
			observationaddreferencerange.setText(o.getObsReferenceRangeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddreferencerangesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddreferencerange.setType(observationaddreferencerangesettype);


		org.hl7.fhir.r4.model.Coding observationaddreferencerangesettypeaddcoding = observationaddreferencerangesettype.addCoding();

		/******************** Obs_ReferenceRange_Type_Coding_Code ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingCode() != null) {
			observationaddreferencerangesettypeaddcoding.setCode(o.getObsReferenceRangeTypeCodingCode());
		}
		/******************** Obs_ReferenceRange_Type_Coding_Display ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingDisplay() != null) {
			observationaddreferencerangesettypeaddcoding.setDisplay(o.getObsReferenceRangeTypeCodingDisplay());
		}
		/******************** Obs_ReferenceRange_Type_Coding_System ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingSystem() != null) {
			observationaddreferencerangesettypeaddcoding.setSystem(o.getObsReferenceRangeTypeCodingSystem());
		}
		/******************** Obs_ReferenceRange_Type_Coding_Usrslt ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingUsrslt() != null) {
			observationaddreferencerangesettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsReferenceRangeTypeCodingUsrslt()));
		}
		/******************** Obs_ReferenceRange_Type_Coding_Version ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingVersion() != null) {
			observationaddreferencerangesettypeaddcoding.setVersion(o.getObsReferenceRangeTypeCodingVersion());
		}
		/******************** Obs_ReferenceRange_Type_Text ********************************************************************************/
		if(o.getObsReferenceRangeTypeText() != null) {
			observationaddreferencerangesettype.setText(o.getObsReferenceRangeTypeText());
		}
		/******************** Obs_Specimen ********************************************************************************/
		if(o.getObsSpecimen() != null) {
			org.hl7.fhir.r4.model.Reference ObsSpecimenref = new org.hl7.fhir.r4.model.Reference();
			observation.setSpecimen(ObsSpecimenref.setReference(o.getObsSpecimen()));
		}

		org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory observationsetstatusEnumFactory = new org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory();

		/******************** Obs_Status_Code ********************************************************************************/
		if(o.getObsStatusCode() != null) {
			observation.setStatus(observationsetstatusEnumFactory.fromCode(o.getObsStatusCode()));

		}
		/******************** Obs_Subject ********************************************************************************/
		if(o.getObsSubject() != null) {
			org.hl7.fhir.r4.model.Reference ObsSubjectref = new org.hl7.fhir.r4.model.Reference();
			observation.setSubject(ObsSubjectref.setReference(o.getObsSubject()));
		}
		/******************** Observation_ValueBoolean ********************************************************************************/
		if(o.getObservationValueBoolean() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.BooleanType(o.getObservationValueBoolean()));
		}

		if( o.getObsValueCodeableConceptCodingCode() != null || o.getObsValueCodeableConceptCodingDisplay() != null || o.getObsValueCodeableConceptCodingSystem() != null || o.getObsValueCodeableConceptCodingUsrslt() != null || o.getObsValueCodeableConceptCodingVersion() != null || o.getObsValueCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept observationsetvalueCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			observation.setValue(observationsetvalueCodeableConcept);


		org.hl7.fhir.r4.model.Coding observationsetvalueCodeableConceptaddcoding = observationsetvalueCodeableConcept.addCoding();

		/******************** Obs_Value_CodeableConcept_Coding_Code ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingCode() != null) {
			observationsetvalueCodeableConceptaddcoding.setCode(o.getObsValueCodeableConceptCodingCode());
		}
		/******************** Obs_Value_CodeableConcept_Coding_Display ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingDisplay() != null) {
			observationsetvalueCodeableConceptaddcoding.setDisplay(o.getObsValueCodeableConceptCodingDisplay());
		}
		/******************** Obs_Value_CodeableConcept_Coding_System ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingSystem() != null) {
			observationsetvalueCodeableConceptaddcoding.setSystem(o.getObsValueCodeableConceptCodingSystem());
		}
		/******************** Obs_Value_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingUsrslt() != null) {
			observationsetvalueCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsValueCodeableConceptCodingUsrslt()));
		}
		/******************** Obs_Value_CodeableConcept_Coding_Version ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingVersion() != null) {
			observationsetvalueCodeableConceptaddcoding.setVersion(o.getObsValueCodeableConceptCodingVersion());
		}
		/******************** Obs_Value_CodeableConcept_Text ********************************************************************************/
		if(o.getObsValueCodeableConceptText() != null) {
			observationsetvalueCodeableConcept.setText(o.getObsValueCodeableConceptText());
		}
		}
		/******************** Observation_ValueDateTime ********************************************************************************/
		if(o.getObservationValueDateTime() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.DateTimeType(o.getObservationValueDateTime()));
		}
		/******************** Observation_ValueInteger ********************************************************************************/
		if(o.getObservationValueInteger() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.IntegerType(o.getObservationValueInteger()));
		}

		if( o.getObsValuePeriodEnd() != null || o.getObsValuePeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationsetvaluePeriod = new org.hl7.fhir.r4.model.Period();
			observation.setValue(observationsetvaluePeriod);

		/******************** Obs_Value_Period_End ********************************************************************************/
		if(o.getObsValuePeriodEnd() != null) {
			java.text.SimpleDateFormat ObsValuePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsValuePeriodEnddate = ObsValuePeriodEndsdf.parse(o.getObsValuePeriodEnd());
			observationsetvaluePeriod.setEnd(ObsValuePeriodEnddate);
		}
		/******************** Obs_Value_Period_Start ********************************************************************************/
		if(o.getObsValuePeriodStart() != null) {
			java.text.SimpleDateFormat ObsValuePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsValuePeriodStartdate = ObsValuePeriodStartsdf.parse(o.getObsValuePeriodStart());
			observationsetvaluePeriod.setStart(ObsValuePeriodStartdate);
		}
		}

		if( o.getObsValueQuantityCode() != null || o.getObsValueQuantityCompartrCode() != null || o.getObsValueQuantitySystem() != null || o.getObsValueQuantityUnit() != null || o.getObsValueQuantityValue() != null ) {
			org.hl7.fhir.r4.model.Quantity observationsetvalueQuantity = new org.hl7.fhir.r4.model.Quantity();
			observation.setValue(observationsetvalueQuantity);

		/******************** Obs_Value_Quantity_Code ********************************************************************************/
		if(o.getObsValueQuantityCode() != null) {
			observationsetvalueQuantity.setCode(o.getObsValueQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueQuantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Quantity_Compartr_Code ********************************************************************************/
		if(o.getObsValueQuantityCompartrCode() != null) {
			observationsetvalueQuantity.setComparator(observationsetvalueQuantitysetcomparatorEnumFactory.fromCode(o.getObsValueQuantityCompartrCode()));

		}
		/******************** Obs_Value_Quantity_System ********************************************************************************/
		if(o.getObsValueQuantitySystem() != null) {
			observationsetvalueQuantity.setSystem(o.getObsValueQuantitySystem());
		}
		/******************** Obs_Value_Quantity_Unit ********************************************************************************/
		if(o.getObsValueQuantityUnit() != null) {
			observationsetvalueQuantity.setUnit(o.getObsValueQuantityUnit());
		}
		/******************** Obs_Value_Quantity_Value ********************************************************************************/
		if(o.getObsValueQuantityValue() != null) {
			observationsetvalueQuantity.setValue(Double.parseDouble((o.getObsValueQuantityValue())));
		}
		}

		if( o.getObsValueRangeHighCode() != null || o.getObsValueRangeHighCompartrCode() != null || o.getObsValueRangeHighSystem() != null || o.getObsValueRangeHighUnit() != null || o.getObsValueRangeHighValue() != null || o.getObsValueRangeLowCode() != null || o.getObsValueRangeLowCompartrCode() != null || o.getObsValueRangeLowSystem() != null || o.getObsValueRangeLowUnit() != null || o.getObsValueRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range observationsetvalueRange = new org.hl7.fhir.r4.model.Range();
			observation.setValue(observationsetvalueRange);


		org.hl7.fhir.r4.model.Quantity observationsetvalueRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRange.setHigh(observationsetvalueRangesethigh);

		/******************** Obs_Value_Range_High_Code ********************************************************************************/
		if(o.getObsValueRangeHighCode() != null) {
			observationsetvalueRangesethigh.setCode(o.getObsValueRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Range_High_Compartr_Code ********************************************************************************/
		if(o.getObsValueRangeHighCompartrCode() != null) {
			observationsetvalueRangesethigh.setComparator(observationsetvalueRangesethighsetcomparatorEnumFactory.fromCode(o.getObsValueRangeHighCompartrCode()));

		}
		/******************** Obs_Value_Range_High_System ********************************************************************************/
		if(o.getObsValueRangeHighSystem() != null) {
			observationsetvalueRangesethigh.setSystem(o.getObsValueRangeHighSystem());
		}
		/******************** Obs_Value_Range_High_Unit ********************************************************************************/
		if(o.getObsValueRangeHighUnit() != null) {
			observationsetvalueRangesethigh.setUnit(o.getObsValueRangeHighUnit());
		}
		/******************** Obs_Value_Range_High_Value ********************************************************************************/
		if(o.getObsValueRangeHighValue() != null) {
			observationsetvalueRangesethigh.setValue(Double.parseDouble((o.getObsValueRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationsetvalueRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRange.setLow(observationsetvalueRangesetlow);

		/******************** Obs_Value_Range_Low_Code ********************************************************************************/
		if(o.getObsValueRangeLowCode() != null) {
			observationsetvalueRangesetlow.setCode(o.getObsValueRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Range_Low_Compartr_Code ********************************************************************************/
		if(o.getObsValueRangeLowCompartrCode() != null) {
			observationsetvalueRangesetlow.setComparator(observationsetvalueRangesetlowsetcomparatorEnumFactory.fromCode(o.getObsValueRangeLowCompartrCode()));

		}
		/******************** Obs_Value_Range_Low_System ********************************************************************************/
		if(o.getObsValueRangeLowSystem() != null) {
			observationsetvalueRangesetlow.setSystem(o.getObsValueRangeLowSystem());
		}
		/******************** Obs_Value_Range_Low_Unit ********************************************************************************/
		if(o.getObsValueRangeLowUnit() != null) {
			observationsetvalueRangesetlow.setUnit(o.getObsValueRangeLowUnit());
		}
		/******************** Obs_Value_Range_Low_Value ********************************************************************************/
		if(o.getObsValueRangeLowValue() != null) {
			observationsetvalueRangesetlow.setValue(Double.parseDouble((o.getObsValueRangeLowValue())));
		}
		}

		if( o.getObsValueRatioDenomCode() != null || o.getObsValueRatioDenomCompartrCode() != null || o.getObsValueRatioDenomSystem() != null || o.getObsValueRatioDenomUnit() != null || o.getObsValueRatioDenomValue() != null || o.getObsValueRatioNumeratorCode() != null || o.getObsValueRatioNumeratorCompartrCode() != null || o.getObsValueRatioNumeratorSystem() != null || o.getObsValueRatioNumeratorUnit() != null || o.getObsValueRatioNumeratorValue() != null ) {
			org.hl7.fhir.r4.model.Ratio observationsetvalueRatio = new org.hl7.fhir.r4.model.Ratio();
			observation.setValue(observationsetvalueRatio);


		org.hl7.fhir.r4.model.Quantity observationsetvalueRatiosetdenominator = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRatio.setDenominator(observationsetvalueRatiosetdenominator);

		/******************** Obs_Value_Ratio_Denom_Code ********************************************************************************/
		if(o.getObsValueRatioDenomCode() != null) {
			observationsetvalueRatiosetdenominator.setCode(o.getObsValueRatioDenomCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRatiosetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Ratio_Denom_Compartr_Code ********************************************************************************/
		if(o.getObsValueRatioDenomCompartrCode() != null) {
			observationsetvalueRatiosetdenominator.setComparator(observationsetvalueRatiosetdenominatorsetcomparatorEnumFactory.fromCode(o.getObsValueRatioDenomCompartrCode()));

		}
		/******************** Obs_Value_Ratio_Denom_System ********************************************************************************/
		if(o.getObsValueRatioDenomSystem() != null) {
			observationsetvalueRatiosetdenominator.setSystem(o.getObsValueRatioDenomSystem());
		}
		/******************** Obs_Value_Ratio_Denom_Unit ********************************************************************************/
		if(o.getObsValueRatioDenomUnit() != null) {
			observationsetvalueRatiosetdenominator.setUnit(o.getObsValueRatioDenomUnit());
		}
		/******************** Obs_Value_Ratio_Denom_Value ********************************************************************************/
		if(o.getObsValueRatioDenomValue() != null) {
			observationsetvalueRatiosetdenominator.setValue(Double.parseDouble((o.getObsValueRatioDenomValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationsetvalueRatiosetnumerator = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRatio.setNumerator(observationsetvalueRatiosetnumerator);

		/******************** Obs_Value_Ratio_Numerator_Code ********************************************************************************/
		if(o.getObsValueRatioNumeratorCode() != null) {
			observationsetvalueRatiosetnumerator.setCode(o.getObsValueRatioNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRatiosetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Ratio_Numerator_Compartr_Code ********************************************************************************/
		if(o.getObsValueRatioNumeratorCompartrCode() != null) {
			observationsetvalueRatiosetnumerator.setComparator(observationsetvalueRatiosetnumeratorsetcomparatorEnumFactory.fromCode(o.getObsValueRatioNumeratorCompartrCode()));

		}
		/******************** Obs_Value_Ratio_Numerator_System ********************************************************************************/
		if(o.getObsValueRatioNumeratorSystem() != null) {
			observationsetvalueRatiosetnumerator.setSystem(o.getObsValueRatioNumeratorSystem());
		}
		/******************** Obs_Value_Ratio_Numerator_Unit ********************************************************************************/
		if(o.getObsValueRatioNumeratorUnit() != null) {
			observationsetvalueRatiosetnumerator.setUnit(o.getObsValueRatioNumeratorUnit());
		}
		/******************** Obs_Value_Ratio_Numerator_Value ********************************************************************************/
		if(o.getObsValueRatioNumeratorValue() != null) {
			observationsetvalueRatiosetnumerator.setValue(Double.parseDouble((o.getObsValueRatioNumeratorValue())));
		}
		}

		if( o.getObsValueSampledDataData() != null || o.getObsValueSampledDataDimensions() != null || o.getObsValueSampledDataFactor() != null || o.getObsValueSampledDataLowerLimit() != null || o.getObsValueSampledDataOriginCode() != null || o.getObsValueSampledDataOriginCompartrCode() != null || o.getObsValueSampledDataOriginSystem() != null || o.getObsValueSampledDataOriginUnit() != null || o.getObsValueSampledDataOriginValue() != null || o.getObsValueSampledDataPeriod() != null || o.getObsValueSampledDataUpperLimit() != null ) {
			org.hl7.fhir.r4.model.SampledData observationsetvalueSampledData = new org.hl7.fhir.r4.model.SampledData();
			observation.setValue(observationsetvalueSampledData);

		/******************** Obs_Value_SampledData_Data ********************************************************************************/
		if(o.getObsValueSampledDataData() != null) {
			observationsetvalueSampledData.setData(o.getObsValueSampledDataData());
		}
		/******************** Obs_Value_SampledData_Dimensions ********************************************************************************/
		if(o.getObsValueSampledDataDimensions() != null) {
			observationsetvalueSampledData.setDimensions(Integer.parseInt(o.getObsValueSampledDataDimensions()));
		}
		/******************** Obs_Value_SampledData_Factor ********************************************************************************/
		if(o.getObsValueSampledDataFactor() != null) {
			observationsetvalueSampledData.setFactor(Double.parseDouble((o.getObsValueSampledDataFactor())));
		}
		/******************** Obs_Value_SampledData_LowerLimit ********************************************************************************/
		if(o.getObsValueSampledDataLowerLimit() != null) {
			observationsetvalueSampledData.setLowerLimit(Double.parseDouble((o.getObsValueSampledDataLowerLimit())));
		}

		org.hl7.fhir.r4.model.Quantity observationsetvalueSampledDatasetorigin = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueSampledData.setOrigin(observationsetvalueSampledDatasetorigin);

		/******************** Obs_Value_SampledData_Origin_Code ********************************************************************************/
		if(o.getObsValueSampledDataOriginCode() != null) {
			observationsetvalueSampledDatasetorigin.setCode(o.getObsValueSampledDataOriginCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueSampledDatasetoriginsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_SampledData_Origin_Compartr_Code ********************************************************************************/
		if(o.getObsValueSampledDataOriginCompartrCode() != null) {
			observationsetvalueSampledDatasetorigin.setComparator(observationsetvalueSampledDatasetoriginsetcomparatorEnumFactory.fromCode(o.getObsValueSampledDataOriginCompartrCode()));

		}
		/******************** Obs_Value_SampledData_Origin_System ********************************************************************************/
		if(o.getObsValueSampledDataOriginSystem() != null) {
			observationsetvalueSampledDatasetorigin.setSystem(o.getObsValueSampledDataOriginSystem());
		}
		/******************** Obs_Value_SampledData_Origin_Unit ********************************************************************************/
		if(o.getObsValueSampledDataOriginUnit() != null) {
			observationsetvalueSampledDatasetorigin.setUnit(o.getObsValueSampledDataOriginUnit());
		}
		/******************** Obs_Value_SampledData_Origin_Value ********************************************************************************/
		if(o.getObsValueSampledDataOriginValue() != null) {
			observationsetvalueSampledDatasetorigin.setValue(Double.parseDouble((o.getObsValueSampledDataOriginValue())));
		}
		/******************** Obs_Value_SampledData_Period ********************************************************************************/
		if(o.getObsValueSampledDataPeriod() != null) {
			observationsetvalueSampledData.setPeriod(Double.parseDouble((o.getObsValueSampledDataPeriod())));
		}
		/******************** Obs_Value_SampledData_UpperLimit ********************************************************************************/
		if(o.getObsValueSampledDataUpperLimit() != null) {
			observationsetvalueSampledData.setUpperLimit(Double.parseDouble((o.getObsValueSampledDataUpperLimit())));
		}
		}
		/******************** Observation_ValueString ********************************************************************************/
		if(o.getObservationValueString() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.StringType(o.getObservationValueString()));
		}
		/******************** Observation_ValueTime ********************************************************************************/
		if(o.getObservationValueTime() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.TimeType(o.getObservationValueTime()));
		}
		return observation;
	}
}
>>>>>>> master
