package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationDefinition;
public class OperationDefinitionConversion 
{
	public org.hl7.fhir.r4.model.OperationDefinition OperationDefinitions(OperationDefinition o) throws ParseException
	{
		org.hl7.fhir.r4.model.OperationDefinition operationdefinition = new org.hl7.fhir.r4.model.OperationDefinition();

		/******************** id ********************************************************************************/
		operationdefinition.setId(o.getId());

		/******************** OprtnDfn_AffectsState ********************************************************************************/
		if(o.getOprtnDfnAffectsState() != null ) {

			if(o.getOprtnDfnAffectsState().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnAffectsState()==null) {} else {
			operationdefinition.setAffectsState(Boolean.parseBoolean(o.getOprtnDfnAffectsState().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Base ********************************************************************************/
		if(o.getOprtnDfnBase() != null ) {

			if(o.getOprtnDfnBase().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnBase()==null) {} else {
			operationdefinition.setBase(o.getOprtnDfnBase().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Cd ********************************************************************************/
		if(o.getOprtnDfnCd() != null ) {

			if(o.getOprtnDfnCd().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnCd()==null) {} else {
			operationdefinition.setCode(o.getOprtnDfnCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Comment ********************************************************************************/
		if(o.getOprtnDfnComment() != null ) {

			if(o.getOprtnDfnComment().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnComment()==null) {} else {
			operationdefinition.setComment(o.getOprtnDfnComment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Cntct_Nm ********************************************************************************/
		if(o.getOprtnDfnCntctNm() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				String[] arrayi1 = o.getOprtnDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getContact().get(i0).getTelecom().size() < i1+1) { operationdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				String[] arrayi1 = o.getOprtnDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getContact().get(i0).getTelecom().size() < i1+1) { operationdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				String[] arrayi1 = o.getOprtnDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getContact().get(i0).getTelecom().size() < i1+1) { operationdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				String[] arrayi1 = o.getOprtnDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getContact().get(i0).getTelecom().size() < i1+1) { operationdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				String[] arrayi1 = o.getOprtnDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getContact().get(i0).getTelecom().size() < i1+1) { operationdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = o.getOprtnDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getContact().size() < i0+1) { operationdefinition.addContact(); }
				String[] arrayi1 = o.getOprtnDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getContact().get(i0).getTelecom().size() < i1+1) { operationdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Dt ********************************************************************************/
		if(o.getOprtnDfnDt() != null ) {

			if(o.getOprtnDfnDt().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnDt()==null) {} else {
			operationdefinition.setDate(o.getOprtnDfnDt().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(o.getOprtnDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Dscrptn ********************************************************************************/
		if(o.getOprtnDfnDscrptn() != null ) {

			if(o.getOprtnDfnDscrptn().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnDscrptn()==null) {} else {
			operationdefinition.setDescription(o.getOprtnDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Exprmtl ********************************************************************************/
		if(o.getOprtnDfnExprmtl() != null ) {

			if(o.getOprtnDfnExprmtl().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnExprmtl()==null) {} else {
			operationdefinition.setExperimental(Boolean.parseBoolean(o.getOprtnDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_InputProfile ********************************************************************************/
		if(o.getOprtnDfnInputProfile() != null ) {

			if(o.getOprtnDfnInputProfile().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnInputProfile()==null) {} else {
			operationdefinition.setInputProfile(o.getOprtnDfnInputProfile().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Instance ********************************************************************************/
		if(o.getOprtnDfnInstance() != null ) {

			if(o.getOprtnDfnInstance().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnInstance()==null) {} else {
			operationdefinition.setInstance(Boolean.parseBoolean(o.getOprtnDfnInstance().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = o.getOprtnDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getJurisdiction().size() < i0+1) { operationdefinition.addJurisdiction(); }
				String[] arrayi1 = o.getOprtnDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { operationdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = o.getOprtnDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getJurisdiction().size() < i0+1) { operationdefinition.addJurisdiction(); }
				String[] arrayi1 = o.getOprtnDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { operationdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = o.getOprtnDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getJurisdiction().size() < i0+1) { operationdefinition.addJurisdiction(); }
				String[] arrayi1 = o.getOprtnDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { operationdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOprtnDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getJurisdiction().size() < i0+1) { operationdefinition.addJurisdiction(); }
				String[] arrayi1 = o.getOprtnDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { operationdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = o.getOprtnDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getJurisdiction().size() < i0+1) { operationdefinition.addJurisdiction(); }
				String[] arrayi1 = o.getOprtnDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { operationdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Jrsdctn_Txt ********************************************************************************/
		if(o.getOprtnDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = o.getOprtnDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getJurisdiction().size() < i0+1) { operationdefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Kind ********************************************************************************/
		if(o.getOprtnDfnKind() != null ) {

			if(o.getOprtnDfnKind().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnKind()==null) {} else {
			operationdefinition.setKind(new org.hl7.fhir.r4.model.OperationDefinition.OperationKindEnumFactory().fromCode(o.getOprtnDfnKind().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Nm ********************************************************************************/
		if(o.getOprtnDfnNm() != null ) {

			if(o.getOprtnDfnNm().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnNm()==null) {} else {
			operationdefinition.setName(o.getOprtnDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_OutputProfile ********************************************************************************/
		if(o.getOprtnDfnOutputProfile() != null ) {

			if(o.getOprtnDfnOutputProfile().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnOutputProfile()==null) {} else {
			operationdefinition.setOutputProfile(o.getOprtnDfnOutputProfile().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Overload_Comment ********************************************************************************/
		if(o.getOprtnDfnOverloadComment() != null ) {

			String[] arrayi0 = o.getOprtnDfnOverloadComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getOverload().size() < i0+1) { operationdefinition.addOverload(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getOverload().get(i0).setComment(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Overload_PrmtrNm ********************************************************************************/
		if(o.getOprtnDfnOverloadPrmtrNm() != null ) {

			String[] arrayi0 = o.getOprtnDfnOverloadPrmtrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getOverload().size() < i0+1) { operationdefinition.addOverload(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {operationdefinition.getOverload().get(i0).addParameterName(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Prmtr_Binding_Str ********************************************************************************/
		if(o.getOprtnDfnPrmtrBindingStr() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrBindingStr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).getBinding().setStrength(new org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_Prmtr_Binding_VlSt ********************************************************************************/
		if(o.getOprtnDfnPrmtrBindingVlSt() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrBindingVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).getBinding().setValueSet(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Prmtr_Docation ********************************************************************************/
		if(o.getOprtnDfnPrmtrDocation() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Prmtr_Mx ********************************************************************************/
		if(o.getOprtnDfnPrmtrMx() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setMax(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Prmtr_Min ********************************************************************************/
		if(o.getOprtnDfnPrmtrMin() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrMin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setMin(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_Prmtr_Nm ********************************************************************************/
		if(o.getOprtnDfnPrmtrNm() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Prmtr_RfrncdFrom_Src ********************************************************************************/
		if(o.getOprtnDfnPrmtrRfrncdFromSrc() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrRfrncdFromSrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				String[] arrayi1 = o.getOprtnDfnPrmtrRfrncdFromSrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getParameter().get(i0).getReferencedFrom().size() < i1+1) { operationdefinition.getParameter().get(i0).addReferencedFrom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getParameter().get(i0).getReferencedFrom().get(i1).setSource(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Prmtr_RfrncdFrom_SrcId ********************************************************************************/
		if(o.getOprtnDfnPrmtrRfrncdFromSrcId() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrRfrncdFromSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				String[] arrayi1 = o.getOprtnDfnPrmtrRfrncdFromSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getParameter().get(i0).getReferencedFrom().size() < i1+1) { operationdefinition.getParameter().get(i0).addReferencedFrom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getParameter().get(i0).getReferencedFrom().get(i1).setSourceId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Prmtr_SrchTyp ********************************************************************************/
		if(o.getOprtnDfnPrmtrSrchTyp() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrSrchTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setSearchType(new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_Prmtr_TarProfile ********************************************************************************/
		if(o.getOprtnDfnPrmtrTarProfile() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrTarProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {operationdefinition.getParameter().get(i0).addTargetProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_Prmtr_Typ ********************************************************************************/
		if(o.getOprtnDfnPrmtrTyp() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_Prmtr_Use ********************************************************************************/
		if(o.getOprtnDfnPrmtrUse() != null ) {

			String[] arrayi0 = o.getOprtnDfnPrmtrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getParameter().size() < i0+1) { operationdefinition.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getParameter().get(i0).setUse(new org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_Pblshr ********************************************************************************/
		if(o.getOprtnDfnPblshr() != null ) {

			if(o.getOprtnDfnPblshr().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnPblshr()==null) {} else {
			operationdefinition.setPublisher(o.getOprtnDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Prpse ********************************************************************************/
		if(o.getOprtnDfnPrpse() != null ) {

			if(o.getOprtnDfnPrpse().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnPrpse()==null) {} else {
			operationdefinition.setPurpose(o.getOprtnDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Rsrc ********************************************************************************/
		if(o.getOprtnDfnRsrc() != null ) {

				for( String currListStrSplit : o.getOprtnDfnRsrc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			operationdefinition.addResource(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** OprtnDfn_Sts ********************************************************************************/
		if(o.getOprtnDfnSts() != null ) {

			if(o.getOprtnDfnSts().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnSts()==null) {} else {
			operationdefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(o.getOprtnDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Sys ********************************************************************************/
		if(o.getOprtnDfnSys() != null ) {

			if(o.getOprtnDfnSys().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnSys()==null) {} else {
			operationdefinition.setSystem(Boolean.parseBoolean(o.getOprtnDfnSys().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Ttl ********************************************************************************/
		if(o.getOprtnDfnTtl() != null ) {

			if(o.getOprtnDfnTtl().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnTtl()==null) {} else {
			operationdefinition.setTitle(o.getOprtnDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_Typ ********************************************************************************/
		if(o.getOprtnDfnTyp() != null ) {

			if(o.getOprtnDfnTyp().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnTyp()==null) {} else {
			operationdefinition.setType(Boolean.parseBoolean(o.getOprtnDfnTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** OprtnDfn_Url ********************************************************************************/
		if(o.getOprtnDfnUrl() != null ) {

			if(o.getOprtnDfnUrl().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnUrl()==null) {} else {
			operationdefinition.setUrl(o.getOprtnDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** OprtnDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				String[] arrayi1 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { operationdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				String[] arrayi1 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { operationdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				String[] arrayi1 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { operationdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				String[] arrayi1 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { operationdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				String[] arrayi1 = o.getOprtnDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { operationdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** OprtnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = o.getOprtnDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationdefinition.getUseContext().size() < i0+1) { operationdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationdefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnDfn_Vrsn ********************************************************************************/
		if(o.getOprtnDfnVrsn() != null ) {

			if(o.getOprtnDfnVrsn().replace("[","").replace("]","").equals("NULL") | o.getOprtnDfnVrsn()==null) {} else {
			operationdefinition.setVersion(o.getOprtnDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return operationdefinition;
	}
}
