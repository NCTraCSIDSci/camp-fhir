package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationRecommendation;
public class ImmunizationRecommendationConversion 
{
	public org.hl7.fhir.r4.model.ImmunizationRecommendation ImmunizationRecommendations(ImmunizationRecommendation i) throws ParseException
	{
		org.hl7.fhir.r4.model.ImmunizationRecommendation immunizationrecommendation = new org.hl7.fhir.r4.model.ImmunizationRecommendation();

		/******************** id ********************************************************************************/
		immunizationrecommendation.setId(i.getId());

		/******************** ImmnztnRecmndation_Athrity ********************************************************************************/
		if(i.getImmnztnRecmndationAthrity() != null ) {

			if(i.getImmnztnRecmndationAthrity().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRecmndationAthrity()==null) {} else {
			immunizationrecommendation.setAuthority(new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationAthrity().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnRecmndation_Dt ********************************************************************************/
		if(i.getImmnztnRecmndationDt() != null ) {

			if(i.getImmnztnRecmndationDt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRecmndationDt()==null) {} else {
			immunizationrecommendation.setDate(i.getImmnztnRecmndationDt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRecmndationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getImmnztnRecmndationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnRecmndation_Id_Assigner ********************************************************************************/
		if(i.getImmnztnRecmndationIdAssigner() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Id_Prd_End ********************************************************************************/
		if(i.getImmnztnRecmndationIdPrdEnd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Id_Prd_Strt ********************************************************************************/
		if(i.getImmnztnRecmndationIdPrdStrt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Id_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationIdSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnRecmndationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationrecommendation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnRecmndationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationrecommendation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnRecmndationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationrecommendation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnRecmndationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationrecommendation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnRecmndationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationrecommendation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Id_Typ_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationIdTypTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Id_Use ********************************************************************************/
		if(i.getImmnztnRecmndationIdUse() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Id_Vl ********************************************************************************/
		if(i.getImmnztnRecmndationIdVl() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getIdentifier().size() < i0+1) { immunizationrecommendation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Pnt ********************************************************************************/
		if(i.getImmnztnRecmndationPnt() != null ) {

			if(i.getImmnztnRecmndationPnt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRecmndationPnt()==null) {} else {
			immunizationrecommendation.setPatient(new org.hl7.fhir.r4.model.Reference(i.getImmnztnRecmndationPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addContraindicatedVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addContraindicatedVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addContraindicatedVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addContraindicatedVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addContraindicatedVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_CntrindctdVaccineCd_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationCntrindctdVaccineCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addContraindicatedVaccineCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getContraindicatedVaccineCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationDtCriterionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Cd_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionCdTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DtCriterion_Vl ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDtCriterionVl() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDtCriterionVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationDtCriterionVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addDateCriterion(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getDateCriterion().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_Dscrptn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDscrptn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDoseNmbrPositiveIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).setDoseNumber(new org.hl7.fhir.r4.model.PositiveIntType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_DoseNmbrStrgTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationDoseNmbrStrgTyp() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationDoseNmbrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).setDoseNumber(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addForecastReason(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationForecastRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addForecastReason(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationForecastRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addForecastReason(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationForecastRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addForecastReason(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationForecastRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addForecastReason(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationForecastRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastRsn_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastRsnTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastReason().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addForecastReason(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastReason().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationForecastStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_ForecastSts_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationForecastStsTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationForecastStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getForecastStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_Series ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSeries() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationSeries().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).setSeries(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationSeriesDosesPositiveIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).setSeriesDoses(new org.hl7.fhir.r4.model.PositiveIntType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_SeriesDosesStrgTyp ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSeriesDosesStrgTyp() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationSeriesDosesStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).setSeriesDoses(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_SprtingImmnztn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSprtingImmnztn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationSprtingImmnztn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {immunizationrecommendation.getRecommendation().get(i0).addSupportingImmunization(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_SprtingPntInfo ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationSprtingPntInfo() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationSprtingPntInfo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {immunizationrecommendation.getRecommendation().get(i0).addSupportingPatientInformation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationTarDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_TarDisease_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationTarDiseaseTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationTarDiseaseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getTargetDisease().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addVaccineCode(); }
					String[] arrayi2 = i.getImmnztnRecmndationRecmndationVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().size() < i2+1) { immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImmnztnRecmndation_Recmndation_VaccineCd_Txt ********************************************************************************/
		if(i.getImmnztnRecmndationRecmndationVaccineCdTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRecmndationRecmndationVaccineCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationrecommendation.getRecommendation().size() < i0+1) { immunizationrecommendation.addRecommendation(); }
				String[] arrayi1 = i.getImmnztnRecmndationRecmndationVaccineCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().size() < i1+1) { immunizationrecommendation.getRecommendation().get(i0).addVaccineCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationrecommendation.getRecommendation().get(i0).getVaccineCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		return immunizationrecommendation;
	}
}
