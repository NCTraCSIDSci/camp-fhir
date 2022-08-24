package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ServiceRequest;
public class ServiceRequestConversion 
{
	public org.hl7.fhir.r4.model.ServiceRequest ServiceRequests(ServiceRequest s) throws ParseException
	{
		org.hl7.fhir.r4.model.ServiceRequest servicerequest = new org.hl7.fhir.r4.model.ServiceRequest();

		/******************** id ********************************************************************************/
		servicerequest.setId(s.getId());

		/******************** SrvRqst_AsNdBooleanTyp ********************************************************************************/
		if(s.getSrvRqstAsNdBooleanTyp() != null ) {

			if(s.getSrvRqstAsNdBooleanTyp().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstAsNdBooleanTyp()==null) {} else {
			servicerequest.setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(s.getSrvRqstAsNdBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getAsNeededCodeableConcept().getCoding().size() < i0+1) { servicerequest.getAsNeededCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getAsNeededCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getAsNeededCodeableConcept().getCoding().size() < i0+1) { servicerequest.getAsNeededCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getAsNeededCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getAsNeededCodeableConcept().getCoding().size() < i0+1) { servicerequest.getAsNeededCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getAsNeededCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getAsNeededCodeableConcept().getCoding().size() < i0+1) { servicerequest.getAsNeededCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getAsNeededCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getAsNeededCodeableConcept().getCoding().size() < i0+1) { servicerequest.getAsNeededCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getAsNeededCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(s.getSrvRqstAsNdCdbleCncptTxt() != null ) {

			if(s.getSrvRqstAsNdCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstAsNdCdbleCncptTxt()==null) {} else {
			servicerequest.getAsNeededCodeableConcept().setText(s.getSrvRqstAsNdCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_AthredOn ********************************************************************************/
		if(s.getSrvRqstAthredOn() != null ) {

			if(s.getSrvRqstAthredOn().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstAthredOn()==null) {} else {
			servicerequest.setAuthoredOn(s.getSrvRqstAthredOn().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_BasedOn ********************************************************************************/
		if(s.getSrvRqstBasedOn() != null ) {

				for( String currListStrSplit : s.getSrvRqstBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_BodySite_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getBodySite().size() < i0+1) { servicerequest.addBodySite(); }
				String[] arrayi1 = s.getSrvRqstBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getBodySite().get(i0).getCoding().size() < i1+1) { servicerequest.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getBodySite().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_BodySite_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getBodySite().size() < i0+1) { servicerequest.addBodySite(); }
				String[] arrayi1 = s.getSrvRqstBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getBodySite().get(i0).getCoding().size() < i1+1) { servicerequest.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getBodySite().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_BodySite_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getBodySite().size() < i0+1) { servicerequest.addBodySite(); }
				String[] arrayi1 = s.getSrvRqstBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getBodySite().get(i0).getCoding().size() < i1+1) { servicerequest.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getBodySite().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getBodySite().size() < i0+1) { servicerequest.addBodySite(); }
				String[] arrayi1 = s.getSrvRqstBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getBodySite().get(i0).getCoding().size() < i1+1) { servicerequest.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getBodySite().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrvRqst_BodySite_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getBodySite().size() < i0+1) { servicerequest.addBodySite(); }
				String[] arrayi1 = s.getSrvRqstBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getBodySite().get(i0).getCoding().size() < i1+1) { servicerequest.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getBodySite().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_BodySite_Txt ********************************************************************************/
		if(s.getSrvRqstBodySiteTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getBodySite().size() < i0+1) { servicerequest.addBodySite(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getBodySite().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstCtgryCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCategory().size() < i0+1) { servicerequest.addCategory(); }
				String[] arrayi1 = s.getSrvRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getCategory().get(i0).getCoding().size() < i1+1) { servicerequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstCtgryCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCategory().size() < i0+1) { servicerequest.addCategory(); }
				String[] arrayi1 = s.getSrvRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getCategory().get(i0).getCoding().size() < i1+1) { servicerequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstCtgryCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCategory().size() < i0+1) { servicerequest.addCategory(); }
				String[] arrayi1 = s.getSrvRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getCategory().get(i0).getCoding().size() < i1+1) { servicerequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCategory().size() < i0+1) { servicerequest.addCategory(); }
				String[] arrayi1 = s.getSrvRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getCategory().get(i0).getCoding().size() < i1+1) { servicerequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrvRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstCtgryCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCategory().size() < i0+1) { servicerequest.addCategory(); }
				String[] arrayi1 = s.getSrvRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getCategory().get(i0).getCoding().size() < i1+1) { servicerequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Ctgry_Txt ********************************************************************************/
		if(s.getSrvRqstCtgryTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCategory().size() < i0+1) { servicerequest.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstCdCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCode().getCoding().size() < i0+1) { servicerequest.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCode().getCoding().size() < i0+1) { servicerequest.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstCdCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCode().getCoding().size() < i0+1) { servicerequest.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCode().getCoding().size() < i0+1) { servicerequest.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getCode().getCoding().size() < i0+1) { servicerequest.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Cd_Txt ********************************************************************************/
		if(s.getSrvRqstCdTxt() != null ) {

			if(s.getSrvRqstCdTxt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstCdTxt()==null) {} else {
			servicerequest.getCode().setText(s.getSrvRqstCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_DoNotPerform ********************************************************************************/
		if(s.getSrvRqstDoNotPerform() != null ) {

			if(s.getSrvRqstDoNotPerform().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstDoNotPerform()==null) {} else {
			servicerequest.setDoNotPerform(Boolean.parseBoolean(s.getSrvRqstDoNotPerform().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Enc ********************************************************************************/
		if(s.getSrvRqstEnc() != null ) {

			if(s.getSrvRqstEnc().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstEnc()==null) {} else {
			servicerequest.setEncounter(new org.hl7.fhir.r4.model.Reference(s.getSrvRqstEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Id_Assigner ********************************************************************************/
		if(s.getSrvRqstIdAssigner() != null ) {

			String[] arrayi0 = s.getSrvRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Id_Prd_End ********************************************************************************/
		if(s.getSrvRqstIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSrvRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Id_Prd_Strt ********************************************************************************/
		if(s.getSrvRqstIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSrvRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Id_Sys ********************************************************************************/
		if(s.getSrvRqstIdSys() != null ) {

			String[] arrayi0 = s.getSrvRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				String[] arrayi1 = s.getSrvRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { servicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				String[] arrayi1 = s.getSrvRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { servicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				String[] arrayi1 = s.getSrvRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { servicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				String[] arrayi1 = s.getSrvRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { servicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrvRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				String[] arrayi1 = s.getSrvRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { servicerequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_Id_Typ_Txt ********************************************************************************/
		if(s.getSrvRqstIdTypTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Id_Use ********************************************************************************/
		if(s.getSrvRqstIdUse() != null ) {

			String[] arrayi0 = s.getSrvRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Id_Vl ********************************************************************************/
		if(s.getSrvRqstIdVl() != null ) {

			String[] arrayi0 = s.getSrvRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getIdentifier().size() < i0+1) { servicerequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_InstantiatesCanonical ********************************************************************************/
		if(s.getSrvRqstInstantiatesCanonical() != null ) {

				for( String currListStrSplit : s.getSrvRqstInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SrvRqst_InstantiatesUri ********************************************************************************/
		if(s.getSrvRqstInstantiatesUri() != null ) {

				for( String currListStrSplit : s.getSrvRqstInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SrvRqst_Insrnc ********************************************************************************/
		if(s.getSrvRqstInsrnc() != null ) {

				for( String currListStrSplit : s.getSrvRqstInsrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addInsurance(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_Intent ********************************************************************************/
		if(s.getSrvRqstIntent() != null ) {

			if(s.getSrvRqstIntent().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstIntent()==null) {} else {
			servicerequest.setIntent(new org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestIntentEnumFactory().fromCode(s.getSrvRqstIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_LctnCd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstLctnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getLocationCode().size() < i0+1) { servicerequest.addLocationCode(); }
				String[] arrayi1 = s.getSrvRqstLctnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getLocationCode().get(i0).getCoding().size() < i1+1) { servicerequest.getLocationCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getLocationCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_LctnCd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstLctnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getLocationCode().size() < i0+1) { servicerequest.addLocationCode(); }
				String[] arrayi1 = s.getSrvRqstLctnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getLocationCode().get(i0).getCoding().size() < i1+1) { servicerequest.getLocationCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getLocationCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_LctnCd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstLctnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getLocationCode().size() < i0+1) { servicerequest.addLocationCode(); }
				String[] arrayi1 = s.getSrvRqstLctnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getLocationCode().get(i0).getCoding().size() < i1+1) { servicerequest.getLocationCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getLocationCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_LctnCd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstLctnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getLocationCode().size() < i0+1) { servicerequest.addLocationCode(); }
				String[] arrayi1 = s.getSrvRqstLctnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getLocationCode().get(i0).getCoding().size() < i1+1) { servicerequest.getLocationCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getLocationCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrvRqst_LctnCd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstLctnCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstLctnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getLocationCode().size() < i0+1) { servicerequest.addLocationCode(); }
				String[] arrayi1 = s.getSrvRqstLctnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getLocationCode().get(i0).getCoding().size() < i1+1) { servicerequest.getLocationCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getLocationCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_LctnCd_Txt ********************************************************************************/
		if(s.getSrvRqstLctnCdTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstLctnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getLocationCode().size() < i0+1) { servicerequest.addLocationCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getLocationCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_LctnRfrnc ********************************************************************************/
		if(s.getSrvRqstLctnRfrnc() != null ) {

				for( String currListStrSplit : s.getSrvRqstLctnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addLocationReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_Nt_AthrRfrnc ********************************************************************************/
		if(s.getSrvRqstNtAthrRfrnc() != null ) {

			String[] arrayi0 = s.getSrvRqstNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getNote().size() < i0+1) { servicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(s.getSrvRqstNtAthrStrgTyp() != null ) {

			String[] arrayi0 = s.getSrvRqstNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getNote().size() < i0+1) { servicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Nt_Txt ********************************************************************************/
		if(s.getSrvRqstNtTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getNote().size() < i0+1) { servicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Nt_Time ********************************************************************************/
		if(s.getSrvRqstNtTime() != null ) {

			String[] arrayi0 = s.getSrvRqstNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getNote().size() < i0+1) { servicerequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(s.getSrvRqstOccrnceDtTimeTyp() != null ) {

			if(s.getSrvRqstOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceDtTimeTyp()==null) {} else {
			servicerequest.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(s.getSrvRqstOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrncePrd_End ********************************************************************************/
		if(s.getSrvRqstOccrncePrdEnd() != null ) {

			if(s.getSrvRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrncePrdEnd()==null) {} else {
			servicerequest.getOccurrencePeriod().setEnd(s.getSrvRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrncePrd_Strt ********************************************************************************/
		if(s.getSrvRqstOccrncePrdStrt() != null ) {

			if(s.getSrvRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrncePrdStrt()==null) {} else {
			servicerequest.getOccurrencePeriod().setStart(s.getSrvRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { servicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { servicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { servicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { servicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { servicerequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getOccurrenceTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgCdTxt() != null ) {

			if(s.getSrvRqstOccrnceTmgCdTxt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgCdTxt()==null) {} else {
			servicerequest.getOccurrenceTiming().getCode().setText(s.getSrvRqstOccrnceTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgEvnt() != null ) {

				for( String currListStrSplit : s.getSrvRqstOccrnceTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.getOccurrenceTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsDurationCd() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsDurationCd()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setCode(s.getSrvRqstOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsDurationCmprtr() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsDurationCmprtr()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsDurationSys() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsDurationSys()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setSystem(s.getSrvRqstOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsDurationUnt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsDurationUnt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setUnit(s.getSrvRqstOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsDurationVl() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsDurationVl()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((s.getSrvRqstOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsPrdEnd() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsPrdEnd()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsPeriod().setEnd(s.getSrvRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsPrdStrt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsPrdStrt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsPeriod().setStart(s.getSrvRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiCd() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngHiCd()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setCode(s.getSrvRqstOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiCmprtr() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngHiCmprtr()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiSys() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngHiSys()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setSystem(s.getSrvRqstOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiUnt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngHiUnt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setUnit(s.getSrvRqstOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngHiVl() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngHiVl()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((s.getSrvRqstOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwCd() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngLwCd()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setCode(s.getSrvRqstOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwCmprtr() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngLwCmprtr()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwSys() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngLwSys()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setSystem(s.getSrvRqstOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwUnt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngLwUnt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setUnit(s.getSrvRqstOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptBndsRngLwVl() != null ) {

			if(s.getSrvRqstOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptBndsRngLwVl()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((s.getSrvRqstOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptCnt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptCnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptCnt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setCount(Integer.parseInt(s.getSrvRqstOccrnceTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptCntMx() != null ) {

			if(s.getSrvRqstOccrnceTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptCntMx()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setCountMax(Integer.parseInt(s.getSrvRqstOccrnceTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptDuration() != null ) {

			if(s.getSrvRqstOccrnceTmgRptDuration().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptDuration()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setDuration((Double.parseDouble((s.getSrvRqstOccrnceTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptDurationMx() != null ) {

			if(s.getSrvRqstOccrnceTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptDurationMx()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setDurationMax((Double.parseDouble((s.getSrvRqstOccrnceTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_DurationUnt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptDurationUnt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptDurationUnt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(s.getSrvRqstOccrnceTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptFrqncy() != null ) {

			if(s.getSrvRqstOccrnceTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptFrqncy()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setFrequency(Integer.parseInt(s.getSrvRqstOccrnceTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptFrqncyMx() != null ) {

			if(s.getSrvRqstOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptFrqncyMx()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setFrequencyMax(Integer.parseInt(s.getSrvRqstOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptOff() != null ) {

			if(s.getSrvRqstOccrnceTmgRptOff().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptOff()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setOffset(Integer.parseInt(s.getSrvRqstOccrnceTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptPrd() != null ) {

			if(s.getSrvRqstOccrnceTmgRptPrd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptPrd()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setPeriod((new java.math.BigDecimal((s.getSrvRqstOccrnceTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptPrdMx() != null ) {

			if(s.getSrvRqstOccrnceTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptPrdMx()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((s.getSrvRqstOccrnceTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_PrdUnt ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptPrdUnt() != null ) {

			if(s.getSrvRqstOccrnceTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstOccrnceTmgRptPrdUnt()==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(s.getSrvRqstOccrnceTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(s.getSrvRqstOccrnceTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : s.getSrvRqstOccrnceTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.getOccurrenceTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SrvRqst_OrdrDtl_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstOrdrDtlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOrderDetail().size() < i0+1) { servicerequest.addOrderDetail(); }
				String[] arrayi1 = s.getSrvRqstOrdrDtlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getOrderDetail().get(i0).getCoding().size() < i1+1) { servicerequest.getOrderDetail().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getOrderDetail().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_OrdrDtl_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstOrdrDtlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOrderDetail().size() < i0+1) { servicerequest.addOrderDetail(); }
				String[] arrayi1 = s.getSrvRqstOrdrDtlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getOrderDetail().get(i0).getCoding().size() < i1+1) { servicerequest.getOrderDetail().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getOrderDetail().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_OrdrDtl_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstOrdrDtlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOrderDetail().size() < i0+1) { servicerequest.addOrderDetail(); }
				String[] arrayi1 = s.getSrvRqstOrdrDtlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getOrderDetail().get(i0).getCoding().size() < i1+1) { servicerequest.getOrderDetail().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getOrderDetail().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_OrdrDtl_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstOrdrDtlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOrderDetail().size() < i0+1) { servicerequest.addOrderDetail(); }
				String[] arrayi1 = s.getSrvRqstOrdrDtlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getOrderDetail().get(i0).getCoding().size() < i1+1) { servicerequest.getOrderDetail().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getOrderDetail().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrvRqst_OrdrDtl_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstOrdrDtlCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstOrdrDtlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOrderDetail().size() < i0+1) { servicerequest.addOrderDetail(); }
				String[] arrayi1 = s.getSrvRqstOrdrDtlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getOrderDetail().get(i0).getCoding().size() < i1+1) { servicerequest.getOrderDetail().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getOrderDetail().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_OrdrDtl_Txt ********************************************************************************/
		if(s.getSrvRqstOrdrDtlTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstOrdrDtlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getOrderDetail().size() < i0+1) { servicerequest.addOrderDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getOrderDetail().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_PntInstrctn ********************************************************************************/
		if(s.getSrvRqstPntInstrctn() != null ) {

			if(s.getSrvRqstPntInstrctn().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstPntInstrctn()==null) {} else {
			servicerequest.setPatientInstruction(s.getSrvRqstPntInstrctn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_Prfrmr ********************************************************************************/
		if(s.getSrvRqstPrfrmr() != null ) {

				for( String currListStrSplit : s.getSrvRqstPrfrmr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addPerformer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getPerformerType().getCoding().size() < i0+1) { servicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getPerformerType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getPerformerType().getCoding().size() < i0+1) { servicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getPerformerType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getPerformerType().getCoding().size() < i0+1) { servicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getPerformerType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getPerformerType().getCoding().size() < i0+1) { servicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getPerformerType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getPerformerType().getCoding().size() < i0+1) { servicerequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getPerformerType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(s.getSrvRqstPrfrmrTypTxt() != null ) {

			if(s.getSrvRqstPrfrmrTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstPrfrmrTypTxt()==null) {} else {
			servicerequest.getPerformerType().setText(s.getSrvRqstPrfrmrTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_Priority ********************************************************************************/
		if(s.getSrvRqstPriority() != null ) {

			if(s.getSrvRqstPriority().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstPriority()==null) {} else {
			servicerequest.setPriority(new org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestPriorityEnumFactory().fromCode(s.getSrvRqstPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_QntyQnty_Cd ********************************************************************************/
		if(s.getSrvRqstQntyQntyCd() != null ) {

			if(s.getSrvRqstQntyQntyCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyQntyCd()==null) {} else {
			servicerequest.getQuantityQuantity().setCode(s.getSrvRqstQntyQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyQnty_Cmprtr ********************************************************************************/
		if(s.getSrvRqstQntyQntyCmprtr() != null ) {

			if(s.getSrvRqstQntyQntyCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyQntyCmprtr()==null) {} else {
			servicerequest.getQuantityQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstQntyQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_QntyQnty_Sys ********************************************************************************/
		if(s.getSrvRqstQntyQntySys() != null ) {

			if(s.getSrvRqstQntyQntySys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyQntySys()==null) {} else {
			servicerequest.getQuantityQuantity().setSystem(s.getSrvRqstQntyQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyQnty_Unt ********************************************************************************/
		if(s.getSrvRqstQntyQntyUnt() != null ) {

			if(s.getSrvRqstQntyQntyUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyQntyUnt()==null) {} else {
			servicerequest.getQuantityQuantity().setUnit(s.getSrvRqstQntyQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyQnty_Vl ********************************************************************************/
		if(s.getSrvRqstQntyQntyVl() != null ) {

			if(s.getSrvRqstQntyQntyVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyQntyVl()==null) {} else {
			servicerequest.getQuantityQuantity().setValue((new java.math.BigDecimal((s.getSrvRqstQntyQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_QntyRng_Hi_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRngHiCd() != null ) {

			if(s.getSrvRqstQntyRngHiCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngHiCd()==null) {} else {
			servicerequest.getQuantityRange().getHigh().setCode(s.getSrvRqstQntyRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSrvRqstQntyRngHiCmprtr() != null ) {

			if(s.getSrvRqstQntyRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngHiCmprtr()==null) {} else {
			servicerequest.getQuantityRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstQntyRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_QntyRng_Hi_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRngHiSys() != null ) {

			if(s.getSrvRqstQntyRngHiSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngHiSys()==null) {} else {
			servicerequest.getQuantityRange().getHigh().setSystem(s.getSrvRqstQntyRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRng_Hi_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRngHiUnt() != null ) {

			if(s.getSrvRqstQntyRngHiUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngHiUnt()==null) {} else {
			servicerequest.getQuantityRange().getHigh().setUnit(s.getSrvRqstQntyRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRng_Hi_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRngHiVl() != null ) {

			if(s.getSrvRqstQntyRngHiVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngHiVl()==null) {} else {
			servicerequest.getQuantityRange().getHigh().setValue((new java.math.BigDecimal((s.getSrvRqstQntyRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_QntyRng_Lw_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRngLwCd() != null ) {

			if(s.getSrvRqstQntyRngLwCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngLwCd()==null) {} else {
			servicerequest.getQuantityRange().getLow().setCode(s.getSrvRqstQntyRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSrvRqstQntyRngLwCmprtr() != null ) {

			if(s.getSrvRqstQntyRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngLwCmprtr()==null) {} else {
			servicerequest.getQuantityRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstQntyRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_QntyRng_Lw_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRngLwSys() != null ) {

			if(s.getSrvRqstQntyRngLwSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngLwSys()==null) {} else {
			servicerequest.getQuantityRange().getLow().setSystem(s.getSrvRqstQntyRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRng_Lw_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRngLwUnt() != null ) {

			if(s.getSrvRqstQntyRngLwUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngLwUnt()==null) {} else {
			servicerequest.getQuantityRange().getLow().setUnit(s.getSrvRqstQntyRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRng_Lw_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRngLwVl() != null ) {

			if(s.getSrvRqstQntyRngLwVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRngLwVl()==null) {} else {
			servicerequest.getQuantityRange().getLow().setValue((new java.math.BigDecimal((s.getSrvRqstQntyRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrCd() != null ) {

			if(s.getSrvRqstQntyRtioDnmntrCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioDnmntrCd()==null) {} else {
			servicerequest.getQuantityRatio().getDenominator().setCode(s.getSrvRqstQntyRtioDnmntrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrCmprtr() != null ) {

			if(s.getSrvRqstQntyRtioDnmntrCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioDnmntrCmprtr()==null) {} else {
			servicerequest.getQuantityRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstQntyRtioDnmntrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrSys() != null ) {

			if(s.getSrvRqstQntyRtioDnmntrSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioDnmntrSys()==null) {} else {
			servicerequest.getQuantityRatio().getDenominator().setSystem(s.getSrvRqstQntyRtioDnmntrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrUnt() != null ) {

			if(s.getSrvRqstQntyRtioDnmntrUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioDnmntrUnt()==null) {} else {
			servicerequest.getQuantityRatio().getDenominator().setUnit(s.getSrvRqstQntyRtioDnmntrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRtio_Dnmntr_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRtioDnmntrVl() != null ) {

			if(s.getSrvRqstQntyRtioDnmntrVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioDnmntrVl()==null) {} else {
			servicerequest.getQuantityRatio().getDenominator().setValue((new java.math.BigDecimal((s.getSrvRqstQntyRtioDnmntrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Cd ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrCd() != null ) {

			if(s.getSrvRqstQntyRtioNmrtrCd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioNmrtrCd()==null) {} else {
			servicerequest.getQuantityRatio().getNumerator().setCode(s.getSrvRqstQntyRtioNmrtrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrCmprtr() != null ) {

			if(s.getSrvRqstQntyRtioNmrtrCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioNmrtrCmprtr()==null) {} else {
			servicerequest.getQuantityRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSrvRqstQntyRtioNmrtrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Sys ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrSys() != null ) {

			if(s.getSrvRqstQntyRtioNmrtrSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioNmrtrSys()==null) {} else {
			servicerequest.getQuantityRatio().getNumerator().setSystem(s.getSrvRqstQntyRtioNmrtrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Unt ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrUnt() != null ) {

			if(s.getSrvRqstQntyRtioNmrtrUnt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioNmrtrUnt()==null) {} else {
			servicerequest.getQuantityRatio().getNumerator().setUnit(s.getSrvRqstQntyRtioNmrtrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_QntyRtio_Nmrtr_Vl ********************************************************************************/
		if(s.getSrvRqstQntyRtioNmrtrVl() != null ) {

			if(s.getSrvRqstQntyRtioNmrtrVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstQntyRtioNmrtrVl()==null) {} else {
			servicerequest.getQuantityRatio().getNumerator().setValue((new java.math.BigDecimal((s.getSrvRqstQntyRtioNmrtrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SrvRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getReasonCode().size() < i0+1) { servicerequest.addReasonCode(); }
				String[] arrayi1 = s.getSrvRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { servicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getReasonCode().size() < i0+1) { servicerequest.addReasonCode(); }
				String[] arrayi1 = s.getSrvRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { servicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getReasonCode().size() < i0+1) { servicerequest.addReasonCode(); }
				String[] arrayi1 = s.getSrvRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { servicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getReasonCode().size() < i0+1) { servicerequest.addReasonCode(); }
				String[] arrayi1 = s.getSrvRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { servicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrvRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getReasonCode().size() < i0+1) { servicerequest.addReasonCode(); }
				String[] arrayi1 = s.getSrvRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(servicerequest.getReasonCode().get(i0).getCoding().size() < i1+1) { servicerequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {servicerequest.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrvRqst_RsnCd_Txt ********************************************************************************/
		if(s.getSrvRqstRsnCdTxt() != null ) {

			String[] arrayi0 = s.getSrvRqstRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getReasonCode().size() < i0+1) { servicerequest.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_RsnRfrnc ********************************************************************************/
		if(s.getSrvRqstRsnRfrnc() != null ) {

				for( String currListStrSplit : s.getSrvRqstRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_RelevantHis ********************************************************************************/
		if(s.getSrvRqstRelevantHis() != null ) {

				for( String currListStrSplit : s.getSrvRqstRelevantHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addRelevantHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_Replaces ********************************************************************************/
		if(s.getSrvRqstReplaces() != null ) {

				for( String currListStrSplit : s.getSrvRqstReplaces().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addReplaces(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_Rqster ********************************************************************************/
		if(s.getSrvRqstRqster() != null ) {

			if(s.getSrvRqstRqster().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRqster()==null) {} else {
			servicerequest.setRequester(new org.hl7.fhir.r4.model.Reference(s.getSrvRqstRqster().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Requisition_Assigner ********************************************************************************/
		if(s.getSrvRqstRequisitionAssigner() != null ) {

			if(s.getSrvRqstRequisitionAssigner().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionAssigner()==null) {} else {
			servicerequest.getRequisition().setAssigner(new org.hl7.fhir.r4.model.Reference(s.getSrvRqstRequisitionAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Requisition_Prd_End ********************************************************************************/
		if(s.getSrvRqstRequisitionPrdEnd() != null ) {

			if(s.getSrvRqstRequisitionPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionPrdEnd()==null) {} else {
			servicerequest.getRequisition().getPeriod().setEnd(s.getSrvRqstRequisitionPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstRequisitionPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Requisition_Prd_Strt ********************************************************************************/
		if(s.getSrvRqstRequisitionPrdStrt() != null ) {

			if(s.getSrvRqstRequisitionPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionPrdStrt()==null) {} else {
			servicerequest.getRequisition().getPeriod().setStart(s.getSrvRqstRequisitionPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrvRqstRequisitionPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Requisition_Sys ********************************************************************************/
		if(s.getSrvRqstRequisitionSys() != null ) {

			if(s.getSrvRqstRequisitionSys().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionSys()==null) {} else {
			servicerequest.getRequisition().setSystem(s.getSrvRqstRequisitionSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgCd() != null ) {

			String[] arrayi0 = s.getSrvRqstRequisitionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getRequisition().getType().getCoding().size() < i0+1) { servicerequest.getRequisition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getRequisition().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSrvRqstRequisitionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getRequisition().getType().getCoding().size() < i0+1) { servicerequest.getRequisition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getRequisition().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgSys() != null ) {

			String[] arrayi0 = s.getSrvRqstRequisitionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getRequisition().getType().getCoding().size() < i0+1) { servicerequest.getRequisition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getRequisition().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Requisition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrvRqstRequisitionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getRequisition().getType().getCoding().size() < i0+1) { servicerequest.getRequisition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getRequisition().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrvRqst_Requisition_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSrvRqstRequisitionTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrvRqstRequisitionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(servicerequest.getRequisition().getType().getCoding().size() < i0+1) { servicerequest.getRequisition().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {servicerequest.getRequisition().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrvRqst_Requisition_Typ_Txt ********************************************************************************/
		if(s.getSrvRqstRequisitionTypTxt() != null ) {

			if(s.getSrvRqstRequisitionTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionTypTxt()==null) {} else {
			servicerequest.getRequisition().getType().setText(s.getSrvRqstRequisitionTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_Requisition_Use ********************************************************************************/
		if(s.getSrvRqstRequisitionUse() != null ) {

			if(s.getSrvRqstRequisitionUse().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionUse()==null) {} else {
			servicerequest.getRequisition().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(s.getSrvRqstRequisitionUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Requisition_Vl ********************************************************************************/
		if(s.getSrvRqstRequisitionVl() != null ) {

			if(s.getSrvRqstRequisitionVl().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstRequisitionVl()==null) {} else {
			servicerequest.getRequisition().setValue(s.getSrvRqstRequisitionVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrvRqst_Spcmn ********************************************************************************/
		if(s.getSrvRqstSpcmn() != null ) {

				for( String currListStrSplit : s.getSrvRqstSpcmn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addSpecimen(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SrvRqst_Sts ********************************************************************************/
		if(s.getSrvRqstSts() != null ) {

			if(s.getSrvRqstSts().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstSts()==null) {} else {
			servicerequest.setStatus(new org.hl7.fhir.r4.model.ServiceRequest.ServiceRequestStatusEnumFactory().fromCode(s.getSrvRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_Sbjct ********************************************************************************/
		if(s.getSrvRqstSbjct() != null ) {

			if(s.getSrvRqstSbjct().replace("[","").replace("]","").equals("NULL") | s.getSrvRqstSbjct()==null) {} else {
			servicerequest.setSubject(new org.hl7.fhir.r4.model.Reference(s.getSrvRqstSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrvRqst_SprtingInfo ********************************************************************************/
		if(s.getSrvRqstSprtingInfo() != null ) {

				for( String currListStrSplit : s.getSrvRqstSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			servicerequest.addSupportingInfo(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return servicerequest;
	}
}
