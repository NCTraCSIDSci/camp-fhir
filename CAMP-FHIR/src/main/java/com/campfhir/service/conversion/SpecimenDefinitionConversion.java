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

		/******************** specimendefinitioncollection ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitioncollection =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinition.addCollection(specimendefinitioncollection);

		/******************** specimendefinitioncollectioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitioncollectioncoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitioncollection.addCoding(specimendefinitioncollectioncoding);

		/******************** SpcmnDfn_Collection_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgCd() != null) {
			specimendefinitioncollectioncoding.setCode(s.getSpcmnDfnCollectionCdgCd());
		}
		/******************** SpcmnDfn_Collection_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgDsply() != null) {
			specimendefinitioncollectioncoding.setDisplay(s.getSpcmnDfnCollectionCdgDsply());
		}
		/******************** SpcmnDfn_Collection_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgSys() != null) {
			specimendefinitioncollectioncoding.setSystem(s.getSpcmnDfnCollectionCdgSys());
		}
		/******************** SpcmnDfn_Collection_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgUsrSltd() != null) {
			specimendefinitioncollectioncoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnCollectionCdgUsrSltd()));
		}
		/******************** SpcmnDfn_Collection_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnCollectionCdgVrsn() != null) {
			specimendefinitioncollectioncoding.setVersion(s.getSpcmnDfnCollectionCdgVrsn());
		}
		/******************** SpcmnDfn_Collection_Txt ********************************************************************************/
		if(s.getSpcmnDfnCollectionTxt() != null) {
			specimendefinitioncollection.setText(s.getSpcmnDfnCollectionTxt());
		}
		/******************** specimendefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimendefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		specimendefinition.setIdentifier(specimendefinitionidentifier);

		/******************** SpcmnDfn_Id_Assigner ********************************************************************************/
		if(s.getSpcmnDfnIdAssigner() != null) {
			specimendefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSpcmnDfnIdAssigner()));
		}
		/******************** specimendefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimendefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		specimendefinitionidentifier.setPeriod(specimendefinitionidentifierperiod);

		/******************** SpcmnDfn_Id_Prd_End ********************************************************************************/
		if(s.getSpcmnDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat SpcmnDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpcmnDfn_Id_Prd_Enddate = SpcmnDfn_Id_Prd_Endsdf.parse(s.getSpcmnDfnIdPrdEnd());
			specimendefinitionidentifierperiod.setEnd(SpcmnDfn_Id_Prd_Enddate);
		}
		/******************** SpcmnDfn_Id_Prd_Strt ********************************************************************************/
		if(s.getSpcmnDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat SpcmnDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpcmnDfn_Id_Prd_Strtdate = SpcmnDfn_Id_Prd_Strtsdf.parse(s.getSpcmnDfnIdPrdStrt());
			specimendefinitionidentifierperiod.setStart(SpcmnDfn_Id_Prd_Strtdate);
		}
		/******************** SpcmnDfn_Id_Sys ********************************************************************************/
		if(s.getSpcmnDfnIdSys() != null) {
			specimendefinitionidentifier.setSystem(s.getSpcmnDfnIdSys());
		}
		/******************** specimendefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitionidentifier.setType(specimendefinitionidentifiertype);

		/******************** specimendefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitionidentifiertype.addCoding(specimendefinitionidentifiertypecoding);

		/******************** SpcmnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgCd() != null) {
			specimendefinitionidentifiertypecoding.setCode(s.getSpcmnDfnIdTypCdgCd());
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgDsply() != null) {
			specimendefinitionidentifiertypecoding.setDisplay(s.getSpcmnDfnIdTypCdgDsply());
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgSys() != null) {
			specimendefinitionidentifiertypecoding.setSystem(s.getSpcmnDfnIdTypCdgSys());
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgUsrSltd() != null) {
			specimendefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnIdTypCdgUsrSltd()));
		}
		/******************** SpcmnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnIdTypCdgVrsn() != null) {
			specimendefinitionidentifiertypecoding.setVersion(s.getSpcmnDfnIdTypCdgVrsn());
		}
		/******************** SpcmnDfn_Id_Typ_Txt ********************************************************************************/
		if(s.getSpcmnDfnIdTypTxt() != null) {
			specimendefinitionidentifiertype.setText(s.getSpcmnDfnIdTypTxt());
		}
		/******************** specimendefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory specimendefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		specimendefinitionidentifier.setUse(specimendefinitionidentifieruse.fromCode(s.getSpcmnDfnIdUse()));

		/******************** SpcmnDfn_Id_Vl ********************************************************************************/
		if(s.getSpcmnDfnIdVl() != null) {
			specimendefinitionidentifier.setValue(s.getSpcmnDfnIdVl());
		}
		/******************** specimendefinitionpatientpreparation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitionpatientpreparation =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinition.addPatientPreparation(specimendefinitionpatientpreparation);

		/******************** specimendefinitionpatientpreparationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitionpatientpreparationcoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitionpatientpreparation.addCoding(specimendefinitionpatientpreparationcoding);

		/******************** SpcmnDfn_PntPreparation_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgCd() != null) {
			specimendefinitionpatientpreparationcoding.setCode(s.getSpcmnDfnPntPreparationCdgCd());
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgDsply() != null) {
			specimendefinitionpatientpreparationcoding.setDisplay(s.getSpcmnDfnPntPreparationCdgDsply());
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgSys() != null) {
			specimendefinitionpatientpreparationcoding.setSystem(s.getSpcmnDfnPntPreparationCdgSys());
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgUsrSltd() != null) {
			specimendefinitionpatientpreparationcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnPntPreparationCdgUsrSltd()));
		}
		/******************** SpcmnDfn_PntPreparation_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationCdgVrsn() != null) {
			specimendefinitionpatientpreparationcoding.setVersion(s.getSpcmnDfnPntPreparationCdgVrsn());
		}
		/******************** SpcmnDfn_PntPreparation_Txt ********************************************************************************/
		if(s.getSpcmnDfnPntPreparationTxt() != null) {
			specimendefinitionpatientpreparation.setText(s.getSpcmnDfnPntPreparationTxt());
		}
		/******************** SpcmnDfn_TimeAspect ********************************************************************************/
		if(s.getSpcmnDfnTimeAspect() != null) {
			specimendefinition.setTimeAspect(s.getSpcmnDfnTimeAspect());
		}
		/******************** specimendefinitiontypecollected ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypecollected =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinition.setTypeCollected(specimendefinitiontypecollected);

		/******************** specimendefinitiontypecollectedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypecollectedcoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypecollected.addCoding(specimendefinitiontypecollectedcoding);

		/******************** SpcmnDfn_TypCollected_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgCd() != null) {
			specimendefinitiontypecollectedcoding.setCode(s.getSpcmnDfnTypCollectedCdgCd());
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgDsply() != null) {
			specimendefinitiontypecollectedcoding.setDisplay(s.getSpcmnDfnTypCollectedCdgDsply());
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgSys() != null) {
			specimendefinitiontypecollectedcoding.setSystem(s.getSpcmnDfnTypCollectedCdgSys());
		}
		/******************** SpcmnDfn_TypCollected_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgUsrSltd() != null) {
			specimendefinitiontypecollectedcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypCollectedCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypCollected_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedCdgVrsn() != null) {
			specimendefinitiontypecollectedcoding.setVersion(s.getSpcmnDfnTypCollectedCdgVrsn());
		}
		/******************** SpcmnDfn_TypCollected_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypCollectedTxt() != null) {
			specimendefinitiontypecollected.setText(s.getSpcmnDfnTypCollectedTxt());
		}
		/******************** specimendefinitiontypetested ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedComponent specimendefinitiontypetested =  new org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedComponent();
		specimendefinition.addTypeTested(specimendefinitiontypetested);

		/******************** specimendefinitiontypetestedcontainer ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerComponent specimendefinitiontypetestedcontainer =  new org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerComponent();
		specimendefinitiontypetested.setContainer(specimendefinitiontypetestedcontainer);

		/******************** specimendefinitiontypetestedcontaineradditive ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerAdditiveComponent specimendefinitiontypetestedcontaineradditive =  new org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedContainerAdditiveComponent();
		specimendefinitiontypetestedcontainer.addAdditive(specimendefinitiontypetestedcontaineradditive);

		/******************** specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetestedcontaineradditive.setAdditive(specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept);

		/******************** specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.addCoding(specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding);

		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd() != null) {
			specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.setCode(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply() != null) {
			specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.setDisplay(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys() != null) {
			specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.setSystem(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd() != null) {
			specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn() != null) {
			specimendefinitiontypetestedcontaineradditiveadditivecodeableconceptcoding.setVersion(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt() != null) {
			specimendefinitiontypetestedcontaineradditiveadditivecodeableconcept.setText(s.getSpcmnDfnTypTstedCntainerAddtvAddtvCdbleCncptTxt());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Addtv_AddtvRfrnc ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerAddtvAddtvRfrnc() != null) {
			specimendefinitiontypetestedcontaineradditive.setAdditive( new org.hl7.fhir.r4.model.Reference(s.getSpcmnDfnTypTstedCntainerAddtvAddtvRfrnc()));
		}
		/******************** specimendefinitiontypetestedcontainercap ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainercap =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetestedcontainer.setCap(specimendefinitiontypetestedcontainercap);

		/******************** specimendefinitiontypetestedcontainercapcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontainercapcoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedcontainercap.addCoding(specimendefinitiontypetestedcontainercapcoding);

		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgCd() != null) {
			specimendefinitiontypetestedcontainercapcoding.setCode(s.getSpcmnDfnTypTstedCntainerCapCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgDsply() != null) {
			specimendefinitiontypetestedcontainercapcoding.setDisplay(s.getSpcmnDfnTypTstedCntainerCapCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgSys() != null) {
			specimendefinitiontypetestedcontainercapcoding.setSystem(s.getSpcmnDfnTypTstedCntainerCapCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgUsrSltd() != null) {
			specimendefinitiontypetestedcontainercapcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedCntainerCapCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapCdgVrsn() != null) {
			specimendefinitiontypetestedcontainercapcoding.setVersion(s.getSpcmnDfnTypTstedCntainerCapCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Cap_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapTxt() != null) {
			specimendefinitiontypetestedcontainercap.setText(s.getSpcmnDfnTypTstedCntainerCapTxt());
		}
		/******************** specimendefinitiontypetestedcontainercapacity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedcontainercapacity =  new org.hl7.fhir.r4.model.Quantity();
		specimendefinitiontypetestedcontainer.setCapacity(specimendefinitiontypetestedcontainercapacity);

		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityCd() != null) {
			specimendefinitiontypetestedcontainercapacity.setCode(s.getSpcmnDfnTypTstedCntainerCapacityCd());
		}
		/******************** specimendefinitiontypetestedcontainercapacitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimendefinitiontypetestedcontainercapacitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimendefinitiontypetestedcontainercapacity.setComparator(specimendefinitiontypetestedcontainercapacitycomparator.fromCode(s.getSpcmnDfnTypTstedCntainerCapacityCmprtr()));

		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacitySys() != null) {
			specimendefinitiontypetestedcontainercapacity.setSystem(s.getSpcmnDfnTypTstedCntainerCapacitySys());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityUnt() != null) {
			specimendefinitiontypetestedcontainercapacity.setUnit(s.getSpcmnDfnTypTstedCntainerCapacityUnt());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Capacity_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerCapacityVl() != null) {
			specimendefinitiontypetestedcontainercapacity.setValue(Double.parseDouble((s.getSpcmnDfnTypTstedCntainerCapacityVl())));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Dscrptn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerDscrptn() != null) {
			specimendefinitiontypetestedcontainer.setDescription(s.getSpcmnDfnTypTstedCntainerDscrptn());
		}
		/******************** specimendefinitiontypetestedcontainermaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainermaterial =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetestedcontainer.setMaterial(specimendefinitiontypetestedcontainermaterial);

		/******************** specimendefinitiontypetestedcontainermaterialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontainermaterialcoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedcontainermaterial.addCoding(specimendefinitiontypetestedcontainermaterialcoding);

		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgCd() != null) {
			specimendefinitiontypetestedcontainermaterialcoding.setCode(s.getSpcmnDfnTypTstedCntainerMtrlCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgDsply() != null) {
			specimendefinitiontypetestedcontainermaterialcoding.setDisplay(s.getSpcmnDfnTypTstedCntainerMtrlCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgSys() != null) {
			specimendefinitiontypetestedcontainermaterialcoding.setSystem(s.getSpcmnDfnTypTstedCntainerMtrlCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd() != null) {
			specimendefinitiontypetestedcontainermaterialcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedCntainerMtrlCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlCdgVrsn() != null) {
			specimendefinitiontypetestedcontainermaterialcoding.setVersion(s.getSpcmnDfnTypTstedCntainerMtrlCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Mtrl_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMtrlTxt() != null) {
			specimendefinitiontypetestedcontainermaterial.setText(s.getSpcmnDfnTypTstedCntainerMtrlTxt());
		}
		/******************** specimendefinitiontypetestedcontainerminimumvolumequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedcontainerminimumvolumequantity =  new org.hl7.fhir.r4.model.Quantity();
		specimendefinitiontypetestedcontainer.setMinimumVolume(specimendefinitiontypetestedcontainerminimumvolumequantity);

		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd() != null) {
			specimendefinitiontypetestedcontainerminimumvolumequantity.setCode(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCd());
		}
		/******************** specimendefinitiontypetestedcontainerminimumvolumequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimendefinitiontypetestedcontainerminimumvolumequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimendefinitiontypetestedcontainerminimumvolumequantity.setComparator(specimendefinitiontypetestedcontainerminimumvolumequantitycomparator.fromCode(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyCmprtr()));

		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntySys() != null) {
			specimendefinitiontypetestedcontainerminimumvolumequantity.setSystem(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntySys());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt() != null) {
			specimendefinitiontypetestedcontainerminimumvolumequantity.setUnit(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyUnt());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeQnty_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl() != null) {
			specimendefinitiontypetestedcontainerminimumvolumequantity.setValue(Double.parseDouble((s.getSpcmnDfnTypTstedCntainerMinimumVolumeQntyVl())));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_MinimumVolumeStrgTyp ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp() != null) {
			specimendefinitiontypetestedcontainer.setMinimumVolume( new org.hl7.fhir.r4.model.StringType(s.getSpcmnDfnTypTstedCntainerMinimumVolumeStrgTyp()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Preparation ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerPreparation() != null) {
			specimendefinitiontypetestedcontainer.setPreparation(s.getSpcmnDfnTypTstedCntainerPreparation());
		}
		/******************** specimendefinitiontypetestedcontainertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedcontainertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetestedcontainer.setType(specimendefinitiontypetestedcontainertype);

		/******************** specimendefinitiontypetestedcontainertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedcontainertypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedcontainertype.addCoding(specimendefinitiontypetestedcontainertypecoding);

		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgCd() != null) {
			specimendefinitiontypetestedcontainertypecoding.setCode(s.getSpcmnDfnTypTstedCntainerTypCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgDsply() != null) {
			specimendefinitiontypetestedcontainertypecoding.setDisplay(s.getSpcmnDfnTypTstedCntainerTypCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgSys() != null) {
			specimendefinitiontypetestedcontainertypecoding.setSystem(s.getSpcmnDfnTypTstedCntainerTypCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgUsrSltd() != null) {
			specimendefinitiontypetestedcontainertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedCntainerTypCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypCdgVrsn() != null) {
			specimendefinitiontypetestedcontainertypecoding.setVersion(s.getSpcmnDfnTypTstedCntainerTypCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_Cntainer_Typ_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedCntainerTypTxt() != null) {
			specimendefinitiontypetestedcontainertype.setText(s.getSpcmnDfnTypTstedCntainerTypTxt());
		}
		/******************** specimendefinitiontypetestedhandling ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedHandlingComponent specimendefinitiontypetestedhandling =  new org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenDefinitionTypeTestedHandlingComponent();
		specimendefinitiontypetested.addHandling(specimendefinitiontypetestedhandling);

		/******************** SpcmnDfn_TypTsted_Handling_Instrctn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingInstrctn() != null) {
			specimendefinitiontypetestedhandling.setInstruction(s.getSpcmnDfnTypTstedHandlingInstrctn());
		}
		/******************** specimendefinitiontypetestedhandlingmaxduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimendefinitiontypetestedhandlingmaxduration =  new org.hl7.fhir.r4.model.Duration();
		specimendefinitiontypetestedhandling.setMaxDuration(specimendefinitiontypetestedhandlingmaxduration);

		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationCd() != null) {
			specimendefinitiontypetestedhandlingmaxduration.setCode(s.getSpcmnDfnTypTstedHandlingMxDurationCd());
		}
		/******************** specimendefinitiontypetestedhandlingmaxdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimendefinitiontypetestedhandlingmaxdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimendefinitiontypetestedhandlingmaxduration.setComparator(specimendefinitiontypetestedhandlingmaxdurationcomparator.fromCode(s.getSpcmnDfnTypTstedHandlingMxDurationCmprtr()));

		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationSys() != null) {
			specimendefinitiontypetestedhandlingmaxduration.setSystem(s.getSpcmnDfnTypTstedHandlingMxDurationSys());
		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationUnt() != null) {
			specimendefinitiontypetestedhandlingmaxduration.setUnit(s.getSpcmnDfnTypTstedHandlingMxDurationUnt());
		}
		/******************** SpcmnDfn_TypTsted_Handling_MxDuration_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingMxDurationVl() != null) {
			specimendefinitiontypetestedhandlingmaxduration.setValue(Double.parseDouble((s.getSpcmnDfnTypTstedHandlingMxDurationVl())));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturequalifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedhandlingtemperaturequalifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetestedhandling.setTemperatureQualifier(specimendefinitiontypetestedhandlingtemperaturequalifier);

		/******************** specimendefinitiontypetestedhandlingtemperaturequalifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedhandlingtemperaturequalifiercoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedhandlingtemperaturequalifier.addCoding(specimendefinitiontypetestedhandlingtemperaturequalifiercoding);

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd() != null) {
			specimendefinitiontypetestedhandlingtemperaturequalifiercoding.setCode(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply() != null) {
			specimendefinitiontypetestedhandlingtemperaturequalifiercoding.setDisplay(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys() != null) {
			specimendefinitiontypetestedhandlingtemperaturequalifiercoding.setSystem(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd() != null) {
			specimendefinitiontypetestedhandlingtemperaturequalifiercoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn() != null) {
			specimendefinitiontypetestedhandlingtemperaturequalifiercoding.setVersion(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureQualifier_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierTxt() != null) {
			specimendefinitiontypetestedhandlingtemperaturequalifier.setText(s.getSpcmnDfnTypTstedHandlingTemperatureQualifierTxt());
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range specimendefinitiontypetestedhandlingtemperaturerange =  new org.hl7.fhir.r4.model.Range();
		specimendefinitiontypetestedhandling.setTemperatureRange(specimendefinitiontypetestedhandlingtemperaturerange);

		/******************** specimendefinitiontypetestedhandlingtemperaturerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedhandlingtemperaturerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		specimendefinitiontypetestedhandlingtemperaturerange.setHigh(specimendefinitiontypetestedhandlingtemperaturerangehigh);

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCd() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangehigh.setCode(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCd());
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimendefinitiontypetestedhandlingtemperaturerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimendefinitiontypetestedhandlingtemperaturerangehigh.setComparator(specimendefinitiontypetestedhandlingtemperaturerangehighcomparator.fromCode(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiCmprtr()));

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiSys() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangehigh.setSystem(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiSys());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiUnt() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangehigh.setUnit(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiUnt());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Hi_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngHiVl() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangehigh.setValue(Double.parseDouble((s.getSpcmnDfnTypTstedHandlingTemperatureRngHiVl())));
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimendefinitiontypetestedhandlingtemperaturerangelow =  new org.hl7.fhir.r4.model.Quantity();
		specimendefinitiontypetestedhandlingtemperaturerange.setLow(specimendefinitiontypetestedhandlingtemperaturerangelow);

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCd() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangelow.setCode(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCd());
		}
		/******************** specimendefinitiontypetestedhandlingtemperaturerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimendefinitiontypetestedhandlingtemperaturerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimendefinitiontypetestedhandlingtemperaturerangelow.setComparator(specimendefinitiontypetestedhandlingtemperaturerangelowcomparator.fromCode(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwCmprtr()));

		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwSys() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangelow.setSystem(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwSys());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwUnt() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangelow.setUnit(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwUnt());
		}
		/******************** SpcmnDfn_TypTsted_Handling_TemperatureRng_Lw_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedHandlingTemperatureRngLwVl() != null) {
			specimendefinitiontypetestedhandlingtemperaturerangelow.setValue(Double.parseDouble((s.getSpcmnDfnTypTstedHandlingTemperatureRngLwVl())));
		}
		/******************** SpcmnDfn_TypTsted_IsDerived ********************************************************************************/
		if(s.getSpcmnDfnTypTstedIsDerived() != null) {
			specimendefinitiontypetested.setIsDerived(Boolean.parseBoolean(s.getSpcmnDfnTypTstedIsDerived()));
		}
		/******************** specimendefinitiontypetestedpreference ********************************************************************************/
		org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenContainedPreferenceEnumFactory specimendefinitiontypetestedpreference =  new org.hl7.fhir.r4.model.SpecimenDefinition.SpecimenContainedPreferenceEnumFactory();
		specimendefinitiontypetested.setPreference(specimendefinitiontypetestedpreference.fromCode(s.getSpcmnDfnTypTstedPreference()));

		/******************** specimendefinitiontypetestedrejectioncriterion ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedrejectioncriterion =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetested.addRejectionCriterion(specimendefinitiontypetestedrejectioncriterion);

		/******************** specimendefinitiontypetestedrejectioncriterioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedrejectioncriterioncoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedrejectioncriterion.addCoding(specimendefinitiontypetestedrejectioncriterioncoding);

		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgCd() != null) {
			specimendefinitiontypetestedrejectioncriterioncoding.setCode(s.getSpcmnDfnTypTstedRejectionCriterionCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgDsply() != null) {
			specimendefinitiontypetestedrejectioncriterioncoding.setDisplay(s.getSpcmnDfnTypTstedRejectionCriterionCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgSys() != null) {
			specimendefinitiontypetestedrejectioncriterioncoding.setSystem(s.getSpcmnDfnTypTstedRejectionCriterionCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd() != null) {
			specimendefinitiontypetestedrejectioncriterioncoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedRejectionCriterionCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionCdgVrsn() != null) {
			specimendefinitiontypetestedrejectioncriterioncoding.setVersion(s.getSpcmnDfnTypTstedRejectionCriterionCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_RejectionCriterion_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRejectionCriterionTxt() != null) {
			specimendefinitiontypetestedrejectioncriterion.setText(s.getSpcmnDfnTypTstedRejectionCriterionTxt());
		}
		/******************** SpcmnDfn_TypTsted_Rqrment ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRqrment() != null) {
			specimendefinitiontypetested.setRequirement(s.getSpcmnDfnTypTstedRqrment());
		}
		/******************** specimendefinitiontypetestedretentiontime ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimendefinitiontypetestedretentiontime =  new org.hl7.fhir.r4.model.Duration();
		specimendefinitiontypetested.setRetentionTime(specimendefinitiontypetestedretentiontime);

		/******************** SpcmnDfn_TypTsted_RetentionTime_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeCd() != null) {
			specimendefinitiontypetestedretentiontime.setCode(s.getSpcmnDfnTypTstedRetentionTimeCd());
		}
		/******************** specimendefinitiontypetestedretentiontimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimendefinitiontypetestedretentiontimecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimendefinitiontypetestedretentiontime.setComparator(specimendefinitiontypetestedretentiontimecomparator.fromCode(s.getSpcmnDfnTypTstedRetentionTimeCmprtr()));

		/******************** SpcmnDfn_TypTsted_RetentionTime_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeSys() != null) {
			specimendefinitiontypetestedretentiontime.setSystem(s.getSpcmnDfnTypTstedRetentionTimeSys());
		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Unt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeUnt() != null) {
			specimendefinitiontypetestedretentiontime.setUnit(s.getSpcmnDfnTypTstedRetentionTimeUnt());
		}
		/******************** SpcmnDfn_TypTsted_RetentionTime_Vl ********************************************************************************/
		if(s.getSpcmnDfnTypTstedRetentionTimeVl() != null) {
			specimendefinitiontypetestedretentiontime.setValue(Double.parseDouble((s.getSpcmnDfnTypTstedRetentionTimeVl())));
		}
		/******************** specimendefinitiontypetestedtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimendefinitiontypetestedtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimendefinitiontypetested.setType(specimendefinitiontypetestedtype);

		/******************** specimendefinitiontypetestedtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimendefinitiontypetestedtypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimendefinitiontypetestedtype.addCoding(specimendefinitiontypetestedtypecoding);

		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgCd() != null) {
			specimendefinitiontypetestedtypecoding.setCode(s.getSpcmnDfnTypTstedTypCdgCd());
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgDsply() != null) {
			specimendefinitiontypetestedtypecoding.setDisplay(s.getSpcmnDfnTypTstedTypCdgDsply());
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgSys() != null) {
			specimendefinitiontypetestedtypecoding.setSystem(s.getSpcmnDfnTypTstedTypCdgSys());
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgUsrSltd() != null) {
			specimendefinitiontypetestedtypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnDfnTypTstedTypCdgUsrSltd()));
		}
		/******************** SpcmnDfn_TypTsted_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypCdgVrsn() != null) {
			specimendefinitiontypetestedtypecoding.setVersion(s.getSpcmnDfnTypTstedTypCdgVrsn());
		}
		/******************** SpcmnDfn_TypTsted_Typ_Txt ********************************************************************************/
		if(s.getSpcmnDfnTypTstedTypTxt() != null) {
			specimendefinitiontypetestedtype.setText(s.getSpcmnDfnTypTstedTypTxt());
		}
		return specimendefinition;
	}
}
