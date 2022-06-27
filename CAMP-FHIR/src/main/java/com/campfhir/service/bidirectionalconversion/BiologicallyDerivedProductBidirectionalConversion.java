package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BiologicallyDerivedProduct;
public class BiologicallyDerivedProductBidirectionalConversion 
{
	public BiologicallyDerivedProduct BiologicallyDerivedProducts(org.hl7.fhir.r4.model.BiologicallyDerivedProduct biologicallyderivedproduct) throws ParseException
	{
		 main.java.com.campfhir.model.BiologicallyDerivedProduct b = new  main.java.com.campfhir.model.BiologicallyDerivedProduct();

		/******************** id ********************************************************************************/
		biologicallyderivedproduct.setId(b.getId());

		/******************** biologicallyderivedproductstatus ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStatus biologicallyderivedproductstatus = biologicallyderivedproduct.getStatus();
		b.setBiologicallyDerivedPrdctSts(biologicallyderivedproductstatus.toCode());

		/******************** biologicallyderivedproductproductcategory ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCategory biologicallyderivedproductproductcategory = biologicallyderivedproduct.getProductCategory();
		b.setBiologicallyDerivedPrdctPrdctCtgry(biologicallyderivedproductproductcategory.toCode());

		/******************** biologicallyderivedproductproductcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductproductcode = biologicallyderivedproduct.getProductCode();

		/******************** BiologicallyDerivedPrdct_PrdctCd_Txt ********************************************************************************/
		if(biologicallyderivedproductproductcode.hasText()) {
			b.setBiologicallyDerivedPrdctPrdctCdTxt(String.valueOf(biologicallyderivedproductproductcode.getText()));
		}
		/******************** biologicallyderivedproductproductcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding biologicallyderivedproductproductcodecoding = biologicallyderivedproductproductcode.getCodingFirstRep();

		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Vrsn ********************************************************************************/
		if(biologicallyderivedproductproductcodecoding.hasVersion()) {
			b.setBiologicallyDerivedPrdctPrdctCdCdgVrsn(String.valueOf(biologicallyderivedproductproductcodecoding.getVersion()));
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Dsply ********************************************************************************/
		if(biologicallyderivedproductproductcodecoding.hasDisplay()) {
			b.setBiologicallyDerivedPrdctPrdctCdCdgDsply(String.valueOf(biologicallyderivedproductproductcodecoding.getDisplay()));
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Cd ********************************************************************************/
		if(biologicallyderivedproductproductcodecoding.hasCode()) {
			b.setBiologicallyDerivedPrdctPrdctCdCdgCd(String.valueOf(biologicallyderivedproductproductcodecoding.getCode()));
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_UsrSltd ********************************************************************************/
		if(biologicallyderivedproductproductcodecoding.hasUserSelected()) {
			b.setBiologicallyDerivedPrdctPrdctCdCdgUsrSltd(String.valueOf(biologicallyderivedproductproductcodecoding.getUserSelected()));
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Sys ********************************************************************************/
		if(biologicallyderivedproductproductcodecoding.hasSystem()) {
			b.setBiologicallyDerivedPrdctPrdctCdCdgSys(String.valueOf(biologicallyderivedproductproductcodecoding.getSystem()));
		}
		/******************** BiologicallyDerivedPrdct_Rqst ********************************************************************************/
		if(biologicallyderivedproduct.hasRequest()) {
			b.setBiologicallyDerivedPrdctRqst(String.valueOf(biologicallyderivedproduct.getRequestFirstRep()));
		}
		/******************** BiologicallyDerivedPrdct_Qnty ********************************************************************************/
		if(biologicallyderivedproduct.hasQuantity()) {
			b.setBiologicallyDerivedPrdctQnty(String.valueOf(biologicallyderivedproduct.getQuantity()));
		}
		/******************** BiologicallyDerivedPrdct_Parent ********************************************************************************/
		if(biologicallyderivedproduct.hasParent()) {
			b.setBiologicallyDerivedPrdctParent(String.valueOf(biologicallyderivedproduct.getParentFirstRep()));
		}
		/******************** biologicallyderivedproductcollection ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent biologicallyderivedproductcollection = biologicallyderivedproduct.getCollection();

		/******************** BiologicallyDerivedPrdct_Collection_Src ********************************************************************************/
		if(biologicallyderivedproductcollection.hasSource()) {
			b.setBiologicallyDerivedPrdctCollectionSrc(String.valueOf(biologicallyderivedproductcollection.getSource()));
		}
		/******************** BiologicallyDerivedPrdct_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(biologicallyderivedproductcollection.hasCollectedDateTimeType()) {
			b.setBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp(String.valueOf(biologicallyderivedproductcollection.getCollectedDateTimeType()));
		}
		/******************** BiologicallyDerivedPrdct_Collection_Collector ********************************************************************************/
		if(biologicallyderivedproductcollection.hasCollector()) {
			b.setBiologicallyDerivedPrdctCollectionCollector(String.valueOf(biologicallyderivedproductcollection.getCollector()));
		}
		/******************** biologicallyderivedproductcollectioncollectedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductcollectioncollectedperiod = biologicallyderivedproductcollection.getCollectedPeriod();

		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_Strt ********************************************************************************/
		if(biologicallyderivedproductcollectioncollectedperiod.hasStart()) {
			b.setBiologicallyDerivedPrdctCollectionCollectedPrdStrt(String.valueOf(biologicallyderivedproductcollectioncollectedperiod.getStart()));
		}
		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_End ********************************************************************************/
		if(biologicallyderivedproductcollectioncollectedperiod.hasEnd()) {
			b.setBiologicallyDerivedPrdctCollectionCollectedPrdEnd(String.valueOf(biologicallyderivedproductcollectioncollectedperiod.getEnd()));
		}
		/******************** biologicallyderivedproductstorage ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent biologicallyderivedproductstorage = biologicallyderivedproduct.getStorageFirstRep();

		/******************** BiologicallyDerivedPrdct_Storage_Dscrptn ********************************************************************************/
		if(biologicallyderivedproductstorage.hasDescription()) {
			b.setBiologicallyDerivedPrdctStorageDscrptn(String.valueOf(biologicallyderivedproductstorage.getDescription()));
		}
		/******************** biologicallyderivedproductstorageduration ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductstorageduration = biologicallyderivedproductstorage.getDuration();

		/******************** BiologicallyDerivedPrdct_Storage_Duration_Strt ********************************************************************************/
		if(biologicallyderivedproductstorageduration.hasStart()) {
			b.setBiologicallyDerivedPrdctStorageDurationStrt(String.valueOf(biologicallyderivedproductstorageduration.getStart()));
		}
		/******************** BiologicallyDerivedPrdct_Storage_Duration_End ********************************************************************************/
		if(biologicallyderivedproductstorageduration.hasEnd()) {
			b.setBiologicallyDerivedPrdctStorageDurationEnd(String.valueOf(biologicallyderivedproductstorageduration.getEnd()));
		}
		/******************** BiologicallyDerivedPrdct_Storage_Temperature ********************************************************************************/
		if(biologicallyderivedproductstorage.hasTemperature()) {
			b.setBiologicallyDerivedPrdctStorageTemperature(String.valueOf(biologicallyderivedproductstorage.getTemperature()));
		}
		/******************** biologicallyderivedproductstoragescale ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageScale biologicallyderivedproductstoragescale = biologicallyderivedproductstorage.getScale();
		b.setBiologicallyDerivedPrdctStorageScale(biologicallyderivedproductstoragescale.toCode());

		/******************** biologicallyderivedproductmanipulation ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent biologicallyderivedproductmanipulation = biologicallyderivedproduct.getManipulation();

		/******************** BiologicallyDerivedPrdct_Manipulation_Dscrptn ********************************************************************************/
		if(biologicallyderivedproductmanipulation.hasDescription()) {
			b.setBiologicallyDerivedPrdctManipulationDscrptn(String.valueOf(biologicallyderivedproductmanipulation.getDescription()));
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimeDtTimeTyp ********************************************************************************/
		if(biologicallyderivedproductmanipulation.hasTimeDateTimeType()) {
			b.setBiologicallyDerivedPrdctManipulationTimeDtTimeTyp(String.valueOf(biologicallyderivedproductmanipulation.getTimeDateTimeType()));
		}
		/******************** biologicallyderivedproductmanipulationtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductmanipulationtimeperiod = biologicallyderivedproductmanipulation.getTimePeriod();

		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_Strt ********************************************************************************/
		if(biologicallyderivedproductmanipulationtimeperiod.hasStart()) {
			b.setBiologicallyDerivedPrdctManipulationTimePrdStrt(String.valueOf(biologicallyderivedproductmanipulationtimeperiod.getStart()));
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_End ********************************************************************************/
		if(biologicallyderivedproductmanipulationtimeperiod.hasEnd()) {
			b.setBiologicallyDerivedPrdctManipulationTimePrdEnd(String.valueOf(biologicallyderivedproductmanipulationtimeperiod.getEnd()));
		}
		/******************** biologicallyderivedproductidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier biologicallyderivedproductidentifier = biologicallyderivedproduct.getIdentifierFirstRep();

		/******************** BiologicallyDerivedPrdct_Id_Vl ********************************************************************************/
		if(biologicallyderivedproductidentifier.hasValue()) {
			b.setBiologicallyDerivedPrdctIdVl(String.valueOf(biologicallyderivedproductidentifier.getValue()));
		}
		/******************** biologicallyderivedproductidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductidentifiertype = biologicallyderivedproductidentifier.getType();

		/******************** BiologicallyDerivedPrdct_Id_Typ_Txt ********************************************************************************/
		if(biologicallyderivedproductidentifiertype.hasText()) {
			b.setBiologicallyDerivedPrdctIdTypTxt(String.valueOf(biologicallyderivedproductidentifiertype.getText()));
		}
		/******************** biologicallyderivedproductidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding biologicallyderivedproductidentifiertypecoding = biologicallyderivedproductidentifiertype.getCodingFirstRep();

		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecoding.hasVersion()) {
			b.setBiologicallyDerivedPrdctIdTypCdgVrsn(String.valueOf(biologicallyderivedproductidentifiertypecoding.getVersion()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecoding.hasDisplay()) {
			b.setBiologicallyDerivedPrdctIdTypCdgDsply(String.valueOf(biologicallyderivedproductidentifiertypecoding.getDisplay()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecoding.hasCode()) {
			b.setBiologicallyDerivedPrdctIdTypCdgCd(String.valueOf(biologicallyderivedproductidentifiertypecoding.getCode()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecoding.hasUserSelected()) {
			b.setBiologicallyDerivedPrdctIdTypCdgUsrSltd(String.valueOf(biologicallyderivedproductidentifiertypecoding.getUserSelected()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecoding.hasSystem()) {
			b.setBiologicallyDerivedPrdctIdTypCdgSys(String.valueOf(biologicallyderivedproductidentifiertypecoding.getSystem()));
		}
		/******************** biologicallyderivedproductidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductidentifierperiod = biologicallyderivedproductidentifier.getPeriod();

		/******************** BiologicallyDerivedPrdct_Id_Prd_Strt ********************************************************************************/
		if(biologicallyderivedproductidentifierperiod.hasStart()) {
			b.setBiologicallyDerivedPrdctIdPrdStrt(String.valueOf(biologicallyderivedproductidentifierperiod.getStart()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Prd_End ********************************************************************************/
		if(biologicallyderivedproductidentifierperiod.hasEnd()) {
			b.setBiologicallyDerivedPrdctIdPrdEnd(String.valueOf(biologicallyderivedproductidentifierperiod.getEnd()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Assigner ********************************************************************************/
		if(biologicallyderivedproductidentifier.hasAssigner()) {
			b.setBiologicallyDerivedPrdctIdAssigner(String.valueOf(biologicallyderivedproductidentifier.getAssigner()));
		}
		/******************** BiologicallyDerivedPrdct_Id_Sys ********************************************************************************/
		if(biologicallyderivedproductidentifier.hasSystem()) {
			b.setBiologicallyDerivedPrdctIdSys(String.valueOf(biologicallyderivedproductidentifier.getSystem()));
		}
		/******************** biologicallyderivedproductidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse biologicallyderivedproductidentifieruse = biologicallyderivedproductidentifier.getUse();
		b.setBiologicallyDerivedPrdctIdUse(biologicallyderivedproductidentifieruse.toCode());

		/******************** biologicallyderivedproductprocessing ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent biologicallyderivedproductprocessing = biologicallyderivedproduct.getProcessingFirstRep();

		/******************** BiologicallyDerivedPrdct_Processing_Dscrptn ********************************************************************************/
		if(biologicallyderivedproductprocessing.hasDescription()) {
			b.setBiologicallyDerivedPrdctProcessingDscrptn(String.valueOf(biologicallyderivedproductprocessing.getDescription()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_TimeDtTimeTyp ********************************************************************************/
		if(biologicallyderivedproductprocessing.hasTimeDateTimeType()) {
			b.setBiologicallyDerivedPrdctProcessingTimeDtTimeTyp(String.valueOf(biologicallyderivedproductprocessing.getTimeDateTimeType()));
		}
		/******************** biologicallyderivedproductprocessingprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductprocessingprocedure = biologicallyderivedproductprocessing.getProcedure();

		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Txt ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedure.hasText()) {
			b.setBiologicallyDerivedPrdctProcessingPrcdrTxt(String.valueOf(biologicallyderivedproductprocessingprocedure.getText()));
		}
		/******************** biologicallyderivedproductprocessingprocedurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding biologicallyderivedproductprocessingprocedurecoding = biologicallyderivedproductprocessingprocedure.getCodingFirstRep();

		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecoding.hasVersion()) {
			b.setBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getVersion()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecoding.hasDisplay()) {
			b.setBiologicallyDerivedPrdctProcessingPrcdrCdgDsply(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getDisplay()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecoding.hasCode()) {
			b.setBiologicallyDerivedPrdctProcessingPrcdrCdgCd(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getCode()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecoding.hasUserSelected()) {
			b.setBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getUserSelected()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecoding.hasSystem()) {
			b.setBiologicallyDerivedPrdctProcessingPrcdrCdgSys(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getSystem()));
		}
		/******************** biologicallyderivedproductprocessingtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductprocessingtimeperiod = biologicallyderivedproductprocessing.getTimePeriod();

		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_Strt ********************************************************************************/
		if(biologicallyderivedproductprocessingtimeperiod.hasStart()) {
			b.setBiologicallyDerivedPrdctProcessingTimePrdStrt(String.valueOf(biologicallyderivedproductprocessingtimeperiod.getStart()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_End ********************************************************************************/
		if(biologicallyderivedproductprocessingtimeperiod.hasEnd()) {
			b.setBiologicallyDerivedPrdctProcessingTimePrdEnd(String.valueOf(biologicallyderivedproductprocessingtimeperiod.getEnd()));
		}
		/******************** BiologicallyDerivedPrdct_Processing_Addtv ********************************************************************************/
		if(biologicallyderivedproductprocessing.hasAdditive()) {
			b.setBiologicallyDerivedPrdctProcessingAddtv(String.valueOf(biologicallyderivedproductprocessing.getAdditive()));
		}
		return b;
	}
}
