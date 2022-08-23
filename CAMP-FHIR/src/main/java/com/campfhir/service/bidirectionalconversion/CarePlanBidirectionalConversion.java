package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CarePlan;
public class CarePlanBidirectionalConversion 
{
	public CarePlan CarePlans(org.hl7.fhir.r4.model.CarePlan careplan) throws ParseException
	{
		 main.java.com.campfhir.model.CarePlan c = new  main.java.com.campfhir.model.CarePlan();

		/******************** id ********************************************************************************/
		c.setId(careplan.getIdElement().getIdPart());

		/******************** CarePln_Sbjct ********************************************************************************/
		if(careplan.hasSubject()) {

			if(careplan.getSubject().getReference() != null) {
			c.addCarePlnSbjct(careplan.getSubject().getReference());
			}
		} else {
			c.addCarePlnSbjct("NULL");
		}


		/******************** careplanstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanStatus careplanstatus = careplan.getStatus();
		if(careplanstatus!=null) {
			c.addCarePlnSts(careplanstatus.toCode());
		} else {
			c.addCarePlnSts("NULL");
		}

		/******************** CarePln_Enc ********************************************************************************/
		if(careplan.hasEncounter()) {

			if(careplan.getEncounter().getReference() != null) {
			c.addCarePlnEnc(careplan.getEncounter().getReference());
			}
		} else {
			c.addCarePlnEnc("NULL");
		}


		/******************** CarePln_BasedOn ********************************************************************************/
		if(careplan.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getBasedOn().size(); incr++) {
				array = array + careplan.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnBasedOn(array);

		} else {
			c.addCarePlnBasedOn("NULL");
		}


		/******************** CarePln_Dscrptn ********************************************************************************/
		if(careplan.hasDescription()) {

			c.addCarePlnDscrptn(String.valueOf(careplan.getDescription()));
		} else {
			c.addCarePlnDscrptn("NULL");
		}


		/******************** careplannote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> careplannotelist = careplan.getNote();
		for(int careplannotei = 0; careplannotei<careplannotelist.size();careplannotei++ ) {
		org.hl7.fhir.r4.model.Annotation  careplannote = careplannotelist.get(careplannotei);

		/******************** CarePln_Nt_Time ********************************************************************************/
		if(careplannotei == 0) {c.addCarePlnNtTime("[");}
		if(careplannote.hasTime()) {

			c.addCarePlnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplannote.getTime())+"\"");
		} else {
			c.addCarePlnNtTime("NULL");
		}

		if(careplannotei == careplannotelist.size()-1) {c.addCarePlnNtTime("]");}


		/******************** CarePln_Nt_AthrRfrnc ********************************************************************************/
		if(careplannotei == 0) {c.addCarePlnNtAthrRfrnc("[");}
		if(careplannote.hasAuthorReference()) {

			if(careplannote.getAuthorReference().getReference() != null) {
			c.addCarePlnNtAthrRfrnc(careplannote.getAuthorReference().getReference());
			}
		} else {
			c.addCarePlnNtAthrRfrnc("NULL");
		}

		if(careplannotei == careplannotelist.size()-1) {c.addCarePlnNtAthrRfrnc("]");}


		/******************** CarePln_Nt_Txt ********************************************************************************/
		if(careplannotei == 0) {c.addCarePlnNtTxt("[");}
		if(careplannote.hasText()) {

			c.addCarePlnNtTxt(String.valueOf(careplannote.getText()));
		} else {
			c.addCarePlnNtTxt("NULL");
		}

		if(careplannotei == careplannotelist.size()-1) {c.addCarePlnNtTxt("]");}


		/******************** CarePln_Nt_AthrStrgTyp ********************************************************************************/
		if(careplannotei == 0) {c.addCarePlnNtAthrStrgTyp("[");}
		if(careplannote.hasAuthorStringType()) {

			c.addCarePlnNtAthrStrgTyp("\""+careplannote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCarePlnNtAthrStrgTyp("NULL");
		}

		if(careplannotei == careplannotelist.size()-1) {c.addCarePlnNtAthrStrgTyp("]");}


		 };
		/******************** CarePln_Created ********************************************************************************/
		if(careplan.hasCreated()) {

			c.addCarePlnCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplan.getCreated())+"\"");
		} else {
			c.addCarePlnCreated("NULL");
		}


		/******************** careplanperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanperiod = careplan.getPeriod();

		/******************** CarePln_Prd_Strt ********************************************************************************/
		if(careplanperiod.hasStart()) {

			c.addCarePlnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanperiod.getStart())+"\"");
		} else {
			c.addCarePlnPrdStrt("NULL");
		}


		/******************** CarePln_Prd_End ********************************************************************************/
		if(careplanperiod.hasEnd()) {

			c.addCarePlnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanperiod.getEnd())+"\"");
		} else {
			c.addCarePlnPrdEnd("NULL");
		}


		/******************** careplanidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> careplanidentifierlist = careplan.getIdentifier();
		for(int careplanidentifieri = 0; careplanidentifieri<careplanidentifierlist.size();careplanidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  careplanidentifier = careplanidentifierlist.get(careplanidentifieri);

		/******************** CarePln_Id_Vl ********************************************************************************/
		if(careplanidentifieri == 0) {c.addCarePlnIdVl("[");}
		if(careplanidentifier.hasValue()) {

			c.addCarePlnIdVl(String.valueOf(careplanidentifier.getValue()));
		} else {
			c.addCarePlnIdVl("NULL");
		}

		if(careplanidentifieri == careplanidentifierlist.size()-1) {c.addCarePlnIdVl("]");}


		/******************** careplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanidentifiertype = careplanidentifier.getType();

		/******************** CarePln_Id_Typ_Txt ********************************************************************************/
		if(careplanidentifieri == 0) {c.addCarePlnIdTypTxt("[");}
		if(careplanidentifiertype.hasText()) {

			c.addCarePlnIdTypTxt(String.valueOf(careplanidentifiertype.getText()));
		} else {
			c.addCarePlnIdTypTxt("NULL");
		}

		if(careplanidentifieri == careplanidentifierlist.size()-1) {c.addCarePlnIdTypTxt("]");}


		/******************** careplanidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanidentifiertypecodinglist = careplanidentifiertype.getCoding();
		for(int careplanidentifiertypecodingi = 0; careplanidentifiertypecodingi<careplanidentifiertypecodinglist.size();careplanidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanidentifiertypecoding = careplanidentifiertypecodinglist.get(careplanidentifiertypecodingi);

		/******************** CarePln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(careplanidentifiertypecodingi == 0) {c.addCarePlnIdTypCdgDsply("[[");}
		if(careplanidentifiertypecoding.hasDisplay()) {

			c.addCarePlnIdTypCdgDsply(String.valueOf(careplanidentifiertypecoding.getDisplay()));
		} else {
			c.addCarePlnIdTypCdgDsply("NULL");
		}

		if(careplanidentifiertypecodingi == careplanidentifiertypecodinglist.size()-1) {c.addCarePlnIdTypCdgDsply("]]");}


		/******************** CarePln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(careplanidentifiertypecodingi == 0) {c.addCarePlnIdTypCdgVrsn("[[");}
		if(careplanidentifiertypecoding.hasVersion()) {

			c.addCarePlnIdTypCdgVrsn(String.valueOf(careplanidentifiertypecoding.getVersion()));
		} else {
			c.addCarePlnIdTypCdgVrsn("NULL");
		}

		if(careplanidentifiertypecodingi == careplanidentifiertypecodinglist.size()-1) {c.addCarePlnIdTypCdgVrsn("]]");}


		/******************** CarePln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(careplanidentifiertypecodingi == 0) {c.addCarePlnIdTypCdgCd("[[");}
		if(careplanidentifiertypecoding.hasCode()) {

			c.addCarePlnIdTypCdgCd(String.valueOf(careplanidentifiertypecoding.getCode()));
		} else {
			c.addCarePlnIdTypCdgCd("NULL");
		}

		if(careplanidentifiertypecodingi == careplanidentifiertypecodinglist.size()-1) {c.addCarePlnIdTypCdgCd("]]");}


		/******************** CarePln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(careplanidentifiertypecodingi == 0) {c.addCarePlnIdTypCdgUsrSltd("[[");}
		if(careplanidentifiertypecoding.hasUserSelected()) {

			c.addCarePlnIdTypCdgUsrSltd(String.valueOf(careplanidentifiertypecoding.getUserSelected()));
		} else {
			c.addCarePlnIdTypCdgUsrSltd("NULL");
		}

		if(careplanidentifiertypecodingi == careplanidentifiertypecodinglist.size()-1) {c.addCarePlnIdTypCdgUsrSltd("]]");}


		/******************** CarePln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(careplanidentifiertypecodingi == 0) {c.addCarePlnIdTypCdgSys("[[");}
		if(careplanidentifiertypecoding.hasSystem()) {

			c.addCarePlnIdTypCdgSys(String.valueOf(careplanidentifiertypecoding.getSystem()));
		} else {
			c.addCarePlnIdTypCdgSys("NULL");
		}

		if(careplanidentifiertypecodingi == careplanidentifiertypecodinglist.size()-1) {c.addCarePlnIdTypCdgSys("]]");}


		 };
		/******************** careplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanidentifierperiod = careplanidentifier.getPeriod();

		/******************** CarePln_Id_Prd_Strt ********************************************************************************/
		if(careplanidentifieri == 0) {c.addCarePlnIdPrdStrt("[");}
		if(careplanidentifierperiod.hasStart()) {

			c.addCarePlnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanidentifierperiod.getStart())+"\"");
		} else {
			c.addCarePlnIdPrdStrt("NULL");
		}

		if(careplanidentifieri == careplanidentifierlist.size()-1) {c.addCarePlnIdPrdStrt("]");}


		/******************** CarePln_Id_Prd_End ********************************************************************************/
		if(careplanidentifieri == 0) {c.addCarePlnIdPrdEnd("[");}
		if(careplanidentifierperiod.hasEnd()) {

			c.addCarePlnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanidentifierperiod.getEnd())+"\"");
		} else {
			c.addCarePlnIdPrdEnd("NULL");
		}

		if(careplanidentifieri == careplanidentifierlist.size()-1) {c.addCarePlnIdPrdEnd("]");}


		/******************** careplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse careplanidentifieruse = careplanidentifier.getUse();
		if(careplanidentifieruse!=null) {
		if(careplanidentifieri == 0) {

		c.addCarePlnIdUse("[");		}
			c.addCarePlnIdUse(careplanidentifieruse.toCode());
		if(careplanidentifieri == careplanidentifierlist.size()-1) {

		c.addCarePlnIdUse("]");		}

		} else {
			c.addCarePlnIdUse("NULL");
		}

		/******************** CarePln_Id_Assigner ********************************************************************************/
		if(careplanidentifieri == 0) {c.addCarePlnIdAssigner("[");}
		if(careplanidentifier.hasAssigner()) {

			if(careplanidentifier.getAssigner().getReference() != null) {
			c.addCarePlnIdAssigner(careplanidentifier.getAssigner().getReference());
			}
		} else {
			c.addCarePlnIdAssigner("NULL");
		}

		if(careplanidentifieri == careplanidentifierlist.size()-1) {c.addCarePlnIdAssigner("]");}


		/******************** CarePln_Id_Sys ********************************************************************************/
		if(careplanidentifieri == 0) {c.addCarePlnIdSys("[");}
		if(careplanidentifier.hasSystem()) {

			c.addCarePlnIdSys(String.valueOf(careplanidentifier.getSystem()));
		} else {
			c.addCarePlnIdSys("NULL");
		}

		if(careplanidentifieri == careplanidentifierlist.size()-1) {c.addCarePlnIdSys("]");}


		 };
		/******************** CarePln_Replaces ********************************************************************************/
		if(careplan.hasReplaces()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getReplaces().size(); incr++) {
				array = array + careplan.getReplaces().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnReplaces(array);

		} else {
			c.addCarePlnReplaces("NULL");
		}


		/******************** CarePln_InstantiatesUri ********************************************************************************/
		if(careplan.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getInstantiatesUri().size(); incr++) {
				array = array + careplan.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnInstantiatesUri(array);

		} else {
			c.addCarePlnInstantiatesUri("NULL");
		}


		/******************** careplancategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> careplancategorylist = careplan.getCategory();
		for(int careplancategoryi = 0; careplancategoryi<careplancategorylist.size();careplancategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  careplancategory = careplancategorylist.get(careplancategoryi);

		/******************** CarePln_Ctgry_Txt ********************************************************************************/
		if(careplancategoryi == 0) {c.addCarePlnCtgryTxt("[");}
		if(careplancategory.hasText()) {

			c.addCarePlnCtgryTxt(String.valueOf(careplancategory.getText()));
		} else {
			c.addCarePlnCtgryTxt("NULL");
		}

		if(careplancategoryi == careplancategorylist.size()-1) {c.addCarePlnCtgryTxt("]");}


		/******************** careplancategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplancategorycodinglist = careplancategory.getCoding();
		for(int careplancategorycodingi = 0; careplancategorycodingi<careplancategorycodinglist.size();careplancategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplancategorycoding = careplancategorycodinglist.get(careplancategorycodingi);

		/******************** CarePln_Ctgry_Cdg_Dsply ********************************************************************************/
		if(careplancategorycodingi == 0) {c.addCarePlnCtgryCdgDsply("[[");}
		if(careplancategorycoding.hasDisplay()) {

			c.addCarePlnCtgryCdgDsply(String.valueOf(careplancategorycoding.getDisplay()));
		} else {
			c.addCarePlnCtgryCdgDsply("NULL");
		}

		if(careplancategorycodingi == careplancategorycodinglist.size()-1) {c.addCarePlnCtgryCdgDsply("]]");}


		/******************** CarePln_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(careplancategorycodingi == 0) {c.addCarePlnCtgryCdgVrsn("[[");}
		if(careplancategorycoding.hasVersion()) {

			c.addCarePlnCtgryCdgVrsn(String.valueOf(careplancategorycoding.getVersion()));
		} else {
			c.addCarePlnCtgryCdgVrsn("NULL");
		}

		if(careplancategorycodingi == careplancategorycodinglist.size()-1) {c.addCarePlnCtgryCdgVrsn("]]");}


		/******************** CarePln_Ctgry_Cdg_Cd ********************************************************************************/
		if(careplancategorycodingi == 0) {c.addCarePlnCtgryCdgCd("[[");}
		if(careplancategorycoding.hasCode()) {

			c.addCarePlnCtgryCdgCd(String.valueOf(careplancategorycoding.getCode()));
		} else {
			c.addCarePlnCtgryCdgCd("NULL");
		}

		if(careplancategorycodingi == careplancategorycodinglist.size()-1) {c.addCarePlnCtgryCdgCd("]]");}


		/******************** CarePln_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(careplancategorycodingi == 0) {c.addCarePlnCtgryCdgUsrSltd("[[");}
		if(careplancategorycoding.hasUserSelected()) {

			c.addCarePlnCtgryCdgUsrSltd(String.valueOf(careplancategorycoding.getUserSelected()));
		} else {
			c.addCarePlnCtgryCdgUsrSltd("NULL");
		}

		if(careplancategorycodingi == careplancategorycodinglist.size()-1) {c.addCarePlnCtgryCdgUsrSltd("]]");}


		/******************** CarePln_Ctgry_Cdg_Sys ********************************************************************************/
		if(careplancategorycodingi == 0) {c.addCarePlnCtgryCdgSys("[[");}
		if(careplancategorycoding.hasSystem()) {

			c.addCarePlnCtgryCdgSys(String.valueOf(careplancategorycoding.getSystem()));
		} else {
			c.addCarePlnCtgryCdgSys("NULL");
		}

		if(careplancategorycodingi == careplancategorycodinglist.size()-1) {c.addCarePlnCtgryCdgSys("]]");}


		 };
		 };
		/******************** CarePln_CareTeam ********************************************************************************/
		if(careplan.hasCareTeam()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getCareTeam().size(); incr++) {
				array = array + careplan.getCareTeam().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnCareTeam(array);

		} else {
			c.addCarePlnCareTeam("NULL");
		}


		/******************** CarePln_Goal ********************************************************************************/
		if(careplan.hasGoal()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getGoal().size(); incr++) {
				array = array + careplan.getGoal().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnGoal(array);

		} else {
			c.addCarePlnGoal("NULL");
		}


		/******************** CarePln_Contributor ********************************************************************************/
		if(careplan.hasContributor()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getContributor().size(); incr++) {
				array = array + careplan.getContributor().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnContributor(array);

		} else {
			c.addCarePlnContributor("NULL");
		}


		/******************** CarePln_Addres ********************************************************************************/
		if(careplan.hasAddresses()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getAddresses().size(); incr++) {
				array = array + careplan.getAddresses().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnAddres(array);

		} else {
			c.addCarePlnAddres("NULL");
		}


		/******************** careplanactivity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent> careplanactivitylist = careplan.getActivity();
		for(int careplanactivityi = 0; careplanactivityi<careplanactivitylist.size();careplanactivityi++ ) {
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent  careplanactivity = careplanactivitylist.get(careplanactivityi);

		/******************** CarePln_Actvty_Rfrnc ********************************************************************************/
		if(careplanactivityi == 0) {c.addCarePlnActvtyRfrnc("[");}
		if(careplanactivity.hasReference()) {

			if(careplanactivity.getReference().getReference() != null) {
			c.addCarePlnActvtyRfrnc(careplanactivity.getReference().getReference());
			}
		} else {
			c.addCarePlnActvtyRfrnc("NULL");
		}

		if(careplanactivityi == careplanactivitylist.size()-1) {c.addCarePlnActvtyRfrnc("]");}


		/******************** careplanactivitydetail ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent careplanactivitydetail = careplanactivity.getDetail();

		/******************** CarePln_Actvty_Dtl_Lctn ********************************************************************************/
		if(careplanactivityi == 0) {c.addCarePlnActvtyDtlLctn("[");}
		if(careplanactivitydetail.hasLocation()) {

			if(careplanactivitydetail.getLocation().getReference() != null) {
			c.addCarePlnActvtyDtlLctn(careplanactivitydetail.getLocation().getReference());
			}
		} else {
			c.addCarePlnActvtyDtlLctn("NULL");
		}

		if(careplanactivityi == careplanactivitylist.size()-1) {c.addCarePlnActvtyDtlLctn("]");}


		/******************** careplanactivitydetailcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailcode = careplanactivitydetail.getCode();

		/******************** CarePln_Actvty_Dtl_Cd_Txt ********************************************************************************/
		if(careplanactivityi == 0) {c.addCarePlnActvtyDtlCdTxt("[");}
		if(careplanactivitydetailcode.hasText()) {

			c.addCarePlnActvtyDtlCdTxt(String.valueOf(careplanactivitydetailcode.getText()));
		} else {
			c.addCarePlnActvtyDtlCdTxt("NULL");
		}

		if(careplanactivityi == careplanactivitylist.size()-1) {c.addCarePlnActvtyDtlCdTxt("]");}


		/******************** careplanactivitydetailcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanactivitydetailcodecodinglist = careplanactivitydetailcode.getCoding();
		for(int careplanactivitydetailcodecodingi = 0; careplanactivitydetailcodecodingi<careplanactivitydetailcodecodinglist.size();careplanactivitydetailcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanactivitydetailcodecoding = careplanactivitydetailcodecodinglist.get(careplanactivitydetailcodecodingi);

		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailcodecodingi == 0) {c.addCarePlnActvtyDtlCdCdgDsply("[[");}
		if(careplanactivitydetailcodecoding.hasDisplay()) {

			c.addCarePlnActvtyDtlCdCdgDsply(String.valueOf(careplanactivitydetailcodecoding.getDisplay()));
		} else {
			c.addCarePlnActvtyDtlCdCdgDsply("NULL");
		}

		if(careplanactivitydetailcodecodingi == careplanactivitydetailcodecodinglist.size()-1) {c.addCarePlnActvtyDtlCdCdgDsply("]]");}


		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailcodecodingi == 0) {c.addCarePlnActvtyDtlCdCdgVrsn("[[");}
		if(careplanactivitydetailcodecoding.hasVersion()) {

			c.addCarePlnActvtyDtlCdCdgVrsn(String.valueOf(careplanactivitydetailcodecoding.getVersion()));
		} else {
			c.addCarePlnActvtyDtlCdCdgVrsn("NULL");
		}

		if(careplanactivitydetailcodecodingi == careplanactivitydetailcodecodinglist.size()-1) {c.addCarePlnActvtyDtlCdCdgVrsn("]]");}


		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailcodecodingi == 0) {c.addCarePlnActvtyDtlCdCdgCd("[[");}
		if(careplanactivitydetailcodecoding.hasCode()) {

			c.addCarePlnActvtyDtlCdCdgCd(String.valueOf(careplanactivitydetailcodecoding.getCode()));
		} else {
			c.addCarePlnActvtyDtlCdCdgCd("NULL");
		}

		if(careplanactivitydetailcodecodingi == careplanactivitydetailcodecodinglist.size()-1) {c.addCarePlnActvtyDtlCdCdgCd("]]");}


		/******************** CarePln_Actvty_Dtl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailcodecodingi == 0) {c.addCarePlnActvtyDtlCdCdgUsrSltd("[[");}
		if(careplanactivitydetailcodecoding.hasUserSelected()) {

			c.addCarePlnActvtyDtlCdCdgUsrSltd(String.valueOf(careplanactivitydetailcodecoding.getUserSelected()));
		} else {
			c.addCarePlnActvtyDtlCdCdgUsrSltd("NULL");
		}

		if(careplanactivitydetailcodecodingi == careplanactivitydetailcodecodinglist.size()-1) {c.addCarePlnActvtyDtlCdCdgUsrSltd("]]");}


		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailcodecodingi == 0) {c.addCarePlnActvtyDtlCdCdgSys("[[");}
		if(careplanactivitydetailcodecoding.hasSystem()) {

			c.addCarePlnActvtyDtlCdCdgSys(String.valueOf(careplanactivitydetailcodecoding.getSystem()));
		} else {
			c.addCarePlnActvtyDtlCdCdgSys("NULL");
		}

		if(careplanactivitydetailcodecodingi == careplanactivitydetailcodecodinglist.size()-1) {c.addCarePlnActvtyDtlCdCdgSys("]]");}


		 };
		/******************** careplanactivitydetailstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityStatus careplanactivitydetailstatus = careplanactivitydetail.getStatus();
		if(careplanactivitydetailstatus!=null) {
		if(careplanactivityi == 0) {

		c.addCarePlnActvtyDtlSts("[");		}
			c.addCarePlnActvtyDtlSts(careplanactivitydetailstatus.toCode());
		if(careplanactivityi == careplanactivitylist.size()-1) {

		c.addCarePlnActvtyDtlSts("]");		}

		} else {
			c.addCarePlnActvtyDtlSts("NULL");
		}

		/******************** careplanactivitydetailreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> careplanactivitydetailreasoncodelist = careplanactivitydetail.getReasonCode();
		for(int careplanactivitydetailreasoncodei = 0; careplanactivitydetailreasoncodei<careplanactivitydetailreasoncodelist.size();careplanactivitydetailreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  careplanactivitydetailreasoncode = careplanactivitydetailreasoncodelist.get(careplanactivitydetailreasoncodei);

		/******************** CarePln_Actvty_Dtl_RsnCd_Txt ********************************************************************************/
		if(careplanactivitydetailreasoncodei == 0) {c.addCarePlnActvtyDtlRsnCdTxt("[[");}
		if(careplanactivitydetailreasoncode.hasText()) {

			c.addCarePlnActvtyDtlRsnCdTxt(String.valueOf(careplanactivitydetailreasoncode.getText()));
		} else {
			c.addCarePlnActvtyDtlRsnCdTxt("NULL");
		}

		if(careplanactivitydetailreasoncodei == careplanactivitydetailreasoncodelist.size()-1) {c.addCarePlnActvtyDtlRsnCdTxt("]]");}


		/******************** careplanactivitydetailreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanactivitydetailreasoncodecodinglist = careplanactivitydetailreasoncode.getCoding();
		for(int careplanactivitydetailreasoncodecodingi = 0; careplanactivitydetailreasoncodecodingi<careplanactivitydetailreasoncodecodinglist.size();careplanactivitydetailreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanactivitydetailreasoncodecoding = careplanactivitydetailreasoncodecodinglist.get(careplanactivitydetailreasoncodecodingi);

		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailreasoncodecodingi == 0) {c.addCarePlnActvtyDtlRsnCdCdgDsply("[[[");}
		if(careplanactivitydetailreasoncodecoding.hasDisplay()) {

			c.addCarePlnActvtyDtlRsnCdCdgDsply(String.valueOf(careplanactivitydetailreasoncodecoding.getDisplay()));
		} else {
			c.addCarePlnActvtyDtlRsnCdCdgDsply("NULL");
		}

		if(careplanactivitydetailreasoncodecodingi == careplanactivitydetailreasoncodecodinglist.size()-1) {c.addCarePlnActvtyDtlRsnCdCdgDsply("]]]");}


		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailreasoncodecodingi == 0) {c.addCarePlnActvtyDtlRsnCdCdgVrsn("[[[");}
		if(careplanactivitydetailreasoncodecoding.hasVersion()) {

			c.addCarePlnActvtyDtlRsnCdCdgVrsn(String.valueOf(careplanactivitydetailreasoncodecoding.getVersion()));
		} else {
			c.addCarePlnActvtyDtlRsnCdCdgVrsn("NULL");
		}

		if(careplanactivitydetailreasoncodecodingi == careplanactivitydetailreasoncodecodinglist.size()-1) {c.addCarePlnActvtyDtlRsnCdCdgVrsn("]]]");}


		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailreasoncodecodingi == 0) {c.addCarePlnActvtyDtlRsnCdCdgCd("[[[");}
		if(careplanactivitydetailreasoncodecoding.hasCode()) {

			c.addCarePlnActvtyDtlRsnCdCdgCd(String.valueOf(careplanactivitydetailreasoncodecoding.getCode()));
		} else {
			c.addCarePlnActvtyDtlRsnCdCdgCd("NULL");
		}

		if(careplanactivitydetailreasoncodecodingi == careplanactivitydetailreasoncodecodinglist.size()-1) {c.addCarePlnActvtyDtlRsnCdCdgCd("]]]");}


		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailreasoncodecodingi == 0) {c.addCarePlnActvtyDtlRsnCdCdgUsrSltd("[[[");}
		if(careplanactivitydetailreasoncodecoding.hasUserSelected()) {

			c.addCarePlnActvtyDtlRsnCdCdgUsrSltd(String.valueOf(careplanactivitydetailreasoncodecoding.getUserSelected()));
		} else {
			c.addCarePlnActvtyDtlRsnCdCdgUsrSltd("NULL");
		}

		if(careplanactivitydetailreasoncodecodingi == careplanactivitydetailreasoncodecodinglist.size()-1) {c.addCarePlnActvtyDtlRsnCdCdgUsrSltd("]]]");}


		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailreasoncodecodingi == 0) {c.addCarePlnActvtyDtlRsnCdCdgSys("[[[");}
		if(careplanactivitydetailreasoncodecoding.hasSystem()) {

			c.addCarePlnActvtyDtlRsnCdCdgSys(String.valueOf(careplanactivitydetailreasoncodecoding.getSystem()));
		} else {
			c.addCarePlnActvtyDtlRsnCdCdgSys("NULL");
		}

		if(careplanactivitydetailreasoncodecodingi == careplanactivitydetailreasoncodecodinglist.size()-1) {c.addCarePlnActvtyDtlRsnCdCdgSys("]]]");}


		 };
		 };
		/******************** CarePln_Actvty_Dtl_Dscrptn ********************************************************************************/
		if(careplanactivitydetail.hasDescription()) {

			c.addCarePlnActvtyDtlDscrptn(String.valueOf(careplanactivitydetail.getDescription()));
		} else {
			c.addCarePlnActvtyDtlDscrptn("NULL");
		}


		/******************** CarePln_Actvty_Dtl_RsnRfrnc ********************************************************************************/
		if(careplanactivitydetail.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetail.getReasonReference().size(); incr++) {
				array = array + careplanactivitydetail.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlRsnRfrnc(array);

		} else {
			c.addCarePlnActvtyDtlRsnRfrnc("NULL");
		}


		/******************** CarePln_Actvty_Dtl_InstantiatesUri ********************************************************************************/
		if(careplanactivitydetail.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetail.getInstantiatesUri().size(); incr++) {
				array = array + careplanactivitydetail.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlInstantiatesUri(array);

		} else {
			c.addCarePlnActvtyDtlInstantiatesUri("NULL");
		}


		/******************** careplanactivitydetailscheduledperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanactivitydetailscheduledperiod = careplanactivitydetail.getScheduledPeriod();

		/******************** CarePln_Actvty_Dtl_SchdldPrd_Strt ********************************************************************************/
		if(careplanactivitydetailscheduledperiod.hasStart()) {

			c.addCarePlnActvtyDtlSchdldPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanactivitydetailscheduledperiod.getStart())+"\"");
		} else {
			c.addCarePlnActvtyDtlSchdldPrdStrt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldPrd_End ********************************************************************************/
		if(careplanactivitydetailscheduledperiod.hasEnd()) {

			c.addCarePlnActvtyDtlSchdldPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanactivitydetailscheduledperiod.getEnd())+"\"");
		} else {
			c.addCarePlnActvtyDtlSchdldPrdEnd("NULL");
		}


		/******************** careplanactivitydetailscheduledtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing careplanactivitydetailscheduledtiming = careplanactivitydetail.getScheduledTiming();

		/******************** careplanactivitydetailscheduledtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailscheduledtimingcode = careplanactivitydetailscheduledtiming.getCode();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Txt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcode.hasText()) {

			c.addCarePlnActvtyDtlSchdldTmgCdTxt(String.valueOf(careplanactivitydetailscheduledtimingcode.getText()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgCdTxt("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanactivitydetailscheduledtimingcodecodinglist = careplanactivitydetailscheduledtimingcode.getCoding();
		for(int careplanactivitydetailscheduledtimingcodecodingi = 0; careplanactivitydetailscheduledtimingcodecodingi<careplanactivitydetailscheduledtimingcodecodinglist.size();careplanactivitydetailscheduledtimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanactivitydetailscheduledtimingcodecoding = careplanactivitydetailscheduledtimingcodecodinglist.get(careplanactivitydetailscheduledtimingcodecodingi);

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecodingi == 0) {c.addCarePlnActvtyDtlSchdldTmgCdCdgDsply("[[");}
		if(careplanactivitydetailscheduledtimingcodecoding.hasDisplay()) {

			c.addCarePlnActvtyDtlSchdldTmgCdCdgDsply(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getDisplay()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgCdCdgDsply("NULL");
		}

		if(careplanactivitydetailscheduledtimingcodecodingi == careplanactivitydetailscheduledtimingcodecodinglist.size()-1) {c.addCarePlnActvtyDtlSchdldTmgCdCdgDsply("]]");}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecodingi == 0) {c.addCarePlnActvtyDtlSchdldTmgCdCdgVrsn("[[");}
		if(careplanactivitydetailscheduledtimingcodecoding.hasVersion()) {

			c.addCarePlnActvtyDtlSchdldTmgCdCdgVrsn(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getVersion()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgCdCdgVrsn("NULL");
		}

		if(careplanactivitydetailscheduledtimingcodecodingi == careplanactivitydetailscheduledtimingcodecodinglist.size()-1) {c.addCarePlnActvtyDtlSchdldTmgCdCdgVrsn("]]");}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecodingi == 0) {c.addCarePlnActvtyDtlSchdldTmgCdCdgCd("[[");}
		if(careplanactivitydetailscheduledtimingcodecoding.hasCode()) {

			c.addCarePlnActvtyDtlSchdldTmgCdCdgCd(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getCode()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgCdCdgCd("NULL");
		}

		if(careplanactivitydetailscheduledtimingcodecodingi == careplanactivitydetailscheduledtimingcodecodinglist.size()-1) {c.addCarePlnActvtyDtlSchdldTmgCdCdgCd("]]");}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecodingi == 0) {c.addCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd("[[");}
		if(careplanactivitydetailscheduledtimingcodecoding.hasUserSelected()) {

			c.addCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getUserSelected()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd("NULL");
		}

		if(careplanactivitydetailscheduledtimingcodecodingi == careplanactivitydetailscheduledtimingcodecodinglist.size()-1) {c.addCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd("]]");}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecodingi == 0) {c.addCarePlnActvtyDtlSchdldTmgCdCdgSys("[[");}
		if(careplanactivitydetailscheduledtimingcodecoding.hasSystem()) {

			c.addCarePlnActvtyDtlSchdldTmgCdCdgSys(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getSystem()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgCdCdgSys("NULL");
		}

		if(careplanactivitydetailscheduledtimingcodecodingi == careplanactivitydetailscheduledtimingcodecodinglist.size()-1) {c.addCarePlnActvtyDtlSchdldTmgCdCdgSys("]]");}


		 };
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Evnt ********************************************************************************/
		if(careplanactivitydetailscheduledtiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetailscheduledtiming.getEvent().size(); incr++) {
				array = array + careplanactivitydetailscheduledtiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlSchdldTmgEvnt(array);

		} else {
			c.addCarePlnActvtyDtlSchdldTmgEvnt("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent careplanactivitydetailscheduledtimingrepeat = careplanactivitydetailscheduledtiming.getRepeat();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Off ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasOffset()) {

			c.addCarePlnActvtyDtlSchdldTmgRptOff(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getOffset()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptOff("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Cnt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasCount()) {

			c.addCarePlnActvtyDtlSchdldTmgRptCnt(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getCount()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptCnt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Prd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasPeriod()) {

			c.addCarePlnActvtyDtlSchdldTmgRptPrd(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getPeriod()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptPrd("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_CntMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasCountMax()) {

			c.addCarePlnActvtyDtlSchdldTmgRptCntMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getCountMax()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptCntMx("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_DurationMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasDurationMax()) {

			c.addCarePlnActvtyDtlSchdldTmgRptDurationMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getDurationMax()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptDurationMx("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanactivitydetailscheduledtimingrepeatboundsperiod = careplanactivitydetailscheduledtimingrepeat.getBoundsPeriod();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsperiod.hasStart()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanactivitydetailscheduledtimingrepeatboundsperiod.getStart())+"\"");
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsperiod.hasEnd()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanactivitydetailscheduledtimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime careplanactivitydetailscheduledtimingrepeatdurationunit = careplanactivitydetailscheduledtimingrepeat.getDurationUnit();
		if(careplanactivitydetailscheduledtimingrepeatdurationunit!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptDurationUnt(careplanactivitydetailscheduledtimingrepeatdurationunit.toCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptDurationUnt("NULL");
		}

		/******************** careplanactivitydetailscheduledtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration careplanactivitydetailscheduledtimingrepeatboundsduration = careplanactivitydetailscheduledtimingrepeat.getBoundsDuration();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsduration.hasValue()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationVl(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsduration.getValue()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationVl("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailscheduledtimingrepeatboundsdurationcomparator = careplanactivitydetailscheduledtimingrepeatboundsduration.getComparator();
		if(careplanactivitydetailscheduledtimingrepeatboundsdurationcomparator!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationCmprtr(careplanactivitydetailscheduledtimingrepeatboundsdurationcomparator.toCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsduration.hasCode()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationCd(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsduration.getCode()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationCd("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsduration.hasUnit()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationUnt(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsduration.getUnit()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationUnt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsduration.hasSystem()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationSys(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsduration.getSystem()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsDurationSys("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range careplanactivitydetailscheduledtimingrepeatboundsrange = careplanactivitydetailscheduledtimingrepeat.getBoundsRange();

		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailscheduledtimingrepeatboundsrangelow = careplanactivitydetailscheduledtimingrepeatboundsrange.getLow();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasValue()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getValue()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator = careplanactivitydetailscheduledtimingrepeatboundsrangelow.getComparator();
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwCmprtr(careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator.toCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasCode()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getCode()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasUnit()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getUnit()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasSystem()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getSystem()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailscheduledtimingrepeatboundsrangehigh = careplanactivitydetailscheduledtimingrepeatboundsrange.getHigh();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasValue()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getValue()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator = careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getComparator();
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiCmprtr(careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator.toCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasCode()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getCode()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasUnit()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getUnit()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasSystem()) {

			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getSystem()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_FrqncyMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasFrequencyMax()) {

			c.addCarePlnActvtyDtlSchdldTmgRptFrqncyMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getFrequencyMax()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptFrqncyMx("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> careplanactivitydetailscheduledtimingrepeatwhenlist = careplanactivitydetailscheduledtimingrepeat.getWhen();
		for(int careplanactivitydetailscheduledtimingrepeatwheni = 0; careplanactivitydetailscheduledtimingrepeatwheni<careplanactivitydetailscheduledtimingrepeatwhenlist.size();careplanactivitydetailscheduledtimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  careplanactivitydetailscheduledtimingrepeatwhen = careplanactivitydetailscheduledtimingrepeatwhenlist.get(careplanactivitydetailscheduledtimingrepeatwheni);
		if(careplanactivitydetailscheduledtimingrepeatwhen!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptWhen(careplanactivitydetailscheduledtimingrepeatwhen.getCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptWhen("NULL");
		}
		 };

		/******************** careplanactivitydetailscheduledtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime careplanactivitydetailscheduledtimingrepeatperiodunit = careplanactivitydetailscheduledtimingrepeat.getPeriodUnit();
		if(careplanactivitydetailscheduledtimingrepeatperiodunit!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptPrdUnt(careplanactivitydetailscheduledtimingrepeatperiodunit.toCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptPrdUnt("NULL");
		}

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_PrdMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasPeriodMax()) {

			c.addCarePlnActvtyDtlSchdldTmgRptPrdMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getPeriodMax()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptPrdMx("NULL");
		}


		/******************** careplanactivitydetailscheduledtimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> careplanactivitydetailscheduledtimingrepeatdayofweeklist = careplanactivitydetailscheduledtimingrepeat.getDayOfWeek();
		for(int careplanactivitydetailscheduledtimingrepeatdayofweeki = 0; careplanactivitydetailscheduledtimingrepeatdayofweeki<careplanactivitydetailscheduledtimingrepeatdayofweeklist.size();careplanactivitydetailscheduledtimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  careplanactivitydetailscheduledtimingrepeatdayofweek = careplanactivitydetailscheduledtimingrepeatdayofweeklist.get(careplanactivitydetailscheduledtimingrepeatdayofweeki);
		if(careplanactivitydetailscheduledtimingrepeatdayofweek!=null) {
			c.addCarePlnActvtyDtlSchdldTmgRptDayOfWeek(careplanactivitydetailscheduledtimingrepeatdayofweek.getCode());
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_TimeOfDay ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetailscheduledtimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + careplanactivitydetailscheduledtimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlSchdldTmgRptTimeOfDay(array);

		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptTimeOfDay("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Duration ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasDuration()) {

			c.addCarePlnActvtyDtlSchdldTmgRptDuration(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getDuration()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptDuration("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Frqncy ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasFrequency()) {

			c.addCarePlnActvtyDtlSchdldTmgRptFrqncy(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getFrequency()));
		} else {
			c.addCarePlnActvtyDtlSchdldTmgRptFrqncy("NULL");
		}


		/******************** careplanactivitydetailkind ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityKind careplanactivitydetailkind = careplanactivitydetail.getKind();
		if(careplanactivitydetailkind!=null) {
			c.addCarePlnActvtyDtlKind(careplanactivitydetailkind.toCode());
		} else {
			c.addCarePlnActvtyDtlKind("NULL");
		}

		/******************** careplanactivitydetailproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailproductcodeableconcept = careplanactivitydetail.getProductCodeableConcept();

		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(careplanactivitydetailproductcodeableconcept.hasText()) {

			c.addCarePlnActvtyDtlPrdctCdbleCncptTxt(String.valueOf(careplanactivitydetailproductcodeableconcept.getText()));
		} else {
			c.addCarePlnActvtyDtlPrdctCdbleCncptTxt("NULL");
		}


		/******************** careplanactivitydetailproductcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanactivitydetailproductcodeableconceptcodinglist = careplanactivitydetailproductcodeableconcept.getCoding();
		for(int careplanactivitydetailproductcodeableconceptcodingi = 0; careplanactivitydetailproductcodeableconceptcodingi<careplanactivitydetailproductcodeableconceptcodinglist.size();careplanactivitydetailproductcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanactivitydetailproductcodeableconceptcoding = careplanactivitydetailproductcodeableconceptcodinglist.get(careplanactivitydetailproductcodeableconceptcodingi);

		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcodingi == 0) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgDsply("[[");}
		if(careplanactivitydetailproductcodeableconceptcoding.hasDisplay()) {

			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgDsply(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getDisplay()));
		} else {
			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgDsply("NULL");
		}

		if(careplanactivitydetailproductcodeableconceptcodingi == careplanactivitydetailproductcodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgDsply("]]");}


		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcodingi == 0) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn("[[");}
		if(careplanactivitydetailproductcodeableconceptcoding.hasVersion()) {

			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getVersion()));
		} else {
			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn("NULL");
		}

		if(careplanactivitydetailproductcodeableconceptcodingi == careplanactivitydetailproductcodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn("]]");}


		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcodingi == 0) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgCd("[[");}
		if(careplanactivitydetailproductcodeableconceptcoding.hasCode()) {

			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgCd(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getCode()));
		} else {
			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgCd("NULL");
		}

		if(careplanactivitydetailproductcodeableconceptcodingi == careplanactivitydetailproductcodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgCd("]]");}


		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcodingi == 0) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd("[[");}
		if(careplanactivitydetailproductcodeableconceptcoding.hasUserSelected()) {

			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getUserSelected()));
		} else {
			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd("NULL");
		}

		if(careplanactivitydetailproductcodeableconceptcodingi == careplanactivitydetailproductcodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd("]]");}


		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcodingi == 0) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgSys("[[");}
		if(careplanactivitydetailproductcodeableconceptcoding.hasSystem()) {

			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgSys(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getSystem()));
		} else {
			c.addCarePlnActvtyDtlPrdctCdbleCncptCdgSys("NULL");
		}

		if(careplanactivitydetailproductcodeableconceptcodingi == careplanactivitydetailproductcodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyDtlPrdctCdbleCncptCdgSys("]]");}


		 };
		/******************** CarePln_Actvty_Dtl_PrdctRfrnc ********************************************************************************/
		if(careplanactivitydetail.hasProductReference()) {

			if(careplanactivitydetail.getProductReference().getReference() != null) {
			c.addCarePlnActvtyDtlPrdctRfrnc(careplanactivitydetail.getProductReference().getReference());
			}
		} else {
			c.addCarePlnActvtyDtlPrdctRfrnc("NULL");
		}


		/******************** CarePln_Actvty_Dtl_Goal ********************************************************************************/
		if(careplanactivitydetail.hasGoal()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetail.getGoal().size(); incr++) {
				array = array + careplanactivitydetail.getGoal().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlGoal(array);

		} else {
			c.addCarePlnActvtyDtlGoal("NULL");
		}


		/******************** CarePln_Actvty_Dtl_Prfrmr ********************************************************************************/
		if(careplanactivitydetail.hasPerformer()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetail.getPerformer().size(); incr++) {
				array = array + careplanactivitydetail.getPerformer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlPrfrmr(array);

		} else {
			c.addCarePlnActvtyDtlPrfrmr("NULL");
		}


		/******************** careplanactivitydetaildailyamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetaildailyamount = careplanactivitydetail.getDailyAmount();

		/******************** CarePln_Actvty_Dtl_DailyAmnt_Vl ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasValue()) {

			c.addCarePlnActvtyDtlDailyAmntVl(String.valueOf(careplanactivitydetaildailyamount.getValue()));
		} else {
			c.addCarePlnActvtyDtlDailyAmntVl("NULL");
		}


		/******************** careplanactivitydetaildailyamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetaildailyamountcomparator = careplanactivitydetaildailyamount.getComparator();
		if(careplanactivitydetaildailyamountcomparator!=null) {
			c.addCarePlnActvtyDtlDailyAmntCmprtr(careplanactivitydetaildailyamountcomparator.toCode());
		} else {
			c.addCarePlnActvtyDtlDailyAmntCmprtr("NULL");
		}

		/******************** CarePln_Actvty_Dtl_DailyAmnt_Cd ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasCode()) {

			c.addCarePlnActvtyDtlDailyAmntCd(String.valueOf(careplanactivitydetaildailyamount.getCode()));
		} else {
			c.addCarePlnActvtyDtlDailyAmntCd("NULL");
		}


		/******************** CarePln_Actvty_Dtl_DailyAmnt_Unt ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasUnit()) {

			c.addCarePlnActvtyDtlDailyAmntUnt(String.valueOf(careplanactivitydetaildailyamount.getUnit()));
		} else {
			c.addCarePlnActvtyDtlDailyAmntUnt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_DailyAmnt_Sys ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasSystem()) {

			c.addCarePlnActvtyDtlDailyAmntSys(String.valueOf(careplanactivitydetaildailyamount.getSystem()));
		} else {
			c.addCarePlnActvtyDtlDailyAmntSys("NULL");
		}


		/******************** careplanactivitydetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailquantity = careplanactivitydetail.getQuantity();

		/******************** CarePln_Actvty_Dtl_Qnty_Vl ********************************************************************************/
		if(careplanactivitydetailquantity.hasValue()) {

			c.addCarePlnActvtyDtlQntyVl(String.valueOf(careplanactivitydetailquantity.getValue()));
		} else {
			c.addCarePlnActvtyDtlQntyVl("NULL");
		}


		/******************** careplanactivitydetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailquantitycomparator = careplanactivitydetailquantity.getComparator();
		if(careplanactivitydetailquantitycomparator!=null) {
			c.addCarePlnActvtyDtlQntyCmprtr(careplanactivitydetailquantitycomparator.toCode());
		} else {
			c.addCarePlnActvtyDtlQntyCmprtr("NULL");
		}

		/******************** CarePln_Actvty_Dtl_Qnty_Cd ********************************************************************************/
		if(careplanactivitydetailquantity.hasCode()) {

			c.addCarePlnActvtyDtlQntyCd(String.valueOf(careplanactivitydetailquantity.getCode()));
		} else {
			c.addCarePlnActvtyDtlQntyCd("NULL");
		}


		/******************** CarePln_Actvty_Dtl_Qnty_Unt ********************************************************************************/
		if(careplanactivitydetailquantity.hasUnit()) {

			c.addCarePlnActvtyDtlQntyUnt(String.valueOf(careplanactivitydetailquantity.getUnit()));
		} else {
			c.addCarePlnActvtyDtlQntyUnt("NULL");
		}


		/******************** CarePln_Actvty_Dtl_Qnty_Sys ********************************************************************************/
		if(careplanactivitydetailquantity.hasSystem()) {

			c.addCarePlnActvtyDtlQntySys(String.valueOf(careplanactivitydetailquantity.getSystem()));
		} else {
			c.addCarePlnActvtyDtlQntySys("NULL");
		}


		/******************** CarePln_Actvty_Dtl_InstantiatesCanonical ********************************************************************************/
		if(careplanactivitydetail.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivitydetail.getInstantiatesCanonical().size(); incr++) {
				array = array + careplanactivitydetail.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyDtlInstantiatesCanonical(array);

		} else {
			c.addCarePlnActvtyDtlInstantiatesCanonical("NULL");
		}


		/******************** CarePln_Actvty_Dtl_SchdldStrgTyp ********************************************************************************/
		if(careplanactivitydetail.hasScheduledStringType()) {

			c.addCarePlnActvtyDtlSchdldStrgTyp("\""+careplanactivitydetail.getScheduledStringType().getValueAsString()+"\"");
		} else {
			c.addCarePlnActvtyDtlSchdldStrgTyp("NULL");
		}


		/******************** careplanactivitydetailstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailstatusreason = careplanactivitydetail.getStatusReason();

		/******************** CarePln_Actvty_Dtl_StsRsn_Txt ********************************************************************************/
		if(careplanactivitydetailstatusreason.hasText()) {

			c.addCarePlnActvtyDtlStsRsnTxt(String.valueOf(careplanactivitydetailstatusreason.getText()));
		} else {
			c.addCarePlnActvtyDtlStsRsnTxt("NULL");
		}


		/******************** careplanactivitydetailstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanactivitydetailstatusreasoncodinglist = careplanactivitydetailstatusreason.getCoding();
		for(int careplanactivitydetailstatusreasoncodingi = 0; careplanactivitydetailstatusreasoncodingi<careplanactivitydetailstatusreasoncodinglist.size();careplanactivitydetailstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanactivitydetailstatusreasoncoding = careplanactivitydetailstatusreasoncodinglist.get(careplanactivitydetailstatusreasoncodingi);

		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailstatusreasoncodingi == 0) {c.addCarePlnActvtyDtlStsRsnCdgDsply("[[");}
		if(careplanactivitydetailstatusreasoncoding.hasDisplay()) {

			c.addCarePlnActvtyDtlStsRsnCdgDsply(String.valueOf(careplanactivitydetailstatusreasoncoding.getDisplay()));
		} else {
			c.addCarePlnActvtyDtlStsRsnCdgDsply("NULL");
		}

		if(careplanactivitydetailstatusreasoncodingi == careplanactivitydetailstatusreasoncodinglist.size()-1) {c.addCarePlnActvtyDtlStsRsnCdgDsply("]]");}


		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailstatusreasoncodingi == 0) {c.addCarePlnActvtyDtlStsRsnCdgVrsn("[[");}
		if(careplanactivitydetailstatusreasoncoding.hasVersion()) {

			c.addCarePlnActvtyDtlStsRsnCdgVrsn(String.valueOf(careplanactivitydetailstatusreasoncoding.getVersion()));
		} else {
			c.addCarePlnActvtyDtlStsRsnCdgVrsn("NULL");
		}

		if(careplanactivitydetailstatusreasoncodingi == careplanactivitydetailstatusreasoncodinglist.size()-1) {c.addCarePlnActvtyDtlStsRsnCdgVrsn("]]");}


		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailstatusreasoncodingi == 0) {c.addCarePlnActvtyDtlStsRsnCdgCd("[[");}
		if(careplanactivitydetailstatusreasoncoding.hasCode()) {

			c.addCarePlnActvtyDtlStsRsnCdgCd(String.valueOf(careplanactivitydetailstatusreasoncoding.getCode()));
		} else {
			c.addCarePlnActvtyDtlStsRsnCdgCd("NULL");
		}

		if(careplanactivitydetailstatusreasoncodingi == careplanactivitydetailstatusreasoncodinglist.size()-1) {c.addCarePlnActvtyDtlStsRsnCdgCd("]]");}


		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailstatusreasoncodingi == 0) {c.addCarePlnActvtyDtlStsRsnCdgUsrSltd("[[");}
		if(careplanactivitydetailstatusreasoncoding.hasUserSelected()) {

			c.addCarePlnActvtyDtlStsRsnCdgUsrSltd(String.valueOf(careplanactivitydetailstatusreasoncoding.getUserSelected()));
		} else {
			c.addCarePlnActvtyDtlStsRsnCdgUsrSltd("NULL");
		}

		if(careplanactivitydetailstatusreasoncodingi == careplanactivitydetailstatusreasoncodinglist.size()-1) {c.addCarePlnActvtyDtlStsRsnCdgUsrSltd("]]");}


		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailstatusreasoncodingi == 0) {c.addCarePlnActvtyDtlStsRsnCdgSys("[[");}
		if(careplanactivitydetailstatusreasoncoding.hasSystem()) {

			c.addCarePlnActvtyDtlStsRsnCdgSys(String.valueOf(careplanactivitydetailstatusreasoncoding.getSystem()));
		} else {
			c.addCarePlnActvtyDtlStsRsnCdgSys("NULL");
		}

		if(careplanactivitydetailstatusreasoncodingi == careplanactivitydetailstatusreasoncodinglist.size()-1) {c.addCarePlnActvtyDtlStsRsnCdgSys("]]");}


		 };
		/******************** CarePln_Actvty_Dtl_DoNotPerform ********************************************************************************/
		if(careplanactivitydetail.hasDoNotPerform()) {

			c.addCarePlnActvtyDtlDoNotPerform(String.valueOf(careplanactivitydetail.getDoNotPerform()));
		} else {
			c.addCarePlnActvtyDtlDoNotPerform("NULL");
		}


		/******************** CarePln_Actvty_OutcomeRfrnc ********************************************************************************/
		if(careplanactivityi == 0) {c.addCarePlnActvtyOutcomeRfrnc("[");}
		if(careplanactivity.hasOutcomeReference()) {

			String  array = "[";
			for(int incr=0; incr<careplanactivity.getOutcomeReference().size(); incr++) {
				array = array + careplanactivity.getOutcomeReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnActvtyOutcomeRfrnc(array);

		} else {
			c.addCarePlnActvtyOutcomeRfrnc("NULL");
		}

		if(careplanactivityi == careplanactivitylist.size()-1) {c.addCarePlnActvtyOutcomeRfrnc("]");}


		/******************** careplanactivityprogress ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> careplanactivityprogresslist = careplanactivity.getProgress();
		for(int careplanactivityprogressi = 0; careplanactivityprogressi<careplanactivityprogresslist.size();careplanactivityprogressi++ ) {
		org.hl7.fhir.r4.model.Annotation  careplanactivityprogress = careplanactivityprogresslist.get(careplanactivityprogressi);

		/******************** CarePln_Actvty_Progress_Time ********************************************************************************/
		if(careplanactivityprogressi == 0) {c.addCarePlnActvtyProgressTime("[[");}
		if(careplanactivityprogress.hasTime()) {

			c.addCarePlnActvtyProgressTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(careplanactivityprogress.getTime())+"\"");
		} else {
			c.addCarePlnActvtyProgressTime("NULL");
		}

		if(careplanactivityprogressi == careplanactivityprogresslist.size()-1) {c.addCarePlnActvtyProgressTime("]]");}


		/******************** CarePln_Actvty_Progress_AthrRfrnc ********************************************************************************/
		if(careplanactivityprogressi == 0) {c.addCarePlnActvtyProgressAthrRfrnc("[[");}
		if(careplanactivityprogress.hasAuthorReference()) {

			if(careplanactivityprogress.getAuthorReference().getReference() != null) {
			c.addCarePlnActvtyProgressAthrRfrnc(careplanactivityprogress.getAuthorReference().getReference());
			}
		} else {
			c.addCarePlnActvtyProgressAthrRfrnc("NULL");
		}

		if(careplanactivityprogressi == careplanactivityprogresslist.size()-1) {c.addCarePlnActvtyProgressAthrRfrnc("]]");}


		/******************** CarePln_Actvty_Progress_Txt ********************************************************************************/
		if(careplanactivityprogressi == 0) {c.addCarePlnActvtyProgressTxt("[[");}
		if(careplanactivityprogress.hasText()) {

			c.addCarePlnActvtyProgressTxt(String.valueOf(careplanactivityprogress.getText()));
		} else {
			c.addCarePlnActvtyProgressTxt("NULL");
		}

		if(careplanactivityprogressi == careplanactivityprogresslist.size()-1) {c.addCarePlnActvtyProgressTxt("]]");}


		/******************** CarePln_Actvty_Progress_AthrStrgTyp ********************************************************************************/
		if(careplanactivityprogressi == 0) {c.addCarePlnActvtyProgressAthrStrgTyp("[[");}
		if(careplanactivityprogress.hasAuthorStringType()) {

			c.addCarePlnActvtyProgressAthrStrgTyp("\""+careplanactivityprogress.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCarePlnActvtyProgressAthrStrgTyp("NULL");
		}

		if(careplanactivityprogressi == careplanactivityprogresslist.size()-1) {c.addCarePlnActvtyProgressAthrStrgTyp("]]");}


		 };
		/******************** careplanactivityoutcomecodeableconcept ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> careplanactivityoutcomecodeableconceptlist = careplanactivity.getOutcomeCodeableConcept();
		for(int careplanactivityoutcomecodeableconcepti = 0; careplanactivityoutcomecodeableconcepti<careplanactivityoutcomecodeableconceptlist.size();careplanactivityoutcomecodeableconcepti++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  careplanactivityoutcomecodeableconcept = careplanactivityoutcomecodeableconceptlist.get(careplanactivityoutcomecodeableconcepti);

		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Txt ********************************************************************************/
		if(careplanactivityoutcomecodeableconcepti == 0) {c.addCarePlnActvtyOutcomeCdbleCncptTxt("[[");}
		if(careplanactivityoutcomecodeableconcept.hasText()) {

			c.addCarePlnActvtyOutcomeCdbleCncptTxt(String.valueOf(careplanactivityoutcomecodeableconcept.getText()));
		} else {
			c.addCarePlnActvtyOutcomeCdbleCncptTxt("NULL");
		}

		if(careplanactivityoutcomecodeableconcepti == careplanactivityoutcomecodeableconceptlist.size()-1) {c.addCarePlnActvtyOutcomeCdbleCncptTxt("]]");}


		/******************** careplanactivityoutcomecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> careplanactivityoutcomecodeableconceptcodinglist = careplanactivityoutcomecodeableconcept.getCoding();
		for(int careplanactivityoutcomecodeableconceptcodingi = 0; careplanactivityoutcomecodeableconceptcodingi<careplanactivityoutcomecodeableconceptcodinglist.size();careplanactivityoutcomecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  careplanactivityoutcomecodeableconceptcoding = careplanactivityoutcomecodeableconceptcodinglist.get(careplanactivityoutcomecodeableconceptcodingi);

		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcodingi == 0) {c.addCarePlnActvtyOutcomeCdbleCncptCdgDsply("[[[");}
		if(careplanactivityoutcomecodeableconceptcoding.hasDisplay()) {

			c.addCarePlnActvtyOutcomeCdbleCncptCdgDsply(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getDisplay()));
		} else {
			c.addCarePlnActvtyOutcomeCdbleCncptCdgDsply("NULL");
		}

		if(careplanactivityoutcomecodeableconceptcodingi == careplanactivityoutcomecodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyOutcomeCdbleCncptCdgDsply("]]]");}


		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcodingi == 0) {c.addCarePlnActvtyOutcomeCdbleCncptCdgVrsn("[[[");}
		if(careplanactivityoutcomecodeableconceptcoding.hasVersion()) {

			c.addCarePlnActvtyOutcomeCdbleCncptCdgVrsn(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getVersion()));
		} else {
			c.addCarePlnActvtyOutcomeCdbleCncptCdgVrsn("NULL");
		}

		if(careplanactivityoutcomecodeableconceptcodingi == careplanactivityoutcomecodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyOutcomeCdbleCncptCdgVrsn("]]]");}


		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcodingi == 0) {c.addCarePlnActvtyOutcomeCdbleCncptCdgCd("[[[");}
		if(careplanactivityoutcomecodeableconceptcoding.hasCode()) {

			c.addCarePlnActvtyOutcomeCdbleCncptCdgCd(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getCode()));
		} else {
			c.addCarePlnActvtyOutcomeCdbleCncptCdgCd("NULL");
		}

		if(careplanactivityoutcomecodeableconceptcodingi == careplanactivityoutcomecodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyOutcomeCdbleCncptCdgCd("]]]");}


		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcodingi == 0) {c.addCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd("[[[");}
		if(careplanactivityoutcomecodeableconceptcoding.hasUserSelected()) {

			c.addCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getUserSelected()));
		} else {
			c.addCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd("NULL");
		}

		if(careplanactivityoutcomecodeableconceptcodingi == careplanactivityoutcomecodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd("]]]");}


		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcodingi == 0) {c.addCarePlnActvtyOutcomeCdbleCncptCdgSys("[[[");}
		if(careplanactivityoutcomecodeableconceptcoding.hasSystem()) {

			c.addCarePlnActvtyOutcomeCdbleCncptCdgSys(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getSystem()));
		} else {
			c.addCarePlnActvtyOutcomeCdbleCncptCdgSys("NULL");
		}

		if(careplanactivityoutcomecodeableconceptcodingi == careplanactivityoutcomecodeableconceptcodinglist.size()-1) {c.addCarePlnActvtyOutcomeCdbleCncptCdgSys("]]]");}


		 };
		 };
		 };
		/******************** CarePln_Ttl ********************************************************************************/
		if(careplan.hasTitle()) {

			c.addCarePlnTtl(String.valueOf(careplan.getTitle()));
		} else {
			c.addCarePlnTtl("NULL");
		}


		/******************** CarePln_SprtingInfo ********************************************************************************/
		if(careplan.hasSupportingInfo()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getSupportingInfo().size(); incr++) {
				array = array + careplan.getSupportingInfo().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnSprtingInfo(array);

		} else {
			c.addCarePlnSprtingInfo("NULL");
		}


		/******************** CarePln_InstantiatesCanonical ********************************************************************************/
		if(careplan.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getInstantiatesCanonical().size(); incr++) {
				array = array + careplan.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnInstantiatesCanonical(array);

		} else {
			c.addCarePlnInstantiatesCanonical("NULL");
		}


		/******************** CarePln_Athr ********************************************************************************/
		if(careplan.hasAuthor()) {

			if(careplan.getAuthor().getReference() != null) {
			c.addCarePlnAthr(careplan.getAuthor().getReference());
			}
		} else {
			c.addCarePlnAthr("NULL");
		}


		/******************** careplanintent ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanIntent careplanintent = careplan.getIntent();
		if(careplanintent!=null) {
			c.addCarePlnIntent(careplanintent.toCode());
		} else {
			c.addCarePlnIntent("NULL");
		}

		/******************** CarePln_PartOf ********************************************************************************/
		if(careplan.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<careplan.getPartOf().size(); incr++) {
				array = array + careplan.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCarePlnPartOf(array);

		} else {
			c.addCarePlnPartOf("NULL");
		}


		return c;
	}
}
