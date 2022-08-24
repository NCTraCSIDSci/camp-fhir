package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EvidenceVariable;
public class EvidenceVariableConversion 
{
	public org.hl7.fhir.r4.model.EvidenceVariable EvidenceVariables(EvidenceVariable e) throws ParseException
	{
		org.hl7.fhir.r4.model.EvidenceVariable evidencevariable = new org.hl7.fhir.r4.model.EvidenceVariable();

		/******************** id ********************************************************************************/
		evidencevariable.setId(e.getId());

		/******************** EvdnceVrble_ApprovalDt ********************************************************************************/
		if(e.getEvdnceVrbleApprovalDt() != null ) {

			if(e.getEvdnceVrbleApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleApprovalDt()==null) {} else {
			evidencevariable.setApprovalDate(e.getEvdnceVrbleApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceVrbleApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_Athr_Nm ********************************************************************************/
		if(e.getEvdnceVrbleAthrNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				String[] arrayi1 = e.getEvdnceVrbleAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getAuthor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				String[] arrayi1 = e.getEvdnceVrbleAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getAuthor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				String[] arrayi1 = e.getEvdnceVrbleAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getAuthor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Athr_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				String[] arrayi1 = e.getEvdnceVrbleAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getAuthor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Athr_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				String[] arrayi1 = e.getEvdnceVrbleAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getAuthor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getAuthor().size() < i0+1) { evidencevariable.addAuthor(); }
				String[] arrayi1 = e.getEvdnceVrbleAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getAuthor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCanonicalTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCanonicalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).setDefinition(new org.hl7.fhir.r4.model.CanonicalType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).getCode().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getCodeFilter().get(i1).setValueSet(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValueDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValuePeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getDateFilter().get(i1).getValuePeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentLmt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().setLimit(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_MustSupport ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentMustSupport() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Profile ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentProfile() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Sort_Direction ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().get(i1).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortPath() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSort().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().getSubjectCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().setSubject(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnDataRqrmentTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionDataRequirement().setType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnDscrptn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionExpression().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnExprsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionExpression().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnLnguage() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionExpression().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionExpression().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionExpression().setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).setDefinition(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getCondition().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Exprsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getCondition().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Lnguage ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getCondition().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getCondition().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Rfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getCondition().setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						String[] arrayi3 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).getCode().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_VlSt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getCodeFilter().get(i2).setValueSet(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValueDuration().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValueDuration().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValueDuration().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValueDuration().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValuePeriod().setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getDateFilter().get(i2).getValuePeriod().setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Lmt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).setLimit(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_MustSupport ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Profile ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Sort_Direction ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSort().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSort().get(i2).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Sort_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSort().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSort().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).getSubjectCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Typ ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().addData(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getData().get(i1).setType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().setTiming(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().setTiming(new org.hl7.fhir.r4.model.DateType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().setTiming(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgEvnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
	return EvidenceVariables_Extended(e, evidencevariable);
	}
		public org.hl7.fhir.r4.model.EvidenceVariable EvidenceVariables_Extended(EvidenceVariable e, org.hl7.fhir.r4.model.EvidenceVariable evidencevariable) throws ParseException
		{
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Typ ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDfnTrgrDfnTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getDefinitionTriggerDefinition().setType(new org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDscrptn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_Exclude ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcExclude() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcExclude().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).setExclude(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_GrpMsr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcGrpMsr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcGrpMsr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).setGroupMeasure(new org.hl7.fhir.r4.model.EvidenceVariable.GroupMeasureEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).setParticipantEffective(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectivePeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectivePeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationUnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdUnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {evidencevariable.getCharacteristic().get(i0).getParticipantEffectiveTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcTimeFromStrtCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcTimeFromStrtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getTimeFromStart().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcTimeFromStrtCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcTimeFromStrtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getTimeFromStart().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcTimeFromStrtSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcTimeFromStrtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getTimeFromStart().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcTimeFromStrtUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcTimeFromStrtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getTimeFromStart().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcTimeFromStrtVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcTimeFromStrtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getCharacteristic().get(i0).getTimeFromStart().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getCode().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					String[] arrayi2 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().size() < i2+1) { evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntySys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getCharacteristic().size() < i0+1) { evidencevariable.addCharacteristic(); }
				String[] arrayi1 = e.getEvdnceVrbleCrctrstcUsgCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getCharacteristic().get(i0).getUsageContext().size() < i1+1) { evidencevariable.getCharacteristic().get(i0).addUsageContext(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getCharacteristic().get(i0).getUsageContext().get(i1).setValue(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Cntct_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCntctNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				String[] arrayi1 = e.getEvdnceVrbleCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getContact().get(i0).getTelecom().size() < i1+1) { evidencevariable.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				String[] arrayi1 = e.getEvdnceVrbleCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getContact().get(i0).getTelecom().size() < i1+1) { evidencevariable.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				String[] arrayi1 = e.getEvdnceVrbleCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getContact().get(i0).getTelecom().size() < i1+1) { evidencevariable.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Cntct_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				String[] arrayi1 = e.getEvdnceVrbleCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getContact().get(i0).getTelecom().size() < i1+1) { evidencevariable.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Cntct_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				String[] arrayi1 = e.getEvdnceVrbleCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getContact().get(i0).getTelecom().size() < i1+1) { evidencevariable.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getContact().size() < i0+1) { evidencevariable.addContact(); }
				String[] arrayi1 = e.getEvdnceVrbleCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getContact().get(i0).getTelecom().size() < i1+1) { evidencevariable.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Copyright ********************************************************************************/
		if(e.getEvdnceVrbleCopyright() != null ) {

			if(e.getEvdnceVrbleCopyright().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleCopyright()==null) {} else {
			evidencevariable.setCopyright(e.getEvdnceVrbleCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_Dt ********************************************************************************/
		if(e.getEvdnceVrbleDt() != null ) {

			if(e.getEvdnceVrbleDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleDt()==null) {} else {
			evidencevariable.setDate(e.getEvdnceVrbleDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceVrbleDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleDscrptn() != null ) {

			if(e.getEvdnceVrbleDscrptn().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleDscrptn()==null) {} else {
			evidencevariable.setDescription(e.getEvdnceVrbleDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_Editor_Nm ********************************************************************************/
		if(e.getEvdnceVrbleEditorNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				String[] arrayi1 = e.getEvdnceVrbleEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEditor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				String[] arrayi1 = e.getEvdnceVrbleEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEditor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				String[] arrayi1 = e.getEvdnceVrbleEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEditor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Editor_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				String[] arrayi1 = e.getEvdnceVrbleEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEditor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Editor_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				String[] arrayi1 = e.getEvdnceVrbleEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEditor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEditor().size() < i0+1) { evidencevariable.addEditor(); }
				String[] arrayi1 = e.getEvdnceVrbleEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEditor().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_EfctivePrd_End ********************************************************************************/
		if(e.getEvdnceVrbleEfctivePrdEnd() != null ) {

			if(e.getEvdnceVrbleEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleEfctivePrdEnd()==null) {} else {
			evidencevariable.getEffectivePeriod().setEnd(e.getEvdnceVrbleEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceVrbleEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_EfctivePrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleEfctivePrdStrt() != null ) {

			if(e.getEvdnceVrbleEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleEfctivePrdStrt()==null) {} else {
			evidencevariable.getEffectivePeriod().setStart(e.getEvdnceVrbleEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceVrbleEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_Endsr_Nm ********************************************************************************/
		if(e.getEvdnceVrbleEndsrNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				String[] arrayi1 = e.getEvdnceVrbleEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEndorser().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				String[] arrayi1 = e.getEvdnceVrbleEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEndorser().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				String[] arrayi1 = e.getEvdnceVrbleEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEndorser().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Endsr_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				String[] arrayi1 = e.getEvdnceVrbleEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEndorser().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Endsr_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				String[] arrayi1 = e.getEvdnceVrbleEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEndorser().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getEndorser().size() < i0+1) { evidencevariable.addEndorser(); }
				String[] arrayi1 = e.getEvdnceVrbleEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getEndorser().get(i0).getTelecom().size() < i1+1) { evidencevariable.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Id_Assigner ********************************************************************************/
		if(e.getEvdnceVrbleIdAssigner() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Id_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Id_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Id_Sys ********************************************************************************/
		if(e.getEvdnceVrbleIdSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceVrbleIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidencevariable.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceVrbleIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidencevariable.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceVrbleIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidencevariable.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceVrbleIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidencevariable.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				String[] arrayi1 = e.getEvdnceVrbleIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { evidencevariable.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Id_Typ_Txt ********************************************************************************/
		if(e.getEvdnceVrbleIdTypTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Id_Use ********************************************************************************/
		if(e.getEvdnceVrbleIdUse() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Id_Vl ********************************************************************************/
		if(e.getEvdnceVrbleIdVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getIdentifier().size() < i0+1) { evidencevariable.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getJurisdiction().size() < i0+1) { evidencevariable.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceVrbleJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidencevariable.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getJurisdiction().size() < i0+1) { evidencevariable.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceVrbleJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidencevariable.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getJurisdiction().size() < i0+1) { evidencevariable.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceVrbleJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidencevariable.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getJurisdiction().size() < i0+1) { evidencevariable.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceVrbleJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidencevariable.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getJurisdiction().size() < i0+1) { evidencevariable.addJurisdiction(); }
				String[] arrayi1 = e.getEvdnceVrbleJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getJurisdiction().get(i0).getCoding().size() < i1+1) { evidencevariable.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Jrsdctn_Txt ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getJurisdiction().size() < i0+1) { evidencevariable.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_LastReviewDt ********************************************************************************/
		if(e.getEvdnceVrbleLastReviewDt() != null ) {

			if(e.getEvdnceVrbleLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleLastReviewDt()==null) {} else {
			evidencevariable.setLastReviewDate(e.getEvdnceVrbleLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEvdnceVrbleLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_Nm ********************************************************************************/
		if(e.getEvdnceVrbleNm() != null ) {

			if(e.getEvdnceVrbleNm().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleNm()==null) {} else {
			evidencevariable.setName(e.getEvdnceVrbleNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleNtAthrRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getNote().size() < i0+1) { evidencevariable.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEvdnceVrbleNtAthrStrgTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getNote().size() < i0+1) { evidencevariable.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Nt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleNtTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getNote().size() < i0+1) { evidencevariable.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Nt_Time ********************************************************************************/
		if(e.getEvdnceVrbleNtTime() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getNote().size() < i0+1) { evidencevariable.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Pblshr ********************************************************************************/
		if(e.getEvdnceVrblePblshr() != null ) {

			if(e.getEvdnceVrblePblshr().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrblePblshr()==null) {} else {
			evidencevariable.setPublisher(e.getEvdnceVrblePblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_RltedArtfct_Citation ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctCitation() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocData() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocHash() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocSz() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctLbl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctRsrc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Typ ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctTyp() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_RltedArtfct_Url ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctUrl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getRelatedArtifact().size() < i0+1) { evidencevariable.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Rviewr_Nm ********************************************************************************/
		if(e.getEvdnceVrbleRviewrNm() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				String[] arrayi1 = e.getEvdnceVrbleRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getReviewer().get(i0).getTelecom().size() < i1+1) { evidencevariable.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				String[] arrayi1 = e.getEvdnceVrbleRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getReviewer().get(i0).getTelecom().size() < i1+1) { evidencevariable.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				String[] arrayi1 = e.getEvdnceVrbleRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getReviewer().get(i0).getTelecom().size() < i1+1) { evidencevariable.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Sys ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				String[] arrayi1 = e.getEvdnceVrbleRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getReviewer().get(i0).getTelecom().size() < i1+1) { evidencevariable.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Use ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmUse() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				String[] arrayi1 = e.getEvdnceVrbleRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getReviewer().get(i0).getTelecom().size() < i1+1) { evidencevariable.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getReviewer().size() < i0+1) { evidencevariable.addReviewer(); }
				String[] arrayi1 = e.getEvdnceVrbleRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getReviewer().get(i0).getTelecom().size() < i1+1) { evidencevariable.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_ShortTtl ********************************************************************************/
		if(e.getEvdnceVrbleShortTtl() != null ) {

			if(e.getEvdnceVrbleShortTtl().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleShortTtl()==null) {} else {
			evidencevariable.setShortTitle(e.getEvdnceVrbleShortTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_Sts ********************************************************************************/
		if(e.getEvdnceVrbleSts() != null ) {

			if(e.getEvdnceVrbleSts().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleSts()==null) {} else {
			evidencevariable.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(e.getEvdnceVrbleSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_Subtitle ********************************************************************************/
		if(e.getEvdnceVrbleSubtitle() != null ) {

			if(e.getEvdnceVrbleSubtitle().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleSubtitle()==null) {} else {
			evidencevariable.setSubtitle(e.getEvdnceVrbleSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_Ttl ********************************************************************************/
		if(e.getEvdnceVrbleTtl() != null ) {

			if(e.getEvdnceVrbleTtl().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleTtl()==null) {} else {
			evidencevariable.setTitle(e.getEvdnceVrbleTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getTopic().size() < i0+1) { evidencevariable.addTopic(); }
				String[] arrayi1 = e.getEvdnceVrbleTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getTopic().get(i0).getCoding().size() < i1+1) { evidencevariable.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getTopic().size() < i0+1) { evidencevariable.addTopic(); }
				String[] arrayi1 = e.getEvdnceVrbleTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getTopic().get(i0).getCoding().size() < i1+1) { evidencevariable.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getTopic().size() < i0+1) { evidencevariable.addTopic(); }
				String[] arrayi1 = e.getEvdnceVrbleTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getTopic().get(i0).getCoding().size() < i1+1) { evidencevariable.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getTopic().size() < i0+1) { evidencevariable.addTopic(); }
				String[] arrayi1 = e.getEvdnceVrbleTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getTopic().get(i0).getCoding().size() < i1+1) { evidencevariable.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getTopic().size() < i0+1) { evidencevariable.addTopic(); }
				String[] arrayi1 = e.getEvdnceVrbleTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getTopic().get(i0).getCoding().size() < i1+1) { evidencevariable.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_Topic_Txt ********************************************************************************/
		if(e.getEvdnceVrbleTopicTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getTopic().size() < i0+1) { evidencevariable.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_Typ ********************************************************************************/
		if(e.getEvdnceVrbleTyp() != null ) {

			if(e.getEvdnceVrbleTyp().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleTyp()==null) {} else {
			evidencevariable.setType(new org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableTypeEnumFactory().fromCode(e.getEvdnceVrbleTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EvdnceVrble_Url ********************************************************************************/
		if(e.getEvdnceVrbleUrl() != null ) {

			if(e.getEvdnceVrbleUrl().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleUrl()==null) {} else {
			evidencevariable.setUrl(e.getEvdnceVrbleUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EvdnceVrble_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				String[] arrayi1 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				String[] arrayi1 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				String[] arrayi1 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				String[] arrayi1 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				String[] arrayi1 = e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { evidencevariable.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {evidencevariable.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EvdnceVrble_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = e.getEvdnceVrbleUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(evidencevariable.getUseContext().size() < i0+1) { evidencevariable.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {evidencevariable.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EvdnceVrble_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleVrsn() != null ) {

			if(e.getEvdnceVrbleVrsn().replace("[","").replace("]","").equals("NULL") | e.getEvdnceVrbleVrsn()==null) {} else {
			evidencevariable.setVersion(e.getEvdnceVrbleVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return evidencevariable;
	}
}
