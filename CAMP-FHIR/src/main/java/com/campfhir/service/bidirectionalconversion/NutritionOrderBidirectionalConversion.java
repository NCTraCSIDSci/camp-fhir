package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NutritionOrder;
public class NutritionOrderBidirectionalConversion 
{
	public NutritionOrder NutritionOrders(org.hl7.fhir.r4.model.NutritionOrder nutritionorder) throws ParseException
	{
		 main.java.com.campfhir.model.NutritionOrder n = new  main.java.com.campfhir.model.NutritionOrder();

		/******************** id ********************************************************************************/
		n.setId(nutritionorder.getIdElement().getIdPart());

		/******************** nutritionorderstatus ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatus nutritionorderstatus = nutritionorder.getStatus();
		if(nutritionorderstatus!=null) {
			n.addNtritnOrdrSts(nutritionorderstatus.toCode());
		} else {
			n.addNtritnOrdrSts("NULL");
		}

		/******************** NtritnOrdr_Enc ********************************************************************************/
		if(nutritionorder.hasEncounter()) {

			if(nutritionorder.getEncounter().getReference() != null) {
			n.addNtritnOrdrEnc(nutritionorder.getEncounter().getReference());
			}
		} else {
			n.addNtritnOrdrEnc("NULL");
		}


		/******************** nutritionordernote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> nutritionordernotelist = nutritionorder.getNote();
		for(int nutritionordernotei = 0; nutritionordernotei<nutritionordernotelist.size();nutritionordernotei++ ) {
		org.hl7.fhir.r4.model.Annotation  nutritionordernote = nutritionordernotelist.get(nutritionordernotei);

		/******************** NtritnOrdr_Nt_Time ********************************************************************************/
		if(nutritionordernotei == 0) {n.addNtritnOrdrNtTime("[");}
		if(nutritionordernote.hasTime()) {

			n.addNtritnOrdrNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionordernote.getTime())+"\"");
		} else {
			n.addNtritnOrdrNtTime("NULL");
		}

		if(nutritionordernotei == nutritionordernotelist.size()-1) {n.addNtritnOrdrNtTime("]");}


		/******************** NtritnOrdr_Nt_AthrRfrnc ********************************************************************************/
		if(nutritionordernotei == 0) {n.addNtritnOrdrNtAthrRfrnc("[");}
		if(nutritionordernote.hasAuthorReference()) {

			if(nutritionordernote.getAuthorReference().getReference() != null) {
			n.addNtritnOrdrNtAthrRfrnc(nutritionordernote.getAuthorReference().getReference());
			}
		} else {
			n.addNtritnOrdrNtAthrRfrnc("NULL");
		}

		if(nutritionordernotei == nutritionordernotelist.size()-1) {n.addNtritnOrdrNtAthrRfrnc("]");}


		/******************** NtritnOrdr_Nt_Txt ********************************************************************************/
		if(nutritionordernotei == 0) {n.addNtritnOrdrNtTxt("[");}
		if(nutritionordernote.hasText()) {

			n.addNtritnOrdrNtTxt(String.valueOf(nutritionordernote.getText()));
		} else {
			n.addNtritnOrdrNtTxt("NULL");
		}

		if(nutritionordernotei == nutritionordernotelist.size()-1) {n.addNtritnOrdrNtTxt("]");}


		/******************** NtritnOrdr_Nt_AthrStrgTyp ********************************************************************************/
		if(nutritionordernotei == 0) {n.addNtritnOrdrNtAthrStrgTyp("[");}
		if(nutritionordernote.hasAuthorStringType()) {

			n.addNtritnOrdrNtAthrStrgTyp("\""+nutritionordernote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			n.addNtritnOrdrNtAthrStrgTyp("NULL");
		}

		if(nutritionordernotei == nutritionordernotelist.size()-1) {n.addNtritnOrdrNtAthrStrgTyp("]");}


		 };
		/******************** nutritionorderidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> nutritionorderidentifierlist = nutritionorder.getIdentifier();
		for(int nutritionorderidentifieri = 0; nutritionorderidentifieri<nutritionorderidentifierlist.size();nutritionorderidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  nutritionorderidentifier = nutritionorderidentifierlist.get(nutritionorderidentifieri);

		/******************** NtritnOrdr_Id_Vl ********************************************************************************/
		if(nutritionorderidentifieri == 0) {n.addNtritnOrdrIdVl("[");}
		if(nutritionorderidentifier.hasValue()) {

			n.addNtritnOrdrIdVl(String.valueOf(nutritionorderidentifier.getValue()));
		} else {
			n.addNtritnOrdrIdVl("NULL");
		}

		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {n.addNtritnOrdrIdVl("]");}


		/******************** nutritionorderidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderidentifiertype = nutritionorderidentifier.getType();

		/******************** NtritnOrdr_Id_Typ_Txt ********************************************************************************/
		if(nutritionorderidentifieri == 0) {n.addNtritnOrdrIdTypTxt("[");}
		if(nutritionorderidentifiertype.hasText()) {

			n.addNtritnOrdrIdTypTxt(String.valueOf(nutritionorderidentifiertype.getText()));
		} else {
			n.addNtritnOrdrIdTypTxt("NULL");
		}

		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {n.addNtritnOrdrIdTypTxt("]");}


		/******************** nutritionorderidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderidentifiertypecodinglist = nutritionorderidentifiertype.getCoding();
		for(int nutritionorderidentifiertypecodingi = 0; nutritionorderidentifiertypecodingi<nutritionorderidentifiertypecodinglist.size();nutritionorderidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderidentifiertypecoding = nutritionorderidentifiertypecodinglist.get(nutritionorderidentifiertypecodingi);

		/******************** NtritnOrdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(nutritionorderidentifiertypecodingi == 0) {n.addNtritnOrdrIdTypCdgDsply("[[");}
		if(nutritionorderidentifiertypecoding.hasDisplay()) {

			n.addNtritnOrdrIdTypCdgDsply(String.valueOf(nutritionorderidentifiertypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrIdTypCdgDsply("NULL");
		}

		if(nutritionorderidentifiertypecodingi == nutritionorderidentifiertypecodinglist.size()-1) {n.addNtritnOrdrIdTypCdgDsply("]]");}


		/******************** NtritnOrdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderidentifiertypecodingi == 0) {n.addNtritnOrdrIdTypCdgVrsn("[[");}
		if(nutritionorderidentifiertypecoding.hasVersion()) {

			n.addNtritnOrdrIdTypCdgVrsn(String.valueOf(nutritionorderidentifiertypecoding.getVersion()));
		} else {
			n.addNtritnOrdrIdTypCdgVrsn("NULL");
		}

		if(nutritionorderidentifiertypecodingi == nutritionorderidentifiertypecodinglist.size()-1) {n.addNtritnOrdrIdTypCdgVrsn("]]");}


		/******************** NtritnOrdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(nutritionorderidentifiertypecodingi == 0) {n.addNtritnOrdrIdTypCdgCd("[[");}
		if(nutritionorderidentifiertypecoding.hasCode()) {

			n.addNtritnOrdrIdTypCdgCd(String.valueOf(nutritionorderidentifiertypecoding.getCode()));
		} else {
			n.addNtritnOrdrIdTypCdgCd("NULL");
		}

		if(nutritionorderidentifiertypecodingi == nutritionorderidentifiertypecodinglist.size()-1) {n.addNtritnOrdrIdTypCdgCd("]]");}


		/******************** NtritnOrdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderidentifiertypecodingi == 0) {n.addNtritnOrdrIdTypCdgUsrSltd("[[");}
		if(nutritionorderidentifiertypecoding.hasUserSelected()) {

			n.addNtritnOrdrIdTypCdgUsrSltd(String.valueOf(nutritionorderidentifiertypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrIdTypCdgUsrSltd("NULL");
		}

		if(nutritionorderidentifiertypecodingi == nutritionorderidentifiertypecodinglist.size()-1) {n.addNtritnOrdrIdTypCdgUsrSltd("]]");}


		/******************** NtritnOrdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(nutritionorderidentifiertypecodingi == 0) {n.addNtritnOrdrIdTypCdgSys("[[");}
		if(nutritionorderidentifiertypecoding.hasSystem()) {

			n.addNtritnOrdrIdTypCdgSys(String.valueOf(nutritionorderidentifiertypecoding.getSystem()));
		} else {
			n.addNtritnOrdrIdTypCdgSys("NULL");
		}

		if(nutritionorderidentifiertypecodingi == nutritionorderidentifiertypecodinglist.size()-1) {n.addNtritnOrdrIdTypCdgSys("]]");}


		 };
		/******************** nutritionorderidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderidentifierperiod = nutritionorderidentifier.getPeriod();

		/******************** NtritnOrdr_Id_Prd_Strt ********************************************************************************/
		if(nutritionorderidentifieri == 0) {n.addNtritnOrdrIdPrdStrt("[");}
		if(nutritionorderidentifierperiod.hasStart()) {

			n.addNtritnOrdrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorderidentifierperiod.getStart())+"\"");
		} else {
			n.addNtritnOrdrIdPrdStrt("NULL");
		}

		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {n.addNtritnOrdrIdPrdStrt("]");}


		/******************** NtritnOrdr_Id_Prd_End ********************************************************************************/
		if(nutritionorderidentifieri == 0) {n.addNtritnOrdrIdPrdEnd("[");}
		if(nutritionorderidentifierperiod.hasEnd()) {

			n.addNtritnOrdrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorderidentifierperiod.getEnd())+"\"");
		} else {
			n.addNtritnOrdrIdPrdEnd("NULL");
		}

		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {n.addNtritnOrdrIdPrdEnd("]");}


		/******************** nutritionorderidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse nutritionorderidentifieruse = nutritionorderidentifier.getUse();
		if(nutritionorderidentifieruse!=null) {
		if(nutritionorderidentifieri == 0) {

		n.addNtritnOrdrIdUse("[");		}
			n.addNtritnOrdrIdUse(nutritionorderidentifieruse.toCode());
		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {

		n.addNtritnOrdrIdUse("]");		}

		} else {
			n.addNtritnOrdrIdUse("NULL");
		}

		/******************** NtritnOrdr_Id_Assigner ********************************************************************************/
		if(nutritionorderidentifieri == 0) {n.addNtritnOrdrIdAssigner("[");}
		if(nutritionorderidentifier.hasAssigner()) {

			if(nutritionorderidentifier.getAssigner().getReference() != null) {
			n.addNtritnOrdrIdAssigner(nutritionorderidentifier.getAssigner().getReference());
			}
		} else {
			n.addNtritnOrdrIdAssigner("NULL");
		}

		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {n.addNtritnOrdrIdAssigner("]");}


		/******************** NtritnOrdr_Id_Sys ********************************************************************************/
		if(nutritionorderidentifieri == 0) {n.addNtritnOrdrIdSys("[");}
		if(nutritionorderidentifier.hasSystem()) {

			n.addNtritnOrdrIdSys(String.valueOf(nutritionorderidentifier.getSystem()));
		} else {
			n.addNtritnOrdrIdSys("NULL");
		}

		if(nutritionorderidentifieri == nutritionorderidentifierlist.size()-1) {n.addNtritnOrdrIdSys("]");}


		 };
		/******************** NtritnOrdr_InstantiatesUri ********************************************************************************/
		if(nutritionorder.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorder.getInstantiatesUri().size(); incr++) {
				array = array + nutritionorder.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrInstantiatesUri(array);

		} else {
			n.addNtritnOrdrInstantiatesUri("NULL");
		}


		/******************** NtritnOrdr_Ordrer ********************************************************************************/
		if(nutritionorder.hasOrderer()) {

			if(nutritionorder.getOrderer().getReference() != null) {
			n.addNtritnOrdrOrdrer(nutritionorder.getOrderer().getReference());
			}
		} else {
			n.addNtritnOrdrOrdrer("NULL");
		}


		/******************** NtritnOrdr_Instantiates ********************************************************************************/
		if(nutritionorder.hasInstantiates()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorder.getInstantiates().size(); incr++) {
				array = array + nutritionorder.getInstantiates().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrInstantiates(array);

		} else {
			n.addNtritnOrdrInstantiates("NULL");
		}


		/******************** NtritnOrdr_DtTime ********************************************************************************/
		if(nutritionorder.hasDateTime()) {

			n.addNtritnOrdrDtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorder.getDateTime())+"\"");
		} else {
			n.addNtritnOrdrDtTime("NULL");
		}


		/******************** nutritionorderoraldiet ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent nutritionorderoraldiet = nutritionorder.getOralDiet();

		/******************** nutritionorderoraldiettype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> nutritionorderoraldiettypelist = nutritionorderoraldiet.getType();
		for(int nutritionorderoraldiettypei = 0; nutritionorderoraldiettypei<nutritionorderoraldiettypelist.size();nutritionorderoraldiettypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  nutritionorderoraldiettype = nutritionorderoraldiettypelist.get(nutritionorderoraldiettypei);

		/******************** NtritnOrdr_OralDiet_Typ_Txt ********************************************************************************/
		if(nutritionorderoraldiettypei == 0) {n.addNtritnOrdrOralDietTypTxt("[");}
		if(nutritionorderoraldiettype.hasText()) {

			n.addNtritnOrdrOralDietTypTxt(String.valueOf(nutritionorderoraldiettype.getText()));
		} else {
			n.addNtritnOrdrOralDietTypTxt("NULL");
		}

		if(nutritionorderoraldiettypei == nutritionorderoraldiettypelist.size()-1) {n.addNtritnOrdrOralDietTypTxt("]");}


		/******************** nutritionorderoraldiettypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderoraldiettypecodinglist = nutritionorderoraldiettype.getCoding();
		for(int nutritionorderoraldiettypecodingi = 0; nutritionorderoraldiettypecodingi<nutritionorderoraldiettypecodinglist.size();nutritionorderoraldiettypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderoraldiettypecoding = nutritionorderoraldiettypecodinglist.get(nutritionorderoraldiettypecodingi);

		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldiettypecodingi == 0) {n.addNtritnOrdrOralDietTypCdgDsply("[[");}
		if(nutritionorderoraldiettypecoding.hasDisplay()) {

			n.addNtritnOrdrOralDietTypCdgDsply(String.valueOf(nutritionorderoraldiettypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrOralDietTypCdgDsply("NULL");
		}

		if(nutritionorderoraldiettypecodingi == nutritionorderoraldiettypecodinglist.size()-1) {n.addNtritnOrdrOralDietTypCdgDsply("]]");}


		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldiettypecodingi == 0) {n.addNtritnOrdrOralDietTypCdgVrsn("[[");}
		if(nutritionorderoraldiettypecoding.hasVersion()) {

			n.addNtritnOrdrOralDietTypCdgVrsn(String.valueOf(nutritionorderoraldiettypecoding.getVersion()));
		} else {
			n.addNtritnOrdrOralDietTypCdgVrsn("NULL");
		}

		if(nutritionorderoraldiettypecodingi == nutritionorderoraldiettypecodinglist.size()-1) {n.addNtritnOrdrOralDietTypCdgVrsn("]]");}


		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldiettypecodingi == 0) {n.addNtritnOrdrOralDietTypCdgCd("[[");}
		if(nutritionorderoraldiettypecoding.hasCode()) {

			n.addNtritnOrdrOralDietTypCdgCd(String.valueOf(nutritionorderoraldiettypecoding.getCode()));
		} else {
			n.addNtritnOrdrOralDietTypCdgCd("NULL");
		}

		if(nutritionorderoraldiettypecodingi == nutritionorderoraldiettypecodinglist.size()-1) {n.addNtritnOrdrOralDietTypCdgCd("]]");}


		/******************** NtritnOrdr_OralDiet_Typ_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldiettypecodingi == 0) {n.addNtritnOrdrOralDietTypCdgUsrSltd("[[");}
		if(nutritionorderoraldiettypecoding.hasUserSelected()) {

			n.addNtritnOrdrOralDietTypCdgUsrSltd(String.valueOf(nutritionorderoraldiettypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrOralDietTypCdgUsrSltd("NULL");
		}

		if(nutritionorderoraldiettypecodingi == nutritionorderoraldiettypecodinglist.size()-1) {n.addNtritnOrdrOralDietTypCdgUsrSltd("]]");}


		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldiettypecodingi == 0) {n.addNtritnOrdrOralDietTypCdgSys("[[");}
		if(nutritionorderoraldiettypecoding.hasSystem()) {

			n.addNtritnOrdrOralDietTypCdgSys(String.valueOf(nutritionorderoraldiettypecoding.getSystem()));
		} else {
			n.addNtritnOrdrOralDietTypCdgSys("NULL");
		}

		if(nutritionorderoraldiettypecodingi == nutritionorderoraldiettypecodinglist.size()-1) {n.addNtritnOrdrOralDietTypCdgSys("]]");}


		 };
		 };
		/******************** nutritionorderoraldietfluidconsistencytype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> nutritionorderoraldietfluidconsistencytypelist = nutritionorderoraldiet.getFluidConsistencyType();
		for(int nutritionorderoraldietfluidconsistencytypei = 0; nutritionorderoraldietfluidconsistencytypei<nutritionorderoraldietfluidconsistencytypelist.size();nutritionorderoraldietfluidconsistencytypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  nutritionorderoraldietfluidconsistencytype = nutritionorderoraldietfluidconsistencytypelist.get(nutritionorderoraldietfluidconsistencytypei);

		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Txt ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypei == 0) {n.addNtritnOrdrOralDietFluidConsistencyTypTxt("[");}
		if(nutritionorderoraldietfluidconsistencytype.hasText()) {

			n.addNtritnOrdrOralDietFluidConsistencyTypTxt(String.valueOf(nutritionorderoraldietfluidconsistencytype.getText()));
		} else {
			n.addNtritnOrdrOralDietFluidConsistencyTypTxt("NULL");
		}

		if(nutritionorderoraldietfluidconsistencytypei == nutritionorderoraldietfluidconsistencytypelist.size()-1) {n.addNtritnOrdrOralDietFluidConsistencyTypTxt("]");}


		/******************** nutritionorderoraldietfluidconsistencytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderoraldietfluidconsistencytypecodinglist = nutritionorderoraldietfluidconsistencytype.getCoding();
		for(int nutritionorderoraldietfluidconsistencytypecodingi = 0; nutritionorderoraldietfluidconsistencytypecodingi<nutritionorderoraldietfluidconsistencytypecodinglist.size();nutritionorderoraldietfluidconsistencytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderoraldietfluidconsistencytypecoding = nutritionorderoraldietfluidconsistencytypecodinglist.get(nutritionorderoraldietfluidconsistencytypecodingi);

		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecodingi == 0) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgDsply("[[");}
		if(nutritionorderoraldietfluidconsistencytypecoding.hasDisplay()) {

			n.addNtritnOrdrOralDietFluidConsistencyTypCdgDsply(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrOralDietFluidConsistencyTypCdgDsply("NULL");
		}

		if(nutritionorderoraldietfluidconsistencytypecodingi == nutritionorderoraldietfluidconsistencytypecodinglist.size()-1) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgDsply("]]");}


		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecodingi == 0) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgVrsn("[[");}
		if(nutritionorderoraldietfluidconsistencytypecoding.hasVersion()) {

			n.addNtritnOrdrOralDietFluidConsistencyTypCdgVrsn(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getVersion()));
		} else {
			n.addNtritnOrdrOralDietFluidConsistencyTypCdgVrsn("NULL");
		}

		if(nutritionorderoraldietfluidconsistencytypecodingi == nutritionorderoraldietfluidconsistencytypecodinglist.size()-1) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgVrsn("]]");}


		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecodingi == 0) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgCd("[[");}
		if(nutritionorderoraldietfluidconsistencytypecoding.hasCode()) {

			n.addNtritnOrdrOralDietFluidConsistencyTypCdgCd(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getCode()));
		} else {
			n.addNtritnOrdrOralDietFluidConsistencyTypCdgCd("NULL");
		}

		if(nutritionorderoraldietfluidconsistencytypecodingi == nutritionorderoraldietfluidconsistencytypecodinglist.size()-1) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgCd("]]");}


		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecodingi == 0) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd("[[");}
		if(nutritionorderoraldietfluidconsistencytypecoding.hasUserSelected()) {

			n.addNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd("NULL");
		}

		if(nutritionorderoraldietfluidconsistencytypecodingi == nutritionorderoraldietfluidconsistencytypecodinglist.size()-1) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd("]]");}


		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecodingi == 0) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgSys("[[");}
		if(nutritionorderoraldietfluidconsistencytypecoding.hasSystem()) {

			n.addNtritnOrdrOralDietFluidConsistencyTypCdgSys(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getSystem()));
		} else {
			n.addNtritnOrdrOralDietFluidConsistencyTypCdgSys("NULL");
		}

		if(nutritionorderoraldietfluidconsistencytypecodingi == nutritionorderoraldietfluidconsistencytypecodinglist.size()-1) {n.addNtritnOrdrOralDietFluidConsistencyTypCdgSys("]]");}


		 };
		 };
		/******************** nutritionorderoraldietschedule ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Timing> nutritionorderoraldietschedulelist = nutritionorderoraldiet.getSchedule();
		for(int nutritionorderoraldietschedulei = 0; nutritionorderoraldietschedulei<nutritionorderoraldietschedulelist.size();nutritionorderoraldietschedulei++ ) {
		org.hl7.fhir.r4.model.Timing  nutritionorderoraldietschedule = nutritionorderoraldietschedulelist.get(nutritionorderoraldietschedulei);

		/******************** nutritionorderoraldietschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietschedulecode = nutritionorderoraldietschedule.getCode();

		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Txt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlCdTxt("[");}
		if(nutritionorderoraldietschedulecode.hasText()) {

			n.addNtritnOrdrOralDietSchdlCdTxt(String.valueOf(nutritionorderoraldietschedulecode.getText()));
		} else {
			n.addNtritnOrdrOralDietSchdlCdTxt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlCdTxt("]");}


		/******************** nutritionorderoraldietschedulecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderoraldietschedulecodecodinglist = nutritionorderoraldietschedulecode.getCoding();
		for(int nutritionorderoraldietschedulecodecodingi = 0; nutritionorderoraldietschedulecodecodingi<nutritionorderoraldietschedulecodecodinglist.size();nutritionorderoraldietschedulecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderoraldietschedulecodecoding = nutritionorderoraldietschedulecodecodinglist.get(nutritionorderoraldietschedulecodecodingi);

		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldietschedulecodecodingi == 0) {n.addNtritnOrdrOralDietSchdlCdCdgDsply("[[");}
		if(nutritionorderoraldietschedulecodecoding.hasDisplay()) {

			n.addNtritnOrdrOralDietSchdlCdCdgDsply(String.valueOf(nutritionorderoraldietschedulecodecoding.getDisplay()));
		} else {
			n.addNtritnOrdrOralDietSchdlCdCdgDsply("NULL");
		}

		if(nutritionorderoraldietschedulecodecodingi == nutritionorderoraldietschedulecodecodinglist.size()-1) {n.addNtritnOrdrOralDietSchdlCdCdgDsply("]]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldietschedulecodecodingi == 0) {n.addNtritnOrdrOralDietSchdlCdCdgVrsn("[[");}
		if(nutritionorderoraldietschedulecodecoding.hasVersion()) {

			n.addNtritnOrdrOralDietSchdlCdCdgVrsn(String.valueOf(nutritionorderoraldietschedulecodecoding.getVersion()));
		} else {
			n.addNtritnOrdrOralDietSchdlCdCdgVrsn("NULL");
		}

		if(nutritionorderoraldietschedulecodecodingi == nutritionorderoraldietschedulecodecodinglist.size()-1) {n.addNtritnOrdrOralDietSchdlCdCdgVrsn("]]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulecodecodingi == 0) {n.addNtritnOrdrOralDietSchdlCdCdgCd("[[");}
		if(nutritionorderoraldietschedulecodecoding.hasCode()) {

			n.addNtritnOrdrOralDietSchdlCdCdgCd(String.valueOf(nutritionorderoraldietschedulecodecoding.getCode()));
		} else {
			n.addNtritnOrdrOralDietSchdlCdCdgCd("NULL");
		}

		if(nutritionorderoraldietschedulecodecodingi == nutritionorderoraldietschedulecodecodinglist.size()-1) {n.addNtritnOrdrOralDietSchdlCdCdgCd("]]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldietschedulecodecodingi == 0) {n.addNtritnOrdrOralDietSchdlCdCdgUsrSltd("[[");}
		if(nutritionorderoraldietschedulecodecoding.hasUserSelected()) {

			n.addNtritnOrdrOralDietSchdlCdCdgUsrSltd(String.valueOf(nutritionorderoraldietschedulecodecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrOralDietSchdlCdCdgUsrSltd("NULL");
		}

		if(nutritionorderoraldietschedulecodecodingi == nutritionorderoraldietschedulecodecodinglist.size()-1) {n.addNtritnOrdrOralDietSchdlCdCdgUsrSltd("]]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulecodecodingi == 0) {n.addNtritnOrdrOralDietSchdlCdCdgSys("[[");}
		if(nutritionorderoraldietschedulecodecoding.hasSystem()) {

			n.addNtritnOrdrOralDietSchdlCdCdgSys(String.valueOf(nutritionorderoraldietschedulecodecoding.getSystem()));
		} else {
			n.addNtritnOrdrOralDietSchdlCdCdgSys("NULL");
		}

		if(nutritionorderoraldietschedulecodecodingi == nutritionorderoraldietschedulecodecodinglist.size()-1) {n.addNtritnOrdrOralDietSchdlCdCdgSys("]]");}


		 };
		/******************** NtritnOrdr_OralDiet_Schdl_Evnt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlEvnt("[");}
		if(nutritionorderoraldietschedule.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorderoraldietschedule.getEvent().size(); incr++) {
				array = array + nutritionorderoraldietschedule.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrOralDietSchdlEvnt(array);

		} else {
			n.addNtritnOrdrOralDietSchdlEvnt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlEvnt("]");}


		/******************** nutritionorderoraldietschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionorderoraldietschedulerepeat = nutritionorderoraldietschedule.getRepeat();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Off ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptOff("[");}
		if(nutritionorderoraldietschedulerepeat.hasOffset()) {

			n.addNtritnOrdrOralDietSchdlRptOff(String.valueOf(nutritionorderoraldietschedulerepeat.getOffset()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptOff("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptOff("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Cnt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptCnt("[");}
		if(nutritionorderoraldietschedulerepeat.hasCount()) {

			n.addNtritnOrdrOralDietSchdlRptCnt(String.valueOf(nutritionorderoraldietschedulerepeat.getCount()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptCnt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptCnt("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Prd ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptPrd("[");}
		if(nutritionorderoraldietschedulerepeat.hasPeriod()) {

			n.addNtritnOrdrOralDietSchdlRptPrd(String.valueOf(nutritionorderoraldietschedulerepeat.getPeriod()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptPrd("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptPrd("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_CntMx ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptCntMx("[");}
		if(nutritionorderoraldietschedulerepeat.hasCountMax()) {

			n.addNtritnOrdrOralDietSchdlRptCntMx(String.valueOf(nutritionorderoraldietschedulerepeat.getCountMax()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptCntMx("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptCntMx("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_DurationMx ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptDurationMx("[");}
		if(nutritionorderoraldietschedulerepeat.hasDurationMax()) {

			n.addNtritnOrdrOralDietSchdlRptDurationMx(String.valueOf(nutritionorderoraldietschedulerepeat.getDurationMax()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptDurationMx("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptDurationMx("]");}


		/******************** nutritionorderoraldietschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderoraldietschedulerepeatboundsperiod = nutritionorderoraldietschedulerepeat.getBoundsPeriod();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsPrdStrt("[");}
		if(nutritionorderoraldietschedulerepeatboundsperiod.hasStart()) {

			n.addNtritnOrdrOralDietSchdlRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorderoraldietschedulerepeatboundsperiod.getStart())+"\"");
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsPrdStrt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsPrdStrt("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsPrdEnd("[");}
		if(nutritionorderoraldietschedulerepeatboundsperiod.hasEnd()) {

			n.addNtritnOrdrOralDietSchdlRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorderoraldietschedulerepeatboundsperiod.getEnd())+"\"");
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsPrdEnd("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsPrdEnd("]");}


		/******************** nutritionorderoraldietschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderoraldietschedulerepeatdurationunit = nutritionorderoraldietschedulerepeat.getDurationUnit();
		if(nutritionorderoraldietschedulerepeatdurationunit!=null) {
		if(nutritionorderoraldietschedulei == 0) {

		n.addNtritnOrdrOralDietSchdlRptDurationUnt("[");		}
			n.addNtritnOrdrOralDietSchdlRptDurationUnt(nutritionorderoraldietschedulerepeatdurationunit.toCode());
		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {

		n.addNtritnOrdrOralDietSchdlRptDurationUnt("]");		}

		} else {
			n.addNtritnOrdrOralDietSchdlRptDurationUnt("NULL");
		}

		/******************** nutritionorderoraldietschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionorderoraldietschedulerepeatboundsduration = nutritionorderoraldietschedulerepeat.getBoundsDuration();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsDurationVl("[");}
		if(nutritionorderoraldietschedulerepeatboundsduration.hasValue()) {

			n.addNtritnOrdrOralDietSchdlRptBndsDurationVl(String.valueOf(nutritionorderoraldietschedulerepeatboundsduration.getValue()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsDurationVl("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsDurationVl("]");}


		/******************** nutritionorderoraldietschedulerepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietschedulerepeatboundsdurationcomparator = nutritionorderoraldietschedulerepeatboundsduration.getComparator();
		if(nutritionorderoraldietschedulerepeatboundsdurationcomparator!=null) {
		if(nutritionorderoraldietschedulei == 0) {

		n.addNtritnOrdrOralDietSchdlRptBndsDurationCmprtr("[");		}
			n.addNtritnOrdrOralDietSchdlRptBndsDurationCmprtr(nutritionorderoraldietschedulerepeatboundsdurationcomparator.toCode());
		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {

		n.addNtritnOrdrOralDietSchdlRptBndsDurationCmprtr("]");		}

		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsDurationCmprtr("NULL");
		}

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsDurationCd("[");}
		if(nutritionorderoraldietschedulerepeatboundsduration.hasCode()) {

			n.addNtritnOrdrOralDietSchdlRptBndsDurationCd(String.valueOf(nutritionorderoraldietschedulerepeatboundsduration.getCode()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsDurationCd("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsDurationCd("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsDurationUnt("[");}
		if(nutritionorderoraldietschedulerepeatboundsduration.hasUnit()) {

			n.addNtritnOrdrOralDietSchdlRptBndsDurationUnt(String.valueOf(nutritionorderoraldietschedulerepeatboundsduration.getUnit()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsDurationUnt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsDurationUnt("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsDurationSys("[");}
		if(nutritionorderoraldietschedulerepeatboundsduration.hasSystem()) {

			n.addNtritnOrdrOralDietSchdlRptBndsDurationSys(String.valueOf(nutritionorderoraldietschedulerepeatboundsduration.getSystem()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsDurationSys("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsDurationSys("]");}


		/******************** nutritionorderoraldietschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionorderoraldietschedulerepeatboundsrange = nutritionorderoraldietschedulerepeat.getBoundsRange();

		/******************** nutritionorderoraldietschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietschedulerepeatboundsrangelow = nutritionorderoraldietschedulerepeatboundsrange.getLow();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwVl("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasValue()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngLwVl(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getValue()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngLwVl("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwVl("]");}


		/******************** nutritionorderoraldietschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietschedulerepeatboundsrangelowcomparator = nutritionorderoraldietschedulerepeatboundsrangelow.getComparator();
		if(nutritionorderoraldietschedulerepeatboundsrangelowcomparator!=null) {
		if(nutritionorderoraldietschedulei == 0) {

		n.addNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr("[");		}
			n.addNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr(nutritionorderoraldietschedulerepeatboundsrangelowcomparator.toCode());
		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {

		n.addNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr("]");		}

		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr("NULL");
		}

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwCd("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasCode()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngLwCd(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getCode()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngLwCd("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwCd("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwUnt("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasUnit()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngLwUnt(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getUnit()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngLwUnt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwUnt("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwSys("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasSystem()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngLwSys(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getSystem()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngLwSys("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngLwSys("]");}


		/******************** nutritionorderoraldietschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietschedulerepeatboundsrangehigh = nutritionorderoraldietschedulerepeatboundsrange.getHigh();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiVl("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasValue()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngHiVl(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getValue()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngHiVl("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiVl("]");}


		/******************** nutritionorderoraldietschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietschedulerepeatboundsrangehighcomparator = nutritionorderoraldietschedulerepeatboundsrangehigh.getComparator();
		if(nutritionorderoraldietschedulerepeatboundsrangehighcomparator!=null) {
		if(nutritionorderoraldietschedulei == 0) {

		n.addNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr("[");		}
			n.addNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr(nutritionorderoraldietschedulerepeatboundsrangehighcomparator.toCode());
		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {

		n.addNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr("]");		}

		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr("NULL");
		}

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiCd("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasCode()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngHiCd(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getCode()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngHiCd("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiCd("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiUnt("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasUnit()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngHiUnt(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getUnit()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngHiUnt("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiUnt("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiSys("[");}
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasSystem()) {

			n.addNtritnOrdrOralDietSchdlRptBndsRngHiSys(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getSystem()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptBndsRngHiSys("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptBndsRngHiSys("]");}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(nutritionorderoraldietschedulei == 0) {n.addNtritnOrdrOralDietSchdlRptFrqncyMx("[");}
		if(nutritionorderoraldietschedulerepeat.hasFrequencyMax()) {

			n.addNtritnOrdrOralDietSchdlRptFrqncyMx(String.valueOf(nutritionorderoraldietschedulerepeat.getFrequencyMax()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptFrqncyMx("NULL");
		}

		if(nutritionorderoraldietschedulei == nutritionorderoraldietschedulelist.size()-1) {n.addNtritnOrdrOralDietSchdlRptFrqncyMx("]");}


		/******************** nutritionorderoraldietschedulerepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> nutritionorderoraldietschedulerepeatwhenlist = nutritionorderoraldietschedulerepeat.getWhen();
		for(int nutritionorderoraldietschedulerepeatwheni = 0; nutritionorderoraldietschedulerepeatwheni<nutritionorderoraldietschedulerepeatwhenlist.size();nutritionorderoraldietschedulerepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  nutritionorderoraldietschedulerepeatwhen = nutritionorderoraldietschedulerepeatwhenlist.get(nutritionorderoraldietschedulerepeatwheni);
		if(nutritionorderoraldietschedulerepeatwhen!=null) {
			n.addNtritnOrdrOralDietSchdlRptWhen(nutritionorderoraldietschedulerepeatwhen.getCode());
		} else {
			n.addNtritnOrdrOralDietSchdlRptWhen("NULL");
		}
		 };

		/******************** nutritionorderoraldietschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderoraldietschedulerepeatperiodunit = nutritionorderoraldietschedulerepeat.getPeriodUnit();
		if(nutritionorderoraldietschedulerepeatperiodunit!=null) {
			n.addNtritnOrdrOralDietSchdlRptPrdUnt(nutritionorderoraldietschedulerepeatperiodunit.toCode());
		} else {
			n.addNtritnOrdrOralDietSchdlRptPrdUnt("NULL");
		}

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_PrdMx ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasPeriodMax()) {

			n.addNtritnOrdrOralDietSchdlRptPrdMx(String.valueOf(nutritionorderoraldietschedulerepeat.getPeriodMax()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptPrdMx("NULL");
		}


		/******************** nutritionorderoraldietschedulerepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> nutritionorderoraldietschedulerepeatdayofweeklist = nutritionorderoraldietschedulerepeat.getDayOfWeek();
		for(int nutritionorderoraldietschedulerepeatdayofweeki = 0; nutritionorderoraldietschedulerepeatdayofweeki<nutritionorderoraldietschedulerepeatdayofweeklist.size();nutritionorderoraldietschedulerepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  nutritionorderoraldietschedulerepeatdayofweek = nutritionorderoraldietschedulerepeatdayofweeklist.get(nutritionorderoraldietschedulerepeatdayofweeki);
		if(nutritionorderoraldietschedulerepeatdayofweek!=null) {
			n.addNtritnOrdrOralDietSchdlRptDayOfWeek(nutritionorderoraldietschedulerepeatdayofweek.getCode());
		} else {
			n.addNtritnOrdrOralDietSchdlRptDayOfWeek("NULL");
		}
		 };

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorderoraldietschedulerepeat.getTimeOfDay().size(); incr++) {
				array = array + nutritionorderoraldietschedulerepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrOralDietSchdlRptTimeOfDay(array);

		} else {
			n.addNtritnOrdrOralDietSchdlRptTimeOfDay("NULL");
		}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Duration ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasDuration()) {

			n.addNtritnOrdrOralDietSchdlRptDuration(String.valueOf(nutritionorderoraldietschedulerepeat.getDuration()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptDuration("NULL");
		}


		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Frqncy ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasFrequency()) {

			n.addNtritnOrdrOralDietSchdlRptFrqncy(String.valueOf(nutritionorderoraldietschedulerepeat.getFrequency()));
		} else {
			n.addNtritnOrdrOralDietSchdlRptFrqncy("NULL");
		}


		 };
		/******************** NtritnOrdr_OralDiet_Instrctn ********************************************************************************/
		if(nutritionorderoraldiet.hasInstruction()) {

			n.addNtritnOrdrOralDietInstrctn(String.valueOf(nutritionorderoraldiet.getInstruction()));
		} else {
			n.addNtritnOrdrOralDietInstrctn("NULL");
		}


		/******************** nutritionorderoraldiettexture ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent> nutritionorderoraldiettexturelist = nutritionorderoraldiet.getTexture();
		for(int nutritionorderoraldiettexturei = 0; nutritionorderoraldiettexturei<nutritionorderoraldiettexturelist.size();nutritionorderoraldiettexturei++ ) {
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent  nutritionorderoraldiettexture = nutritionorderoraldiettexturelist.get(nutritionorderoraldiettexturei);

		/******************** nutritionorderoraldiettexturemodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettexturemodifier = nutritionorderoraldiettexture.getModifier();

		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Txt ********************************************************************************/
		if(nutritionorderoraldiettexturei == 0) {n.addNtritnOrdrOralDietTxtureMdfrTxt("[");}
		if(nutritionorderoraldiettexturemodifier.hasText()) {

			n.addNtritnOrdrOralDietTxtureMdfrTxt(String.valueOf(nutritionorderoraldiettexturemodifier.getText()));
		} else {
			n.addNtritnOrdrOralDietTxtureMdfrTxt("NULL");
		}

		if(nutritionorderoraldiettexturei == nutritionorderoraldiettexturelist.size()-1) {n.addNtritnOrdrOralDietTxtureMdfrTxt("]");}


		/******************** nutritionorderoraldiettexturemodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderoraldiettexturemodifiercodinglist = nutritionorderoraldiettexturemodifier.getCoding();
		for(int nutritionorderoraldiettexturemodifiercodingi = 0; nutritionorderoraldiettexturemodifiercodingi<nutritionorderoraldiettexturemodifiercodinglist.size();nutritionorderoraldiettexturemodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderoraldiettexturemodifiercoding = nutritionorderoraldiettexturemodifiercodinglist.get(nutritionorderoraldiettexturemodifiercodingi);

		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercodingi == 0) {n.addNtritnOrdrOralDietTxtureMdfrCdgDsply("[[");}
		if(nutritionorderoraldiettexturemodifiercoding.hasDisplay()) {

			n.addNtritnOrdrOralDietTxtureMdfrCdgDsply(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getDisplay()));
		} else {
			n.addNtritnOrdrOralDietTxtureMdfrCdgDsply("NULL");
		}

		if(nutritionorderoraldiettexturemodifiercodingi == nutritionorderoraldiettexturemodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureMdfrCdgDsply("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercodingi == 0) {n.addNtritnOrdrOralDietTxtureMdfrCdgVrsn("[[");}
		if(nutritionorderoraldiettexturemodifiercoding.hasVersion()) {

			n.addNtritnOrdrOralDietTxtureMdfrCdgVrsn(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getVersion()));
		} else {
			n.addNtritnOrdrOralDietTxtureMdfrCdgVrsn("NULL");
		}

		if(nutritionorderoraldiettexturemodifiercodingi == nutritionorderoraldiettexturemodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureMdfrCdgVrsn("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercodingi == 0) {n.addNtritnOrdrOralDietTxtureMdfrCdgCd("[[");}
		if(nutritionorderoraldiettexturemodifiercoding.hasCode()) {

			n.addNtritnOrdrOralDietTxtureMdfrCdgCd(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getCode()));
		} else {
			n.addNtritnOrdrOralDietTxtureMdfrCdgCd("NULL");
		}

		if(nutritionorderoraldiettexturemodifiercodingi == nutritionorderoraldiettexturemodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureMdfrCdgCd("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercodingi == 0) {n.addNtritnOrdrOralDietTxtureMdfrCdgUsrSltd("[[");}
		if(nutritionorderoraldiettexturemodifiercoding.hasUserSelected()) {

			n.addNtritnOrdrOralDietTxtureMdfrCdgUsrSltd(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getUserSelected()));
		} else {
			n.addNtritnOrdrOralDietTxtureMdfrCdgUsrSltd("NULL");
		}

		if(nutritionorderoraldiettexturemodifiercodingi == nutritionorderoraldiettexturemodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureMdfrCdgUsrSltd("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercodingi == 0) {n.addNtritnOrdrOralDietTxtureMdfrCdgSys("[[");}
		if(nutritionorderoraldiettexturemodifiercoding.hasSystem()) {

			n.addNtritnOrdrOralDietTxtureMdfrCdgSys(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getSystem()));
		} else {
			n.addNtritnOrdrOralDietTxtureMdfrCdgSys("NULL");
		}

		if(nutritionorderoraldiettexturemodifiercodingi == nutritionorderoraldiettexturemodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureMdfrCdgSys("]]");}


		 };
		/******************** nutritionorderoraldiettexturefoodtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettexturefoodtype = nutritionorderoraldiettexture.getFoodType();

		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Txt ********************************************************************************/
		if(nutritionorderoraldiettexturei == 0) {n.addNtritnOrdrOralDietTxtureFoodTypTxt("[");}
		if(nutritionorderoraldiettexturefoodtype.hasText()) {

			n.addNtritnOrdrOralDietTxtureFoodTypTxt(String.valueOf(nutritionorderoraldiettexturefoodtype.getText()));
		} else {
			n.addNtritnOrdrOralDietTxtureFoodTypTxt("NULL");
		}

		if(nutritionorderoraldiettexturei == nutritionorderoraldiettexturelist.size()-1) {n.addNtritnOrdrOralDietTxtureFoodTypTxt("]");}


		/******************** nutritionorderoraldiettexturefoodtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderoraldiettexturefoodtypecodinglist = nutritionorderoraldiettexturefoodtype.getCoding();
		for(int nutritionorderoraldiettexturefoodtypecodingi = 0; nutritionorderoraldiettexturefoodtypecodingi<nutritionorderoraldiettexturefoodtypecodinglist.size();nutritionorderoraldiettexturefoodtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderoraldiettexturefoodtypecoding = nutritionorderoraldiettexturefoodtypecodinglist.get(nutritionorderoraldiettexturefoodtypecodingi);

		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecodingi == 0) {n.addNtritnOrdrOralDietTxtureFoodTypCdgDsply("[[");}
		if(nutritionorderoraldiettexturefoodtypecoding.hasDisplay()) {

			n.addNtritnOrdrOralDietTxtureFoodTypCdgDsply(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrOralDietTxtureFoodTypCdgDsply("NULL");
		}

		if(nutritionorderoraldiettexturefoodtypecodingi == nutritionorderoraldiettexturefoodtypecodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureFoodTypCdgDsply("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecodingi == 0) {n.addNtritnOrdrOralDietTxtureFoodTypCdgVrsn("[[");}
		if(nutritionorderoraldiettexturefoodtypecoding.hasVersion()) {

			n.addNtritnOrdrOralDietTxtureFoodTypCdgVrsn(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getVersion()));
		} else {
			n.addNtritnOrdrOralDietTxtureFoodTypCdgVrsn("NULL");
		}

		if(nutritionorderoraldiettexturefoodtypecodingi == nutritionorderoraldiettexturefoodtypecodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureFoodTypCdgVrsn("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecodingi == 0) {n.addNtritnOrdrOralDietTxtureFoodTypCdgCd("[[");}
		if(nutritionorderoraldiettexturefoodtypecoding.hasCode()) {

			n.addNtritnOrdrOralDietTxtureFoodTypCdgCd(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getCode()));
		} else {
			n.addNtritnOrdrOralDietTxtureFoodTypCdgCd("NULL");
		}

		if(nutritionorderoraldiettexturefoodtypecodingi == nutritionorderoraldiettexturefoodtypecodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureFoodTypCdgCd("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecodingi == 0) {n.addNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd("[[");}
		if(nutritionorderoraldiettexturefoodtypecoding.hasUserSelected()) {

			n.addNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd("NULL");
		}

		if(nutritionorderoraldiettexturefoodtypecodingi == nutritionorderoraldiettexturefoodtypecodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd("]]");}


		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecodingi == 0) {n.addNtritnOrdrOralDietTxtureFoodTypCdgSys("[[");}
		if(nutritionorderoraldiettexturefoodtypecoding.hasSystem()) {

			n.addNtritnOrdrOralDietTxtureFoodTypCdgSys(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getSystem()));
		} else {
			n.addNtritnOrdrOralDietTxtureFoodTypCdgSys("NULL");
		}

		if(nutritionorderoraldiettexturefoodtypecodingi == nutritionorderoraldiettexturefoodtypecodinglist.size()-1) {n.addNtritnOrdrOralDietTxtureFoodTypCdgSys("]]");}


		 };
		 };
		/******************** nutritionorderoraldietnutrient ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent> nutritionorderoraldietnutrientlist = nutritionorderoraldiet.getNutrient();
		for(int nutritionorderoraldietnutrienti = 0; nutritionorderoraldietnutrienti<nutritionorderoraldietnutrientlist.size();nutritionorderoraldietnutrienti++ ) {
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent  nutritionorderoraldietnutrient = nutritionorderoraldietnutrientlist.get(nutritionorderoraldietnutrienti);

		/******************** nutritionorderoraldietnutrientmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietnutrientmodifier = nutritionorderoraldietnutrient.getModifier();

		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Txt ********************************************************************************/
		if(nutritionorderoraldietnutrienti == 0) {n.addNtritnOrdrOralDietNutrientMdfrTxt("[");}
		if(nutritionorderoraldietnutrientmodifier.hasText()) {

			n.addNtritnOrdrOralDietNutrientMdfrTxt(String.valueOf(nutritionorderoraldietnutrientmodifier.getText()));
		} else {
			n.addNtritnOrdrOralDietNutrientMdfrTxt("NULL");
		}

		if(nutritionorderoraldietnutrienti == nutritionorderoraldietnutrientlist.size()-1) {n.addNtritnOrdrOralDietNutrientMdfrTxt("]");}


		/******************** nutritionorderoraldietnutrientmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderoraldietnutrientmodifiercodinglist = nutritionorderoraldietnutrientmodifier.getCoding();
		for(int nutritionorderoraldietnutrientmodifiercodingi = 0; nutritionorderoraldietnutrientmodifiercodingi<nutritionorderoraldietnutrientmodifiercodinglist.size();nutritionorderoraldietnutrientmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderoraldietnutrientmodifiercoding = nutritionorderoraldietnutrientmodifiercodinglist.get(nutritionorderoraldietnutrientmodifiercodingi);

		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercodingi == 0) {n.addNtritnOrdrOralDietNutrientMdfrCdgDsply("[[");}
		if(nutritionorderoraldietnutrientmodifiercoding.hasDisplay()) {

			n.addNtritnOrdrOralDietNutrientMdfrCdgDsply(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getDisplay()));
		} else {
			n.addNtritnOrdrOralDietNutrientMdfrCdgDsply("NULL");
		}

		if(nutritionorderoraldietnutrientmodifiercodingi == nutritionorderoraldietnutrientmodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietNutrientMdfrCdgDsply("]]");}


		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercodingi == 0) {n.addNtritnOrdrOralDietNutrientMdfrCdgVrsn("[[");}
		if(nutritionorderoraldietnutrientmodifiercoding.hasVersion()) {

			n.addNtritnOrdrOralDietNutrientMdfrCdgVrsn(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getVersion()));
		} else {
			n.addNtritnOrdrOralDietNutrientMdfrCdgVrsn("NULL");
		}

		if(nutritionorderoraldietnutrientmodifiercodingi == nutritionorderoraldietnutrientmodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietNutrientMdfrCdgVrsn("]]");}


		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercodingi == 0) {n.addNtritnOrdrOralDietNutrientMdfrCdgCd("[[");}
		if(nutritionorderoraldietnutrientmodifiercoding.hasCode()) {

			n.addNtritnOrdrOralDietNutrientMdfrCdgCd(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getCode()));
		} else {
			n.addNtritnOrdrOralDietNutrientMdfrCdgCd("NULL");
		}

		if(nutritionorderoraldietnutrientmodifiercodingi == nutritionorderoraldietnutrientmodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietNutrientMdfrCdgCd("]]");}


		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercodingi == 0) {n.addNtritnOrdrOralDietNutrientMdfrCdgUsrSltd("[[");}
		if(nutritionorderoraldietnutrientmodifiercoding.hasUserSelected()) {

			n.addNtritnOrdrOralDietNutrientMdfrCdgUsrSltd(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getUserSelected()));
		} else {
			n.addNtritnOrdrOralDietNutrientMdfrCdgUsrSltd("NULL");
		}

		if(nutritionorderoraldietnutrientmodifiercodingi == nutritionorderoraldietnutrientmodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietNutrientMdfrCdgUsrSltd("]]");}


		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercodingi == 0) {n.addNtritnOrdrOralDietNutrientMdfrCdgSys("[[");}
		if(nutritionorderoraldietnutrientmodifiercoding.hasSystem()) {

			n.addNtritnOrdrOralDietNutrientMdfrCdgSys(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getSystem()));
		} else {
			n.addNtritnOrdrOralDietNutrientMdfrCdgSys("NULL");
		}

		if(nutritionorderoraldietnutrientmodifiercodingi == nutritionorderoraldietnutrientmodifiercodinglist.size()-1) {n.addNtritnOrdrOralDietNutrientMdfrCdgSys("]]");}


		 };
		/******************** nutritionorderoraldietnutrientamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietnutrientamount = nutritionorderoraldietnutrient.getAmount();

		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Vl ********************************************************************************/
		if(nutritionorderoraldietnutrienti == 0) {n.addNtritnOrdrOralDietNutrientAmntVl("[");}
		if(nutritionorderoraldietnutrientamount.hasValue()) {

			n.addNtritnOrdrOralDietNutrientAmntVl(String.valueOf(nutritionorderoraldietnutrientamount.getValue()));
		} else {
			n.addNtritnOrdrOralDietNutrientAmntVl("NULL");
		}

		if(nutritionorderoraldietnutrienti == nutritionorderoraldietnutrientlist.size()-1) {n.addNtritnOrdrOralDietNutrientAmntVl("]");}


		/******************** nutritionorderoraldietnutrientamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietnutrientamountcomparator = nutritionorderoraldietnutrientamount.getComparator();
		if(nutritionorderoraldietnutrientamountcomparator!=null) {
		if(nutritionorderoraldietnutrienti == 0) {

		n.addNtritnOrdrOralDietNutrientAmntCmprtr("[");		}
			n.addNtritnOrdrOralDietNutrientAmntCmprtr(nutritionorderoraldietnutrientamountcomparator.toCode());
		if(nutritionorderoraldietnutrienti == nutritionorderoraldietnutrientlist.size()-1) {

		n.addNtritnOrdrOralDietNutrientAmntCmprtr("]");		}

		} else {
			n.addNtritnOrdrOralDietNutrientAmntCmprtr("NULL");
		}

		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Cd ********************************************************************************/
		if(nutritionorderoraldietnutrienti == 0) {n.addNtritnOrdrOralDietNutrientAmntCd("[");}
		if(nutritionorderoraldietnutrientamount.hasCode()) {

			n.addNtritnOrdrOralDietNutrientAmntCd(String.valueOf(nutritionorderoraldietnutrientamount.getCode()));
		} else {
			n.addNtritnOrdrOralDietNutrientAmntCd("NULL");
		}

		if(nutritionorderoraldietnutrienti == nutritionorderoraldietnutrientlist.size()-1) {n.addNtritnOrdrOralDietNutrientAmntCd("]");}


		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Unt ********************************************************************************/
		if(nutritionorderoraldietnutrienti == 0) {n.addNtritnOrdrOralDietNutrientAmntUnt("[");}
		if(nutritionorderoraldietnutrientamount.hasUnit()) {

			n.addNtritnOrdrOralDietNutrientAmntUnt(String.valueOf(nutritionorderoraldietnutrientamount.getUnit()));
		} else {
			n.addNtritnOrdrOralDietNutrientAmntUnt("NULL");
		}

		if(nutritionorderoraldietnutrienti == nutritionorderoraldietnutrientlist.size()-1) {n.addNtritnOrdrOralDietNutrientAmntUnt("]");}


		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Sys ********************************************************************************/
		if(nutritionorderoraldietnutrienti == 0) {n.addNtritnOrdrOralDietNutrientAmntSys("[");}
		if(nutritionorderoraldietnutrientamount.hasSystem()) {

			n.addNtritnOrdrOralDietNutrientAmntSys(String.valueOf(nutritionorderoraldietnutrientamount.getSystem()));
		} else {
			n.addNtritnOrdrOralDietNutrientAmntSys("NULL");
		}

		if(nutritionorderoraldietnutrienti == nutritionorderoraldietnutrientlist.size()-1) {n.addNtritnOrdrOralDietNutrientAmntSys("]");}


		 };
		/******************** nutritionordersupplement ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent> nutritionordersupplementlist = nutritionorder.getSupplement();
		for(int nutritionordersupplementi = 0; nutritionordersupplementi<nutritionordersupplementlist.size();nutritionordersupplementi++ ) {
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent  nutritionordersupplement = nutritionordersupplementlist.get(nutritionordersupplementi);

		/******************** nutritionordersupplementtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionordersupplementtype = nutritionordersupplement.getType();

		/******************** NtritnOrdr_Supplement_Typ_Txt ********************************************************************************/
		if(nutritionordersupplementi == 0) {n.addNtritnOrdrSupplementTypTxt("[");}
		if(nutritionordersupplementtype.hasText()) {

			n.addNtritnOrdrSupplementTypTxt(String.valueOf(nutritionordersupplementtype.getText()));
		} else {
			n.addNtritnOrdrSupplementTypTxt("NULL");
		}

		if(nutritionordersupplementi == nutritionordersupplementlist.size()-1) {n.addNtritnOrdrSupplementTypTxt("]");}


		/******************** nutritionordersupplementtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionordersupplementtypecodinglist = nutritionordersupplementtype.getCoding();
		for(int nutritionordersupplementtypecodingi = 0; nutritionordersupplementtypecodingi<nutritionordersupplementtypecodinglist.size();nutritionordersupplementtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionordersupplementtypecoding = nutritionordersupplementtypecodinglist.get(nutritionordersupplementtypecodingi);

		/******************** NtritnOrdr_Supplement_Typ_Cdg_Dsply ********************************************************************************/
		if(nutritionordersupplementtypecodingi == 0) {n.addNtritnOrdrSupplementTypCdgDsply("[[");}
		if(nutritionordersupplementtypecoding.hasDisplay()) {

			n.addNtritnOrdrSupplementTypCdgDsply(String.valueOf(nutritionordersupplementtypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrSupplementTypCdgDsply("NULL");
		}

		if(nutritionordersupplementtypecodingi == nutritionordersupplementtypecodinglist.size()-1) {n.addNtritnOrdrSupplementTypCdgDsply("]]");}


		/******************** NtritnOrdr_Supplement_Typ_Cdg_Vrsn ********************************************************************************/
		if(nutritionordersupplementtypecodingi == 0) {n.addNtritnOrdrSupplementTypCdgVrsn("[[");}
		if(nutritionordersupplementtypecoding.hasVersion()) {

			n.addNtritnOrdrSupplementTypCdgVrsn(String.valueOf(nutritionordersupplementtypecoding.getVersion()));
		} else {
			n.addNtritnOrdrSupplementTypCdgVrsn("NULL");
		}

		if(nutritionordersupplementtypecodingi == nutritionordersupplementtypecodinglist.size()-1) {n.addNtritnOrdrSupplementTypCdgVrsn("]]");}


		/******************** NtritnOrdr_Supplement_Typ_Cdg_Cd ********************************************************************************/
		if(nutritionordersupplementtypecodingi == 0) {n.addNtritnOrdrSupplementTypCdgCd("[[");}
		if(nutritionordersupplementtypecoding.hasCode()) {

			n.addNtritnOrdrSupplementTypCdgCd(String.valueOf(nutritionordersupplementtypecoding.getCode()));
		} else {
			n.addNtritnOrdrSupplementTypCdgCd("NULL");
		}

		if(nutritionordersupplementtypecodingi == nutritionordersupplementtypecodinglist.size()-1) {n.addNtritnOrdrSupplementTypCdgCd("]]");}


		/******************** NtritnOrdr_Supplement_Typ_Cdg_UsrSltd ********************************************************************************/
		if(nutritionordersupplementtypecodingi == 0) {n.addNtritnOrdrSupplementTypCdgUsrSltd("[[");}
		if(nutritionordersupplementtypecoding.hasUserSelected()) {

			n.addNtritnOrdrSupplementTypCdgUsrSltd(String.valueOf(nutritionordersupplementtypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrSupplementTypCdgUsrSltd("NULL");
		}

		if(nutritionordersupplementtypecodingi == nutritionordersupplementtypecodinglist.size()-1) {n.addNtritnOrdrSupplementTypCdgUsrSltd("]]");}


		/******************** NtritnOrdr_Supplement_Typ_Cdg_Sys ********************************************************************************/
		if(nutritionordersupplementtypecodingi == 0) {n.addNtritnOrdrSupplementTypCdgSys("[[");}
		if(nutritionordersupplementtypecoding.hasSystem()) {

			n.addNtritnOrdrSupplementTypCdgSys(String.valueOf(nutritionordersupplementtypecoding.getSystem()));
		} else {
			n.addNtritnOrdrSupplementTypCdgSys("NULL");
		}

		if(nutritionordersupplementtypecodingi == nutritionordersupplementtypecodinglist.size()-1) {n.addNtritnOrdrSupplementTypCdgSys("]]");}


		 };
		/******************** nutritionordersupplementschedule ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Timing> nutritionordersupplementschedulelist = nutritionordersupplement.getSchedule();
		for(int nutritionordersupplementschedulei = 0; nutritionordersupplementschedulei<nutritionordersupplementschedulelist.size();nutritionordersupplementschedulei++ ) {
		org.hl7.fhir.r4.model.Timing  nutritionordersupplementschedule = nutritionordersupplementschedulelist.get(nutritionordersupplementschedulei);

		/******************** nutritionordersupplementschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionordersupplementschedulecode = nutritionordersupplementschedule.getCode();

		/******************** NtritnOrdr_Supplement_Schdl_Cd_Txt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlCdTxt("[[");}
		if(nutritionordersupplementschedulecode.hasText()) {

			n.addNtritnOrdrSupplementSchdlCdTxt(String.valueOf(nutritionordersupplementschedulecode.getText()));
		} else {
			n.addNtritnOrdrSupplementSchdlCdTxt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlCdTxt("]]");}


		/******************** nutritionordersupplementschedulecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionordersupplementschedulecodecodinglist = nutritionordersupplementschedulecode.getCoding();
		for(int nutritionordersupplementschedulecodecodingi = 0; nutritionordersupplementschedulecodecodingi<nutritionordersupplementschedulecodecodinglist.size();nutritionordersupplementschedulecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionordersupplementschedulecodecoding = nutritionordersupplementschedulecodecodinglist.get(nutritionordersupplementschedulecodecodingi);

		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(nutritionordersupplementschedulecodecodingi == 0) {n.addNtritnOrdrSupplementSchdlCdCdgDsply("[[[");}
		if(nutritionordersupplementschedulecodecoding.hasDisplay()) {

			n.addNtritnOrdrSupplementSchdlCdCdgDsply(String.valueOf(nutritionordersupplementschedulecodecoding.getDisplay()));
		} else {
			n.addNtritnOrdrSupplementSchdlCdCdgDsply("NULL");
		}

		if(nutritionordersupplementschedulecodecodingi == nutritionordersupplementschedulecodecodinglist.size()-1) {n.addNtritnOrdrSupplementSchdlCdCdgDsply("]]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(nutritionordersupplementschedulecodecodingi == 0) {n.addNtritnOrdrSupplementSchdlCdCdgVrsn("[[[");}
		if(nutritionordersupplementschedulecodecoding.hasVersion()) {

			n.addNtritnOrdrSupplementSchdlCdCdgVrsn(String.valueOf(nutritionordersupplementschedulecodecoding.getVersion()));
		} else {
			n.addNtritnOrdrSupplementSchdlCdCdgVrsn("NULL");
		}

		if(nutritionordersupplementschedulecodecodingi == nutritionordersupplementschedulecodecodinglist.size()-1) {n.addNtritnOrdrSupplementSchdlCdCdgVrsn("]]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(nutritionordersupplementschedulecodecodingi == 0) {n.addNtritnOrdrSupplementSchdlCdCdgCd("[[[");}
		if(nutritionordersupplementschedulecodecoding.hasCode()) {

			n.addNtritnOrdrSupplementSchdlCdCdgCd(String.valueOf(nutritionordersupplementschedulecodecoding.getCode()));
		} else {
			n.addNtritnOrdrSupplementSchdlCdCdgCd("NULL");
		}

		if(nutritionordersupplementschedulecodecodingi == nutritionordersupplementschedulecodecodinglist.size()-1) {n.addNtritnOrdrSupplementSchdlCdCdgCd("]]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(nutritionordersupplementschedulecodecodingi == 0) {n.addNtritnOrdrSupplementSchdlCdCdgUsrSltd("[[[");}
		if(nutritionordersupplementschedulecodecoding.hasUserSelected()) {

			n.addNtritnOrdrSupplementSchdlCdCdgUsrSltd(String.valueOf(nutritionordersupplementschedulecodecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrSupplementSchdlCdCdgUsrSltd("NULL");
		}

		if(nutritionordersupplementschedulecodecodingi == nutritionordersupplementschedulecodecodinglist.size()-1) {n.addNtritnOrdrSupplementSchdlCdCdgUsrSltd("]]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(nutritionordersupplementschedulecodecodingi == 0) {n.addNtritnOrdrSupplementSchdlCdCdgSys("[[[");}
		if(nutritionordersupplementschedulecodecoding.hasSystem()) {

			n.addNtritnOrdrSupplementSchdlCdCdgSys(String.valueOf(nutritionordersupplementschedulecodecoding.getSystem()));
		} else {
			n.addNtritnOrdrSupplementSchdlCdCdgSys("NULL");
		}

		if(nutritionordersupplementschedulecodecodingi == nutritionordersupplementschedulecodecodinglist.size()-1) {n.addNtritnOrdrSupplementSchdlCdCdgSys("]]]");}


		 };
		/******************** NtritnOrdr_Supplement_Schdl_Evnt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlEvnt("[[");}
		if(nutritionordersupplementschedule.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<nutritionordersupplementschedule.getEvent().size(); incr++) {
				array = array + nutritionordersupplementschedule.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrSupplementSchdlEvnt(array);

		} else {
			n.addNtritnOrdrSupplementSchdlEvnt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlEvnt("]]");}


		/******************** nutritionordersupplementschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionordersupplementschedulerepeat = nutritionordersupplementschedule.getRepeat();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Off ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptOff("[[");}
		if(nutritionordersupplementschedulerepeat.hasOffset()) {

			n.addNtritnOrdrSupplementSchdlRptOff(String.valueOf(nutritionordersupplementschedulerepeat.getOffset()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptOff("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptOff("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Cnt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptCnt("[[");}
		if(nutritionordersupplementschedulerepeat.hasCount()) {

			n.addNtritnOrdrSupplementSchdlRptCnt(String.valueOf(nutritionordersupplementschedulerepeat.getCount()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptCnt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptCnt("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Prd ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptPrd("[[");}
		if(nutritionordersupplementschedulerepeat.hasPeriod()) {

			n.addNtritnOrdrSupplementSchdlRptPrd(String.valueOf(nutritionordersupplementschedulerepeat.getPeriod()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptPrd("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptPrd("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_CntMx ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptCntMx("[[");}
		if(nutritionordersupplementschedulerepeat.hasCountMax()) {

			n.addNtritnOrdrSupplementSchdlRptCntMx(String.valueOf(nutritionordersupplementschedulerepeat.getCountMax()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptCntMx("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptCntMx("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_DurationMx ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptDurationMx("[[");}
		if(nutritionordersupplementschedulerepeat.hasDurationMax()) {

			n.addNtritnOrdrSupplementSchdlRptDurationMx(String.valueOf(nutritionordersupplementschedulerepeat.getDurationMax()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptDurationMx("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptDurationMx("]]");}


		/******************** nutritionordersupplementschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionordersupplementschedulerepeatboundsperiod = nutritionordersupplementschedulerepeat.getBoundsPeriod();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsPrdStrt("[[");}
		if(nutritionordersupplementschedulerepeatboundsperiod.hasStart()) {

			n.addNtritnOrdrSupplementSchdlRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionordersupplementschedulerepeatboundsperiod.getStart())+"\"");
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsPrdStrt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsPrdStrt("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsPrdEnd("[[");}
		if(nutritionordersupplementschedulerepeatboundsperiod.hasEnd()) {

			n.addNtritnOrdrSupplementSchdlRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionordersupplementschedulerepeatboundsperiod.getEnd())+"\"");
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsPrdEnd("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsPrdEnd("]]");}


		/******************** nutritionordersupplementschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionordersupplementschedulerepeatdurationunit = nutritionordersupplementschedulerepeat.getDurationUnit();
		if(nutritionordersupplementschedulerepeatdurationunit!=null) {
		if(nutritionordersupplementschedulei == 0) {

		n.addNtritnOrdrSupplementSchdlRptDurationUnt("[[");		}
			n.addNtritnOrdrSupplementSchdlRptDurationUnt(nutritionordersupplementschedulerepeatdurationunit.toCode());
		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {

		n.addNtritnOrdrSupplementSchdlRptDurationUnt("]]");		}

		} else {
			n.addNtritnOrdrSupplementSchdlRptDurationUnt("NULL");
		}

		/******************** nutritionordersupplementschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionordersupplementschedulerepeatboundsduration = nutritionordersupplementschedulerepeat.getBoundsDuration();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsDurationVl("[[");}
		if(nutritionordersupplementschedulerepeatboundsduration.hasValue()) {

			n.addNtritnOrdrSupplementSchdlRptBndsDurationVl(String.valueOf(nutritionordersupplementschedulerepeatboundsduration.getValue()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsDurationVl("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsDurationVl("]]");}


		/******************** nutritionordersupplementschedulerepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementschedulerepeatboundsdurationcomparator = nutritionordersupplementschedulerepeatboundsduration.getComparator();
		if(nutritionordersupplementschedulerepeatboundsdurationcomparator!=null) {
		if(nutritionordersupplementschedulei == 0) {

		n.addNtritnOrdrSupplementSchdlRptBndsDurationCmprtr("[[");		}
			n.addNtritnOrdrSupplementSchdlRptBndsDurationCmprtr(nutritionordersupplementschedulerepeatboundsdurationcomparator.toCode());
		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {

		n.addNtritnOrdrSupplementSchdlRptBndsDurationCmprtr("]]");		}

		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsDurationCmprtr("NULL");
		}

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsDurationCd("[[");}
		if(nutritionordersupplementschedulerepeatboundsduration.hasCode()) {

			n.addNtritnOrdrSupplementSchdlRptBndsDurationCd(String.valueOf(nutritionordersupplementschedulerepeatboundsduration.getCode()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsDurationCd("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsDurationCd("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsDurationUnt("[[");}
		if(nutritionordersupplementschedulerepeatboundsduration.hasUnit()) {

			n.addNtritnOrdrSupplementSchdlRptBndsDurationUnt(String.valueOf(nutritionordersupplementschedulerepeatboundsduration.getUnit()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsDurationUnt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsDurationUnt("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsDurationSys("[[");}
		if(nutritionordersupplementschedulerepeatboundsduration.hasSystem()) {

			n.addNtritnOrdrSupplementSchdlRptBndsDurationSys(String.valueOf(nutritionordersupplementschedulerepeatboundsduration.getSystem()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsDurationSys("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsDurationSys("]]");}


		/******************** nutritionordersupplementschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionordersupplementschedulerepeatboundsrange = nutritionordersupplementschedulerepeat.getBoundsRange();

		/******************** nutritionordersupplementschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementschedulerepeatboundsrangelow = nutritionordersupplementschedulerepeatboundsrange.getLow();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwVl("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasValue()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngLwVl(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getValue()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngLwVl("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwVl("]]");}


		/******************** nutritionordersupplementschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementschedulerepeatboundsrangelowcomparator = nutritionordersupplementschedulerepeatboundsrangelow.getComparator();
		if(nutritionordersupplementschedulerepeatboundsrangelowcomparator!=null) {
		if(nutritionordersupplementschedulei == 0) {

		n.addNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr("[[");		}
			n.addNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr(nutritionordersupplementschedulerepeatboundsrangelowcomparator.toCode());
		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {

		n.addNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr("]]");		}

		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr("NULL");
		}

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwCd("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasCode()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngLwCd(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getCode()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngLwCd("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwCd("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwUnt("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasUnit()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngLwUnt(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getUnit()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngLwUnt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwUnt("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwSys("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasSystem()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngLwSys(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getSystem()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngLwSys("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngLwSys("]]");}


		/******************** nutritionordersupplementschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementschedulerepeatboundsrangehigh = nutritionordersupplementschedulerepeatboundsrange.getHigh();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiVl("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasValue()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngHiVl(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getValue()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngHiVl("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiVl("]]");}


		/******************** nutritionordersupplementschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementschedulerepeatboundsrangehighcomparator = nutritionordersupplementschedulerepeatboundsrangehigh.getComparator();
		if(nutritionordersupplementschedulerepeatboundsrangehighcomparator!=null) {
		if(nutritionordersupplementschedulei == 0) {

		n.addNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr("[[");		}
			n.addNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr(nutritionordersupplementschedulerepeatboundsrangehighcomparator.toCode());
		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {

		n.addNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr("]]");		}

		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr("NULL");
		}

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiCd("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasCode()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngHiCd(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getCode()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngHiCd("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiCd("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiUnt("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasUnit()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngHiUnt(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getUnit()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngHiUnt("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiUnt("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiSys("[[");}
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasSystem()) {

			n.addNtritnOrdrSupplementSchdlRptBndsRngHiSys(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getSystem()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptBndsRngHiSys("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptBndsRngHiSys("]]");}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(nutritionordersupplementschedulei == 0) {n.addNtritnOrdrSupplementSchdlRptFrqncyMx("[[");}
		if(nutritionordersupplementschedulerepeat.hasFrequencyMax()) {

			n.addNtritnOrdrSupplementSchdlRptFrqncyMx(String.valueOf(nutritionordersupplementschedulerepeat.getFrequencyMax()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptFrqncyMx("NULL");
		}

		if(nutritionordersupplementschedulei == nutritionordersupplementschedulelist.size()-1) {n.addNtritnOrdrSupplementSchdlRptFrqncyMx("]]");}


		/******************** nutritionordersupplementschedulerepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> nutritionordersupplementschedulerepeatwhenlist = nutritionordersupplementschedulerepeat.getWhen();
		for(int nutritionordersupplementschedulerepeatwheni = 0; nutritionordersupplementschedulerepeatwheni<nutritionordersupplementschedulerepeatwhenlist.size();nutritionordersupplementschedulerepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  nutritionordersupplementschedulerepeatwhen = nutritionordersupplementschedulerepeatwhenlist.get(nutritionordersupplementschedulerepeatwheni);
		if(nutritionordersupplementschedulerepeatwhen!=null) {
			n.addNtritnOrdrSupplementSchdlRptWhen(nutritionordersupplementschedulerepeatwhen.getCode());
		} else {
			n.addNtritnOrdrSupplementSchdlRptWhen("NULL");
		}
		 };

		/******************** nutritionordersupplementschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionordersupplementschedulerepeatperiodunit = nutritionordersupplementschedulerepeat.getPeriodUnit();
		if(nutritionordersupplementschedulerepeatperiodunit!=null) {
			n.addNtritnOrdrSupplementSchdlRptPrdUnt(nutritionordersupplementschedulerepeatperiodunit.toCode());
		} else {
			n.addNtritnOrdrSupplementSchdlRptPrdUnt("NULL");
		}

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_PrdMx ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasPeriodMax()) {

			n.addNtritnOrdrSupplementSchdlRptPrdMx(String.valueOf(nutritionordersupplementschedulerepeat.getPeriodMax()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptPrdMx("NULL");
		}


		/******************** nutritionordersupplementschedulerepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> nutritionordersupplementschedulerepeatdayofweeklist = nutritionordersupplementschedulerepeat.getDayOfWeek();
		for(int nutritionordersupplementschedulerepeatdayofweeki = 0; nutritionordersupplementschedulerepeatdayofweeki<nutritionordersupplementschedulerepeatdayofweeklist.size();nutritionordersupplementschedulerepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  nutritionordersupplementschedulerepeatdayofweek = nutritionordersupplementschedulerepeatdayofweeklist.get(nutritionordersupplementschedulerepeatdayofweeki);
		if(nutritionordersupplementschedulerepeatdayofweek!=null) {
			n.addNtritnOrdrSupplementSchdlRptDayOfWeek(nutritionordersupplementschedulerepeatdayofweek.getCode());
		} else {
			n.addNtritnOrdrSupplementSchdlRptDayOfWeek("NULL");
		}
		 };

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<nutritionordersupplementschedulerepeat.getTimeOfDay().size(); incr++) {
				array = array + nutritionordersupplementschedulerepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrSupplementSchdlRptTimeOfDay(array);

		} else {
			n.addNtritnOrdrSupplementSchdlRptTimeOfDay("NULL");
		}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Duration ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasDuration()) {

			n.addNtritnOrdrSupplementSchdlRptDuration(String.valueOf(nutritionordersupplementschedulerepeat.getDuration()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptDuration("NULL");
		}


		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Frqncy ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasFrequency()) {

			n.addNtritnOrdrSupplementSchdlRptFrqncy(String.valueOf(nutritionordersupplementschedulerepeat.getFrequency()));
		} else {
			n.addNtritnOrdrSupplementSchdlRptFrqncy("NULL");
		}


		 };
		/******************** NtritnOrdr_Supplement_Instrctn ********************************************************************************/
		if(nutritionordersupplement.hasInstruction()) {

			n.addNtritnOrdrSupplementInstrctn(String.valueOf(nutritionordersupplement.getInstruction()));
		} else {
			n.addNtritnOrdrSupplementInstrctn("NULL");
		}


		/******************** NtritnOrdr_Supplement_PrdctNm ********************************************************************************/
		if(nutritionordersupplement.hasProductName()) {

			n.addNtritnOrdrSupplementPrdctNm(String.valueOf(nutritionordersupplement.getProductName()));
		} else {
			n.addNtritnOrdrSupplementPrdctNm("NULL");
		}


		/******************** nutritionordersupplementquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementquantity = nutritionordersupplement.getQuantity();

		/******************** NtritnOrdr_Supplement_Qnty_Vl ********************************************************************************/
		if(nutritionordersupplementquantity.hasValue()) {

			n.addNtritnOrdrSupplementQntyVl(String.valueOf(nutritionordersupplementquantity.getValue()));
		} else {
			n.addNtritnOrdrSupplementQntyVl("NULL");
		}


		/******************** nutritionordersupplementquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementquantitycomparator = nutritionordersupplementquantity.getComparator();
		if(nutritionordersupplementquantitycomparator!=null) {
			n.addNtritnOrdrSupplementQntyCmprtr(nutritionordersupplementquantitycomparator.toCode());
		} else {
			n.addNtritnOrdrSupplementQntyCmprtr("NULL");
		}

		/******************** NtritnOrdr_Supplement_Qnty_Cd ********************************************************************************/
		if(nutritionordersupplementquantity.hasCode()) {

			n.addNtritnOrdrSupplementQntyCd(String.valueOf(nutritionordersupplementquantity.getCode()));
		} else {
			n.addNtritnOrdrSupplementQntyCd("NULL");
		}


		/******************** NtritnOrdr_Supplement_Qnty_Unt ********************************************************************************/
		if(nutritionordersupplementquantity.hasUnit()) {

			n.addNtritnOrdrSupplementQntyUnt(String.valueOf(nutritionordersupplementquantity.getUnit()));
		} else {
			n.addNtritnOrdrSupplementQntyUnt("NULL");
		}


		/******************** NtritnOrdr_Supplement_Qnty_Sys ********************************************************************************/
		if(nutritionordersupplementquantity.hasSystem()) {

			n.addNtritnOrdrSupplementQntySys(String.valueOf(nutritionordersupplementquantity.getSystem()));
		} else {
			n.addNtritnOrdrSupplementQntySys("NULL");
		}


		 };
		/******************** nutritionorderenteralformula ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent nutritionorderenteralformula = nutritionorder.getEnteralFormula();

		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaPrdctNm ********************************************************************************/
		if(nutritionorderenteralformula.hasBaseFormulaProductName()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm(String.valueOf(nutritionorderenteralformula.getBaseFormulaProductName()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm("NULL");
		}


		/******************** nutritionorderenteralformularouteofadministration ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformularouteofadministration = nutritionorderenteralformula.getRouteofAdministration();

		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Txt ********************************************************************************/
		if(nutritionorderenteralformularouteofadministration.hasText()) {

			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt(String.valueOf(nutritionorderenteralformularouteofadministration.getText()));
		} else {
			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt("NULL");
		}


		/******************** nutritionorderenteralformularouteofadministrationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderenteralformularouteofadministrationcodinglist = nutritionorderenteralformularouteofadministration.getCoding();
		for(int nutritionorderenteralformularouteofadministrationcodingi = 0; nutritionorderenteralformularouteofadministrationcodingi<nutritionorderenteralformularouteofadministrationcodinglist.size();nutritionorderenteralformularouteofadministrationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderenteralformularouteofadministrationcoding = nutritionorderenteralformularouteofadministrationcodinglist.get(nutritionorderenteralformularouteofadministrationcodingi);

		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcodingi == 0) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply("[");}
		if(nutritionorderenteralformularouteofadministrationcoding.hasDisplay()) {

			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getDisplay()));
		} else {
			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply("NULL");
		}

		if(nutritionorderenteralformularouteofadministrationcodingi == nutritionorderenteralformularouteofadministrationcodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply("]");}


		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcodingi == 0) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn("[");}
		if(nutritionorderenteralformularouteofadministrationcoding.hasVersion()) {

			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getVersion()));
		} else {
			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn("NULL");
		}

		if(nutritionorderenteralformularouteofadministrationcodingi == nutritionorderenteralformularouteofadministrationcodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn("]");}


		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcodingi == 0) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd("[");}
		if(nutritionorderenteralformularouteofadministrationcoding.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd("NULL");
		}

		if(nutritionorderenteralformularouteofadministrationcodingi == nutritionorderenteralformularouteofadministrationcodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcodingi == 0) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd("[");}
		if(nutritionorderenteralformularouteofadministrationcoding.hasUserSelected()) {

			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getUserSelected()));
		} else {
			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd("NULL");
		}

		if(nutritionorderenteralformularouteofadministrationcodingi == nutritionorderenteralformularouteofadministrationcodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd("]");}


		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcodingi == 0) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys("[");}
		if(nutritionorderenteralformularouteofadministrationcoding.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys("NULL");
		}

		if(nutritionorderenteralformularouteofadministrationcodingi == nutritionorderenteralformularouteofadministrationcodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys("]");}


		 };
		/******************** NtritnOrdr_EnteralFrmula_AdmnstnInstrctn ********************************************************************************/
		if(nutritionorderenteralformula.hasAdministrationInstruction()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnInstrctn(String.valueOf(nutritionorderenteralformula.getAdministrationInstruction()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnInstrctn("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_AddtvPrdctNm ********************************************************************************/
		if(nutritionorderenteralformula.hasAdditiveProductName()) {

			n.addNtritnOrdrEnteralFrmulaAddtvPrdctNm(String.valueOf(nutritionorderenteralformula.getAdditiveProductName()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvPrdctNm("NULL");
		}


		/******************** nutritionorderenteralformulamaxvolumetodeliver ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulamaxvolumetodeliver = nutritionorderenteralformula.getMaxVolumeToDeliver();

		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Vl ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl("NULL");
		}


		/******************** nutritionorderenteralformulamaxvolumetodelivercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulamaxvolumetodelivercomparator = nutritionorderenteralformulamaxvolumetodeliver.getComparator();
		if(nutritionorderenteralformulamaxvolumetodelivercomparator!=null) {
			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr(nutritionorderenteralformulamaxvolumetodelivercomparator.toCode());
		} else {
			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cd ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Unt ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Sys ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys("NULL");
		}


		/******************** nutritionorderenteralformulaadministration ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent> nutritionorderenteralformulaadministrationlist = nutritionorderenteralformula.getAdministration();
		for(int nutritionorderenteralformulaadministrationi = 0; nutritionorderenteralformulaadministrationi<nutritionorderenteralformulaadministrationlist.size();nutritionorderenteralformulaadministrationi++ ) {
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent  nutritionorderenteralformulaadministration = nutritionorderenteralformulaadministrationlist.get(nutritionorderenteralformulaadministrationi);

		/******************** nutritionorderenteralformulaadministrationratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationratequantity = nutritionorderenteralformulaadministration.getRateQuantity();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl("[");}
		if(nutritionorderenteralformulaadministrationratequantity.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl("]");}


		/******************** nutritionorderenteralformulaadministrationratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationratequantitycomparator = nutritionorderenteralformulaadministrationratequantity.getComparator();
		if(nutritionorderenteralformulaadministrationratequantitycomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr(nutritionorderenteralformulaadministrationratequantitycomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd("[");}
		if(nutritionorderenteralformulaadministrationratequantity.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt("[");}
		if(nutritionorderenteralformulaadministrationratequantity.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntySys("[");}
		if(nutritionorderenteralformulaadministrationratequantity.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntySys(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntySys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtQntySys("]");}


		/******************** nutritionorderenteralformulaadministrationrateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio nutritionorderenteralformulaadministrationrateratio = nutritionorderenteralformulaadministration.getRateRatio();

		/******************** nutritionorderenteralformulaadministrationraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationraterationumerator = nutritionorderenteralformulaadministrationrateratio.getNumerator();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl("[");}
		if(nutritionorderenteralformulaadministrationraterationumerator.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl("]");}


		/******************** nutritionorderenteralformulaadministrationraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationraterationumeratorcomparator = nutritionorderenteralformulaadministrationraterationumerator.getComparator();
		if(nutritionorderenteralformulaadministrationraterationumeratorcomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr(nutritionorderenteralformulaadministrationraterationumeratorcomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd("[");}
		if(nutritionorderenteralformulaadministrationraterationumerator.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt("[");}
		if(nutritionorderenteralformulaadministrationraterationumerator.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys("[");}
		if(nutritionorderenteralformulaadministrationraterationumerator.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys("]");}


		/******************** nutritionorderenteralformulaadministrationrateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationrateratiodenominator = nutritionorderenteralformulaadministrationrateratio.getDenominator();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl("[");}
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl("]");}


		/******************** nutritionorderenteralformulaadministrationrateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationrateratiodenominatorcomparator = nutritionorderenteralformulaadministrationrateratiodenominator.getComparator();
		if(nutritionorderenteralformulaadministrationrateratiodenominatorcomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr(nutritionorderenteralformulaadministrationrateratiodenominatorcomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd("[");}
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt("[");}
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys("[");}
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys("]");}


		/******************** nutritionorderenteralformulaadministrationschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionorderenteralformulaadministrationschedule = nutritionorderenteralformulaadministration.getSchedule();

		/******************** nutritionorderenteralformulaadministrationschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulaadministrationschedulecode = nutritionorderenteralformulaadministrationschedule.getCode();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Txt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt("[");}
		if(nutritionorderenteralformulaadministrationschedulecode.hasText()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt(String.valueOf(nutritionorderenteralformulaadministrationschedulecode.getText()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt("]");}


		/******************** nutritionorderenteralformulaadministrationschedulecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderenteralformulaadministrationschedulecodecodinglist = nutritionorderenteralformulaadministrationschedulecode.getCoding();
		for(int nutritionorderenteralformulaadministrationschedulecodecodingi = 0; nutritionorderenteralformulaadministrationschedulecodecodingi<nutritionorderenteralformulaadministrationschedulecodecodinglist.size();nutritionorderenteralformulaadministrationschedulecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderenteralformulaadministrationschedulecodecoding = nutritionorderenteralformulaadministrationschedulecodecodinglist.get(nutritionorderenteralformulaadministrationschedulecodecodingi);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply("[[");}
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasDisplay()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getDisplay()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply("NULL");
		}

		if(nutritionorderenteralformulaadministrationschedulecodecodingi == nutritionorderenteralformulaadministrationschedulecodecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply("]]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn("[[");}
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasVersion()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getVersion()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn("NULL");
		}

		if(nutritionorderenteralformulaadministrationschedulecodecodingi == nutritionorderenteralformulaadministrationschedulecodecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn("]]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd("[[");}
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationschedulecodecodingi == nutritionorderenteralformulaadministrationschedulecodecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd("]]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd("[[");}
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasUserSelected()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd("NULL");
		}

		if(nutritionorderenteralformulaadministrationschedulecodecodingi == nutritionorderenteralformulaadministrationschedulecodecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd("]]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys("[[");}
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys("NULL");
		}

		if(nutritionorderenteralformulaadministrationschedulecodecodingi == nutritionorderenteralformulaadministrationschedulecodecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys("]]");}


		 };
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evnt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt("[");}
		if(nutritionorderenteralformulaadministrationschedule.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorderenteralformulaadministrationschedule.getEvent().size(); incr++) {
				array = array + nutritionorderenteralformulaadministrationschedule.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt(array);

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionorderenteralformulaadministrationschedulerepeat = nutritionorderenteralformulaadministrationschedule.getRepeat();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Off ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasOffset()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getOffset()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Cnt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasCount()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getCount()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Prd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasPeriod()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getPeriod()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_CntMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasCountMax()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getCountMax()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasDurationMax()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getDurationMax()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderenteralformulaadministrationschedulerepeatboundsperiod = nutritionorderenteralformulaadministrationschedulerepeat.getBoundsPeriod();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.hasStart()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.getStart())+"\"");
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.hasEnd()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.getEnd())+"\"");
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderenteralformulaadministrationschedulerepeatdurationunit = nutritionorderenteralformulaadministrationschedulerepeat.getDurationUnit();
		if(nutritionorderenteralformulaadministrationschedulerepeatdurationunit!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt(nutritionorderenteralformulaadministrationschedulerepeatdurationunit.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt("NULL");
		}

		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionorderenteralformulaadministrationschedulerepeatboundsduration = nutritionorderenteralformulaadministrationschedulerepeat.getBoundsDuration();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator = nutritionorderenteralformulaadministrationschedulerepeatboundsduration.getComparator();
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr(nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsduration.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionorderenteralformulaadministrationschedulerepeatboundsrange = nutritionorderenteralformulaadministrationschedulerepeat.getBoundsRange();

		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow = nutritionorderenteralformulaadministrationschedulerepeatboundsrange.getLow();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator = nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getComparator();
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh = nutritionorderenteralformulaadministrationschedulerepeatboundsrange.getHigh();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator = nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getComparator();
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx("[");}
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasFrequencyMax()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getFrequencyMax()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx("]");}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> nutritionorderenteralformulaadministrationschedulerepeatwhenlist = nutritionorderenteralformulaadministrationschedulerepeat.getWhen();
		for(int nutritionorderenteralformulaadministrationschedulerepeatwheni = 0; nutritionorderenteralformulaadministrationschedulerepeatwheni<nutritionorderenteralformulaadministrationschedulerepeatwhenlist.size();nutritionorderenteralformulaadministrationschedulerepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  nutritionorderenteralformulaadministrationschedulerepeatwhen = nutritionorderenteralformulaadministrationschedulerepeatwhenlist.get(nutritionorderenteralformulaadministrationschedulerepeatwheni);
		if(nutritionorderenteralformulaadministrationschedulerepeatwhen!=null) {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptWhen(nutritionorderenteralformulaadministrationschedulerepeatwhen.getCode());
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptWhen("NULL");
		}
		 };

		/******************** nutritionorderenteralformulaadministrationschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderenteralformulaadministrationschedulerepeatperiodunit = nutritionorderenteralformulaadministrationschedulerepeat.getPeriodUnit();
		if(nutritionorderenteralformulaadministrationschedulerepeatperiodunit!=null) {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdUnt(nutritionorderenteralformulaadministrationschedulerepeatperiodunit.toCode());
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdUnt("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasPeriodMax()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getPeriodMax()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx("NULL");
		}


		/******************** nutritionorderenteralformulaadministrationschedulerepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> nutritionorderenteralformulaadministrationschedulerepeatdayofweeklist = nutritionorderenteralformulaadministrationschedulerepeat.getDayOfWeek();
		for(int nutritionorderenteralformulaadministrationschedulerepeatdayofweeki = 0; nutritionorderenteralformulaadministrationschedulerepeatdayofweeki<nutritionorderenteralformulaadministrationschedulerepeatdayofweeklist.size();nutritionorderenteralformulaadministrationschedulerepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  nutritionorderenteralformulaadministrationschedulerepeatdayofweek = nutritionorderenteralformulaadministrationschedulerepeatdayofweeklist.get(nutritionorderenteralformulaadministrationschedulerepeatdayofweeki);
		if(nutritionorderenteralformulaadministrationschedulerepeatdayofweek!=null) {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDayOfWeek(nutritionorderenteralformulaadministrationschedulerepeatdayofweek.getCode());
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDayOfWeek("NULL");
		}
		 };

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorderenteralformulaadministrationschedulerepeat.getTimeOfDay().size(); incr++) {
				array = array + nutritionorderenteralformulaadministrationschedulerepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptTimeOfDay(array);

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptTimeOfDay("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Duration ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasDuration()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getDuration()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Frqncy ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasFrequency()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getFrequency()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy("NULL");
		}


		/******************** nutritionorderenteralformulaadministrationquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationquantity = nutritionorderenteralformulaadministration.getQuantity();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntyVl("[");}
		if(nutritionorderenteralformulaadministrationquantity.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyVl(String.valueOf(nutritionorderenteralformulaadministrationquantity.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyVl("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntyVl("]");}


		/******************** nutritionorderenteralformulaadministrationquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationquantitycomparator = nutritionorderenteralformulaadministrationquantity.getComparator();
		if(nutritionorderenteralformulaadministrationquantitycomparator!=null) {
		if(nutritionorderenteralformulaadministrationi == 0) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr("[");		}
			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr(nutritionorderenteralformulaadministrationquantitycomparator.toCode());
		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {

		n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr("]");		}

		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCd("[");}
		if(nutritionorderenteralformulaadministrationquantity.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCd(String.valueOf(nutritionorderenteralformulaadministrationquantity.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCd("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntyCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntyUnt("[");}
		if(nutritionorderenteralformulaadministrationquantity.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyUnt(String.valueOf(nutritionorderenteralformulaadministrationquantity.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnQntyUnt("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntyUnt("]");}


		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationi == 0) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntySys("[");}
		if(nutritionorderenteralformulaadministrationquantity.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAdmnstnQntySys(String.valueOf(nutritionorderenteralformulaadministrationquantity.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAdmnstnQntySys("NULL");
		}

		if(nutritionorderenteralformulaadministrationi == nutritionorderenteralformulaadministrationlist.size()-1) {n.addNtritnOrdrEnteralFrmulaAdmnstnQntySys("]");}


		 };
		/******************** nutritionorderenteralformulacaloricdensity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulacaloricdensity = nutritionorderenteralformula.getCaloricDensity();

		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Vl ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasValue()) {

			n.addNtritnOrdrEnteralFrmulaCaloricDensityVl(String.valueOf(nutritionorderenteralformulacaloricdensity.getValue()));
		} else {
			n.addNtritnOrdrEnteralFrmulaCaloricDensityVl("NULL");
		}


		/******************** nutritionorderenteralformulacaloricdensitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulacaloricdensitycomparator = nutritionorderenteralformulacaloricdensity.getComparator();
		if(nutritionorderenteralformulacaloricdensitycomparator!=null) {
			n.addNtritnOrdrEnteralFrmulaCaloricDensityCmprtr(nutritionorderenteralformulacaloricdensitycomparator.toCode());
		} else {
			n.addNtritnOrdrEnteralFrmulaCaloricDensityCmprtr("NULL");
		}

		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Cd ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaCaloricDensityCd(String.valueOf(nutritionorderenteralformulacaloricdensity.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaCaloricDensityCd("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Unt ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasUnit()) {

			n.addNtritnOrdrEnteralFrmulaCaloricDensityUnt(String.valueOf(nutritionorderenteralformulacaloricdensity.getUnit()));
		} else {
			n.addNtritnOrdrEnteralFrmulaCaloricDensityUnt("NULL");
		}


		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Sys ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaCaloricDensitySys(String.valueOf(nutritionorderenteralformulacaloricdensity.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaCaloricDensitySys("NULL");
		}


		/******************** nutritionorderenteralformulaadditivetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulaadditivetype = nutritionorderenteralformula.getAdditiveType();

		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Txt ********************************************************************************/
		if(nutritionorderenteralformulaadditivetype.hasText()) {

			n.addNtritnOrdrEnteralFrmulaAddtvTypTxt(String.valueOf(nutritionorderenteralformulaadditivetype.getText()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvTypTxt("NULL");
		}


		/******************** nutritionorderenteralformulaadditivetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderenteralformulaadditivetypecodinglist = nutritionorderenteralformulaadditivetype.getCoding();
		for(int nutritionorderenteralformulaadditivetypecodingi = 0; nutritionorderenteralformulaadditivetypecodingi<nutritionorderenteralformulaadditivetypecodinglist.size();nutritionorderenteralformulaadditivetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderenteralformulaadditivetypecoding = nutritionorderenteralformulaadditivetypecodinglist.get(nutritionorderenteralformulaadditivetypecodingi);

		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgDsply("[");}
		if(nutritionorderenteralformulaadditivetypecoding.hasDisplay()) {

			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgDsply(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgDsply("NULL");
		}

		if(nutritionorderenteralformulaadditivetypecodingi == nutritionorderenteralformulaadditivetypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgDsply("]");}


		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn("[");}
		if(nutritionorderenteralformulaadditivetypecoding.hasVersion()) {

			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getVersion()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn("NULL");
		}

		if(nutritionorderenteralformulaadditivetypecodingi == nutritionorderenteralformulaadditivetypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn("]");}


		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgCd("[");}
		if(nutritionorderenteralformulaadditivetypecoding.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgCd(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgCd("NULL");
		}

		if(nutritionorderenteralformulaadditivetypecodingi == nutritionorderenteralformulaadditivetypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd("[");}
		if(nutritionorderenteralformulaadditivetypecoding.hasUserSelected()) {

			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd("NULL");
		}

		if(nutritionorderenteralformulaadditivetypecodingi == nutritionorderenteralformulaadditivetypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd("]");}


		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgSys("[");}
		if(nutritionorderenteralformulaadditivetypecoding.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgSys(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaAddtvTypCdgSys("NULL");
		}

		if(nutritionorderenteralformulaadditivetypecodingi == nutritionorderenteralformulaadditivetypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaAddtvTypCdgSys("]");}


		 };
		/******************** nutritionorderenteralformulabaseformulatype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulabaseformulatype = nutritionorderenteralformula.getBaseFormulaType();

		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Txt ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatype.hasText()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt(String.valueOf(nutritionorderenteralformulabaseformulatype.getText()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt("NULL");
		}


		/******************** nutritionorderenteralformulabaseformulatypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderenteralformulabaseformulatypecodinglist = nutritionorderenteralformulabaseformulatype.getCoding();
		for(int nutritionorderenteralformulabaseformulatypecodingi = 0; nutritionorderenteralformulabaseformulatypecodingi<nutritionorderenteralformulabaseformulatypecodinglist.size();nutritionorderenteralformulabaseformulatypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderenteralformulabaseformulatypecoding = nutritionorderenteralformulabaseformulatypecodinglist.get(nutritionorderenteralformulabaseformulatypecodingi);

		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply("[");}
		if(nutritionorderenteralformulabaseformulatypecoding.hasDisplay()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getDisplay()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply("NULL");
		}

		if(nutritionorderenteralformulabaseformulatypecodingi == nutritionorderenteralformulabaseformulatypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply("]");}


		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn("[");}
		if(nutritionorderenteralformulabaseformulatypecoding.hasVersion()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getVersion()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn("NULL");
		}

		if(nutritionorderenteralformulabaseformulatypecodingi == nutritionorderenteralformulabaseformulatypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn("]");}


		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd("[");}
		if(nutritionorderenteralformulabaseformulatypecoding.hasCode()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getCode()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd("NULL");
		}

		if(nutritionorderenteralformulabaseformulatypecodingi == nutritionorderenteralformulabaseformulatypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd("]");}


		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd("[");}
		if(nutritionorderenteralformulabaseformulatypecoding.hasUserSelected()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getUserSelected()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd("NULL");
		}

		if(nutritionorderenteralformulabaseformulatypecodingi == nutritionorderenteralformulabaseformulatypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd("]");}


		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecodingi == 0) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys("[");}
		if(nutritionorderenteralformulabaseformulatypecoding.hasSystem()) {

			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getSystem()));
		} else {
			n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys("NULL");
		}

		if(nutritionorderenteralformulabaseformulatypecodingi == nutritionorderenteralformulabaseformulatypecodinglist.size()-1) {n.addNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys("]");}


		 };
		/******************** nutritionorderexcludefoodmodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> nutritionorderexcludefoodmodifierlist = nutritionorder.getExcludeFoodModifier();
		for(int nutritionorderexcludefoodmodifieri = 0; nutritionorderexcludefoodmodifieri<nutritionorderexcludefoodmodifierlist.size();nutritionorderexcludefoodmodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  nutritionorderexcludefoodmodifier = nutritionorderexcludefoodmodifierlist.get(nutritionorderexcludefoodmodifieri);

		/******************** NtritnOrdr_ExcludeFoodMdfr_Txt ********************************************************************************/
		if(nutritionorderexcludefoodmodifieri == 0) {n.addNtritnOrdrExcludeFoodMdfrTxt("[");}
		if(nutritionorderexcludefoodmodifier.hasText()) {

			n.addNtritnOrdrExcludeFoodMdfrTxt(String.valueOf(nutritionorderexcludefoodmodifier.getText()));
		} else {
			n.addNtritnOrdrExcludeFoodMdfrTxt("NULL");
		}

		if(nutritionorderexcludefoodmodifieri == nutritionorderexcludefoodmodifierlist.size()-1) {n.addNtritnOrdrExcludeFoodMdfrTxt("]");}


		/******************** nutritionorderexcludefoodmodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderexcludefoodmodifiercodinglist = nutritionorderexcludefoodmodifier.getCoding();
		for(int nutritionorderexcludefoodmodifiercodingi = 0; nutritionorderexcludefoodmodifiercodingi<nutritionorderexcludefoodmodifiercodinglist.size();nutritionorderexcludefoodmodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderexcludefoodmodifiercoding = nutritionorderexcludefoodmodifiercodinglist.get(nutritionorderexcludefoodmodifiercodingi);

		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercodingi == 0) {n.addNtritnOrdrExcludeFoodMdfrCdgDsply("[[");}
		if(nutritionorderexcludefoodmodifiercoding.hasDisplay()) {

			n.addNtritnOrdrExcludeFoodMdfrCdgDsply(String.valueOf(nutritionorderexcludefoodmodifiercoding.getDisplay()));
		} else {
			n.addNtritnOrdrExcludeFoodMdfrCdgDsply("NULL");
		}

		if(nutritionorderexcludefoodmodifiercodingi == nutritionorderexcludefoodmodifiercodinglist.size()-1) {n.addNtritnOrdrExcludeFoodMdfrCdgDsply("]]");}


		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercodingi == 0) {n.addNtritnOrdrExcludeFoodMdfrCdgVrsn("[[");}
		if(nutritionorderexcludefoodmodifiercoding.hasVersion()) {

			n.addNtritnOrdrExcludeFoodMdfrCdgVrsn(String.valueOf(nutritionorderexcludefoodmodifiercoding.getVersion()));
		} else {
			n.addNtritnOrdrExcludeFoodMdfrCdgVrsn("NULL");
		}

		if(nutritionorderexcludefoodmodifiercodingi == nutritionorderexcludefoodmodifiercodinglist.size()-1) {n.addNtritnOrdrExcludeFoodMdfrCdgVrsn("]]");}


		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercodingi == 0) {n.addNtritnOrdrExcludeFoodMdfrCdgCd("[[");}
		if(nutritionorderexcludefoodmodifiercoding.hasCode()) {

			n.addNtritnOrdrExcludeFoodMdfrCdgCd(String.valueOf(nutritionorderexcludefoodmodifiercoding.getCode()));
		} else {
			n.addNtritnOrdrExcludeFoodMdfrCdgCd("NULL");
		}

		if(nutritionorderexcludefoodmodifiercodingi == nutritionorderexcludefoodmodifiercodinglist.size()-1) {n.addNtritnOrdrExcludeFoodMdfrCdgCd("]]");}


		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercodingi == 0) {n.addNtritnOrdrExcludeFoodMdfrCdgUsrSltd("[[");}
		if(nutritionorderexcludefoodmodifiercoding.hasUserSelected()) {

			n.addNtritnOrdrExcludeFoodMdfrCdgUsrSltd(String.valueOf(nutritionorderexcludefoodmodifiercoding.getUserSelected()));
		} else {
			n.addNtritnOrdrExcludeFoodMdfrCdgUsrSltd("NULL");
		}

		if(nutritionorderexcludefoodmodifiercodingi == nutritionorderexcludefoodmodifiercodinglist.size()-1) {n.addNtritnOrdrExcludeFoodMdfrCdgUsrSltd("]]");}


		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercodingi == 0) {n.addNtritnOrdrExcludeFoodMdfrCdgSys("[[");}
		if(nutritionorderexcludefoodmodifiercoding.hasSystem()) {

			n.addNtritnOrdrExcludeFoodMdfrCdgSys(String.valueOf(nutritionorderexcludefoodmodifiercoding.getSystem()));
		} else {
			n.addNtritnOrdrExcludeFoodMdfrCdgSys("NULL");
		}

		if(nutritionorderexcludefoodmodifiercodingi == nutritionorderexcludefoodmodifiercodinglist.size()-1) {n.addNtritnOrdrExcludeFoodMdfrCdgSys("]]");}


		 };
		 };
		/******************** nutritionorderfoodpreferencemodifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> nutritionorderfoodpreferencemodifierlist = nutritionorder.getFoodPreferenceModifier();
		for(int nutritionorderfoodpreferencemodifieri = 0; nutritionorderfoodpreferencemodifieri<nutritionorderfoodpreferencemodifierlist.size();nutritionorderfoodpreferencemodifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  nutritionorderfoodpreferencemodifier = nutritionorderfoodpreferencemodifierlist.get(nutritionorderfoodpreferencemodifieri);

		/******************** NtritnOrdr_FoodPreferenceMdfr_Txt ********************************************************************************/
		if(nutritionorderfoodpreferencemodifieri == 0) {n.addNtritnOrdrFoodPreferenceMdfrTxt("[");}
		if(nutritionorderfoodpreferencemodifier.hasText()) {

			n.addNtritnOrdrFoodPreferenceMdfrTxt(String.valueOf(nutritionorderfoodpreferencemodifier.getText()));
		} else {
			n.addNtritnOrdrFoodPreferenceMdfrTxt("NULL");
		}

		if(nutritionorderfoodpreferencemodifieri == nutritionorderfoodpreferencemodifierlist.size()-1) {n.addNtritnOrdrFoodPreferenceMdfrTxt("]");}


		/******************** nutritionorderfoodpreferencemodifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> nutritionorderfoodpreferencemodifiercodinglist = nutritionorderfoodpreferencemodifier.getCoding();
		for(int nutritionorderfoodpreferencemodifiercodingi = 0; nutritionorderfoodpreferencemodifiercodingi<nutritionorderfoodpreferencemodifiercodinglist.size();nutritionorderfoodpreferencemodifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  nutritionorderfoodpreferencemodifiercoding = nutritionorderfoodpreferencemodifiercodinglist.get(nutritionorderfoodpreferencemodifiercodingi);

		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercodingi == 0) {n.addNtritnOrdrFoodPreferenceMdfrCdgDsply("[[");}
		if(nutritionorderfoodpreferencemodifiercoding.hasDisplay()) {

			n.addNtritnOrdrFoodPreferenceMdfrCdgDsply(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getDisplay()));
		} else {
			n.addNtritnOrdrFoodPreferenceMdfrCdgDsply("NULL");
		}

		if(nutritionorderfoodpreferencemodifiercodingi == nutritionorderfoodpreferencemodifiercodinglist.size()-1) {n.addNtritnOrdrFoodPreferenceMdfrCdgDsply("]]");}


		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercodingi == 0) {n.addNtritnOrdrFoodPreferenceMdfrCdgVrsn("[[");}
		if(nutritionorderfoodpreferencemodifiercoding.hasVersion()) {

			n.addNtritnOrdrFoodPreferenceMdfrCdgVrsn(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getVersion()));
		} else {
			n.addNtritnOrdrFoodPreferenceMdfrCdgVrsn("NULL");
		}

		if(nutritionorderfoodpreferencemodifiercodingi == nutritionorderfoodpreferencemodifiercodinglist.size()-1) {n.addNtritnOrdrFoodPreferenceMdfrCdgVrsn("]]");}


		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercodingi == 0) {n.addNtritnOrdrFoodPreferenceMdfrCdgCd("[[");}
		if(nutritionorderfoodpreferencemodifiercoding.hasCode()) {

			n.addNtritnOrdrFoodPreferenceMdfrCdgCd(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getCode()));
		} else {
			n.addNtritnOrdrFoodPreferenceMdfrCdgCd("NULL");
		}

		if(nutritionorderfoodpreferencemodifiercodingi == nutritionorderfoodpreferencemodifiercodinglist.size()-1) {n.addNtritnOrdrFoodPreferenceMdfrCdgCd("]]");}


		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercodingi == 0) {n.addNtritnOrdrFoodPreferenceMdfrCdgUsrSltd("[[");}
		if(nutritionorderfoodpreferencemodifiercoding.hasUserSelected()) {

			n.addNtritnOrdrFoodPreferenceMdfrCdgUsrSltd(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getUserSelected()));
		} else {
			n.addNtritnOrdrFoodPreferenceMdfrCdgUsrSltd("NULL");
		}

		if(nutritionorderfoodpreferencemodifiercodingi == nutritionorderfoodpreferencemodifiercodinglist.size()-1) {n.addNtritnOrdrFoodPreferenceMdfrCdgUsrSltd("]]");}


		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercodingi == 0) {n.addNtritnOrdrFoodPreferenceMdfrCdgSys("[[");}
		if(nutritionorderfoodpreferencemodifiercoding.hasSystem()) {

			n.addNtritnOrdrFoodPreferenceMdfrCdgSys(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getSystem()));
		} else {
			n.addNtritnOrdrFoodPreferenceMdfrCdgSys("NULL");
		}

		if(nutritionorderfoodpreferencemodifiercodingi == nutritionorderfoodpreferencemodifiercodinglist.size()-1) {n.addNtritnOrdrFoodPreferenceMdfrCdgSys("]]");}


		 };
		 };
		/******************** NtritnOrdr_AlrgyIntolerance ********************************************************************************/
		if(nutritionorder.hasAllergyIntolerance()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorder.getAllergyIntolerance().size(); incr++) {
				array = array + nutritionorder.getAllergyIntolerance().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrAlrgyIntolerance(array);

		} else {
			n.addNtritnOrdrAlrgyIntolerance("NULL");
		}


		/******************** NtritnOrdr_Pnt ********************************************************************************/
		if(nutritionorder.hasPatient()) {

			if(nutritionorder.getPatient().getReference() != null) {
			n.addNtritnOrdrPnt(nutritionorder.getPatient().getReference());
			}
		} else {
			n.addNtritnOrdrPnt("NULL");
		}


		/******************** NtritnOrdr_InstantiatesCanonical ********************************************************************************/
		if(nutritionorder.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<nutritionorder.getInstantiatesCanonical().size(); incr++) {
				array = array + nutritionorder.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			n.addNtritnOrdrInstantiatesCanonical(array);

		} else {
			n.addNtritnOrdrInstantiatesCanonical("NULL");
		}


		/******************** nutritionorderintent ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntent nutritionorderintent = nutritionorder.getIntent();
		if(nutritionorderintent!=null) {
			n.addNtritnOrdrIntent(nutritionorderintent.toCode());
		} else {
			n.addNtritnOrdrIntent("NULL");
		}

		return n;
	}
}
