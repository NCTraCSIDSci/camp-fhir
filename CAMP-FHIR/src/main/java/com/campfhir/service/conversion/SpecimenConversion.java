package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Specimen;
public class SpecimenConversion 
{
	public org.hl7.fhir.r4.model.Specimen Specimens(Specimen s) throws ParseException
	{
		org.hl7.fhir.r4.model.Specimen specimen = new org.hl7.fhir.r4.model.Specimen();

		/******************** id ********************************************************************************/
		specimen.setId(s.getId());

		/******************** specimenaccessionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimenaccessionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		specimen.setAccessionIdentifier(specimenaccessionidentifier);

		/******************** Spcmn_AccessionId_Assigner ********************************************************************************/
		if(s.getSpcmnAccessionIdAssigner() != null) {
			specimenaccessionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSpcmnAccessionIdAssigner()));
		}
		/******************** specimenaccessionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenaccessionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		specimenaccessionidentifier.setPeriod(specimenaccessionidentifierperiod);

		/******************** Spcmn_AccessionId_Prd_End ********************************************************************************/
		if(s.getSpcmnAccessionIdPrdEnd() != null) {
			java.text.SimpleDateFormat Spcmn_AccessionId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_AccessionId_Prd_Enddate = Spcmn_AccessionId_Prd_Endsdf.parse(s.getSpcmnAccessionIdPrdEnd());
			specimenaccessionidentifierperiod.setEnd(Spcmn_AccessionId_Prd_Enddate);
		}
		/******************** Spcmn_AccessionId_Prd_Strt ********************************************************************************/
		if(s.getSpcmnAccessionIdPrdStrt() != null) {
			java.text.SimpleDateFormat Spcmn_AccessionId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_AccessionId_Prd_Strtdate = Spcmn_AccessionId_Prd_Strtsdf.parse(s.getSpcmnAccessionIdPrdStrt());
			specimenaccessionidentifierperiod.setStart(Spcmn_AccessionId_Prd_Strtdate);
		}
		/******************** Spcmn_AccessionId_Sys ********************************************************************************/
		if(s.getSpcmnAccessionIdSys() != null) {
			specimenaccessionidentifier.setSystem(s.getSpcmnAccessionIdSys());
		}
		/******************** specimenaccessionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenaccessionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimenaccessionidentifier.setType(specimenaccessionidentifiertype);

		/******************** specimenaccessionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenaccessionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimenaccessionidentifiertype.addCoding(specimenaccessionidentifiertypecoding);

		/******************** Spcmn_AccessionId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgCd() != null) {
			specimenaccessionidentifiertypecoding.setCode(s.getSpcmnAccessionIdTypCdgCd());
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgDsply() != null) {
			specimenaccessionidentifiertypecoding.setDisplay(s.getSpcmnAccessionIdTypCdgDsply());
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgSys() != null) {
			specimenaccessionidentifiertypecoding.setSystem(s.getSpcmnAccessionIdTypCdgSys());
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgUsrSltd() != null) {
			specimenaccessionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnAccessionIdTypCdgUsrSltd()));
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgVrsn() != null) {
			specimenaccessionidentifiertypecoding.setVersion(s.getSpcmnAccessionIdTypCdgVrsn());
		}
		/******************** Spcmn_AccessionId_Typ_Txt ********************************************************************************/
		if(s.getSpcmnAccessionIdTypTxt() != null) {
			specimenaccessionidentifiertype.setText(s.getSpcmnAccessionIdTypTxt());
		}
		/******************** specimenaccessionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory specimenaccessionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		specimenaccessionidentifier.setUse(specimenaccessionidentifieruse.fromCode(s.getSpcmnAccessionIdUse()));

		/******************** Spcmn_AccessionId_Vl ********************************************************************************/
		if(s.getSpcmnAccessionIdVl() != null) {
			specimenaccessionidentifier.setValue(s.getSpcmnAccessionIdVl());
		}
		/******************** specimencollection ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent specimencollection =  new org.hl7.fhir.r4.model.Specimen.SpecimenCollectionComponent();
		specimen.setCollection(specimencollection);

		/******************** specimencollectionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionbodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimencollection.setBodySite(specimencollectionbodysite);

		/******************** specimencollectionbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencollectionbodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		specimencollectionbodysite.addCoding(specimencollectionbodysitecoding);

		/******************** Spcmn_Collection_BodySite_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgCd() != null) {
			specimencollectionbodysitecoding.setCode(s.getSpcmnCollectionBodySiteCdgCd());
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgDsply() != null) {
			specimencollectionbodysitecoding.setDisplay(s.getSpcmnCollectionBodySiteCdgDsply());
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgSys() != null) {
			specimencollectionbodysitecoding.setSystem(s.getSpcmnCollectionBodySiteCdgSys());
		}
		/******************** Spcmn_Collection_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgUsrSltd() != null) {
			specimencollectionbodysitecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCollectionBodySiteCdgUsrSltd()));
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgVrsn() != null) {
			specimencollectionbodysitecoding.setVersion(s.getSpcmnCollectionBodySiteCdgVrsn());
		}
		/******************** Spcmn_Collection_BodySite_Txt ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteTxt() != null) {
			specimencollectionbodysite.setText(s.getSpcmnCollectionBodySiteTxt());
		}
		/******************** Spcmn_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(s.getSpcmnCollectionCollectedDtTimeTyp() != null) {
			specimencollection.setCollected( new org.hl7.fhir.r4.model.DateTimeType(s.getSpcmnCollectionCollectedDtTimeTyp()));
		}
		/******************** specimencollectioncollectedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimencollectioncollectedperiod =  new org.hl7.fhir.r4.model.Period();
		specimencollection.setCollected(specimencollectioncollectedperiod);

		/******************** Spcmn_Collection_CollectedPrd_End ********************************************************************************/
		if(s.getSpcmnCollectionCollectedPrdEnd() != null) {
			java.text.SimpleDateFormat Spcmn_Collection_CollectedPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Collection_CollectedPrd_Enddate = Spcmn_Collection_CollectedPrd_Endsdf.parse(s.getSpcmnCollectionCollectedPrdEnd());
			specimencollectioncollectedperiod.setEnd(Spcmn_Collection_CollectedPrd_Enddate);
		}
		/******************** Spcmn_Collection_CollectedPrd_Strt ********************************************************************************/
		if(s.getSpcmnCollectionCollectedPrdStrt() != null) {
			java.text.SimpleDateFormat Spcmn_Collection_CollectedPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Collection_CollectedPrd_Strtdate = Spcmn_Collection_CollectedPrd_Strtsdf.parse(s.getSpcmnCollectionCollectedPrdStrt());
			specimencollectioncollectedperiod.setStart(Spcmn_Collection_CollectedPrd_Strtdate);
		}
		/******************** Spcmn_Collection_Collector ********************************************************************************/
		if(s.getSpcmnCollectionCollector() != null) {
			specimencollection.setCollector( new org.hl7.fhir.r4.model.Reference(s.getSpcmnCollectionCollector()));
		}
		/******************** specimencollectionduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimencollectionduration =  new org.hl7.fhir.r4.model.Duration();
		specimencollection.setDuration(specimencollectionduration);

		/******************** specimencollectionfastingstatuscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionfastingstatuscodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimencollection.setFastingStatus(specimencollectionfastingstatuscodeableconcept);

		/******************** specimencollectionfastingstatuscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencollectionfastingstatuscodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		specimencollectionfastingstatuscodeableconcept.addCoding(specimencollectionfastingstatuscodeableconceptcoding);

		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgCd() != null) {
			specimencollectionfastingstatuscodeableconceptcoding.setCode(s.getSpcmnCollectionFastingStsCdbleCncptCdgCd());
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgDsply() != null) {
			specimencollectionfastingstatuscodeableconceptcoding.setDisplay(s.getSpcmnCollectionFastingStsCdbleCncptCdgDsply());
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgSys() != null) {
			specimencollectionfastingstatuscodeableconceptcoding.setSystem(s.getSpcmnCollectionFastingStsCdbleCncptCdgSys());
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd() != null) {
			specimencollectionfastingstatuscodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd()));
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgVrsn() != null) {
			specimencollectionfastingstatuscodeableconceptcoding.setVersion(s.getSpcmnCollectionFastingStsCdbleCncptCdgVrsn());
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptTxt() != null) {
			specimencollectionfastingstatuscodeableconcept.setText(s.getSpcmnCollectionFastingStsCdbleCncptTxt());
		}
		/******************** specimencollectionfastingstatusduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration specimencollectionfastingstatusduration =  new org.hl7.fhir.r4.model.Duration();
		specimencollection.setFastingStatus(specimencollectionfastingstatusduration);

		/******************** specimencollectionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencollectionmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimencollection.setMethod(specimencollectionmethod);

		/******************** specimencollectionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencollectionmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		specimencollectionmethod.addCoding(specimencollectionmethodcoding);

		/******************** Spcmn_Collection_Mthd_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgCd() != null) {
			specimencollectionmethodcoding.setCode(s.getSpcmnCollectionMthdCdgCd());
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgDsply() != null) {
			specimencollectionmethodcoding.setDisplay(s.getSpcmnCollectionMthdCdgDsply());
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgSys() != null) {
			specimencollectionmethodcoding.setSystem(s.getSpcmnCollectionMthdCdgSys());
		}
		/******************** Spcmn_Collection_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgUsrSltd() != null) {
			specimencollectionmethodcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCollectionMthdCdgUsrSltd()));
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgVrsn() != null) {
			specimencollectionmethodcoding.setVersion(s.getSpcmnCollectionMthdCdgVrsn());
		}
		/******************** Spcmn_Collection_Mthd_Txt ********************************************************************************/
		if(s.getSpcmnCollectionMthdTxt() != null) {
			specimencollectionmethod.setText(s.getSpcmnCollectionMthdTxt());
		}
		/******************** specimencollectionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencollectionquantity =  new org.hl7.fhir.r4.model.Quantity();
		specimencollection.setQuantity(specimencollectionquantity);

		/******************** Spcmn_Collection_Qnty_Cd ********************************************************************************/
		if(s.getSpcmnCollectionQntyCd() != null) {
			specimencollectionquantity.setCode(s.getSpcmnCollectionQntyCd());
		}
		/******************** specimencollectionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimencollectionquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimencollectionquantity.setComparator(specimencollectionquantitycomparator.fromCode(s.getSpcmnCollectionQntyCmprtr()));

		/******************** Spcmn_Collection_Qnty_Sys ********************************************************************************/
		if(s.getSpcmnCollectionQntySys() != null) {
			specimencollectionquantity.setSystem(s.getSpcmnCollectionQntySys());
		}
		/******************** Spcmn_Collection_Qnty_Unt ********************************************************************************/
		if(s.getSpcmnCollectionQntyUnt() != null) {
			specimencollectionquantity.setUnit(s.getSpcmnCollectionQntyUnt());
		}
		/******************** Spcmn_Collection_Qnty_Vl ********************************************************************************/
		if(s.getSpcmnCollectionQntyVl() != null) {
			specimencollectionquantity.setValue(Double.parseDouble((s.getSpcmnCollectionQntyVl())));
		}
		/******************** specimencondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencondition =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimen.addCondition(specimencondition);

		/******************** specimenconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenconditioncoding =  new org.hl7.fhir.r4.model.Coding();
		specimencondition.addCoding(specimenconditioncoding);

		/******************** Spcmn_Cndtn_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCndtnCdgCd() != null) {
			specimenconditioncoding.setCode(s.getSpcmnCndtnCdgCd());
		}
		/******************** Spcmn_Cndtn_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCndtnCdgDsply() != null) {
			specimenconditioncoding.setDisplay(s.getSpcmnCndtnCdgDsply());
		}
		/******************** Spcmn_Cndtn_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCndtnCdgSys() != null) {
			specimenconditioncoding.setSystem(s.getSpcmnCndtnCdgSys());
		}
		/******************** Spcmn_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCndtnCdgUsrSltd() != null) {
			specimenconditioncoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCndtnCdgUsrSltd()));
		}
		/******************** Spcmn_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCndtnCdgVrsn() != null) {
			specimenconditioncoding.setVersion(s.getSpcmnCndtnCdgVrsn());
		}
		/******************** Spcmn_Cndtn_Txt ********************************************************************************/
		if(s.getSpcmnCndtnTxt() != null) {
			specimencondition.setText(s.getSpcmnCndtnTxt());
		}
		/******************** specimencontainer ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent specimencontainer =  new org.hl7.fhir.r4.model.Specimen.SpecimenContainerComponent();
		specimen.addContainer(specimencontainer);

		/******************** specimencontaineradditivecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontaineradditivecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimencontainer.setAdditive(specimencontaineradditivecodeableconcept);

		/******************** specimencontaineradditivecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencontaineradditivecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		specimencontaineradditivecodeableconcept.addCoding(specimencontaineradditivecodeableconceptcoding);

		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgCd() != null) {
			specimencontaineradditivecodeableconceptcoding.setCode(s.getSpcmnCntainerAddtvCdbleCncptCdgCd());
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgDsply() != null) {
			specimencontaineradditivecodeableconceptcoding.setDisplay(s.getSpcmnCntainerAddtvCdbleCncptCdgDsply());
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgSys() != null) {
			specimencontaineradditivecodeableconceptcoding.setSystem(s.getSpcmnCntainerAddtvCdbleCncptCdgSys());
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgUsrSltd() != null) {
			specimencontaineradditivecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCntainerAddtvCdbleCncptCdgUsrSltd()));
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgVrsn() != null) {
			specimencontaineradditivecodeableconceptcoding.setVersion(s.getSpcmnCntainerAddtvCdbleCncptCdgVrsn());
		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptTxt() != null) {
			specimencontaineradditivecodeableconcept.setText(s.getSpcmnCntainerAddtvCdbleCncptTxt());
		}
		/******************** Spcmn_Cntainer_AddtvRfrnc ********************************************************************************/
		if(s.getSpcmnCntainerAddtvRfrnc() != null) {
			specimencontainer.setAdditive( new org.hl7.fhir.r4.model.Reference(s.getSpcmnCntainerAddtvRfrnc()));
		}
		/******************** specimencontainercapacity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencontainercapacity =  new org.hl7.fhir.r4.model.Quantity();
		specimencontainer.setCapacity(specimencontainercapacity);

		/******************** Spcmn_Cntainer_Capacity_Cd ********************************************************************************/
		if(s.getSpcmnCntainerCapacityCd() != null) {
			specimencontainercapacity.setCode(s.getSpcmnCntainerCapacityCd());
		}
		/******************** specimencontainercapacitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimencontainercapacitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimencontainercapacity.setComparator(specimencontainercapacitycomparator.fromCode(s.getSpcmnCntainerCapacityCmprtr()));

		/******************** Spcmn_Cntainer_Capacity_Sys ********************************************************************************/
		if(s.getSpcmnCntainerCapacitySys() != null) {
			specimencontainercapacity.setSystem(s.getSpcmnCntainerCapacitySys());
		}
		/******************** Spcmn_Cntainer_Capacity_Unt ********************************************************************************/
		if(s.getSpcmnCntainerCapacityUnt() != null) {
			specimencontainercapacity.setUnit(s.getSpcmnCntainerCapacityUnt());
		}
		/******************** Spcmn_Cntainer_Capacity_Vl ********************************************************************************/
		if(s.getSpcmnCntainerCapacityVl() != null) {
			specimencontainercapacity.setValue(Double.parseDouble((s.getSpcmnCntainerCapacityVl())));
		}
		/******************** Spcmn_Cntainer_Dscrptn ********************************************************************************/
		if(s.getSpcmnCntainerDscrptn() != null) {
			specimencontainer.setDescription(s.getSpcmnCntainerDscrptn());
		}
		/******************** specimencontaineridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimencontaineridentifier =  new org.hl7.fhir.r4.model.Identifier();
		specimencontainer.addIdentifier(specimencontaineridentifier);

		/******************** Spcmn_Cntainer_Id_Assigner ********************************************************************************/
		if(s.getSpcmnCntainerIdAssigner() != null) {
			specimencontaineridentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSpcmnCntainerIdAssigner()));
		}
		/******************** specimencontaineridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimencontaineridentifierperiod =  new org.hl7.fhir.r4.model.Period();
		specimencontaineridentifier.setPeriod(specimencontaineridentifierperiod);

		/******************** Spcmn_Cntainer_Id_Prd_End ********************************************************************************/
		if(s.getSpcmnCntainerIdPrdEnd() != null) {
			java.text.SimpleDateFormat Spcmn_Cntainer_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Cntainer_Id_Prd_Enddate = Spcmn_Cntainer_Id_Prd_Endsdf.parse(s.getSpcmnCntainerIdPrdEnd());
			specimencontaineridentifierperiod.setEnd(Spcmn_Cntainer_Id_Prd_Enddate);
		}
		/******************** Spcmn_Cntainer_Id_Prd_Strt ********************************************************************************/
		if(s.getSpcmnCntainerIdPrdStrt() != null) {
			java.text.SimpleDateFormat Spcmn_Cntainer_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Cntainer_Id_Prd_Strtdate = Spcmn_Cntainer_Id_Prd_Strtsdf.parse(s.getSpcmnCntainerIdPrdStrt());
			specimencontaineridentifierperiod.setStart(Spcmn_Cntainer_Id_Prd_Strtdate);
		}
		/******************** Spcmn_Cntainer_Id_Sys ********************************************************************************/
		if(s.getSpcmnCntainerIdSys() != null) {
			specimencontaineridentifier.setSystem(s.getSpcmnCntainerIdSys());
		}
		/******************** specimencontaineridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontaineridentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimencontaineridentifier.setType(specimencontaineridentifiertype);

		/******************** specimencontaineridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencontaineridentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimencontaineridentifiertype.addCoding(specimencontaineridentifiertypecoding);

		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgCd() != null) {
			specimencontaineridentifiertypecoding.setCode(s.getSpcmnCntainerIdTypCdgCd());
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgDsply() != null) {
			specimencontaineridentifiertypecoding.setDisplay(s.getSpcmnCntainerIdTypCdgDsply());
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgSys() != null) {
			specimencontaineridentifiertypecoding.setSystem(s.getSpcmnCntainerIdTypCdgSys());
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgUsrSltd() != null) {
			specimencontaineridentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCntainerIdTypCdgUsrSltd()));
		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgVrsn() != null) {
			specimencontaineridentifiertypecoding.setVersion(s.getSpcmnCntainerIdTypCdgVrsn());
		}
		/******************** Spcmn_Cntainer_Id_Typ_Txt ********************************************************************************/
		if(s.getSpcmnCntainerIdTypTxt() != null) {
			specimencontaineridentifiertype.setText(s.getSpcmnCntainerIdTypTxt());
		}
		/******************** specimencontaineridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory specimencontaineridentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		specimencontaineridentifier.setUse(specimencontaineridentifieruse.fromCode(s.getSpcmnCntainerIdUse()));

		/******************** Spcmn_Cntainer_Id_Vl ********************************************************************************/
		if(s.getSpcmnCntainerIdVl() != null) {
			specimencontaineridentifier.setValue(s.getSpcmnCntainerIdVl());
		}
		/******************** specimencontainerspecimenquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity specimencontainerspecimenquantity =  new org.hl7.fhir.r4.model.Quantity();
		specimencontainer.setSpecimenQuantity(specimencontainerspecimenquantity);

		/******************** Spcmn_Cntainer_SpcmnQnty_Cd ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyCd() != null) {
			specimencontainerspecimenquantity.setCode(s.getSpcmnCntainerSpcmnQntyCd());
		}
		/******************** specimencontainerspecimenquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory specimencontainerspecimenquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		specimencontainerspecimenquantity.setComparator(specimencontainerspecimenquantitycomparator.fromCode(s.getSpcmnCntainerSpcmnQntyCmprtr()));

		/******************** Spcmn_Cntainer_SpcmnQnty_Sys ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntySys() != null) {
			specimencontainerspecimenquantity.setSystem(s.getSpcmnCntainerSpcmnQntySys());
		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Unt ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyUnt() != null) {
			specimencontainerspecimenquantity.setUnit(s.getSpcmnCntainerSpcmnQntyUnt());
		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Vl ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyVl() != null) {
			specimencontainerspecimenquantity.setValue(Double.parseDouble((s.getSpcmnCntainerSpcmnQntyVl())));
		}
		/******************** specimencontainertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimencontainertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimencontainer.setType(specimencontainertype);

		/******************** specimencontainertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimencontainertypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimencontainertype.addCoding(specimencontainertypecoding);

		/******************** Spcmn_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgCd() != null) {
			specimencontainertypecoding.setCode(s.getSpcmnCntainerTypCdgCd());
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgDsply() != null) {
			specimencontainertypecoding.setDisplay(s.getSpcmnCntainerTypCdgDsply());
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgSys() != null) {
			specimencontainertypecoding.setSystem(s.getSpcmnCntainerTypCdgSys());
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgUsrSltd() != null) {
			specimencontainertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnCntainerTypCdgUsrSltd()));
		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgVrsn() != null) {
			specimencontainertypecoding.setVersion(s.getSpcmnCntainerTypCdgVrsn());
		}
		/******************** Spcmn_Cntainer_Typ_Txt ********************************************************************************/
		if(s.getSpcmnCntainerTypTxt() != null) {
			specimencontainertype.setText(s.getSpcmnCntainerTypTxt());
		}
		/******************** specimenidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier specimenidentifier =  new org.hl7.fhir.r4.model.Identifier();
		specimen.addIdentifier(specimenidentifier);

		/******************** Spcmn_Id_Assigner ********************************************************************************/
		if(s.getSpcmnIdAssigner() != null) {
			specimenidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSpcmnIdAssigner()));
		}
		/******************** specimenidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		specimenidentifier.setPeriod(specimenidentifierperiod);

		/******************** Spcmn_Id_Prd_End ********************************************************************************/
		if(s.getSpcmnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Spcmn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Id_Prd_Enddate = Spcmn_Id_Prd_Endsdf.parse(s.getSpcmnIdPrdEnd());
			specimenidentifierperiod.setEnd(Spcmn_Id_Prd_Enddate);
		}
		/******************** Spcmn_Id_Prd_Strt ********************************************************************************/
		if(s.getSpcmnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Spcmn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Id_Prd_Strtdate = Spcmn_Id_Prd_Strtsdf.parse(s.getSpcmnIdPrdStrt());
			specimenidentifierperiod.setStart(Spcmn_Id_Prd_Strtdate);
		}
		/******************** Spcmn_Id_Sys ********************************************************************************/
		if(s.getSpcmnIdSys() != null) {
			specimenidentifier.setSystem(s.getSpcmnIdSys());
		}
		/******************** specimenidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimenidentifier.setType(specimenidentifiertype);

		/******************** specimenidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimenidentifiertype.addCoding(specimenidentifiertypecoding);

		/******************** Spcmn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnIdTypCdgCd() != null) {
			specimenidentifiertypecoding.setCode(s.getSpcmnIdTypCdgCd());
		}
		/******************** Spcmn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnIdTypCdgDsply() != null) {
			specimenidentifiertypecoding.setDisplay(s.getSpcmnIdTypCdgDsply());
		}
		/******************** Spcmn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnIdTypCdgSys() != null) {
			specimenidentifiertypecoding.setSystem(s.getSpcmnIdTypCdgSys());
		}
		/******************** Spcmn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnIdTypCdgUsrSltd() != null) {
			specimenidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnIdTypCdgUsrSltd()));
		}
		/******************** Spcmn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnIdTypCdgVrsn() != null) {
			specimenidentifiertypecoding.setVersion(s.getSpcmnIdTypCdgVrsn());
		}
		/******************** Spcmn_Id_Typ_Txt ********************************************************************************/
		if(s.getSpcmnIdTypTxt() != null) {
			specimenidentifiertype.setText(s.getSpcmnIdTypTxt());
		}
		/******************** specimenidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory specimenidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		specimenidentifier.setUse(specimenidentifieruse.fromCode(s.getSpcmnIdUse()));

		/******************** Spcmn_Id_Vl ********************************************************************************/
		if(s.getSpcmnIdVl() != null) {
			specimenidentifier.setValue(s.getSpcmnIdVl());
		}
		/******************** specimennote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation specimennote =  new org.hl7.fhir.r4.model.Annotation();
		specimen.addNote(specimennote);

		/******************** Spcmn_Nt_AthrRfrnc ********************************************************************************/
		if(s.getSpcmnNtAthrRfrnc() != null) {
			specimennote.setAuthor( new org.hl7.fhir.r4.model.Reference(s.getSpcmnNtAthrRfrnc()));
		}
		/******************** Spcmn_Nt_AthrStrgTyp ********************************************************************************/
		if(s.getSpcmnNtAthrStrgTyp() != null) {
			specimennote.setAuthor( new org.hl7.fhir.r4.model.StringType(s.getSpcmnNtAthrStrgTyp()));
		}
		/******************** Spcmn_Nt_Txt ********************************************************************************/
		if(s.getSpcmnNtTxt() != null) {
			specimennote.setText(s.getSpcmnNtTxt());
		}
		/******************** Spcmn_Nt_Time ********************************************************************************/
		if(s.getSpcmnNtTime() != null) {
			java.text.SimpleDateFormat Spcmn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Nt_Timedate = Spcmn_Nt_Timesdf.parse(s.getSpcmnNtTime());
			specimennote.setTime(Spcmn_Nt_Timedate);
		}
		/******************** Spcmn_Parent ********************************************************************************/
		if(s.getSpcmnParent() != null) {
			specimen.addParent( new org.hl7.fhir.r4.model.Reference(s.getSpcmnParent()));
		}
		/******************** specimenprocessing ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent specimenprocessing =  new org.hl7.fhir.r4.model.Specimen.SpecimenProcessingComponent();
		specimen.addProcessing(specimenprocessing);

		/******************** Spcmn_Processing_Addtv ********************************************************************************/
		if(s.getSpcmnProcessingAddtv() != null) {
			specimenprocessing.addAdditive( new org.hl7.fhir.r4.model.Reference(s.getSpcmnProcessingAddtv()));
		}
		/******************** Spcmn_Processing_Dscrptn ********************************************************************************/
		if(s.getSpcmnProcessingDscrptn() != null) {
			specimenprocessing.setDescription(s.getSpcmnProcessingDscrptn());
		}
		/******************** specimenprocessingprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimenprocessingprocedure =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimenprocessing.setProcedure(specimenprocessingprocedure);

		/******************** specimenprocessingprocedurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimenprocessingprocedurecoding =  new org.hl7.fhir.r4.model.Coding();
		specimenprocessingprocedure.addCoding(specimenprocessingprocedurecoding);

		/******************** Spcmn_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgCd() != null) {
			specimenprocessingprocedurecoding.setCode(s.getSpcmnProcessingPrcdrCdgCd());
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgDsply() != null) {
			specimenprocessingprocedurecoding.setDisplay(s.getSpcmnProcessingPrcdrCdgDsply());
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgSys() != null) {
			specimenprocessingprocedurecoding.setSystem(s.getSpcmnProcessingPrcdrCdgSys());
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgUsrSltd() != null) {
			specimenprocessingprocedurecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnProcessingPrcdrCdgUsrSltd()));
		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgVrsn() != null) {
			specimenprocessingprocedurecoding.setVersion(s.getSpcmnProcessingPrcdrCdgVrsn());
		}
		/******************** Spcmn_Processing_Prcdr_Txt ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrTxt() != null) {
			specimenprocessingprocedure.setText(s.getSpcmnProcessingPrcdrTxt());
		}
		/******************** Spcmn_Processing_TimeDtTimeTyp ********************************************************************************/
		if(s.getSpcmnProcessingTimeDtTimeTyp() != null) {
			specimenprocessing.setTime( new org.hl7.fhir.r4.model.DateTimeType(s.getSpcmnProcessingTimeDtTimeTyp()));
		}
		/******************** specimenprocessingtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period specimenprocessingtimeperiod =  new org.hl7.fhir.r4.model.Period();
		specimenprocessing.setTime(specimenprocessingtimeperiod);

		/******************** Spcmn_Processing_TimePrd_End ********************************************************************************/
		if(s.getSpcmnProcessingTimePrdEnd() != null) {
			java.text.SimpleDateFormat Spcmn_Processing_TimePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Processing_TimePrd_Enddate = Spcmn_Processing_TimePrd_Endsdf.parse(s.getSpcmnProcessingTimePrdEnd());
			specimenprocessingtimeperiod.setEnd(Spcmn_Processing_TimePrd_Enddate);
		}
		/******************** Spcmn_Processing_TimePrd_Strt ********************************************************************************/
		if(s.getSpcmnProcessingTimePrdStrt() != null) {
			java.text.SimpleDateFormat Spcmn_Processing_TimePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_Processing_TimePrd_Strtdate = Spcmn_Processing_TimePrd_Strtsdf.parse(s.getSpcmnProcessingTimePrdStrt());
			specimenprocessingtimeperiod.setStart(Spcmn_Processing_TimePrd_Strtdate);
		}
		/******************** Spcmn_ReceivedTime ********************************************************************************/
		if(s.getSpcmnReceivedTime() != null) {
			java.text.SimpleDateFormat Spcmn_ReceivedTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Spcmn_ReceivedTimedate = Spcmn_ReceivedTimesdf.parse(s.getSpcmnReceivedTime());
			specimen.setReceivedTime(Spcmn_ReceivedTimedate);
		}
		/******************** Spcmn_Rqst ********************************************************************************/
		if(s.getSpcmnRqst() != null) {
			specimen.addRequest( new org.hl7.fhir.r4.model.Reference(s.getSpcmnRqst()));
		}
		/******************** specimenstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Specimen.SpecimenStatusEnumFactory specimenstatus =  new org.hl7.fhir.r4.model.Specimen.SpecimenStatusEnumFactory();
		specimen.setStatus(specimenstatus.fromCode(s.getSpcmnSts()));

		/******************** Spcmn_Sbjct ********************************************************************************/
		if(s.getSpcmnSbjct() != null) {
			specimen.setSubject( new org.hl7.fhir.r4.model.Reference(s.getSpcmnSbjct()));
		}
		/******************** specimentype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept specimentype =  new org.hl7.fhir.r4.model.CodeableConcept();
		specimen.setType(specimentype);

		/******************** specimentypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding specimentypecoding =  new org.hl7.fhir.r4.model.Coding();
		specimentype.addCoding(specimentypecoding);

		/******************** Spcmn_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnTypCdgCd() != null) {
			specimentypecoding.setCode(s.getSpcmnTypCdgCd());
		}
		/******************** Spcmn_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnTypCdgDsply() != null) {
			specimentypecoding.setDisplay(s.getSpcmnTypCdgDsply());
		}
		/******************** Spcmn_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnTypCdgSys() != null) {
			specimentypecoding.setSystem(s.getSpcmnTypCdgSys());
		}
		/******************** Spcmn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnTypCdgUsrSltd() != null) {
			specimentypecoding.setUserSelected(Boolean.parseBoolean(s.getSpcmnTypCdgUsrSltd()));
		}
		/******************** Spcmn_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnTypCdgVrsn() != null) {
			specimentypecoding.setVersion(s.getSpcmnTypCdgVrsn());
		}
		/******************** Spcmn_Typ_Txt ********************************************************************************/
		if(s.getSpcmnTypTxt() != null) {
			specimentype.setText(s.getSpcmnTypTxt());
		}
		return specimen;
	}
}
