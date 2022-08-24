package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BiologicallyDerivedProduct;
public class BiologicallyDerivedProductBidirectionalConversion 
{
	public BiologicallyDerivedProduct BiologicallyDerivedProducts(org.hl7.fhir.r4.model.BiologicallyDerivedProduct biologicallyderivedproduct) throws ParseException
	{
		 main.java.com.campfhir.model.BiologicallyDerivedProduct b = new  main.java.com.campfhir.model.BiologicallyDerivedProduct();

		/******************** id ********************************************************************************/
		b.setId(biologicallyderivedproduct.getIdElement().getIdPart());

		/******************** BiologicallyDerivedPrdct_Parent ********************************************************************************/
		if(biologicallyderivedproduct.hasParent()) {

			String  array = "[";
			for(int incr=0; incr<biologicallyderivedproduct.getParent().size(); incr++) {
				array = array + biologicallyderivedproduct.getParent().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			b.addBiologicallyDerivedPrdctParent(array);

		} else {
			b.addBiologicallyDerivedPrdctParent("NULL");
		}


		/******************** biologicallyderivedproductstatus ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStatus biologicallyderivedproductstatus = biologicallyderivedproduct.getStatus();
		if(biologicallyderivedproductstatus!=null) {
			b.addBiologicallyDerivedPrdctSts(biologicallyderivedproductstatus.toCode());
		} else {
			b.addBiologicallyDerivedPrdctSts("NULL");
		}

		/******************** BiologicallyDerivedPrdct_Rqst ********************************************************************************/
		if(biologicallyderivedproduct.hasRequest()) {

			String  array = "[";
			for(int incr=0; incr<biologicallyderivedproduct.getRequest().size(); incr++) {
				array = array + biologicallyderivedproduct.getRequest().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			b.addBiologicallyDerivedPrdctRqst(array);

		} else {
			b.addBiologicallyDerivedPrdctRqst("NULL");
		}


		/******************** biologicallyderivedproductidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> biologicallyderivedproductidentifierlist = biologicallyderivedproduct.getIdentifier();
		for(int biologicallyderivedproductidentifieri = 0; biologicallyderivedproductidentifieri<biologicallyderivedproductidentifierlist.size();biologicallyderivedproductidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  biologicallyderivedproductidentifier = biologicallyderivedproductidentifierlist.get(biologicallyderivedproductidentifieri);

		/******************** BiologicallyDerivedPrdct_Id_Vl ********************************************************************************/
		if(biologicallyderivedproductidentifieri == 0) {b.addBiologicallyDerivedPrdctIdVl("[");}
		if(biologicallyderivedproductidentifier.hasValue()) {

			b.addBiologicallyDerivedPrdctIdVl(String.valueOf(biologicallyderivedproductidentifier.getValue()));
		} else {
			b.addBiologicallyDerivedPrdctIdVl("NULL");
		}

		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {b.addBiologicallyDerivedPrdctIdVl("]");}


		/******************** biologicallyderivedproductidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductidentifiertype = biologicallyderivedproductidentifier.getType();

		/******************** BiologicallyDerivedPrdct_Id_Typ_Txt ********************************************************************************/
		if(biologicallyderivedproductidentifieri == 0) {b.addBiologicallyDerivedPrdctIdTypTxt("[");}
		if(biologicallyderivedproductidentifiertype.hasText()) {

			b.addBiologicallyDerivedPrdctIdTypTxt(String.valueOf(biologicallyderivedproductidentifiertype.getText()));
		} else {
			b.addBiologicallyDerivedPrdctIdTypTxt("NULL");
		}

		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {b.addBiologicallyDerivedPrdctIdTypTxt("]");}


		/******************** biologicallyderivedproductidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> biologicallyderivedproductidentifiertypecodinglist = biologicallyderivedproductidentifiertype.getCoding();
		for(int biologicallyderivedproductidentifiertypecodingi = 0; biologicallyderivedproductidentifiertypecodingi<biologicallyderivedproductidentifiertypecodinglist.size();biologicallyderivedproductidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  biologicallyderivedproductidentifiertypecoding = biologicallyderivedproductidentifiertypecodinglist.get(biologicallyderivedproductidentifiertypecodingi);

		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecodingi == 0) {b.addBiologicallyDerivedPrdctIdTypCdgDsply("[[");}
		if(biologicallyderivedproductidentifiertypecoding.hasDisplay()) {

			b.addBiologicallyDerivedPrdctIdTypCdgDsply(String.valueOf(biologicallyderivedproductidentifiertypecoding.getDisplay()));
		} else {
			b.addBiologicallyDerivedPrdctIdTypCdgDsply("NULL");
		}

		if(biologicallyderivedproductidentifiertypecodingi == biologicallyderivedproductidentifiertypecodinglist.size()-1) {b.addBiologicallyDerivedPrdctIdTypCdgDsply("]]");}


		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecodingi == 0) {b.addBiologicallyDerivedPrdctIdTypCdgVrsn("[[");}
		if(biologicallyderivedproductidentifiertypecoding.hasVersion()) {

			b.addBiologicallyDerivedPrdctIdTypCdgVrsn(String.valueOf(biologicallyderivedproductidentifiertypecoding.getVersion()));
		} else {
			b.addBiologicallyDerivedPrdctIdTypCdgVrsn("NULL");
		}

		if(biologicallyderivedproductidentifiertypecodingi == biologicallyderivedproductidentifiertypecodinglist.size()-1) {b.addBiologicallyDerivedPrdctIdTypCdgVrsn("]]");}


		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecodingi == 0) {b.addBiologicallyDerivedPrdctIdTypCdgCd("[[");}
		if(biologicallyderivedproductidentifiertypecoding.hasCode()) {

			b.addBiologicallyDerivedPrdctIdTypCdgCd(String.valueOf(biologicallyderivedproductidentifiertypecoding.getCode()));
		} else {
			b.addBiologicallyDerivedPrdctIdTypCdgCd("NULL");
		}

		if(biologicallyderivedproductidentifiertypecodingi == biologicallyderivedproductidentifiertypecodinglist.size()-1) {b.addBiologicallyDerivedPrdctIdTypCdgCd("]]");}


		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecodingi == 0) {b.addBiologicallyDerivedPrdctIdTypCdgUsrSltd("[[");}
		if(biologicallyderivedproductidentifiertypecoding.hasUserSelected()) {

			b.addBiologicallyDerivedPrdctIdTypCdgUsrSltd(String.valueOf(biologicallyderivedproductidentifiertypecoding.getUserSelected()));
		} else {
			b.addBiologicallyDerivedPrdctIdTypCdgUsrSltd("NULL");
		}

		if(biologicallyderivedproductidentifiertypecodingi == biologicallyderivedproductidentifiertypecodinglist.size()-1) {b.addBiologicallyDerivedPrdctIdTypCdgUsrSltd("]]");}


		/******************** BiologicallyDerivedPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(biologicallyderivedproductidentifiertypecodingi == 0) {b.addBiologicallyDerivedPrdctIdTypCdgSys("[[");}
		if(biologicallyderivedproductidentifiertypecoding.hasSystem()) {

			b.addBiologicallyDerivedPrdctIdTypCdgSys(String.valueOf(biologicallyderivedproductidentifiertypecoding.getSystem()));
		} else {
			b.addBiologicallyDerivedPrdctIdTypCdgSys("NULL");
		}

		if(biologicallyderivedproductidentifiertypecodingi == biologicallyderivedproductidentifiertypecodinglist.size()-1) {b.addBiologicallyDerivedPrdctIdTypCdgSys("]]");}


		 };
		/******************** biologicallyderivedproductidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductidentifierperiod = biologicallyderivedproductidentifier.getPeriod();

		/******************** BiologicallyDerivedPrdct_Id_Prd_Strt ********************************************************************************/
		if(biologicallyderivedproductidentifieri == 0) {b.addBiologicallyDerivedPrdctIdPrdStrt("[");}
		if(biologicallyderivedproductidentifierperiod.hasStart()) {

			b.addBiologicallyDerivedPrdctIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductidentifierperiod.getStart())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctIdPrdStrt("NULL");
		}

		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {b.addBiologicallyDerivedPrdctIdPrdStrt("]");}


		/******************** BiologicallyDerivedPrdct_Id_Prd_End ********************************************************************************/
		if(biologicallyderivedproductidentifieri == 0) {b.addBiologicallyDerivedPrdctIdPrdEnd("[");}
		if(biologicallyderivedproductidentifierperiod.hasEnd()) {

			b.addBiologicallyDerivedPrdctIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductidentifierperiod.getEnd())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctIdPrdEnd("NULL");
		}

		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {b.addBiologicallyDerivedPrdctIdPrdEnd("]");}


		/******************** biologicallyderivedproductidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse biologicallyderivedproductidentifieruse = biologicallyderivedproductidentifier.getUse();
		if(biologicallyderivedproductidentifieruse!=null) {
		if(biologicallyderivedproductidentifieri == 0) {

		b.addBiologicallyDerivedPrdctIdUse("[");		}
			b.addBiologicallyDerivedPrdctIdUse(biologicallyderivedproductidentifieruse.toCode());
		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {

		b.addBiologicallyDerivedPrdctIdUse("]");		}

		} else {
			b.addBiologicallyDerivedPrdctIdUse("NULL");
		}

		/******************** BiologicallyDerivedPrdct_Id_Assigner ********************************************************************************/
		if(biologicallyderivedproductidentifieri == 0) {b.addBiologicallyDerivedPrdctIdAssigner("[");}
		if(biologicallyderivedproductidentifier.hasAssigner()) {

			if(biologicallyderivedproductidentifier.getAssigner().getReference() != null) {
			b.addBiologicallyDerivedPrdctIdAssigner(biologicallyderivedproductidentifier.getAssigner().getReference());
			}
		} else {
			b.addBiologicallyDerivedPrdctIdAssigner("NULL");
		}

		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {b.addBiologicallyDerivedPrdctIdAssigner("]");}


		/******************** BiologicallyDerivedPrdct_Id_Sys ********************************************************************************/
		if(biologicallyderivedproductidentifieri == 0) {b.addBiologicallyDerivedPrdctIdSys("[");}
		if(biologicallyderivedproductidentifier.hasSystem()) {

			b.addBiologicallyDerivedPrdctIdSys(String.valueOf(biologicallyderivedproductidentifier.getSystem()));
		} else {
			b.addBiologicallyDerivedPrdctIdSys("NULL");
		}

		if(biologicallyderivedproductidentifieri == biologicallyderivedproductidentifierlist.size()-1) {b.addBiologicallyDerivedPrdctIdSys("]");}


		 };
		/******************** biologicallyderivedproductproductcategory ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCategory biologicallyderivedproductproductcategory = biologicallyderivedproduct.getProductCategory();
		if(biologicallyderivedproductproductcategory!=null) {
			b.addBiologicallyDerivedPrdctPrdctCtgry(biologicallyderivedproductproductcategory.toCode());
		} else {
			b.addBiologicallyDerivedPrdctPrdctCtgry("NULL");
		}

		/******************** biologicallyderivedproductproductcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductproductcode = biologicallyderivedproduct.getProductCode();

		/******************** BiologicallyDerivedPrdct_PrdctCd_Txt ********************************************************************************/
		if(biologicallyderivedproductproductcode.hasText()) {

			b.addBiologicallyDerivedPrdctPrdctCdTxt(String.valueOf(biologicallyderivedproductproductcode.getText()));
		} else {
			b.addBiologicallyDerivedPrdctPrdctCdTxt("NULL");
		}


		/******************** biologicallyderivedproductproductcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> biologicallyderivedproductproductcodecodinglist = biologicallyderivedproductproductcode.getCoding();
		for(int biologicallyderivedproductproductcodecodingi = 0; biologicallyderivedproductproductcodecodingi<biologicallyderivedproductproductcodecodinglist.size();biologicallyderivedproductproductcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  biologicallyderivedproductproductcodecoding = biologicallyderivedproductproductcodecodinglist.get(biologicallyderivedproductproductcodecodingi);

		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Dsply ********************************************************************************/
		if(biologicallyderivedproductproductcodecodingi == 0) {b.addBiologicallyDerivedPrdctPrdctCdCdgDsply("[");}
		if(biologicallyderivedproductproductcodecoding.hasDisplay()) {

			b.addBiologicallyDerivedPrdctPrdctCdCdgDsply(String.valueOf(biologicallyderivedproductproductcodecoding.getDisplay()));
		} else {
			b.addBiologicallyDerivedPrdctPrdctCdCdgDsply("NULL");
		}

		if(biologicallyderivedproductproductcodecodingi == biologicallyderivedproductproductcodecodinglist.size()-1) {b.addBiologicallyDerivedPrdctPrdctCdCdgDsply("]");}


		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Vrsn ********************************************************************************/
		if(biologicallyderivedproductproductcodecodingi == 0) {b.addBiologicallyDerivedPrdctPrdctCdCdgVrsn("[");}
		if(biologicallyderivedproductproductcodecoding.hasVersion()) {

			b.addBiologicallyDerivedPrdctPrdctCdCdgVrsn(String.valueOf(biologicallyderivedproductproductcodecoding.getVersion()));
		} else {
			b.addBiologicallyDerivedPrdctPrdctCdCdgVrsn("NULL");
		}

		if(biologicallyderivedproductproductcodecodingi == biologicallyderivedproductproductcodecodinglist.size()-1) {b.addBiologicallyDerivedPrdctPrdctCdCdgVrsn("]");}


		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Cd ********************************************************************************/
		if(biologicallyderivedproductproductcodecodingi == 0) {b.addBiologicallyDerivedPrdctPrdctCdCdgCd("[");}
		if(biologicallyderivedproductproductcodecoding.hasCode()) {

			b.addBiologicallyDerivedPrdctPrdctCdCdgCd(String.valueOf(biologicallyderivedproductproductcodecoding.getCode()));
		} else {
			b.addBiologicallyDerivedPrdctPrdctCdCdgCd("NULL");
		}

		if(biologicallyderivedproductproductcodecodingi == biologicallyderivedproductproductcodecodinglist.size()-1) {b.addBiologicallyDerivedPrdctPrdctCdCdgCd("]");}


		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_UsrSltd ********************************************************************************/
		if(biologicallyderivedproductproductcodecodingi == 0) {b.addBiologicallyDerivedPrdctPrdctCdCdgUsrSltd("[");}
		if(biologicallyderivedproductproductcodecoding.hasUserSelected()) {

			b.addBiologicallyDerivedPrdctPrdctCdCdgUsrSltd(String.valueOf(biologicallyderivedproductproductcodecoding.getUserSelected()));
		} else {
			b.addBiologicallyDerivedPrdctPrdctCdCdgUsrSltd("NULL");
		}

		if(biologicallyderivedproductproductcodecodingi == biologicallyderivedproductproductcodecodinglist.size()-1) {b.addBiologicallyDerivedPrdctPrdctCdCdgUsrSltd("]");}


		/******************** BiologicallyDerivedPrdct_PrdctCd_Cdg_Sys ********************************************************************************/
		if(biologicallyderivedproductproductcodecodingi == 0) {b.addBiologicallyDerivedPrdctPrdctCdCdgSys("[");}
		if(biologicallyderivedproductproductcodecoding.hasSystem()) {

			b.addBiologicallyDerivedPrdctPrdctCdCdgSys(String.valueOf(biologicallyderivedproductproductcodecoding.getSystem()));
		} else {
			b.addBiologicallyDerivedPrdctPrdctCdCdgSys("NULL");
		}

		if(biologicallyderivedproductproductcodecodingi == biologicallyderivedproductproductcodecodinglist.size()-1) {b.addBiologicallyDerivedPrdctPrdctCdCdgSys("]");}


		 };
		/******************** biologicallyderivedproductprocessing ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent> biologicallyderivedproductprocessinglist = biologicallyderivedproduct.getProcessing();
		for(int biologicallyderivedproductprocessingi = 0; biologicallyderivedproductprocessingi<biologicallyderivedproductprocessinglist.size();biologicallyderivedproductprocessingi++ ) {
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductProcessingComponent  biologicallyderivedproductprocessing = biologicallyderivedproductprocessinglist.get(biologicallyderivedproductprocessingi);

		/******************** BiologicallyDerivedPrdct_Processing_Dscrptn ********************************************************************************/
		if(biologicallyderivedproductprocessingi == 0) {b.addBiologicallyDerivedPrdctProcessingDscrptn("[");}
		if(biologicallyderivedproductprocessing.hasDescription()) {

			b.addBiologicallyDerivedPrdctProcessingDscrptn(String.valueOf(biologicallyderivedproductprocessing.getDescription()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingDscrptn("NULL");
		}

		if(biologicallyderivedproductprocessingi == biologicallyderivedproductprocessinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingDscrptn("]");}


		/******************** biologicallyderivedproductprocessingprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept biologicallyderivedproductprocessingprocedure = biologicallyderivedproductprocessing.getProcedure();

		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Txt ********************************************************************************/
		if(biologicallyderivedproductprocessingi == 0) {b.addBiologicallyDerivedPrdctProcessingPrcdrTxt("[");}
		if(biologicallyderivedproductprocessingprocedure.hasText()) {

			b.addBiologicallyDerivedPrdctProcessingPrcdrTxt(String.valueOf(biologicallyderivedproductprocessingprocedure.getText()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingPrcdrTxt("NULL");
		}

		if(biologicallyderivedproductprocessingi == biologicallyderivedproductprocessinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingPrcdrTxt("]");}


		/******************** biologicallyderivedproductprocessingprocedurecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> biologicallyderivedproductprocessingprocedurecodinglist = biologicallyderivedproductprocessingprocedure.getCoding();
		for(int biologicallyderivedproductprocessingprocedurecodingi = 0; biologicallyderivedproductprocessingprocedurecodingi<biologicallyderivedproductprocessingprocedurecodinglist.size();biologicallyderivedproductprocessingprocedurecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  biologicallyderivedproductprocessingprocedurecoding = biologicallyderivedproductprocessingprocedurecodinglist.get(biologicallyderivedproductprocessingprocedurecodingi);

		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecodingi == 0) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgDsply("[[");}
		if(biologicallyderivedproductprocessingprocedurecoding.hasDisplay()) {

			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgDsply(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getDisplay()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgDsply("NULL");
		}

		if(biologicallyderivedproductprocessingprocedurecodingi == biologicallyderivedproductprocessingprocedurecodinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgDsply("]]");}


		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecodingi == 0) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn("[[");}
		if(biologicallyderivedproductprocessingprocedurecoding.hasVersion()) {

			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getVersion()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn("NULL");
		}

		if(biologicallyderivedproductprocessingprocedurecodingi == biologicallyderivedproductprocessingprocedurecodinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgVrsn("]]");}


		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecodingi == 0) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgCd("[[");}
		if(biologicallyderivedproductprocessingprocedurecoding.hasCode()) {

			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgCd(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getCode()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgCd("NULL");
		}

		if(biologicallyderivedproductprocessingprocedurecodingi == biologicallyderivedproductprocessingprocedurecodinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgCd("]]");}


		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecodingi == 0) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd("[[");}
		if(biologicallyderivedproductprocessingprocedurecoding.hasUserSelected()) {

			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getUserSelected()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd("NULL");
		}

		if(biologicallyderivedproductprocessingprocedurecodingi == biologicallyderivedproductprocessingprocedurecodinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgUsrSltd("]]");}


		/******************** BiologicallyDerivedPrdct_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(biologicallyderivedproductprocessingprocedurecodingi == 0) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgSys("[[");}
		if(biologicallyderivedproductprocessingprocedurecoding.hasSystem()) {

			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgSys(String.valueOf(biologicallyderivedproductprocessingprocedurecoding.getSystem()));
		} else {
			b.addBiologicallyDerivedPrdctProcessingPrcdrCdgSys("NULL");
		}

		if(biologicallyderivedproductprocessingprocedurecodingi == biologicallyderivedproductprocessingprocedurecodinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingPrcdrCdgSys("]]");}


		 };
		/******************** BiologicallyDerivedPrdct_Processing_Addtv ********************************************************************************/
		if(biologicallyderivedproductprocessingi == 0) {b.addBiologicallyDerivedPrdctProcessingAddtv("[");}
		if(biologicallyderivedproductprocessing.hasAdditive()) {

			if(biologicallyderivedproductprocessing.getAdditive().getReference() != null) {
			b.addBiologicallyDerivedPrdctProcessingAddtv(biologicallyderivedproductprocessing.getAdditive().getReference());
			}
		} else {
			b.addBiologicallyDerivedPrdctProcessingAddtv("NULL");
		}

		if(biologicallyderivedproductprocessingi == biologicallyderivedproductprocessinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingAddtv("]");}


		/******************** biologicallyderivedproductprocessingtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductprocessingtimeperiod = biologicallyderivedproductprocessing.getTimePeriod();

		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_Strt ********************************************************************************/
		if(biologicallyderivedproductprocessingi == 0) {b.addBiologicallyDerivedPrdctProcessingTimePrdStrt("[");}
		if(biologicallyderivedproductprocessingtimeperiod.hasStart()) {

			b.addBiologicallyDerivedPrdctProcessingTimePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductprocessingtimeperiod.getStart())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctProcessingTimePrdStrt("NULL");
		}

		if(biologicallyderivedproductprocessingi == biologicallyderivedproductprocessinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingTimePrdStrt("]");}


		/******************** BiologicallyDerivedPrdct_Processing_TimePrd_End ********************************************************************************/
		if(biologicallyderivedproductprocessingi == 0) {b.addBiologicallyDerivedPrdctProcessingTimePrdEnd("[");}
		if(biologicallyderivedproductprocessingtimeperiod.hasEnd()) {

			b.addBiologicallyDerivedPrdctProcessingTimePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductprocessingtimeperiod.getEnd())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctProcessingTimePrdEnd("NULL");
		}

		if(biologicallyderivedproductprocessingi == biologicallyderivedproductprocessinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingTimePrdEnd("]");}


		/******************** BiologicallyDerivedPrdct_Processing_TimeDtTimeTyp ********************************************************************************/
		if(biologicallyderivedproductprocessingi == 0) {b.addBiologicallyDerivedPrdctProcessingTimeDtTimeTyp("[");}
		if(biologicallyderivedproductprocessing.hasTimeDateTimeType()) {

			b.addBiologicallyDerivedPrdctProcessingTimeDtTimeTyp("\""+biologicallyderivedproductprocessing.getTimeDateTimeType().getValueAsString()+"\"");
		} else {
			b.addBiologicallyDerivedPrdctProcessingTimeDtTimeTyp("NULL");
		}

		if(biologicallyderivedproductprocessingi == biologicallyderivedproductprocessinglist.size()-1) {b.addBiologicallyDerivedPrdctProcessingTimeDtTimeTyp("]");}


		 };
		/******************** biologicallyderivedproductcollection ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductCollectionComponent biologicallyderivedproductcollection = biologicallyderivedproduct.getCollection();

		/******************** BiologicallyDerivedPrdct_Collection_Src ********************************************************************************/
		if(biologicallyderivedproductcollection.hasSource()) {

			if(biologicallyderivedproductcollection.getSource().getReference() != null) {
			b.addBiologicallyDerivedPrdctCollectionSrc(biologicallyderivedproductcollection.getSource().getReference());
			}
		} else {
			b.addBiologicallyDerivedPrdctCollectionSrc("NULL");
		}


		/******************** BiologicallyDerivedPrdct_Collection_Collector ********************************************************************************/
		if(biologicallyderivedproductcollection.hasCollector()) {

			if(biologicallyderivedproductcollection.getCollector().getReference() != null) {
			b.addBiologicallyDerivedPrdctCollectionCollector(biologicallyderivedproductcollection.getCollector().getReference());
			}
		} else {
			b.addBiologicallyDerivedPrdctCollectionCollector("NULL");
		}


		/******************** biologicallyderivedproductcollectioncollectedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductcollectioncollectedperiod = biologicallyderivedproductcollection.getCollectedPeriod();

		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_Strt ********************************************************************************/
		if(biologicallyderivedproductcollectioncollectedperiod.hasStart()) {

			b.addBiologicallyDerivedPrdctCollectionCollectedPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductcollectioncollectedperiod.getStart())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctCollectionCollectedPrdStrt("NULL");
		}


		/******************** BiologicallyDerivedPrdct_Collection_CollectedPrd_End ********************************************************************************/
		if(biologicallyderivedproductcollectioncollectedperiod.hasEnd()) {

			b.addBiologicallyDerivedPrdctCollectionCollectedPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductcollectioncollectedperiod.getEnd())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctCollectionCollectedPrdEnd("NULL");
		}


		/******************** BiologicallyDerivedPrdct_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(biologicallyderivedproductcollection.hasCollectedDateTimeType()) {

			b.addBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp("\""+biologicallyderivedproductcollection.getCollectedDateTimeType().getValueAsString()+"\"");
		} else {
			b.addBiologicallyDerivedPrdctCollectionCollectedDtTimeTyp("NULL");
		}


		/******************** BiologicallyDerivedPrdct_Qnty ********************************************************************************/
		if(biologicallyderivedproduct.hasQuantity()) {

			b.addBiologicallyDerivedPrdctQnty(String.valueOf(biologicallyderivedproduct.getQuantity()));
		} else {
			b.addBiologicallyDerivedPrdctQnty("NULL");
		}


		/******************** biologicallyderivedproductmanipulation ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductManipulationComponent biologicallyderivedproductmanipulation = biologicallyderivedproduct.getManipulation();

		/******************** BiologicallyDerivedPrdct_Manipulation_Dscrptn ********************************************************************************/
		if(biologicallyderivedproductmanipulation.hasDescription()) {

			b.addBiologicallyDerivedPrdctManipulationDscrptn(String.valueOf(biologicallyderivedproductmanipulation.getDescription()));
		} else {
			b.addBiologicallyDerivedPrdctManipulationDscrptn("NULL");
		}


		/******************** biologicallyderivedproductmanipulationtimeperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductmanipulationtimeperiod = biologicallyderivedproductmanipulation.getTimePeriod();

		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_Strt ********************************************************************************/
		if(biologicallyderivedproductmanipulationtimeperiod.hasStart()) {

			b.addBiologicallyDerivedPrdctManipulationTimePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductmanipulationtimeperiod.getStart())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctManipulationTimePrdStrt("NULL");
		}


		/******************** BiologicallyDerivedPrdct_Manipulation_TimePrd_End ********************************************************************************/
		if(biologicallyderivedproductmanipulationtimeperiod.hasEnd()) {

			b.addBiologicallyDerivedPrdctManipulationTimePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductmanipulationtimeperiod.getEnd())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctManipulationTimePrdEnd("NULL");
		}


		/******************** BiologicallyDerivedPrdct_Manipulation_TimeDtTimeTyp ********************************************************************************/
		if(biologicallyderivedproductmanipulation.hasTimeDateTimeType()) {

			b.addBiologicallyDerivedPrdctManipulationTimeDtTimeTyp("\""+biologicallyderivedproductmanipulation.getTimeDateTimeType().getValueAsString()+"\"");
		} else {
			b.addBiologicallyDerivedPrdctManipulationTimeDtTimeTyp("NULL");
		}


		/******************** biologicallyderivedproductstorage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent> biologicallyderivedproductstoragelist = biologicallyderivedproduct.getStorage();
		for(int biologicallyderivedproductstoragei = 0; biologicallyderivedproductstoragei<biologicallyderivedproductstoragelist.size();biologicallyderivedproductstoragei++ ) {
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageComponent  biologicallyderivedproductstorage = biologicallyderivedproductstoragelist.get(biologicallyderivedproductstoragei);

		/******************** BiologicallyDerivedPrdct_Storage_Dscrptn ********************************************************************************/
		if(biologicallyderivedproductstoragei == 0) {b.addBiologicallyDerivedPrdctStorageDscrptn("[");}
		if(biologicallyderivedproductstorage.hasDescription()) {

			b.addBiologicallyDerivedPrdctStorageDscrptn(String.valueOf(biologicallyderivedproductstorage.getDescription()));
		} else {
			b.addBiologicallyDerivedPrdctStorageDscrptn("NULL");
		}

		if(biologicallyderivedproductstoragei == biologicallyderivedproductstoragelist.size()-1) {b.addBiologicallyDerivedPrdctStorageDscrptn("]");}


		/******************** biologicallyderivedproductstoragescale ********************************************************************************/
		org.hl7.fhir.r4.model.BiologicallyDerivedProduct.BiologicallyDerivedProductStorageScale biologicallyderivedproductstoragescale = biologicallyderivedproductstorage.getScale();
		if(biologicallyderivedproductstoragescale!=null) {
		if(biologicallyderivedproductstoragei == 0) {

		b.addBiologicallyDerivedPrdctStorageScale("[");		}
			b.addBiologicallyDerivedPrdctStorageScale(biologicallyderivedproductstoragescale.toCode());
		if(biologicallyderivedproductstoragei == biologicallyderivedproductstoragelist.size()-1) {

		b.addBiologicallyDerivedPrdctStorageScale("]");		}

		} else {
			b.addBiologicallyDerivedPrdctStorageScale("NULL");
		}

		/******************** BiologicallyDerivedPrdct_Storage_Temperature ********************************************************************************/
		if(biologicallyderivedproductstoragei == 0) {b.addBiologicallyDerivedPrdctStorageTemperature("[");}
		if(biologicallyderivedproductstorage.hasTemperature()) {

			b.addBiologicallyDerivedPrdctStorageTemperature(String.valueOf(biologicallyderivedproductstorage.getTemperature()));
		} else {
			b.addBiologicallyDerivedPrdctStorageTemperature("NULL");
		}

		if(biologicallyderivedproductstoragei == biologicallyderivedproductstoragelist.size()-1) {b.addBiologicallyDerivedPrdctStorageTemperature("]");}


		/******************** biologicallyderivedproductstorageduration ********************************************************************************/
		org.hl7.fhir.r4.model.Period biologicallyderivedproductstorageduration = biologicallyderivedproductstorage.getDuration();

		/******************** BiologicallyDerivedPrdct_Storage_Duration_Strt ********************************************************************************/
		if(biologicallyderivedproductstoragei == 0) {b.addBiologicallyDerivedPrdctStorageDurationStrt("[");}
		if(biologicallyderivedproductstorageduration.hasStart()) {

			b.addBiologicallyDerivedPrdctStorageDurationStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductstorageduration.getStart())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctStorageDurationStrt("NULL");
		}

		if(biologicallyderivedproductstoragei == biologicallyderivedproductstoragelist.size()-1) {b.addBiologicallyDerivedPrdctStorageDurationStrt("]");}


		/******************** BiologicallyDerivedPrdct_Storage_Duration_End ********************************************************************************/
		if(biologicallyderivedproductstoragei == 0) {b.addBiologicallyDerivedPrdctStorageDurationEnd("[");}
		if(biologicallyderivedproductstorageduration.hasEnd()) {

			b.addBiologicallyDerivedPrdctStorageDurationEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(biologicallyderivedproductstorageduration.getEnd())+"\"");
		} else {
			b.addBiologicallyDerivedPrdctStorageDurationEnd("NULL");
		}

		if(biologicallyderivedproductstoragei == biologicallyderivedproductstoragelist.size()-1) {b.addBiologicallyDerivedPrdctStorageDurationEnd("]");}


		 };
		return b;
	}
}
