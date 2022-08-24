package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchElementDefinition;
public class ResearchElementDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ResearchElementDefinition ResearchElementDefinitions(ResearchElementDefinition r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchElementDefinition researchelementdefinition = new org.hl7.fhir.r4.model.ResearchElementDefinition();

		/******************** id ********************************************************************************/
		researchelementdefinition.setId(r.getId());

		/******************** RsrchElmntDfn_ApprovalDt ********************************************************************************/
		if(r.getRsrchElmntDfnApprovalDt() != null ) {

			if(r.getRsrchElmntDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnApprovalDt()==null) {} else {
			researchelementdefinition.setApprovalDate(r.getRsrchElmntDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchElmntDfnApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Athr_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnAthrNm() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchElmntDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchElmntDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchElmntDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchElmntDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Use ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchElmntDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getAuthor().size() < i0+1) { researchelementdefinition.addAuthor(); }
				String[] arrayi1 = r.getRsrchElmntDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCanonicalTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCanonicalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setDefinition(new org.hl7.fhir.r4.model.CanonicalType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).setValueSet(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValuePeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValuePeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentLmt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().setLimit(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_MustSupport ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentMustSupport() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Profile ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentProfile() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Direction ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().get(i1).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_US ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().setSubject(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnDataRqrmentTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionDataRequirement().setType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnDscrptn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionExpression().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnExprsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionExpression().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnLnguage() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionExpression().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnNm() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionExpression().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnRfrnc() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcDfnExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getDefinitionExpression().setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_Exclude ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcExclude() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcExclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setExclude(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setParticipantEffective(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setParticipantEffectiveDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDuration_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveGrpMsr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setParticipantEffectiveGroupMeasure(new org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasureEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectivePeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectivePeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTimeFromStart().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTimeFromStart().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTimeFromStart().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTimeFromStart().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTimeFromStrt_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTimeFromStrtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTimeFromStart().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		
		return ResearchElementDefinitions_Extended(r, researchelementdefinition); 
		}
	public org.hl7.fhir.r4.model.ResearchElementDefinition ResearchElementDefinitions_Extended(ResearchElementDefinition r, org.hl7.fhir.r4.model.ResearchElementDefinition researchelementdefinition) throws ParseException
	{
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationUnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdUnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDtTimeTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setStudyEffective(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDscrptn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setStudyEffectiveDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDuration_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveGrpMsr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).setStudyEffectiveGroupMeasure(new org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasureEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctivePrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctivePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectivePeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctivePrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctivePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectivePeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTimeFromStart().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTimeFromStart().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTimeFromStart().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTimeFromStart().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTimeFromStrt_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTimeFromStrtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTimeFromStart().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationUnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Off ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdUnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getStudyEffectiveTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUntOfMsrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUnitOfMeasure().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntySys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getCharacteristic().size() < i0+1) { researchelementdefinition.addCharacteristic(); }
				String[] arrayi1 = r.getRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { researchelementdefinition.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getCharacteristic().get(i0).getUsageContext().get(i1).setValue(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Comment ********************************************************************************/
		if(r.getRsrchElmntDfnComment() != null ) {

				for( String currListStrSplit : r.getRsrchElmntDfnComment().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchelementdefinition.addComment(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** RsrchElmntDfn_Cntct_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnCntctNm() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchElmntDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchElmntDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchElmntDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchElmntDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchElmntDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getContact().size() < i0+1) { researchelementdefinition.addContact(); }
				String[] arrayi1 = r.getRsrchElmntDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getContact().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Copyright ********************************************************************************/
		if(r.getRsrchElmntDfnCopyright() != null ) {

			if(r.getRsrchElmntDfnCopyright().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnCopyright()==null) {} else {
			researchelementdefinition.setCopyright(r.getRsrchElmntDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Dt ********************************************************************************/
		if(r.getRsrchElmntDfnDt() != null ) {

			if(r.getRsrchElmntDfnDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnDt()==null) {} else {
			researchelementdefinition.setDate(r.getRsrchElmntDfnDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchElmntDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Dscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnDscrptn() != null ) {

			if(r.getRsrchElmntDfnDscrptn().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnDscrptn()==null) {} else {
			researchelementdefinition.setDescription(r.getRsrchElmntDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Editor_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnEditorNm() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchElmntDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchElmntDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchElmntDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchElmntDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Use ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchElmntDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEditor().size() < i0+1) { researchelementdefinition.addEditor(); }
				String[] arrayi1 = r.getRsrchElmntDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEditor().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_EfctivePrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnEfctivePrdEnd() != null ) {

			if(r.getRsrchElmntDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnEfctivePrdEnd()==null) {} else {
			researchelementdefinition.getEffectivePeriod().setEnd(r.getRsrchElmntDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchElmntDfnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_EfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnEfctivePrdStrt() != null ) {

			if(r.getRsrchElmntDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnEfctivePrdStrt()==null) {} else {
			researchelementdefinition.getEffectivePeriod().setStart(r.getRsrchElmntDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchElmntDfnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Endsr_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrNm() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchElmntDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchElmntDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchElmntDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchElmntDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Use ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchElmntDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getEndorser().size() < i0+1) { researchelementdefinition.addEndorser(); }
				String[] arrayi1 = r.getRsrchElmntDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Exprmtl ********************************************************************************/
		if(r.getRsrchElmntDfnExprmtl() != null ) {

			if(r.getRsrchElmntDfnExprmtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnExprmtl()==null) {} else {
			researchelementdefinition.setExperimental(Boolean.parseBoolean(r.getRsrchElmntDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Id_Assigner ********************************************************************************/
		if(r.getRsrchElmntDfnIdAssigner() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Id_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Id_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnIdSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchElmntDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchelementdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchElmntDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchelementdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchElmntDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchelementdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchElmntDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchelementdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				String[] arrayi1 = r.getRsrchElmntDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchelementdefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Id_Use ********************************************************************************/
		if(r.getRsrchElmntDfnIdUse() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_Id_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnIdVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getIdentifier().size() < i0+1) { researchelementdefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getJurisdiction().size() < i0+1) { researchelementdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchElmntDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getJurisdiction().size() < i0+1) { researchelementdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchElmntDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getJurisdiction().size() < i0+1) { researchelementdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchElmntDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getJurisdiction().size() < i0+1) { researchelementdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchElmntDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getJurisdiction().size() < i0+1) { researchelementdefinition.addJurisdiction(); }
				String[] arrayi1 = r.getRsrchElmntDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Jrsdctn_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getJurisdiction().size() < i0+1) { researchelementdefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_LastReviewDt ********************************************************************************/
		if(r.getRsrchElmntDfnLastReviewDt() != null ) {

			if(r.getRsrchElmntDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnLastReviewDt()==null) {} else {
			researchelementdefinition.setLastReviewDate(r.getRsrchElmntDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchElmntDfnLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Library ********************************************************************************/
		if(r.getRsrchElmntDfnLibrary() != null ) {

				for( String currListStrSplit : r.getRsrchElmntDfnLibrary().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchelementdefinition.addLibrary(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** RsrchElmntDfn_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnNm() != null ) {

			if(r.getRsrchElmntDfnNm().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnNm()==null) {} else {
			researchelementdefinition.setName(r.getRsrchElmntDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Pblshr ********************************************************************************/
		if(r.getRsrchElmntDfnPblshr() != null ) {

			if(r.getRsrchElmntDfnPblshr().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnPblshr()==null) {} else {
			researchelementdefinition.setPublisher(r.getRsrchElmntDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Prpse ********************************************************************************/
		if(r.getRsrchElmntDfnPrpse() != null ) {

			if(r.getRsrchElmntDfnPrpse().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnPrpse()==null) {} else {
			researchelementdefinition.setPurpose(r.getRsrchElmntDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_RltedArtfct_Citation ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctCitation() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocData() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocHash() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocSz() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctLbl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctRsrc() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Typ ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctTyp() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_RltedArtfct_Url ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctUrl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getRelatedArtifact().size() < i0+1) { researchelementdefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrNm() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchElmntDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchElmntDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchElmntDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchElmntDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Use ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchElmntDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getReviewer().size() < i0+1) { researchelementdefinition.addReviewer(); }
				String[] arrayi1 = r.getRsrchElmntDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { researchelementdefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_ShortTtl ********************************************************************************/
		if(r.getRsrchElmntDfnShortTtl() != null ) {

			if(r.getRsrchElmntDfnShortTtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnShortTtl()==null) {} else {
			researchelementdefinition.setShortTitle(r.getRsrchElmntDfnShortTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Sts ********************************************************************************/
		if(r.getRsrchElmntDfnSts() != null ) {

			if(r.getRsrchElmntDfnSts().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnSts()==null) {} else {
			researchelementdefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(r.getRsrchElmntDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchelementdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchelementdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchelementdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchelementdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { researchelementdefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptTxt() != null ) {

			if(r.getRsrchElmntDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnSbjctCdbleCncptTxt()==null) {} else {
			researchelementdefinition.getSubjectCodeableConcept().setText(r.getRsrchElmntDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_SbjctRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctRfrnc() != null ) {

			if(r.getRsrchElmntDfnSbjctRfrnc().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnSbjctRfrnc()==null) {} else {
			researchelementdefinition.setSubject(new org.hl7.fhir.r4.model.Reference(r.getRsrchElmntDfnSbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Subtitle ********************************************************************************/
		if(r.getRsrchElmntDfnSubtitle() != null ) {

			if(r.getRsrchElmntDfnSubtitle().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnSubtitle()==null) {} else {
			researchelementdefinition.setSubtitle(r.getRsrchElmntDfnSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Ttl ********************************************************************************/
		if(r.getRsrchElmntDfnTtl() != null ) {

			if(r.getRsrchElmntDfnTtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnTtl()==null) {} else {
			researchelementdefinition.setTitle(r.getRsrchElmntDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getTopic().size() < i0+1) { researchelementdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchElmntDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getTopic().size() < i0+1) { researchelementdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchElmntDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getTopic().size() < i0+1) { researchelementdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchElmntDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getTopic().size() < i0+1) { researchelementdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchElmntDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getTopic().size() < i0+1) { researchelementdefinition.addTopic(); }
				String[] arrayi1 = r.getRsrchElmntDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getTopic().get(i0).getCoding().size() < i1+1) { researchelementdefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_Topic_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnTopicTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getTopic().size() < i0+1) { researchelementdefinition.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_Typ ********************************************************************************/
		if(r.getRsrchElmntDfnTyp() != null ) {

			if(r.getRsrchElmntDfnTyp().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnTyp()==null) {} else {
			researchelementdefinition.setType(new org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementTypeEnumFactory().fromCode(r.getRsrchElmntDfnTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Url ********************************************************************************/
		if(r.getRsrchElmntDfnUrl() != null ) {

			if(r.getRsrchElmntDfnUrl().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnUrl()==null) {} else {
			researchelementdefinition.setUrl(r.getRsrchElmntDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_Usg ********************************************************************************/
		if(r.getRsrchElmntDfnUsg() != null ) {

			if(r.getRsrchElmntDfnUsg().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnUsg()==null) {} else {
			researchelementdefinition.setUsage(r.getRsrchElmntDfnUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				String[] arrayi1 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RsrchElmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = r.getRsrchElmntDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchelementdefinition.getUseContext().size() < i0+1) { researchelementdefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchelementdefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchElmntDfn_VrbleTyp ********************************************************************************/
		if(r.getRsrchElmntDfnVrbleTyp() != null ) {

			if(r.getRsrchElmntDfnVrbleTyp().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnVrbleTyp()==null) {} else {
			researchelementdefinition.setVariableType(new org.hl7.fhir.r4.model.ResearchElementDefinition.VariableTypeEnumFactory().fromCode(r.getRsrchElmntDfnVrbleTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchElmntDfn_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnVrsn() != null ) {

			if(r.getRsrchElmntDfnVrsn().replace("[","").replace("]","").equals("NULL") | r.getRsrchElmntDfnVrsn()==null) {} else {
			researchelementdefinition.setVersion(r.getRsrchElmntDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return researchelementdefinition;
	}
}
