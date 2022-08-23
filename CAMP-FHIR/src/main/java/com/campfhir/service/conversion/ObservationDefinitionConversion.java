package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ObservationDefinition;
public class ObservationDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ObservationDefinition ObservationDefinitions(ObservationDefinition o) throws ParseException
	{
		org.hl7.fhir.r4.model.ObservationDefinition observationdefinition = new org.hl7.fhir.r4.model.ObservationDefinition();

		/******************** id ********************************************************************************/
		observationdefinition.setId(o.getId());

		/******************** ObsrvtnDfn_AbnormalCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnAbnormalCddVlSt() != null ) {

			if(o.getObsrvtnDfnAbnormalCddVlSt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnAbnormalCddVlSt()==null) {} else {
			observationdefinition.setAbnormalCodedValueSet(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnAbnormalCddVlSt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCategory().size() < i0+1) { observationdefinition.addCategory(); }
				String[] arrayi1 = o.getObsrvtnDfnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getCategory().get(i0).getCoding().size() < i1+1) { observationdefinition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCategory().size() < i0+1) { observationdefinition.addCategory(); }
				String[] arrayi1 = o.getObsrvtnDfnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getCategory().get(i0).getCoding().size() < i1+1) { observationdefinition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCategory().size() < i0+1) { observationdefinition.addCategory(); }
				String[] arrayi1 = o.getObsrvtnDfnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getCategory().get(i0).getCoding().size() < i1+1) { observationdefinition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCategory().size() < i0+1) { observationdefinition.addCategory(); }
				String[] arrayi1 = o.getObsrvtnDfnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getCategory().get(i0).getCoding().size() < i1+1) { observationdefinition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCategory().size() < i0+1) { observationdefinition.addCategory(); }
				String[] arrayi1 = o.getObsrvtnDfnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getCategory().get(i0).getCoding().size() < i1+1) { observationdefinition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Ctgry_Txt ********************************************************************************/
		if(o.getObsrvtnDfnCtgryTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCategory().size() < i0+1) { observationdefinition.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCode().getCoding().size() < i0+1) { observationdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCode().getCoding().size() < i0+1) { observationdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCode().getCoding().size() < i0+1) { observationdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCode().getCoding().size() < i0+1) { observationdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnCdCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getCode().getCoding().size() < i0+1) { observationdefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnDfnCdTxt() != null ) {

			if(o.getObsrvtnDfnCdTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnCdTxt()==null) {} else {
			observationdefinition.getCode().setText(o.getObsrvtnDfnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ObsrvtnDfn_CriticalCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnCriticalCddVlSt() != null ) {

			if(o.getObsrvtnDfnCriticalCddVlSt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnCriticalCddVlSt()==null) {} else {
			observationdefinition.setCriticalCodedValueSet(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnCriticalCddVlSt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ObsrvtnDfn_Id_Assigner ********************************************************************************/
		if(o.getObsrvtnDfnIdAssigner() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_Id_Prd_End ********************************************************************************/
		if(o.getObsrvtnDfnIdPrdEnd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_Id_Prd_Strt ********************************************************************************/
		if(o.getObsrvtnDfnIdPrdStrt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_Id_Sys ********************************************************************************/
		if(o.getObsrvtnDfnIdSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observationdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observationdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observationdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observationdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				String[] arrayi1 = o.getObsrvtnDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { observationdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_Id_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnDfnIdTypTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Id_Use ********************************************************************************/
		if(o.getObsrvtnDfnIdUse() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_Id_Vl ********************************************************************************/
		if(o.getObsrvtnDfnIdVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getIdentifier().size() < i0+1) { observationdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getMethod().getCoding().size() < i0+1) { observationdefinition.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getMethod().getCoding().size() < i0+1) { observationdefinition.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getMethod().getCoding().size() < i0+1) { observationdefinition.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getMethod().getCoding().size() < i0+1) { observationdefinition.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnMthdCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getMethod().getCoding().size() < i0+1) { observationdefinition.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_Mthd_Txt ********************************************************************************/
		if(o.getObsrvtnDfnMthdTxt() != null ) {

			if(o.getObsrvtnDfnMthdTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnMthdTxt()==null) {} else {
			observationdefinition.getMethod().setText(o.getObsrvtnDfnMthdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ObsrvtnDfn_MultipleRsltsAllowed ********************************************************************************/
		if(o.getObsrvtnDfnMultipleRsltsAllowed() != null ) {

			if(o.getObsrvtnDfnMultipleRsltsAllowed().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnMultipleRsltsAllowed()==null) {} else {
			observationdefinition.setMultipleResultsAllowed(Boolean.parseBoolean(o.getObsrvtnDfnMultipleRsltsAllowed().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ObsrvtnDfn_NormalCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnNormalCddVlSt() != null ) {

			if(o.getObsrvtnDfnNormalCddVlSt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnNormalCddVlSt()==null) {} else {
			observationdefinition.setNormalCodedValueSet(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnNormalCddVlSt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ObsrvtnDfn_PermittedDataTyp ********************************************************************************/
		if(o.getObsrvtnDfnPermittedDataTyp() != null ) {

				for( String currListStrSplit : o.getObsrvtnDfnPermittedDataTyp().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			observationdefinition.addPermittedDataType(new org.hl7.fhir.r4.model.ObservationDefinition.ObservationDataTypeEnumFactory().fromCode(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ObsrvtnDfn_PreferredRptNm ********************************************************************************/
		if(o.getObsrvtnDfnPreferredRptNm() != null ) {

			if(o.getObsrvtnDfnPreferredRptNm().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnPreferredRptNm()==null) {} else {
			observationdefinition.setPreferredReportName(o.getObsrvtnDfnPreferredRptNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAgeLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAgeLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAge().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).addAppliesTo(); }
					String[] arrayi2 = o.getObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().size() < i2+1) { observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalAppliesToTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalAppliesToTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).addAppliesTo(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getAppliesTo().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Ctgry ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCtgry() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCtgry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).setCategory(new org.hl7.fhir.r4.model.ObservationDefinition.ObservationRangeCategoryEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cndtn ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCndtn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCndtn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).setCondition(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).getContext().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).getContext().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).getContext().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).getContext().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				String[] arrayi1 = o.getObsrvtnDfnQualifiedIntervalCntxtCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().size() < i1+1) { observationdefinition.getQualifiedInterval().get(i0).getContext().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getContext().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalCntxtTxt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalCntxtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getContext().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Gender ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGender() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGender().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).setGender(new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalGestationalAgeLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getGestationalAge().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Cmprtr ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngHiVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Cmprtr ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwCmprtr() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwUnt() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnDfnQualifiedIntervalRngLwVl() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQualifiedIntervalRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQualifiedInterval().size() < i0+1) { observationdefinition.addQualifiedInterval(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQualifiedInterval().get(i0).getRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_ConversionFactor ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsConversionFactor() != null ) {

			if(o.getObsrvtnDfnQuantitativeDtlsConversionFactor().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnQuantitativeDtlsConversionFactor()==null) {} else {
			observationdefinition.getQuantitativeDetails().setConversionFactor((Double.parseDouble((o.getObsrvtnDfnQuantitativeDtlsConversionFactor().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getCustomaryUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getCustomaryUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getCustomaryUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getCustomaryUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getCustomaryUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getCustomaryUnit().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntTxt() != null ) {

			if(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnQuantitativeDtlsCustomaryUntTxt()==null) {} else {
			observationdefinition.getQuantitativeDetails().getCustomaryUnit().setText(o.getObsrvtnDfnQuantitativeDtlsCustomaryUntTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_DecimalPrecision ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsDecimalPrecision() != null ) {

			if(o.getObsrvtnDfnQuantitativeDtlsDecimalPrecision().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnQuantitativeDtlsDecimalPrecision()==null) {} else {
			observationdefinition.getQuantitativeDetails().setDecimalPrecision(Integer.parseInt(o.getObsrvtnDfnQuantitativeDtlsDecimalPrecision().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgCd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getUnit().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgDsply() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getUnit().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgSys() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getUnit().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getUnit().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntCdgVrsn() != null ) {

			String[] arrayi0 = o.getObsrvtnDfnQuantitativeDtlsUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(observationdefinition.getQuantitativeDetails().getUnit().getCoding().size() < i0+1) { observationdefinition.getQuantitativeDetails().getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {observationdefinition.getQuantitativeDetails().getUnit().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Txt ********************************************************************************/
		if(o.getObsrvtnDfnQuantitativeDtlsUntTxt() != null ) {

			if(o.getObsrvtnDfnQuantitativeDtlsUntTxt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnQuantitativeDtlsUntTxt()==null) {} else {
			observationdefinition.getQuantitativeDetails().getUnit().setText(o.getObsrvtnDfnQuantitativeDtlsUntTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ObsrvtnDfn_ValidCddVlSt ********************************************************************************/
		if(o.getObsrvtnDfnValidCddVlSt() != null ) {

			if(o.getObsrvtnDfnValidCddVlSt().replace("[","").replace("]","").equals("NULL") | o.getObsrvtnDfnValidCddVlSt()==null) {} else {
			observationdefinition.setValidCodedValueSet(new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDfnValidCddVlSt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return observationdefinition;
	}
}
