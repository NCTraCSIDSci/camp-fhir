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

		/******************** BiologicallyDerivedPrdct_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp() != null ) {

			if(b.getBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp()==null) {} else {
			biologicallyderivedproduct.getCollection().setCollected(new org.hl7.fhir.r4.model.DateTimeType(b.getBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd() != null ) {

			if(b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd()==null) {} else {
			biologicallyderivedproduct.getCollection().getCollectedPeriod().setEnd(b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(b.getBiologicallyDerivedPrdctCollectionCollectedPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt() != null ) {

			if(b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt()==null) {} else {
			biologicallyderivedproduct.getCollection().getCollectedPeriod().setStart(b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(b.getBiologicallyDerivedPrdctCollectionCollectedPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Collection_Collector ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionCollector() != null ) {

			if(b.getBiologicallyDerivedPrdctCollectionCollector().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionCollector()==null) {} else {
			biologicallyderivedproduct.getCollection().setCollector(new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctCollectionCollector().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Collection_Src ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctCollectionSrc() != null ) {

			if(b.getBiologicallyDerivedPrdctCollectionSrc().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctCollectionSrc()==null) {} else {
			biologicallyderivedproduct.getCollection().setSource(new org.hl7.fhir.r4.model.Reference(b.getBiologicallyDerivedPrdctCollectionSrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Id_Assigner ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdAssigner() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Prd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdPrdEnd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Prd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdPrdStrt() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdSys() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgCd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { biologicallyderivedproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgDsply() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { biologicallyderivedproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgSys() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { biologicallyderivedproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { biologicallyderivedproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypCdgVrsn() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { biologicallyderivedproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Typ_Txt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdTypTxt() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Use ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdUse() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Id_Vl ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctIdVl() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getIdentifier().size() < i0+1) { biologicallyderivedproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Manipulation_Dscrptn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationDscrptn() != null ) {

			if(b.getBiologicallyDerivedPrdctManipulationDscrptn().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctManipulationDscrptn()==null) {} else {
			biologicallyderivedproduct.getManipulation().setDescription(b.getBiologicallyDerivedPrdctManipulationDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimeDtTimeTyp ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationTimeDtTimeTyp() != null ) {

			if(b.getBiologicallyDerivedPrdctManipulationTimeDtTimeTyp().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctManipulationTimeDtTimeTyp()==null) {} else {
			biologicallyderivedproduct.getManipulation().setTime(new org.hl7.fhir.r4.model.DateTimeType(b.getBiologicallyDerivedPrdctManipulationTimeDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationTimePrdEnd() != null ) {

			if(b.getBiologicallyDerivedPrdctManipulationTimePrdEnd().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctManipulationTimePrdEnd()==null) {} else {
			biologicallyderivedproduct.getManipulation().getTimePeriod().setEnd(b.getBiologicallyDerivedPrdctManipulationTimePrdEnd().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctManipulationTimePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(b.getBiologicallyDerivedPrdctManipulationTimePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctManipulationTimePrdStrt() != null ) {

			if(b.getBiologicallyDerivedPrdctManipulationTimePrdStrt().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctManipulationTimePrdStrt()==null) {} else {
			biologicallyderivedproduct.getManipulation().getTimePeriod().setStart(b.getBiologicallyDerivedPrdctManipulationTimePrdStrt().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctManipulationTimePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(b.getBiologicallyDerivedPrdctManipulationTimePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Parent ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctParent() != null ) {

				for( String currListStrSplit : b.getBiologicallyDerivedPrdctParent().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			biologicallyderivedproduct.addParent(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Addtv ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingAddtv() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingAddtv().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).setAdditive(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Dscrptn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingDscrptn() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgCd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { biologicallyderivedproduct.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgDsply() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { biologicallyderivedproduct.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgSys() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { biologicallyderivedproduct.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { biologicallyderivedproduct.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				String[] arrayi1 = b.getBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { biologicallyderivedproduct.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getProcedure().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Txt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingPrcdrTxt() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingPrcdrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getProcedure().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_TimeDtTimeTyp ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingTimeDtTimeTyp() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingTimeDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).setTime(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingTimePrdEnd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingTimePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getTimePeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctProcessingTimePrdStrt() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctProcessingTimePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProcessing().size() < i0+1) { biologicallyderivedproduct.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProcessing().get(i0).getTimePeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_PrdctCtgry ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCtgry() != null ) {

			if(b.getBiologicallyDerivedPrdctPrdctCtgry().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctPrdctCtgry()==null) {} else {
			biologicallyderivedproduct.setProductCategory(new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCategoryEnumFactory().fromCode(b.getBiologicallyDerivedPrdctPrdctCtgry().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Cd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgCd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctPrdctCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProductCode().getCoding().size() < i0+1) { biologicallyderivedproduct.getProductCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProductCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Dsply ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgDsply() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctPrdctCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProductCode().getCoding().size() < i0+1) { biologicallyderivedproduct.getProductCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProductCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Sys ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgSys() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctPrdctCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProductCode().getCoding().size() < i0+1) { biologicallyderivedproduct.getProductCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProductCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_UsrSltd ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctPrdctCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProductCode().getCoding().size() < i0+1) { biologicallyderivedproduct.getProductCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProductCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Vrsn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdCdgVrsn() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctPrdctCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getProductCode().getCoding().size() < i0+1) { biologicallyderivedproduct.getProductCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getProductCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_PrdctCd_Txt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctPrdctCdTxt() != null ) {

			if(b.getBiologicallyDerivedPrdctPrdctCdTxt().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctPrdctCdTxt()==null) {} else {
			biologicallyderivedproduct.getProductCode().setText(b.getBiologicallyDerivedPrdctPrdctCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** BiologicallyDerivedPrdct_Qnty ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctQnty() != null ) {

			if(b.getBiologicallyDerivedPrdctQnty().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctQnty()==null) {} else {
			biologicallyderivedproduct.setQuantity(Integer.parseInt(b.getBiologicallyDerivedPrdctQnty().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Rqst ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctRqst() != null ) {

				for( String currListStrSplit : b.getBiologicallyDerivedPrdctRqst().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			biologicallyderivedproduct.addRequest(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** BiologicallyDerivedPrdct_Sts ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctSts() != null ) {

			if(b.getBiologicallyDerivedPrdctSts().replace("[","").replace("]","").equals("NULL") | b.getBiologicallyDerivedPrdctSts()==null) {} else {
			biologicallyderivedproduct.setStatus(new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStatusEnumFactory().fromCode(b.getBiologicallyDerivedPrdctSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BiologicallyDerivedPrdct_Storage_Dscrptn ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageDscrptn() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctStorageDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getStorage().size() < i0+1) { biologicallyderivedproduct.addStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getStorage().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Storage_Duration_End ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageDurationEnd() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctStorageDurationEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getStorage().size() < i0+1) { biologicallyderivedproduct.addStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getStorage().get(i0).getDuration().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Storage_Duration_Strt ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageDurationStrt() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctStorageDurationStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getStorage().size() < i0+1) { biologicallyderivedproduct.addStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getStorage().get(i0).getDuration().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Storage_Scale ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageScale() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctStorageScale().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getStorage().size() < i0+1) { biologicallyderivedproduct.addStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getStorage().get(i0).setScale(new org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageScaleEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BiologicallyDerivedPrdct_Storage_Temperature ********************************************************************************/
		if(b.getBiologicallyDerivedPrdctStorageTemperature() != null ) {

			String[] arrayi0 = b.getBiologicallyDerivedPrdctStorageTemperature().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(biologicallyderivedproduct.getStorage().size() < i0+1) { biologicallyderivedproduct.addStorage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {biologicallyderivedproduct.getStorage().get(i0).setTemperature((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		return biologicallyderivedproduct;
	}
}
