package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SpecimenDefinition;
public class SpecimenDefinitionConversion 
{
	public org.hl7.fhir.r4.model.SpecimenDefinition SpecimenDefinitions(SpecimenDefinition s) throws ParseException
	{
		org.hl7.fhir.r4.model.SpecimenDefinition specimendefinition = new org.hl7.fhir.r4.model.SpecimenDefinition();

		/******************** id ********************************************************************************/
		specimendefinition.setId(s.getId());

		/******************** SpcmnDfn_Collection_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnCollectionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getCollection().size() < i0+1) { specimendefinition.addCollection(); }
				String[] arrayi1 = s.getSpcmnDfnCollectionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getCollection().get(i0).getCoding().size() < i1+1) { specimendefinition.getCollection().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getCollection().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_Collection_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnCollectionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getCollection().size() < i0+1) { specimendefinition.addCollection(); }
				String[] arrayi1 = s.getSpcmnDfnCollectionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getCollection().get(i0).getCoding().size() < i1+1) { specimendefinition.getCollection().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getCollection().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_Collection_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnCollectionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getCollection().size() < i0+1) { specimendefinition.addCollection(); }
				String[] arrayi1 = s.getSpcmnDfnCollectionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getCollection().get(i0).getCoding().size() < i1+1) { specimendefinition.getCollection().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getCollection().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_Collection_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnCollectionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getCollection().size() < i0+1) { specimendefinition.addCollection(); }
				String[] arrayi1 = s.getSpcmnDfnCollectionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getCollection().get(i0).getCoding().size() < i1+1) { specimendefinition.getCollection().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getCollection().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_Collection_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnCollectionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getCollection().size() < i0+1) { specimendefinition.addCollection(); }
				String[] arrayi1 = s.getSpcmnDfnCollectionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getCollection().get(i0).getCoding().size() < i1+1) { specimendefinition.getCollection().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getCollection().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_Collection_Txt ********************************************************************************/
		if(s.getSpcmnDfnCollectionTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnCollectionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getCollection().size() < i0+1) { specimendefinition.addCollection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getCollection().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_Id_Assigner ********************************************************************************/
		if(s.getSpcmnDfnIdAssigner() != null ) {

			if(s.getSpcmnDfnIdAssigner().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdAssigner()==null) {} else {
			specimendefinition.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(s.getSpcmnDfnIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpcmnDfn_Id_Prd_End ********************************************************************************/
		if(s.getSpcmnDfnIdPrdEnd() != null ) {

			if(s.getSpcmnDfnIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdPrdEnd()==null) {} else {
			specimendefinition.getIdentifier().getPeriod().setEnd(s.getSpcmnDfnIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnDfnIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpcmnDfn_Id_Prd_Strt ********************************************************************************/
		if(s.getSpcmnDfnIdPrdStrt() != null ) {

			if(s.getSpcmnDfnIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdPrdStrt()==null) {} else {
			specimendefinition.getIdentifier().getPeriod().setStart(s.getSpcmnDfnIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnDfnIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpcmnDfn_Id_Sys ********************************************************************************/
		if(s.getSpcmnDfnIdSys() != null ) {

			if(s.getSpcmnDfnIdSys().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdSys()==null) {} else {
			specimendefinition.getIdentifier().setSystem(s.getSpcmnDfnIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getIdentifier().getType().getCoding().size() < i0+1) { specimendefinition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getIdentifier().getType().getCoding().size() < i0+1) { specimendefinition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getIdentifier().getType().getCoding().size() < i0+1) { specimendefinition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getIdentifier().getType().getCoding().size() < i0+1) { specimendefinition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getIdentifier().getType().getCoding().size() < i0+1) { specimendefinition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_Id_Typ_Txt ********************************************************************************/
		if(s.getSpcmnDfnIdTypTxt() != null ) {

			if(s.getSpcmnDfnIdTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdTypTxt()==null) {} else {
			specimendefinition.getIdentifier().getType().setText(s.getSpcmnDfnIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpcmnDfn_Id_Use ********************************************************************************/
		if(s.getSpcmnDfnIdUse() != null ) {

			if(s.getSpcmnDfnIdUse().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdUse()==null) {} else {
			specimendefinition.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(s.getSpcmnDfnIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpcmnDfn_Id_Vl ********************************************************************************/
		if(s.getSpcmnDfnIdVl() != null ) {

			if(s.getSpcmnDfnIdVl().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnIdVl()==null) {} else {
			specimendefinition.getIdentifier().setValue(s.getSpcmnDfnIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnPntPreparationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getPatientPreparation().size() < i0+1) { specimendefinition.addPatientPreparation(); }
				String[] arrayi1 = s.getSpcmnDfnPntPreparationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getPatientPreparation().get(i0).getCoding().size() < i1+1) { specimendefinition.getPatientPreparation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getPatientPreparation().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnPntPreparationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getPatientPreparation().size() < i0+1) { specimendefinition.addPatientPreparation(); }
				String[] arrayi1 = s.getSpcmnDfnPntPreparationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getPatientPreparation().get(i0).getCoding().size() < i1+1) { specimendefinition.getPatientPreparation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getPatientPreparation().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnPntPreparationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getPatientPreparation().size() < i0+1) { specimendefinition.addPatientPreparation(); }
				String[] arrayi1 = s.getSpcmnDfnPntPreparationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getPatientPreparation().get(i0).getCoding().size() < i1+1) { specimendefinition.getPatientPreparation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getPatientPreparation().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_PntPreparation_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnPntPreparationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getPatientPreparation().size() < i0+1) { specimendefinition.addPatientPreparation(); }
				String[] arrayi1 = s.getSpcmnDfnPntPreparationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getPatientPreparation().get(i0).getCoding().size() < i1+1) { specimendefinition.getPatientPreparation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getPatientPreparation().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnPntPreparationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getPatientPreparation().size() < i0+1) { specimendefinition.addPatientPreparation(); }
				String[] arrayi1 = s.getSpcmnDfnPntPreparationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getPatientPreparation().get(i0).getCoding().size() < i1+1) { specimendefinition.getPatientPreparation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getPatientPreparation().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_PntPreparation_Txt ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnPntPreparationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getPatientPreparation().size() < i0+1) { specimendefinition.addPatientPreparation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getPatientPreparation().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TimeAspect ********************************************************************************/
		if(s.getSpcmnDfnTimeAspect() != null ) {

			if(s.getSpcmnDfnTimeAspect().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnTimeAspect()==null) {} else {
			specimendefinition.setTimeAspect(s.getSpcmnDfnTimeAspect().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypCollectedCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeCollected().getCoding().size() < i0+1) { specimendefinition.getTypeCollected().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeCollected().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypCollected_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypCollectedCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeCollected().getCoding().size() < i0+1) { specimendefinition.getTypeCollected().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeCollected().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypCollected_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypCollectedCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeCollected().getCoding().size() < i0+1) { specimendefinition.getTypeCollected().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeCollected().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypCollected_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypCollectedCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeCollected().getCoding().size() < i0+1) { specimendefinition.getTypeCollected().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeCollected().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypCollected_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypCollectedCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeCollected().getCoding().size() < i0+1) { specimendefinition.getTypeCollected().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeCollected().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypCollected_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedTxt() != null ) {

			if(s.getSpcmnDfnTypCollectedTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnDfnTypCollectedTxt()==null) {} else {
			specimendefinition.getTypeCollected().setText(s.getSpcmnDfnTypCollectedTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).getAdditiveCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvRfrnc ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvRfrnc() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerAddtvAddtvRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().addAdditive(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getAdditive().get(i1).setAdditive(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerCapCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getCap().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerCapCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getCap().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerCapCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getCap().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerCapCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getCap().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerCapCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getCap().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCap().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCap().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapacityCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCapacity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Cmprtr ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapacityCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCapacity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacitySys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapacitySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCapacity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityUnt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapacityUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCapacity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityVl() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerCapacityVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getCapacity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Dscrptn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerDscrptn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMaterial().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMinimumVolumeQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cmprtr ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMinimumVolumeQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntySys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMinimumVolumeQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMinimumVolumeQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getMinimumVolumeQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeStrgTyp ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().setMinimumVolume(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Preparation ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerPreparation() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerPreparation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().setPreparation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedCntainerTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getContainer().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedCntainerTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getContainer().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_Instrctn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingInstrctn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).setInstruction(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingMxDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingMxDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getMaxDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Cmprtr ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingMxDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingMxDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getMaxDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingMxDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingMxDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getMaxDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationUnt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingMxDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingMxDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getMaxDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationVl() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingMxDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingMxDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getMaxDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureQualifierTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureQualifier().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiUnt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiVl() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwUnt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwVl() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedHandlingTemperatureRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getHandling().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addHandling(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getHandling().get(i1).getTemperatureRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_IsDerived ********************************************************************************/
		if(s.getSpcmnDfnTypTstedIsDerived() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedIsDerived().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).setIsDerived(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Preference ********************************************************************************/
		if(s.getSpcmnDfnTypTstedPreference() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedPreference().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).setPreference(new org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenContainedPreferenceEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRejectionCriterionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedRejectionCriterionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addRejectionCriterion(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedRejectionCriterionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRejectionCriterionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedRejectionCriterionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addRejectionCriterion(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedRejectionCriterionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRejectionCriterionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedRejectionCriterionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addRejectionCriterion(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedRejectionCriterionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addRejectionCriterion(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRejectionCriterionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedRejectionCriterionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addRejectionCriterion(); }
					String[] arrayi2 = s.getSpcmnDfnTypTstedRejectionCriterionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().size() < i2+1) { specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRejectionCriterionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedRejectionCriterionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getRejectionCriterion().size() < i1+1) { specimendefinition.getTypeTested().get(i0).addRejectionCriterion(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getRejectionCriterion().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Rqrment ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRqrment() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRqrment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).setRequirement(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRetentionTimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getRetentionTime().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Cmprtr ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRetentionTimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getRetentionTime().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRetentionTimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getRetentionTime().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeUnt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRetentionTimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getRetentionTime().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeVl() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedRetentionTimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getRetentionTime().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				String[] arrayi1 = s.getSpcmnDfnTypTstedTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimendefinition.getTypeTested().get(i0).getType().getCoding().size() < i1+1) { specimendefinition.getTypeTested().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimendefinition.getTypeTested().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpcmnDfn_TypTsted_Typ_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypTxt() != null ) {

			String[] arrayi0 = s.getSpcmnDfnTypTstedTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimendefinition.getTypeTested().size() < i0+1) { specimendefinition.addTypeTested(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimendefinition.getTypeTested().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return specimendefinition;
	}
}
