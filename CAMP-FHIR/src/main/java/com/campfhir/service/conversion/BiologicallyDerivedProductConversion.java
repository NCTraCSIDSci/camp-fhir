package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BiologicallyDerivedProduct;
public class BiologicallyDerivedProductConversion 
{
	public org.hl7.fhir.r4.model.BiologicallyDerivedProduct BiologicallyDerivedProducts(BiologicallyDerivedProduct b) throws ParseException
	{
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct biologicallyderivedproduct = new org.hl7.fhir.r4.model.BiologicallyDerivedProduct();

		/******************** id ********************************************************************************/
		biologicallyderivedproduct.setId(b.getId());

		/******************** biologicallyderivedproductcollection ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent biologicallyderivedproductcollection =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent();
		biologicallyderivedproduct.setCollection(biologicallyderivedproductcollection);

		/******************** BiologicallyDerivedPrdct_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp() != null) {
			biologicallyderivedproductcollection.setCollected( new org.hl7.fhir.r4.model.DateTimeType(b.getBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp()));
		}
		/******************** biologicallyderivedproductcollectioncollectedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductcollectioncollectedperiod =  new org.hl7.fhir.r4.model.Period();
		biologicallyderivedproductcollection.setCollected(biologicallyderivedproductcollectioncollectedperiod);

		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Collection_CollectedPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Collection_CollectedPrd_Enddate = BiologicallyDerivedPrdct_Collection_CollectedPrd_Endsdf.parse(b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd());
			biologicallyderivedproductcollectioncollectedperiod.setEnd(BiologicallyDerivedPrdct_Collection_CollectedPrd_Enddate);
		}
		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Collection_CollectedPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Collection_CollectedPrd_Strtdate = BiologicallyDerivedPrdct_Collection_CollectedPrd_Strtsdf.parse(b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt());
			biologicallyderivedproductcollectioncollectedperiod.setStart(BiologicallyDerivedPrdct_Collection_CollectedPrd_Strtdate);
		}
		/******************** BiologicallyDerivedPrdct_Collection_Collector ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollector() != null) {
			biologicallyderivedproductcollection.setCollector( new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctCollectionCollector()));
		}
		/******************** BiologicallyDerivedPrdct_Collection_Src ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionSrc() != null) {
			biologicallyderivedproductcollection.setSource( new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctCollectionSrc()));
		}
		/******************** biologicallyderivedproductidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier biologicallyderivedproductidentifier =  new org.hl7.fhir.r4.model.Identifier();
		biologicallyderivedproduct.addIdentifier(biologicallyderivedproductidentifier);

		/******************** BiologicallyDerivedPrdct_Id_Assigner ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdAssigner() != null) {
			biologicallyderivedproductidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctIdAssigner()));
		}
		/******************** biologicallyderivedproductidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		biologicallyderivedproductidentifier.setPeriod(biologicallyderivedproductidentifierperiod);

		/******************** BiologicallyDerivedPrdct_Id_Prd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdPrdEnd() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Id_Prd_Enddate = BiologicallyDerivedPrdct_Id_Prd_Endsdf.parse(b.getBiologicallyDerivedPrdctIdPrdEnd());
			biologicallyderivedproductidentifierperiod.setEnd(BiologicallyDerivedPrdct_Id_Prd_Enddate);
		}
		/******************** BiologicallyDerivedPrdct_Id_Prd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdPrdStrt() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Id_Prd_Strtdate = BiologicallyDerivedPrdct_Id_Prd_Strtsdf.parse(b.getBiologicallyDerivedPrdctIdPrdStrt());
			biologicallyderivedproductidentifierperiod.setStart(BiologicallyDerivedPrdct_Id_Prd_Strtdate);
		}
		/******************** BiologicallyDerivedPrdct_Id_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdSys() != null) {
			biologicallyderivedproductidentifier.setSystem(b.getBiologicallyDerivedPrdctIdSys());
		}
		/******************** biologicallyderivedproductidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		biologicallyderivedproductidentifier.setType(biologicallyderivedproductidentifiertype);

		/******************** biologicallyderivedproductidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding biologicallyderivedproductidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		biologicallyderivedproductidentifiertype.addCoding(biologicallyderivedproductidentifiertypecoding);

		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgCd() != null) {
			biologicallyderivedproductidentifiertypecoding.setCode(b.getBiologicallyDerivedPrdctIdTypCdgCd());
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgDsply() != null) {
			biologicallyderivedproductidentifiertypecoding.setDisplay(b.getBiologicallyDerivedPrdctIdTypCdgDsply());
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgSys() != null) {
			biologicallyderivedproductidentifiertypecoding.setSystem(b.getBiologicallyDerivedPrdctIdTypCdgSys());
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgUsrSltd() != null) {
			biologicallyderivedproductidentifiertypecoding.setUserSelected(Boolean.parseBoolean(b.getBiologicallyDerivedPrdctIdTypCdgUsrSltd()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgVrsn() != null) {
			biologicallyderivedproductidentifiertypecoding.setVersion(b.getBiologicallyDerivedPrdctIdTypCdgVrsn());
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Txt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypTxt() != null) {
			biologicallyderivedproductidentifiertype.setText(b.getBiologicallyDerivedPrdctIdTypTxt());
		}
		/******************** biologicallyderivedproductidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory biologicallyderivedproductidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		biologicallyderivedproductidentifier.setUse(biologicallyderivedproductidentifieruse.fromCode(b.getBiologicallyDerivedPrdctIdUse()));

		/******************** BiologicallyDerivedPrdct_Id_Vl ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdVl() != null) {
			biologicallyderivedproductidentifier.setValue(b.getBiologicallyDerivedPrdctIdVl());
		}
		/******************** biologicallyderivedproductmanipulation ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent biologicallyderivedproductmanipulation =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent();
		biologicallyderivedproduct.setManipulation(biologicallyderivedproductmanipulation);

		/******************** BiologicallyDerivedPrdct_Manipulation_Dscrptn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationDscrptn() != null) {
			biologicallyderivedproductmanipulation.setDescription(b.getBiologicallyDerivedPrdctManipulationDscrptn());
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimeDtTimeTyp ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationTimeDtTimeTyp() != null) {
			biologicallyderivedproductmanipulation.setTime( new org.hl7.fhir.r4.model.DateTimeType(b.getBiologicallyDerivedPrdctManipulationTimeDtTimeTyp()));
		}
		/******************** biologicallyderivedproductmanipulationtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductmanipulationtimeperiod =  new org.hl7.fhir.r4.model.Period();
		biologicallyderivedproductmanipulation.setTime(biologicallyderivedproductmanipulationtimeperiod);

		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationTimePrdEnd() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Manipulation_TimePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Manipulation_TimePrd_Enddate = BiologicallyDerivedPrdct_Manipulation_TimePrd_Endsdf.parse(b.getBiologicallyDerivedPrdctManipulationTimePrdEnd());
			biologicallyderivedproductmanipulationtimeperiod.setEnd(BiologicallyDerivedPrdct_Manipulation_TimePrd_Enddate);
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationTimePrdStrt() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Manipulation_TimePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Manipulation_TimePrd_Strtdate = BiologicallyDerivedPrdct_Manipulation_TimePrd_Strtsdf.parse(b.getBiologicallyDerivedPrdctManipulationTimePrdStrt());
			biologicallyderivedproductmanipulationtimeperiod.setStart(BiologicallyDerivedPrdct_Manipulation_TimePrd_Strtdate);
		}
		/******************** BiologicallyDerivedPrdct_Parent ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctParent() != null) {
			biologicallyderivedproduct.addParent( new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctParent()));
		}
		/******************** biologicallyderivedproductprocessing ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent biologicallyderivedproductprocessing =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent();
		biologicallyderivedproduct.addProcessing(biologicallyderivedproductprocessing);

		/******************** BiologicallyDerivedPrdct_Processing_Addtv ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingAddtv() != null) {
			biologicallyderivedproductprocessing.setAdditive( new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctProcessingAddtv()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Dscrptn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingDscrptn() != null) {
			biologicallyderivedproductprocessing.setDescription(b.getBiologicallyDerivedPrdctProcessingDscrptn());
		}
		/******************** biologicallyderivedproductprocessingprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductprocessingprocedure =  new org.hl7.fhir.r4.model.CodeableConcept();
		biologicallyderivedproductprocessing.setProcedure(biologicallyderivedproductprocessingprocedure);

		/******************** biologicallyderivedproductprocessingprocedurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding biologicallyderivedproductprocessingprocedurecoding =  new org.hl7.fhir.r4.model.Coding();
		biologicallyderivedproductprocessingprocedure.addCoding(biologicallyderivedproductprocessingprocedurecoding);

		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgCd() != null) {
			biologicallyderivedproductprocessingprocedurecoding.setCode(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgCd());
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgDsply() != null) {
			biologicallyderivedproductprocessingprocedurecoding.setDisplay(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgDsply());
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgSys() != null) {
			biologicallyderivedproductprocessingprocedurecoding.setSystem(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgSys());
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd() != null) {
			biologicallyderivedproductprocessingprocedurecoding.setUserSelected(Boolean.parseBoolean(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn() != null) {
			biologicallyderivedproductprocessingprocedurecoding.setVersion(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn());
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Txt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrTxt() != null) {
			biologicallyderivedproductprocessingprocedure.setText(b.getBiologicallyDerivedPrdctProcessingPrcdrTxt());
		}
		/******************** BiologicallyDerivedPrdct_Processing_TimeDtTimeTyp ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingTimeDtTimeTyp() != null) {
			biologicallyderivedproductprocessing.setTime( new org.hl7.fhir.r4.model.DateTimeType(b.getBiologicallyDerivedPrdctProcessingTimeDtTimeTyp()));
		}
		/******************** biologicallyderivedproductprocessingtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductprocessingtimeperiod =  new org.hl7.fhir.r4.model.Period();
		biologicallyderivedproductprocessing.setTime(biologicallyderivedproductprocessingtimeperiod);

		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingTimePrdEnd() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Processing_TimePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Processing_TimePrd_Enddate = BiologicallyDerivedPrdct_Processing_TimePrd_Endsdf.parse(b.getBiologicallyDerivedPrdctProcessingTimePrdEnd());
			biologicallyderivedproductprocessingtimeperiod.setEnd(BiologicallyDerivedPrdct_Processing_TimePrd_Enddate);
		}
		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingTimePrdStrt() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Processing_TimePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Processing_TimePrd_Strtdate = BiologicallyDerivedPrdct_Processing_TimePrd_Strtsdf.parse(b.getBiologicallyDerivedPrdctProcessingTimePrdStrt());
			biologicallyderivedproductprocessingtimeperiod.setStart(BiologicallyDerivedPrdct_Processing_TimePrd_Strtdate);
		}
		/******************** biologicallyderivedproductproductcategory ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCategoryEnumFactory biologicallyderivedproductproductcategory =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCategoryEnumFactory();
		biologicallyderivedproduct.setProductCategory(biologicallyderivedproductproductcategory.fromCode(b.getBiologicallyDerivedPrdctPrdctCtgry()));

		/******************** biologicallyderivedproductproductcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductproductcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		biologicallyderivedproduct.setProductCode(biologicallyderivedproductproductcode);

		/******************** biologicallyderivedproductproductcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding biologicallyderivedproductproductcodecoding =  new org.hl7.fhir.r4.model.Coding();
		biologicallyderivedproductproductcode.addCoding(biologicallyderivedproductproductcodecoding);

		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Cd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgCd() != null) {
			biologicallyderivedproductproductcodecoding.setCode(b.getBiologicallyDerivedPrdctPrdctCdCdgCd());
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Dsply ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgDsply() != null) {
			biologicallyderivedproductproductcodecoding.setDisplay(b.getBiologicallyDerivedPrdctPrdctCdCdgDsply());
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgSys() != null) {
			biologicallyderivedproductproductcodecoding.setSystem(b.getBiologicallyDerivedPrdctPrdctCdCdgSys());
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_UsrSltd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgUsrSltd() != null) {
			biologicallyderivedproductproductcodecoding.setUserSelected(Boolean.parseBoolean(b.getBiologicallyDerivedPrdctPrdctCdCdgUsrSltd()));
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Vrsn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgVrsn() != null) {
			biologicallyderivedproductproductcodecoding.setVersion(b.getBiologicallyDerivedPrdctPrdctCdCdgVrsn());
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Txt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdTxt() != null) {
			biologicallyderivedproductproductcode.setText(b.getBiologicallyDerivedPrdctPrdctCdTxt());
		}
		/******************** BiologicallyDerivedPrdct_Qnty ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctQnty() != null) {
			biologicallyderivedproduct.setQuantity(Integer.parseInt(b.getBiologicallyDerivedPrdctQnty()));
		}
		/******************** BiologicallyDerivedPrdct_Rqst ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctRqst() != null) {
			biologicallyderivedproduct.addRequest( new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctRqst()));
		}
		/******************** biologicallyderivedproductstatus ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStatusEnumFactory biologicallyderivedproductstatus =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStatusEnumFactory();
		biologicallyderivedproduct.setStatus(biologicallyderivedproductstatus.fromCode(b.getBiologicallyDerivedPrdctSts()));

		/******************** biologicallyderivedproductstorage ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent biologicallyderivedproductstorage =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent();
		biologicallyderivedproduct.addStorage(biologicallyderivedproductstorage);

		/******************** BiologicallyDerivedPrdct_Storage_Dscrptn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageDscrptn() != null) {
			biologicallyderivedproductstorage.setDescription(b.getBiologicallyDerivedPrdctStorageDscrptn());
		}
		/******************** biologicallyderivedproductstorageduration ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductstorageduration =  new org.hl7.fhir.r4.model.Period();
		biologicallyderivedproductstorage.setDuration(biologicallyderivedproductstorageduration);

		/******************** BiologicallyDerivedPrdct_Storage_Duration_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageDurationEnd() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Storage_Duration_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Storage_Duration_Enddate = BiologicallyDerivedPrdct_Storage_Duration_Endsdf.parse(b.getBiologicallyDerivedPrdctStorageDurationEnd());
			biologicallyderivedproductstorageduration.setEnd(BiologicallyDerivedPrdct_Storage_Duration_Enddate);
		}
		/******************** BiologicallyDerivedPrdct_Storage_Duration_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageDurationStrt() != null) {
			java.text.SimpleDateFormat BiologicallyDerivedPrdct_Storage_Duration_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BiologicallyDerivedPrdct_Storage_Duration_Strtdate = BiologicallyDerivedPrdct_Storage_Duration_Strtsdf.parse(b.getBiologicallyDerivedPrdctStorageDurationStrt());
			biologicallyderivedproductstorageduration.setStart(BiologicallyDerivedPrdct_Storage_Duration_Strtdate);
		}
		/******************** biologicallyderivedproductstoragescale ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageScaleEnumFactory biologicallyderivedproductstoragescale =  new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageScaleEnumFactory();
		biologicallyderivedproductstorage.setScale(biologicallyderivedproductstoragescale.fromCode(b.getBiologicallyDerivedPrdctStorageScale()));

		/******************** BiologicallyDerivedPrdct_Storage_Temperature ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageTemperature() != null) {
			biologicallyderivedproductstorage.setTemperature(Double.parseDouble((b.getBiologicallyDerivedPrdctStorageTemperature())));
		}
		return biologicallyderivedproduct;
	}
}
