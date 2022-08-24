package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ClinicalImpression;
public class ClinicalImpressionConversion 
{
	public org.hl7.fhir.r4.model.ClinicalImpression ClinicalImpressions(ClinicalImpression c) throws ParseException
	{
		org.hl7.fhir.r4.model.ClinicalImpression clinicalimpression = new org.hl7.fhir.r4.model.ClinicalImpression();

		/******************** id ********************************************************************************/
		clinicalimpression.setId(c.getId());

		/******************** ClnclImprssn_Assessor ********************************************************************************/
		if(c.getClnclImprssnAssessor() != null ) {

			if(c.getClnclImprssnAssessor().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnAssessor()==null) {} else {
			clinicalimpression.setAssessor(new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnAssessor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnCdCdgCd() != null ) {

			String[] arrayi0 = c.getClnclImprssnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getCode().getCoding().size() < i0+1) { clinicalimpression.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClnclImprssnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getCode().getCoding().size() < i0+1) { clinicalimpression.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnCdCdgSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getCode().getCoding().size() < i0+1) { clinicalimpression.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClnclImprssnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getCode().getCoding().size() < i0+1) { clinicalimpression.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClnclImprssnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getCode().getCoding().size() < i0+1) { clinicalimpression.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Cd_Txt ********************************************************************************/
		if(c.getClnclImprssnCdTxt() != null ) {

			if(c.getClnclImprssnCdTxt().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnCdTxt()==null) {} else {
			clinicalimpression.getCode().setText(c.getClnclImprssnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClnclImprssn_Dt ********************************************************************************/
		if(c.getClnclImprssnDt() != null ) {

			if(c.getClnclImprssnDt().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnDt()==null) {} else {
			clinicalimpression.setDate(c.getClnclImprssnDt().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClnclImprssnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_Dscrptn ********************************************************************************/
		if(c.getClnclImprssnDscrptn() != null ) {

			if(c.getClnclImprssnDscrptn().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnDscrptn()==null) {} else {
			clinicalimpression.setDescription(c.getClnclImprssnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClnclImprssn_EfctiveDtTimeTyp ********************************************************************************/
		if(c.getClnclImprssnEfctiveDtTimeTyp() != null ) {

			if(c.getClnclImprssnEfctiveDtTimeTyp().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnEfctiveDtTimeTyp()==null) {} else {
			clinicalimpression.setEffective(new org.hl7.fhir.r4.model.DateTimeType(c.getClnclImprssnEfctiveDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_EfctivePrd_End ********************************************************************************/
		if(c.getClnclImprssnEfctivePrdEnd() != null ) {

			if(c.getClnclImprssnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnEfctivePrdEnd()==null) {} else {
			clinicalimpression.getEffectivePeriod().setEnd(c.getClnclImprssnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClnclImprssnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_EfctivePrd_Strt ********************************************************************************/
		if(c.getClnclImprssnEfctivePrdStrt() != null ) {

			if(c.getClnclImprssnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnEfctivePrdStrt()==null) {} else {
			clinicalimpression.getEffectivePeriod().setStart(c.getClnclImprssnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getClnclImprssnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_Enc ********************************************************************************/
		if(c.getClnclImprssnEnc() != null ) {

			if(c.getClnclImprssnEnc().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnEnc()==null) {} else {
			clinicalimpression.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_Finding_Basis ********************************************************************************/
		if(c.getClnclImprssnFindingBasis() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingBasis().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getFinding().get(i0).setBasis(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				String[] arrayi1 = c.getClnclImprssnFindingItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { clinicalimpression.getFinding().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				String[] arrayi1 = c.getClnclImprssnFindingItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { clinicalimpression.getFinding().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				String[] arrayi1 = c.getClnclImprssnFindingItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { clinicalimpression.getFinding().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				String[] arrayi1 = c.getClnclImprssnFindingItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { clinicalimpression.getFinding().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				String[] arrayi1 = c.getClnclImprssnFindingItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { clinicalimpression.getFinding().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getFinding().get(i0).getItemCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Finding_ItmCdbleCncpt_Txt ********************************************************************************/
		if(c.getClnclImprssnFindingItmCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getFinding().get(i0).getItemCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Finding_ItmRfrnc ********************************************************************************/
		if(c.getClnclImprssnFindingItmRfrnc() != null ) {

			String[] arrayi0 = c.getClnclImprssnFindingItmRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getFinding().size() < i0+1) { clinicalimpression.addFinding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getFinding().get(i0).setItemReference(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Id_Assigner ********************************************************************************/
		if(c.getClnclImprssnIdAssigner() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Id_Prd_End ********************************************************************************/
		if(c.getClnclImprssnIdPrdEnd() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Id_Prd_Strt ********************************************************************************/
		if(c.getClnclImprssnIdPrdStrt() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Id_Sys ********************************************************************************/
		if(c.getClnclImprssnIdSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				String[] arrayi1 = c.getClnclImprssnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { clinicalimpression.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				String[] arrayi1 = c.getClnclImprssnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { clinicalimpression.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				String[] arrayi1 = c.getClnclImprssnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { clinicalimpression.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				String[] arrayi1 = c.getClnclImprssnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { clinicalimpression.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClnclImprssn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				String[] arrayi1 = c.getClnclImprssnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { clinicalimpression.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Id_Typ_Txt ********************************************************************************/
		if(c.getClnclImprssnIdTypTxt() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Id_Use ********************************************************************************/
		if(c.getClnclImprssnIdUse() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Id_Vl ********************************************************************************/
		if(c.getClnclImprssnIdVl() != null ) {

			String[] arrayi0 = c.getClnclImprssnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getIdentifier().size() < i0+1) { clinicalimpression.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgCd() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				String[] arrayi1 = c.getClnclImprssnInvestigationCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getInvestigation().get(i0).getCode().getCoding().size() < i1+1) { clinicalimpression.getInvestigation().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getInvestigation().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgDsply() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				String[] arrayi1 = c.getClnclImprssnInvestigationCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getInvestigation().get(i0).getCode().getCoding().size() < i1+1) { clinicalimpression.getInvestigation().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getInvestigation().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				String[] arrayi1 = c.getClnclImprssnInvestigationCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getInvestigation().get(i0).getCode().getCoding().size() < i1+1) { clinicalimpression.getInvestigation().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getInvestigation().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				String[] arrayi1 = c.getClnclImprssnInvestigationCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getInvestigation().get(i0).getCode().getCoding().size() < i1+1) { clinicalimpression.getInvestigation().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getInvestigation().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClnclImprssn_Investigation_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				String[] arrayi1 = c.getClnclImprssnInvestigationCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getInvestigation().get(i0).getCode().getCoding().size() < i1+1) { clinicalimpression.getInvestigation().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getInvestigation().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_Investigation_Cd_Txt ********************************************************************************/
		if(c.getClnclImprssnInvestigationCdTxt() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getInvestigation().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Investigation_Itm ********************************************************************************/
		if(c.getClnclImprssnInvestigationItm() != null ) {

			String[] arrayi0 = c.getClnclImprssnInvestigationItm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getInvestigation().size() < i0+1) { clinicalimpression.addInvestigation(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {clinicalimpression.getInvestigation().get(i0).addItem(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClnclImprssn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getClnclImprssnNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getClnclImprssnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getNote().size() < i0+1) { clinicalimpression.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getClnclImprssnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getClnclImprssnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getNote().size() < i0+1) { clinicalimpression.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Nt_Txt ********************************************************************************/
		if(c.getClnclImprssnNtTxt() != null ) {

			String[] arrayi0 = c.getClnclImprssnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getNote().size() < i0+1) { clinicalimpression.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_Nt_Time ********************************************************************************/
		if(c.getClnclImprssnNtTime() != null ) {

			String[] arrayi0 = c.getClnclImprssnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getNote().size() < i0+1) { clinicalimpression.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_Previous ********************************************************************************/
		if(c.getClnclImprssnPrevious() != null ) {

			if(c.getClnclImprssnPrevious().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnPrevious()==null) {} else {
			clinicalimpression.setPrevious(new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnPrevious().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_Problem ********************************************************************************/
		if(c.getClnclImprssnProblem() != null ) {

				for( String currListStrSplit : c.getClnclImprssnProblem().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			clinicalimpression.addProblem(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getClnclImprssnPrognosisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getPrognosisCodeableConcept().size() < i0+1) { clinicalimpression.addPrognosisCodeableConcept(); }
				String[] arrayi1 = c.getClnclImprssnPrognosisCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().size() < i1+1) { clinicalimpression.getPrognosisCodeableConcept().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getClnclImprssnPrognosisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getPrognosisCodeableConcept().size() < i0+1) { clinicalimpression.addPrognosisCodeableConcept(); }
				String[] arrayi1 = c.getClnclImprssnPrognosisCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().size() < i1+1) { clinicalimpression.getPrognosisCodeableConcept().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnPrognosisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getPrognosisCodeableConcept().size() < i0+1) { clinicalimpression.addPrognosisCodeableConcept(); }
				String[] arrayi1 = c.getClnclImprssnPrognosisCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().size() < i1+1) { clinicalimpression.getPrognosisCodeableConcept().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClnclImprssnPrognosisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getPrognosisCodeableConcept().size() < i0+1) { clinicalimpression.addPrognosisCodeableConcept(); }
				String[] arrayi1 = c.getClnclImprssnPrognosisCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().size() < i1+1) { clinicalimpression.getPrognosisCodeableConcept().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getClnclImprssnPrognosisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getPrognosisCodeableConcept().size() < i0+1) { clinicalimpression.addPrognosisCodeableConcept(); }
				String[] arrayi1 = c.getClnclImprssnPrognosisCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().size() < i1+1) { clinicalimpression.getPrognosisCodeableConcept().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {clinicalimpression.getPrognosisCodeableConcept().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ClnclImprssn_PrognosisCdbleCncpt_Txt ********************************************************************************/
		if(c.getClnclImprssnPrognosisCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getClnclImprssnPrognosisCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getPrognosisCodeableConcept().size() < i0+1) { clinicalimpression.addPrognosisCodeableConcept(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getPrognosisCodeableConcept().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_PrognosisRfrnc ********************************************************************************/
		if(c.getClnclImprssnPrognosisRfrnc() != null ) {

				for( String currListStrSplit : c.getClnclImprssnPrognosisRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			clinicalimpression.addPrognosisReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ClnclImprssn_Protocol ********************************************************************************/
		if(c.getClnclImprssnProtocol() != null ) {

				for( String currListStrSplit : c.getClnclImprssnProtocol().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			clinicalimpression.addProtocol(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ClnclImprssn_Sts ********************************************************************************/
		if(c.getClnclImprssnSts() != null ) {

			if(c.getClnclImprssnSts().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnSts()==null) {} else {
			clinicalimpression.setStatus(new org.hl7.fhir.r4.model.ClinicalImpression.ClinicalImpressionStatusEnumFactory().fromCode(c.getClnclImprssnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgCd() != null ) {

			String[] arrayi0 = c.getClnclImprssnStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getStatusReason().getCoding().size() < i0+1) { clinicalimpression.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getClnclImprssnStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getStatusReason().getCoding().size() < i0+1) { clinicalimpression.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgSys() != null ) {

			String[] arrayi0 = c.getClnclImprssnStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getStatusReason().getCoding().size() < i0+1) { clinicalimpression.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getClnclImprssnStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getStatusReason().getCoding().size() < i0+1) { clinicalimpression.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ClnclImprssn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClnclImprssnStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getClnclImprssnStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(clinicalimpression.getStatusReason().getCoding().size() < i0+1) { clinicalimpression.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {clinicalimpression.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ClnclImprssn_StsRsn_Txt ********************************************************************************/
		if(c.getClnclImprssnStsRsnTxt() != null ) {

			if(c.getClnclImprssnStsRsnTxt().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnStsRsnTxt()==null) {} else {
			clinicalimpression.getStatusReason().setText(c.getClnclImprssnStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClnclImprssn_Sbjct ********************************************************************************/
		if(c.getClnclImprssnSbjct() != null ) {

			if(c.getClnclImprssnSbjct().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnSbjct()==null) {} else {
			clinicalimpression.setSubject(new org.hl7.fhir.r4.model.Reference(c.getClnclImprssnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ClnclImprssn_Summary ********************************************************************************/
		if(c.getClnclImprssnSummary() != null ) {

			if(c.getClnclImprssnSummary().replace("[","").replace("]","").equals("NULL") | c.getClnclImprssnSummary()==null) {} else {
			clinicalimpression.setSummary(c.getClnclImprssnSummary().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ClnclImprssn_SprtingInfo ********************************************************************************/
		if(c.getClnclImprssnSprtingInfo() != null ) {

				for( String currListStrSplit : c.getClnclImprssnSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			clinicalimpression.addSupportingInfo(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return clinicalimpression;
	}
}
