package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SpecimenDefinition;
public class SpecimenDefinitionBidirectionalConversion 
{
	public SpecimenDefinition SpecimenDefinitions(org.hl7.fhir.r4.model.SpecimenDefinition specimendefinition) throws ParseException
	{
		 main.java.com.campfhir.model.SpecimenDefinition s = new  main.java.com.campfhir.model.SpecimenDefinition();

		/******************** id ********************************************************************************/
		specimendefinition.setId(s.getId());

		/******************** specimendefinitiontypetested ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedComponent specimendefinitiontypetested = specimendefinition.getTypeTestedFirstRep();

		/******************** specimendefinitiontypetestedtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedtype = specimendefinitiontypetested.getType();

		/******************** specimendefinitiontypetestedtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedtypecoding = specimendefinitiontypetestedtype.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedtypecoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedTypCdgDsply(String.valueOf(specimendefinitiontypetestedtypecoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedtypecoding.hasVersion()) {
			s.setSpcmnDfnTypTstedTypCdgVrsn(String.valueOf(specimendefinitiontypetestedtypecoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedtypecoding.hasCode()) {
			s.setSpcmnDfnTypTstedTypCdgCd(String.valueOf(specimendefinitiontypetestedtypecoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedtypecoding.hasSystem()) {
			s.setSpcmnDfnTypTstedTypCdgSys(String.valueOf(specimendefinitiontypetestedtypecoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedtypecoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedTypCdgUsrSltd(String.valueOf(specimendefinitiontypetestedtypecoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_Typ_Txt ********************************************************************************/
		if(specimendefinitiontypetestedtype.hasText()) {
			s.setSpcmnDfnTypTstedTypTxt(String.valueOf(specimendefinitiontypetestedtype.getText()));
		}
		/******************** specimendefinitiontypetestedcontainer ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerComponent specimendefinitiontypetestedcontainer = specimendefinitiontypetested.getContainer();

		/******************** specimendefinitiontypetestedcontainertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainertype = specimendefinitiontypetestedcontainer.getType();

		/******************** specimendefinitiontypetestedcontainertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontainertypecoding = specimendefinitiontypetestedcontainertype.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedCntainerTypCdgDsply(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecoding.hasVersion()) {
			s.setSpcmnDfnTypTstedCntainerTypCdgVrsn(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecoding.hasCode()) {
			s.setSpcmnDfnTypTstedCntainerTypCdgCd(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecoding.hasSystem()) {
			s.setSpcmnDfnTypTstedCntainerTypCdgSys(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontainertypecoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedCntainerTypCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontainertypecoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontainertype.hasText()) {
			s.setSpcmnDfnTypTstedCntainerTypTxt(String.valueOf(specimendefinitiontypetestedcontainertype.getText()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Dscrptn ********************************************************************************/
		if(specimendefinitiontypetestedcontainer.hasDescription()) {
			s.setSpcmnDfnTypTstedCntainerDscrptn(String.valueOf(specimendefinitiontypetestedcontainer.getDescription()));
		}
		/******************** specimendefinitiontypetestedcontaineradditive ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerAdditiveComponent specimendefinitiontypetestedcontaineradditive = specimendefinitiontypetestedcontainer.getAdditiveFirstRep();

		/******************** specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept = specimendefinitiontypetestedcontaineradditive.getAdditiveCodeableConcept();

		/******************** specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding = specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasVersion()) {
			s.setSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasCode()) {
			s.setSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasSystem()) {
			s.setSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.hasText()) {
			s.setSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt(String.valueOf(specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.getText()));
		}
		/******************** specimendefinitiontypetestedcontainerminimumvolumequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedcontainerminimumvolumequantity = specimendefinitiontypetestedcontainer.getMinimumVolumeQuantity();

		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Vl ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasValue()) {
			s.setSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getValue()));
		}
		/******************** specimendefinitiontypetestedcontainerminimumvolumequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedcontainerminimumvolumequantitycomparator = specimendefinitiontypetestedcontainerminimumvolumequantity.getComparator();
		s.setSpcmnDfnTypTstedCntainerMinimumVolumeQntyCmprtr(specimendefinitiontypetestedcontainerminimumvolumequantitycomparator.toCode());

		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasCode()) {
			s.setSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasSystem()) {
			s.setSpcmnDfnTypTstedCntainerMinimumVolumeQntySys(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Unt ********************************************************************************/
		if(specimendefinitiontypetestedcontainerminimumvolumequantity.hasUnit()) {
			s.setSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt(String.valueOf(specimendefinitiontypetestedcontainerminimumvolumequantity.getUnit()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeStrgTyp ********************************************************************************/
		if(specimendefinitiontypetestedcontainer.hasMinimumVolumeStringType()) {
			s.setSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp(String.valueOf(specimendefinitiontypetestedcontainer.getMinimumVolumeStringType()));
		}
		/******************** specimendefinitiontypetestedcontainercapacity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedcontainercapacity = specimendefinitiontypetestedcontainer.getCapacity();

		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Vl ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasValue()) {
			s.setSpcmnDfnTypTstedCntainerCapacityVl(String.valueOf(specimendefinitiontypetestedcontainercapacity.getValue()));
		}
		/******************** specimendefinitiontypetestedcontainercapacitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedcontainercapacitycomparator = specimendefinitiontypetestedcontainercapacity.getComparator();
		s.setSpcmnDfnTypTstedCntainerCapacityCmprtr(specimendefinitiontypetestedcontainercapacitycomparator.toCode());

		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasCode()) {
			s.setSpcmnDfnTypTstedCntainerCapacityCd(String.valueOf(specimendefinitiontypetestedcontainercapacity.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasSystem()) {
			s.setSpcmnDfnTypTstedCntainerCapacitySys(String.valueOf(specimendefinitiontypetestedcontainercapacity.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Unt ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapacity.hasUnit()) {
			s.setSpcmnDfnTypTstedCntainerCapacityUnt(String.valueOf(specimendefinitiontypetestedcontainercapacity.getUnit()));
		}
		/******************** specimendefinitiontypetestedcontainercap ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainercap = specimendefinitiontypetestedcontainer.getCap();

		/******************** specimendefinitiontypetestedcontainercapcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontainercapcoding = specimendefinitiontypetestedcontainercap.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedCntainerCapCdgDsply(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcoding.hasVersion()) {
			s.setSpcmnDfnTypTstedCntainerCapCdgVrsn(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcoding.hasCode()) {
			s.setSpcmnDfnTypTstedCntainerCapCdgCd(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcoding.hasSystem()) {
			s.setSpcmnDfnTypTstedCntainerCapCdgSys(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontainercapcoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedCntainerCapCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontainercapcoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontainercap.hasText()) {
			s.setSpcmnDfnTypTstedCntainerCapTxt(String.valueOf(specimendefinitiontypetestedcontainercap.getText()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Preparation ********************************************************************************/
		if(specimendefinitiontypetestedcontainer.hasPreparation()) {
			s.setSpcmnDfnTypTstedCntainerPreparation(String.valueOf(specimendefinitiontypetestedcontainer.getPreparation()));
		}
		/******************** specimendefinitiontypetestedcontainermaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainermaterial = specimendefinitiontypetestedcontainer.getMaterial();

		/******************** specimendefinitiontypetestedcontainermaterialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontainermaterialcoding = specimendefinitiontypetestedcontainermaterial.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedCntainerMtrlCdgDsply(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcoding.hasVersion()) {
			s.setSpcmnDfnTypTstedCntainerMtrlCdgVrsn(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcoding.hasCode()) {
			s.setSpcmnDfnTypTstedCntainerMtrlCdgCd(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcoding.hasSystem()) {
			s.setSpcmnDfnTypTstedCntainerMtrlCdgSys(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterialcoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd(String.valueOf(specimendefinitiontypetestedcontainermaterialcoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Txt ********************************************************************************/
		if(specimendefinitiontypetestedcontainermaterial.hasText()) {
			s.setSpcmnDfnTypTstedCntainerMtrlTxt(String.valueOf(specimendefinitiontypetestedcontainermaterial.getText()));
		}
		/******************** specimendefinitiontypetestedhandling ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedHandlingComponent specimendefinitiontypetestedhandling = specimendefinitiontypetested.getHandlingFirstRep();

		/******************** SpcmnDfn_TypTsted_Handling_Instrctn ********************************************************************************/
		if(specimendefinitiontypetestedhandling.hasInstruction()) {
			s.setSpcmnDfnTypTstedHandlingInstrctn(String.valueOf(specimendefinitiontypetestedhandling.getInstruction()));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturequalifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedhandlingtemperaturequalifier = specimendefinitiontypetestedhandling.getTemperatureQualifier();

		/******************** specimendefinitiontypetestedhandlingtemperaturequalifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedhandlingtemperaturequalifiercoding = specimendefinitiontypetestedhandlingtemperaturequalifier.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasVersion()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasCode()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasSystem()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifiercoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Txt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturequalifier.hasText()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureQualifierTxt(String.valueOf(specimendefinitiontypetestedhandlingtemperaturequalifier.getText()));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range specimendefinitiontypetestedhandlingtemperaturerange = specimendefinitiontypetestedhandling.getTemperatureRange();

		/******************** specimendefinitiontypetestedhandlingtemperaturerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedhandlingtemperaturerangelow = specimendefinitiontypetestedhandlingtemperaturerange.getLow();

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Vl ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasValue()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngLwVl(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getValue()));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedhandlingtemperaturerangelowcomparator = specimendefinitiontypetestedhandlingtemperaturerangelow.getComparator();
		s.setSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr(specimendefinitiontypetestedhandlingtemperaturerangelowcomparator.toCode());

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasCode()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngLwCd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasSystem()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngLwSys(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Unt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangelow.hasUnit()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngLwUnt(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangelow.getUnit()));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedhandlingtemperaturerangehigh = specimendefinitiontypetestedhandlingtemperaturerange.getHigh();

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Vl ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasValue()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngHiVl(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getValue()));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator specimendefinitiontypetestedhandlingtemperaturerangehighcomparator = specimendefinitiontypetestedhandlingtemperaturerangehigh.getComparator();
		s.setSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr(specimendefinitiontypetestedhandlingtemperaturerangehighcomparator.toCode());

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cd ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasCode()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngHiCd(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Sys ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasSystem()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngHiSys(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Unt ********************************************************************************/
		if(specimendefinitiontypetestedhandlingtemperaturerangehigh.hasUnit()) {
			s.setSpcmnDfnTypTstedHandlingTemperatureRngHiUnt(String.valueOf(specimendefinitiontypetestedhandlingtemperaturerangehigh.getUnit()));
		}
		/******************** specimendefinitiontypetestedhandlingmaxduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimendefinitiontypetestedhandlingmaxduration = specimendefinitiontypetestedhandling.getMaxDuration();

		/******************** specimendefinitiontypetestedrejectioncriterion ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedrejectioncriterion = specimendefinitiontypetested.getRejectionCriterionFirstRep();

		/******************** specimendefinitiontypetestedrejectioncriterioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedrejectioncriterioncoding = specimendefinitiontypetestedrejectioncriterion.getCodingFirstRep();

		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasDisplay()) {
			s.setSpcmnDfnTypTstedRejectionCriterionCdgDsply(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasVersion()) {
			s.setSpcmnDfnTypTstedRejectionCriterionCdgVrsn(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getVersion()));
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasCode()) {
			s.setSpcmnDfnTypTstedRejectionCriterionCdgCd(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getCode()));
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasSystem()) {
			s.setSpcmnDfnTypTstedRejectionCriterionCdgSys(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getSystem()));
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterioncoding.hasUserSelected()) {
			s.setSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd(String.valueOf(specimendefinitiontypetestedrejectioncriterioncoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Txt ********************************************************************************/
		if(specimendefinitiontypetestedrejectioncriterion.hasText()) {
			s.setSpcmnDfnTypTstedRejectionCriterionTxt(String.valueOf(specimendefinitiontypetestedrejectioncriterion.getText()));
		}
		/******************** SpcmnDfn_TypTsted_Rqrment ********************************************************************************/
		if(specimendefinitiontypetested.hasRequirement()) {
			s.setSpcmnDfnTypTstedRqrment(String.valueOf(specimendefinitiontypetested.getRequirement()));
		}
		/******************** SpcmnDfn_TypTsted_IsDerived ********************************************************************************/
		if(specimendefinitiontypetested.hasIsDerived()) {
			s.setSpcmnDfnTypTstedIsDerived(String.valueOf(specimendefinitiontypetested.getIsDerived()));
		}
		/******************** specimendefinitiontypetestedpreference ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenContainedPreference specimendefinitiontypetestedpreference = specimendefinitiontypetested.getPreference();
		s.setSpcmnDfnTypTstedPreference(specimendefinitiontypetestedpreference.toCode());

		/******************** specimendefinitiontypetestedretentiontime ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimendefinitiontypetestedretentiontime = specimendefinitiontypetested.getRetentionTime();

		/******************** specimendefinitionpatientpreparation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitionpatientpreparation = specimendefinition.getPatientPreparationFirstRep();

		/******************** specimendefinitionpatientpreparationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitionpatientpreparationcoding = specimendefinitionpatientpreparation.getCodingFirstRep();

		/******************** SpcmnDfn_PntPreparation_Cdg_Dsply ********************************************************************************/
		if(specimendefinitionpatientpreparationcoding.hasDisplay()) {
			s.setSpcmnDfnPntPreparationCdgDsply(String.valueOf(specimendefinitionpatientpreparationcoding.getDisplay()));
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitionpatientpreparationcoding.hasVersion()) {
			s.setSpcmnDfnPntPreparationCdgVrsn(String.valueOf(specimendefinitionpatientpreparationcoding.getVersion()));
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Cd ********************************************************************************/
		if(specimendefinitionpatientpreparationcoding.hasCode()) {
			s.setSpcmnDfnPntPreparationCdgCd(String.valueOf(specimendefinitionpatientpreparationcoding.getCode()));
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Sys ********************************************************************************/
		if(specimendefinitionpatientpreparationcoding.hasSystem()) {
			s.setSpcmnDfnPntPreparationCdgSys(String.valueOf(specimendefinitionpatientpreparationcoding.getSystem()));
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitionpatientpreparationcoding.hasUserSelected()) {
			s.setSpcmnDfnPntPreparationCdgUsrSltd(String.valueOf(specimendefinitionpatientpreparationcoding.getUserSelected()));
		}
		/******************** SpcmnDfn_PntPreparation_Txt ********************************************************************************/
		if(specimendefinitionpatientpreparation.hasText()) {
			s.setSpcmnDfnPntPreparationTxt(String.valueOf(specimendefinitionpatientpreparation.getText()));
		}
		/******************** specimendefinitioncollection ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitioncollection = specimendefinition.getCollectionFirstRep();

		/******************** specimendefinitioncollectioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitioncollectioncoding = specimendefinitioncollection.getCodingFirstRep();

		/******************** SpcmnDfn_Collection_Cdg_Dsply ********************************************************************************/
		if(specimendefinitioncollectioncoding.hasDisplay()) {
			s.setSpcmnDfnCollectionCdgDsply(String.valueOf(specimendefinitioncollectioncoding.getDisplay()));
		}
		/******************** SpcmnDfn_Collection_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitioncollectioncoding.hasVersion()) {
			s.setSpcmnDfnCollectionCdgVrsn(String.valueOf(specimendefinitioncollectioncoding.getVersion()));
		}
		/******************** SpcmnDfn_Collection_Cdg_Cd ********************************************************************************/
		if(specimendefinitioncollectioncoding.hasCode()) {
			s.setSpcmnDfnCollectionCdgCd(String.valueOf(specimendefinitioncollectioncoding.getCode()));
		}
		/******************** SpcmnDfn_Collection_Cdg_Sys ********************************************************************************/
		if(specimendefinitioncollectioncoding.hasSystem()) {
			s.setSpcmnDfnCollectionCdgSys(String.valueOf(specimendefinitioncollectioncoding.getSystem()));
		}
		/******************** SpcmnDfn_Collection_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitioncollectioncoding.hasUserSelected()) {
			s.setSpcmnDfnCollectionCdgUsrSltd(String.valueOf(specimendefinitioncollectioncoding.getUserSelected()));
		}
		/******************** SpcmnDfn_Collection_Txt ********************************************************************************/
		if(specimendefinitioncollection.hasText()) {
			s.setSpcmnDfnCollectionTxt(String.valueOf(specimendefinitioncollection.getText()));
		}
		/******************** specimendefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimendefinitionidentifier = specimendefinition.getIdentifier();

		/******************** SpcmnDfn_Id_Vl ********************************************************************************/
		if(specimendefinitionidentifier.hasValue()) {
			s.setSpcmnDfnIdVl(String.valueOf(specimendefinitionidentifier.getValue()));
		}
		/******************** specimendefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitionidentifiertype = specimendefinitionidentifier.getType();

		/******************** specimendefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitionidentifiertypecoding = specimendefinitionidentifiertype.getCodingFirstRep();

		/******************** SpcmnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(specimendefinitionidentifiertypecoding.hasDisplay()) {
			s.setSpcmnDfnIdTypCdgDsply(String.valueOf(specimendefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitionidentifiertypecoding.hasVersion()) {
			s.setSpcmnDfnIdTypCdgVrsn(String.valueOf(specimendefinitionidentifiertypecoding.getVersion()));
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(specimendefinitionidentifiertypecoding.hasCode()) {
			s.setSpcmnDfnIdTypCdgCd(String.valueOf(specimendefinitionidentifiertypecoding.getCode()));
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(specimendefinitionidentifiertypecoding.hasSystem()) {
			s.setSpcmnDfnIdTypCdgSys(String.valueOf(specimendefinitionidentifiertypecoding.getSystem()));
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitionidentifiertypecoding.hasUserSelected()) {
			s.setSpcmnDfnIdTypCdgUsrSltd(String.valueOf(specimendefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** SpcmnDfn_Id_Typ_Txt ********************************************************************************/
		if(specimendefinitionidentifiertype.hasText()) {
			s.setSpcmnDfnIdTypTxt(String.valueOf(specimendefinitionidentifiertype.getText()));
		}
		/******************** SpcmnDfn_Id_Sys ********************************************************************************/
		if(specimendefinitionidentifier.hasSystem()) {
			s.setSpcmnDfnIdSys(String.valueOf(specimendefinitionidentifier.getSystem()));
		}
		/******************** SpcmnDfn_Id_Assigner ********************************************************************************/
		if(specimendefinitionidentifier.hasAssigner()) {
			s.setSpcmnDfnIdAssigner(String.valueOf(specimendefinitionidentifier.getAssigner()));
		}
		/******************** specimendefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimendefinitionidentifierperiod = specimendefinitionidentifier.getPeriod();

		/******************** SpcmnDfn_Id_Prd_End ********************************************************************************/
		if(specimendefinitionidentifierperiod.hasEnd()) {
			s.setSpcmnDfnIdPrdEnd(String.valueOf(specimendefinitionidentifierperiod.getEnd()));
		}
		/******************** SpcmnDfn_Id_Prd_Strt ********************************************************************************/
		if(specimendefinitionidentifierperiod.hasStart()) {
			s.setSpcmnDfnIdPrdStrt(String.valueOf(specimendefinitionidentifierperiod.getStart()));
		}
		/******************** specimendefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse specimendefinitionidentifieruse = specimendefinitionidentifier.getUse();
		s.setSpcmnDfnIdUse(specimendefinitionidentifieruse.toCode());

		/******************** specimendefinitiontypecollected ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypecollected = specimendefinition.getTypeCollected();

		/******************** specimendefinitiontypecollectedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypecollectedcoding = specimendefinitiontypecollected.getCodingFirstRep();

		/******************** SpcmnDfn_TypCollected_Cdg_Dsply ********************************************************************************/
		if(specimendefinitiontypecollectedcoding.hasDisplay()) {
			s.setSpcmnDfnTypCollectedCdgDsply(String.valueOf(specimendefinitiontypecollectedcoding.getDisplay()));
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Vrsn ********************************************************************************/
		if(specimendefinitiontypecollectedcoding.hasVersion()) {
			s.setSpcmnDfnTypCollectedCdgVrsn(String.valueOf(specimendefinitiontypecollectedcoding.getVersion()));
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Cd ********************************************************************************/
		if(specimendefinitiontypecollectedcoding.hasCode()) {
			s.setSpcmnDfnTypCollectedCdgCd(String.valueOf(specimendefinitiontypecollectedcoding.getCode()));
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Sys ********************************************************************************/
		if(specimendefinitiontypecollectedcoding.hasSystem()) {
			s.setSpcmnDfnTypCollectedCdgSys(String.valueOf(specimendefinitiontypecollectedcoding.getSystem()));
		}
		/******************** SpcmnDfn_TypCollected_Cdg_UsrSltd ********************************************************************************/
		if(specimendefinitiontypecollectedcoding.hasUserSelected()) {
			s.setSpcmnDfnTypCollectedCdgUsrSltd(String.valueOf(specimendefinitiontypecollectedcoding.getUserSelected()));
		}
		/******************** SpcmnDfn_TypCollected_Txt ********************************************************************************/
		if(specimendefinitiontypecollected.hasText()) {
			s.setSpcmnDfnTypCollectedTxt(String.valueOf(specimendefinitiontypecollected.getText()));
		}
		/******************** SpcmnDfn_TimeAspect ********************************************************************************/
		if(specimendefinition.hasTimeAspect()) {
			s.setSpcmnDfnTimeAspect(String.valueOf(specimendefinition.getTimeAspect()));
		}
		return s;
	}
}
