package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyRequest;
public class SupplyRequestBidirectionalConversion 
{
	public SupplyRequest SupplyRequests(org.hl7.fhir.r4.model.SupplyRequest supplyrequest) throws ParseException
	{
		 main.java.com.campfhir.model.SupplyRequest s = new  main.java.com.campfhir.model.SupplyRequest();

		/******************** id ********************************************************************************/
		s.setId(supplyrequest.getIdElement().getIdPart());

		/******************** supplyrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.RequestPriority supplyrequestpriority = supplyrequest.getPriority();
		if(supplyrequestpriority!=null) {
			s.addSpplyRqstPriority(supplyrequestpriority.toCode());
		} else {
			s.addSpplyRqstPriority("NULL");
		}

		/******************** supplyrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestStatus supplyrequeststatus = supplyrequest.getStatus();
		if(supplyrequeststatus!=null) {
			s.addSpplyRqstSts(supplyrequeststatus.toCode());
		} else {
			s.addSpplyRqstSts("NULL");
		}

		/******************** supplyrequestreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> supplyrequestreasoncodelist = supplyrequest.getReasonCode();
		for(int supplyrequestreasoncodei = 0; supplyrequestreasoncodei<supplyrequestreasoncodelist.size();supplyrequestreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  supplyrequestreasoncode = supplyrequestreasoncodelist.get(supplyrequestreasoncodei);

		/******************** SpplyRqst_RsnCd_Txt ********************************************************************************/
		if(supplyrequestreasoncodei == 0) {s.addSpplyRqstRsnCdTxt("[");}
		if(supplyrequestreasoncode.hasText()) {

			s.addSpplyRqstRsnCdTxt(String.valueOf(supplyrequestreasoncode.getText()));
		} else {
			s.addSpplyRqstRsnCdTxt("NULL");
		}

		if(supplyrequestreasoncodei == supplyrequestreasoncodelist.size()-1) {s.addSpplyRqstRsnCdTxt("]");}


		/******************** supplyrequestreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestreasoncodecodinglist = supplyrequestreasoncode.getCoding();
		for(int supplyrequestreasoncodecodingi = 0; supplyrequestreasoncodecodingi<supplyrequestreasoncodecodinglist.size();supplyrequestreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestreasoncodecoding = supplyrequestreasoncodecodinglist.get(supplyrequestreasoncodecodingi);

		/******************** SpplyRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(supplyrequestreasoncodecodingi == 0) {s.addSpplyRqstRsnCdCdgDsply("[[");}
		if(supplyrequestreasoncodecoding.hasDisplay()) {

			s.addSpplyRqstRsnCdCdgDsply(String.valueOf(supplyrequestreasoncodecoding.getDisplay()));
		} else {
			s.addSpplyRqstRsnCdCdgDsply("NULL");
		}

		if(supplyrequestreasoncodecodingi == supplyrequestreasoncodecodinglist.size()-1) {s.addSpplyRqstRsnCdCdgDsply("]]");}


		/******************** SpplyRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestreasoncodecodingi == 0) {s.addSpplyRqstRsnCdCdgVrsn("[[");}
		if(supplyrequestreasoncodecoding.hasVersion()) {

			s.addSpplyRqstRsnCdCdgVrsn(String.valueOf(supplyrequestreasoncodecoding.getVersion()));
		} else {
			s.addSpplyRqstRsnCdCdgVrsn("NULL");
		}

		if(supplyrequestreasoncodecodingi == supplyrequestreasoncodecodinglist.size()-1) {s.addSpplyRqstRsnCdCdgVrsn("]]");}


		/******************** SpplyRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(supplyrequestreasoncodecodingi == 0) {s.addSpplyRqstRsnCdCdgCd("[[");}
		if(supplyrequestreasoncodecoding.hasCode()) {

			s.addSpplyRqstRsnCdCdgCd(String.valueOf(supplyrequestreasoncodecoding.getCode()));
		} else {
			s.addSpplyRqstRsnCdCdgCd("NULL");
		}

		if(supplyrequestreasoncodecodingi == supplyrequestreasoncodecodinglist.size()-1) {s.addSpplyRqstRsnCdCdgCd("]]");}


		/******************** SpplyRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestreasoncodecodingi == 0) {s.addSpplyRqstRsnCdCdgUsrSltd("[[");}
		if(supplyrequestreasoncodecoding.hasUserSelected()) {

			s.addSpplyRqstRsnCdCdgUsrSltd(String.valueOf(supplyrequestreasoncodecoding.getUserSelected()));
		} else {
			s.addSpplyRqstRsnCdCdgUsrSltd("NULL");
		}

		if(supplyrequestreasoncodecodingi == supplyrequestreasoncodecodinglist.size()-1) {s.addSpplyRqstRsnCdCdgUsrSltd("]]");}


		/******************** SpplyRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(supplyrequestreasoncodecodingi == 0) {s.addSpplyRqstRsnCdCdgSys("[[");}
		if(supplyrequestreasoncodecoding.hasSystem()) {

			s.addSpplyRqstRsnCdCdgSys(String.valueOf(supplyrequestreasoncodecoding.getSystem()));
		} else {
			s.addSpplyRqstRsnCdCdgSys("NULL");
		}

		if(supplyrequestreasoncodecodingi == supplyrequestreasoncodecodinglist.size()-1) {s.addSpplyRqstRsnCdCdgSys("]]");}


		 };
		 };
		/******************** SpplyRqst_RsnRfrnc ********************************************************************************/
		if(supplyrequest.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<supplyrequest.getReasonReference().size(); incr++) {
				array = array + supplyrequest.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyRqstRsnRfrnc(array);

		} else {
			s.addSpplyRqstRsnRfrnc("NULL");
		}


		/******************** supplyrequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> supplyrequestidentifierlist = supplyrequest.getIdentifier();
		for(int supplyrequestidentifieri = 0; supplyrequestidentifieri<supplyrequestidentifierlist.size();supplyrequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  supplyrequestidentifier = supplyrequestidentifierlist.get(supplyrequestidentifieri);

		/******************** SpplyRqst_Id_Vl ********************************************************************************/
		if(supplyrequestidentifieri == 0) {s.addSpplyRqstIdVl("[");}
		if(supplyrequestidentifier.hasValue()) {

			s.addSpplyRqstIdVl(String.valueOf(supplyrequestidentifier.getValue()));
		} else {
			s.addSpplyRqstIdVl("NULL");
		}

		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {s.addSpplyRqstIdVl("]");}


		/******************** supplyrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestidentifiertype = supplyrequestidentifier.getType();

		/******************** SpplyRqst_Id_Typ_Txt ********************************************************************************/
		if(supplyrequestidentifieri == 0) {s.addSpplyRqstIdTypTxt("[");}
		if(supplyrequestidentifiertype.hasText()) {

			s.addSpplyRqstIdTypTxt(String.valueOf(supplyrequestidentifiertype.getText()));
		} else {
			s.addSpplyRqstIdTypTxt("NULL");
		}

		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {s.addSpplyRqstIdTypTxt("]");}


		/******************** supplyrequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestidentifiertypecodinglist = supplyrequestidentifiertype.getCoding();
		for(int supplyrequestidentifiertypecodingi = 0; supplyrequestidentifiertypecodingi<supplyrequestidentifiertypecodinglist.size();supplyrequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestidentifiertypecoding = supplyrequestidentifiertypecodinglist.get(supplyrequestidentifiertypecodingi);

		/******************** SpplyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(supplyrequestidentifiertypecodingi == 0) {s.addSpplyRqstIdTypCdgDsply("[[");}
		if(supplyrequestidentifiertypecoding.hasDisplay()) {

			s.addSpplyRqstIdTypCdgDsply(String.valueOf(supplyrequestidentifiertypecoding.getDisplay()));
		} else {
			s.addSpplyRqstIdTypCdgDsply("NULL");
		}

		if(supplyrequestidentifiertypecodingi == supplyrequestidentifiertypecodinglist.size()-1) {s.addSpplyRqstIdTypCdgDsply("]]");}


		/******************** SpplyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestidentifiertypecodingi == 0) {s.addSpplyRqstIdTypCdgVrsn("[[");}
		if(supplyrequestidentifiertypecoding.hasVersion()) {

			s.addSpplyRqstIdTypCdgVrsn(String.valueOf(supplyrequestidentifiertypecoding.getVersion()));
		} else {
			s.addSpplyRqstIdTypCdgVrsn("NULL");
		}

		if(supplyrequestidentifiertypecodingi == supplyrequestidentifiertypecodinglist.size()-1) {s.addSpplyRqstIdTypCdgVrsn("]]");}


		/******************** SpplyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(supplyrequestidentifiertypecodingi == 0) {s.addSpplyRqstIdTypCdgCd("[[");}
		if(supplyrequestidentifiertypecoding.hasCode()) {

			s.addSpplyRqstIdTypCdgCd(String.valueOf(supplyrequestidentifiertypecoding.getCode()));
		} else {
			s.addSpplyRqstIdTypCdgCd("NULL");
		}

		if(supplyrequestidentifiertypecodingi == supplyrequestidentifiertypecodinglist.size()-1) {s.addSpplyRqstIdTypCdgCd("]]");}


		/******************** SpplyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestidentifiertypecodingi == 0) {s.addSpplyRqstIdTypCdgUsrSltd("[[");}
		if(supplyrequestidentifiertypecoding.hasUserSelected()) {

			s.addSpplyRqstIdTypCdgUsrSltd(String.valueOf(supplyrequestidentifiertypecoding.getUserSelected()));
		} else {
			s.addSpplyRqstIdTypCdgUsrSltd("NULL");
		}

		if(supplyrequestidentifiertypecodingi == supplyrequestidentifiertypecodinglist.size()-1) {s.addSpplyRqstIdTypCdgUsrSltd("]]");}


		/******************** SpplyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(supplyrequestidentifiertypecodingi == 0) {s.addSpplyRqstIdTypCdgSys("[[");}
		if(supplyrequestidentifiertypecoding.hasSystem()) {

			s.addSpplyRqstIdTypCdgSys(String.valueOf(supplyrequestidentifiertypecoding.getSystem()));
		} else {
			s.addSpplyRqstIdTypCdgSys("NULL");
		}

		if(supplyrequestidentifiertypecodingi == supplyrequestidentifiertypecodinglist.size()-1) {s.addSpplyRqstIdTypCdgSys("]]");}


		 };
		/******************** supplyrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestidentifierperiod = supplyrequestidentifier.getPeriod();

		/******************** SpplyRqst_Id_Prd_Strt ********************************************************************************/
		if(supplyrequestidentifieri == 0) {s.addSpplyRqstIdPrdStrt("[");}
		if(supplyrequestidentifierperiod.hasStart()) {

			s.addSpplyRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequestidentifierperiod.getStart())+"\"");
		} else {
			s.addSpplyRqstIdPrdStrt("NULL");
		}

		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {s.addSpplyRqstIdPrdStrt("]");}


		/******************** SpplyRqst_Id_Prd_End ********************************************************************************/
		if(supplyrequestidentifieri == 0) {s.addSpplyRqstIdPrdEnd("[");}
		if(supplyrequestidentifierperiod.hasEnd()) {

			s.addSpplyRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequestidentifierperiod.getEnd())+"\"");
		} else {
			s.addSpplyRqstIdPrdEnd("NULL");
		}

		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {s.addSpplyRqstIdPrdEnd("]");}


		/******************** supplyrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse supplyrequestidentifieruse = supplyrequestidentifier.getUse();
		if(supplyrequestidentifieruse!=null) {
		if(supplyrequestidentifieri == 0) {

		s.addSpplyRqstIdUse("[");		}
			s.addSpplyRqstIdUse(supplyrequestidentifieruse.toCode());
		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {

		s.addSpplyRqstIdUse("]");		}

		} else {
			s.addSpplyRqstIdUse("NULL");
		}

		/******************** SpplyRqst_Id_Assigner ********************************************************************************/
		if(supplyrequestidentifieri == 0) {s.addSpplyRqstIdAssigner("[");}
		if(supplyrequestidentifier.hasAssigner()) {

			if(supplyrequestidentifier.getAssigner().getReference() != null) {
			s.addSpplyRqstIdAssigner(supplyrequestidentifier.getAssigner().getReference());
			}
		} else {
			s.addSpplyRqstIdAssigner("NULL");
		}

		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {s.addSpplyRqstIdAssigner("]");}


		/******************** SpplyRqst_Id_Sys ********************************************************************************/
		if(supplyrequestidentifieri == 0) {s.addSpplyRqstIdSys("[");}
		if(supplyrequestidentifier.hasSystem()) {

			s.addSpplyRqstIdSys(String.valueOf(supplyrequestidentifier.getSystem()));
		} else {
			s.addSpplyRqstIdSys("NULL");
		}

		if(supplyrequestidentifieri == supplyrequestidentifierlist.size()-1) {s.addSpplyRqstIdSys("]");}


		 };
		/******************** supplyrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestcategory = supplyrequest.getCategory();

		/******************** SpplyRqst_Ctgry_Txt ********************************************************************************/
		if(supplyrequestcategory.hasText()) {

			s.addSpplyRqstCtgryTxt(String.valueOf(supplyrequestcategory.getText()));
		} else {
			s.addSpplyRqstCtgryTxt("NULL");
		}


		/******************** supplyrequestcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestcategorycodinglist = supplyrequestcategory.getCoding();
		for(int supplyrequestcategorycodingi = 0; supplyrequestcategorycodingi<supplyrequestcategorycodinglist.size();supplyrequestcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestcategorycoding = supplyrequestcategorycodinglist.get(supplyrequestcategorycodingi);

		/******************** SpplyRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(supplyrequestcategorycodingi == 0) {s.addSpplyRqstCtgryCdgDsply("[");}
		if(supplyrequestcategorycoding.hasDisplay()) {

			s.addSpplyRqstCtgryCdgDsply(String.valueOf(supplyrequestcategorycoding.getDisplay()));
		} else {
			s.addSpplyRqstCtgryCdgDsply("NULL");
		}

		if(supplyrequestcategorycodingi == supplyrequestcategorycodinglist.size()-1) {s.addSpplyRqstCtgryCdgDsply("]");}


		/******************** SpplyRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestcategorycodingi == 0) {s.addSpplyRqstCtgryCdgVrsn("[");}
		if(supplyrequestcategorycoding.hasVersion()) {

			s.addSpplyRqstCtgryCdgVrsn(String.valueOf(supplyrequestcategorycoding.getVersion()));
		} else {
			s.addSpplyRqstCtgryCdgVrsn("NULL");
		}

		if(supplyrequestcategorycodingi == supplyrequestcategorycodinglist.size()-1) {s.addSpplyRqstCtgryCdgVrsn("]");}


		/******************** SpplyRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(supplyrequestcategorycodingi == 0) {s.addSpplyRqstCtgryCdgCd("[");}
		if(supplyrequestcategorycoding.hasCode()) {

			s.addSpplyRqstCtgryCdgCd(String.valueOf(supplyrequestcategorycoding.getCode()));
		} else {
			s.addSpplyRqstCtgryCdgCd("NULL");
		}

		if(supplyrequestcategorycodingi == supplyrequestcategorycodinglist.size()-1) {s.addSpplyRqstCtgryCdgCd("]");}


		/******************** SpplyRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestcategorycodingi == 0) {s.addSpplyRqstCtgryCdgUsrSltd("[");}
		if(supplyrequestcategorycoding.hasUserSelected()) {

			s.addSpplyRqstCtgryCdgUsrSltd(String.valueOf(supplyrequestcategorycoding.getUserSelected()));
		} else {
			s.addSpplyRqstCtgryCdgUsrSltd("NULL");
		}

		if(supplyrequestcategorycodingi == supplyrequestcategorycodinglist.size()-1) {s.addSpplyRqstCtgryCdgUsrSltd("]");}


		/******************** SpplyRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(supplyrequestcategorycodingi == 0) {s.addSpplyRqstCtgryCdgSys("[");}
		if(supplyrequestcategorycoding.hasSystem()) {

			s.addSpplyRqstCtgryCdgSys(String.valueOf(supplyrequestcategorycoding.getSystem()));
		} else {
			s.addSpplyRqstCtgryCdgSys("NULL");
		}

		if(supplyrequestcategorycodingi == supplyrequestcategorycodinglist.size()-1) {s.addSpplyRqstCtgryCdgSys("]");}


		 };
		/******************** SpplyRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(supplyrequest.hasOccurrenceDateTimeType()) {

			s.addSpplyRqstOccrnceDtTimeTyp("\""+supplyrequest.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			s.addSpplyRqstOccrnceDtTimeTyp("NULL");
		}


		/******************** supplyrequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestoccurrenceperiod = supplyrequest.getOccurrencePeriod();

		/******************** SpplyRqst_OccrncePrd_Strt ********************************************************************************/
		if(supplyrequestoccurrenceperiod.hasStart()) {

			s.addSpplyRqstOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequestoccurrenceperiod.getStart())+"\"");
		} else {
			s.addSpplyRqstOccrncePrdStrt("NULL");
		}


		/******************** SpplyRqst_OccrncePrd_End ********************************************************************************/
		if(supplyrequestoccurrenceperiod.hasEnd()) {

			s.addSpplyRqstOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequestoccurrenceperiod.getEnd())+"\"");
		} else {
			s.addSpplyRqstOccrncePrdEnd("NULL");
		}


		/******************** SpplyRqst_Rqster ********************************************************************************/
		if(supplyrequest.hasRequester()) {

			if(supplyrequest.getRequester().getReference() != null) {
			s.addSpplyRqstRqster(supplyrequest.getRequester().getReference());
			}
		} else {
			s.addSpplyRqstRqster("NULL");
		}


		/******************** supplyrequestparameter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent> supplyrequestparameterlist = supplyrequest.getParameter();
		for(int supplyrequestparameteri = 0; supplyrequestparameteri<supplyrequestparameterlist.size();supplyrequestparameteri++ ) {
		org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent  supplyrequestparameter = supplyrequestparameterlist.get(supplyrequestparameteri);

		/******************** supplyrequestparametercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestparametercode = supplyrequestparameter.getCode();

		/******************** SpplyRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrCdTxt("[");}
		if(supplyrequestparametercode.hasText()) {

			s.addSpplyRqstPrmtrCdTxt(String.valueOf(supplyrequestparametercode.getText()));
		} else {
			s.addSpplyRqstPrmtrCdTxt("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrCdTxt("]");}


		/******************** supplyrequestparametercodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestparametercodecodinglist = supplyrequestparametercode.getCoding();
		for(int supplyrequestparametercodecodingi = 0; supplyrequestparametercodecodingi<supplyrequestparametercodecodinglist.size();supplyrequestparametercodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestparametercodecoding = supplyrequestparametercodecodinglist.get(supplyrequestparametercodecodingi);

		/******************** SpplyRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(supplyrequestparametercodecodingi == 0) {s.addSpplyRqstPrmtrCdCdgDsply("[[");}
		if(supplyrequestparametercodecoding.hasDisplay()) {

			s.addSpplyRqstPrmtrCdCdgDsply(String.valueOf(supplyrequestparametercodecoding.getDisplay()));
		} else {
			s.addSpplyRqstPrmtrCdCdgDsply("NULL");
		}

		if(supplyrequestparametercodecodingi == supplyrequestparametercodecodinglist.size()-1) {s.addSpplyRqstPrmtrCdCdgDsply("]]");}


		/******************** SpplyRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestparametercodecodingi == 0) {s.addSpplyRqstPrmtrCdCdgVrsn("[[");}
		if(supplyrequestparametercodecoding.hasVersion()) {

			s.addSpplyRqstPrmtrCdCdgVrsn(String.valueOf(supplyrequestparametercodecoding.getVersion()));
		} else {
			s.addSpplyRqstPrmtrCdCdgVrsn("NULL");
		}

		if(supplyrequestparametercodecodingi == supplyrequestparametercodecodinglist.size()-1) {s.addSpplyRqstPrmtrCdCdgVrsn("]]");}


		/******************** SpplyRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(supplyrequestparametercodecodingi == 0) {s.addSpplyRqstPrmtrCdCdgCd("[[");}
		if(supplyrequestparametercodecoding.hasCode()) {

			s.addSpplyRqstPrmtrCdCdgCd(String.valueOf(supplyrequestparametercodecoding.getCode()));
		} else {
			s.addSpplyRqstPrmtrCdCdgCd("NULL");
		}

		if(supplyrequestparametercodecodingi == supplyrequestparametercodecodinglist.size()-1) {s.addSpplyRqstPrmtrCdCdgCd("]]");}


		/******************** SpplyRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestparametercodecodingi == 0) {s.addSpplyRqstPrmtrCdCdgUsrSltd("[[");}
		if(supplyrequestparametercodecoding.hasUserSelected()) {

			s.addSpplyRqstPrmtrCdCdgUsrSltd(String.valueOf(supplyrequestparametercodecoding.getUserSelected()));
		} else {
			s.addSpplyRqstPrmtrCdCdgUsrSltd("NULL");
		}

		if(supplyrequestparametercodecodingi == supplyrequestparametercodecodinglist.size()-1) {s.addSpplyRqstPrmtrCdCdgUsrSltd("]]");}


		/******************** SpplyRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(supplyrequestparametercodecodingi == 0) {s.addSpplyRqstPrmtrCdCdgSys("[[");}
		if(supplyrequestparametercodecoding.hasSystem()) {

			s.addSpplyRqstPrmtrCdCdgSys(String.valueOf(supplyrequestparametercodecoding.getSystem()));
		} else {
			s.addSpplyRqstPrmtrCdCdgSys("NULL");
		}

		if(supplyrequestparametercodecodingi == supplyrequestparametercodecodinglist.size()-1) {s.addSpplyRqstPrmtrCdCdgSys("]]");}


		 };
		/******************** SpplyRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlBooleanTyp("[");}
		if(supplyrequestparameter.hasValueBooleanType()) {

			s.addSpplyRqstPrmtrVlBooleanTyp("\""+supplyrequestparameter.getValueBooleanType().getValueAsString()+"\"");
		} else {
			s.addSpplyRqstPrmtrVlBooleanTyp("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlBooleanTyp("]");}


		/******************** supplyrequestparametervaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestparametervaluecodeableconcept = supplyrequestparameter.getValueCodeableConcept();

		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlCdbleCncptTxt("[");}
		if(supplyrequestparametervaluecodeableconcept.hasText()) {

			s.addSpplyRqstPrmtrVlCdbleCncptTxt(String.valueOf(supplyrequestparametervaluecodeableconcept.getText()));
		} else {
			s.addSpplyRqstPrmtrVlCdbleCncptTxt("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlCdbleCncptTxt("]");}


		/******************** supplyrequestparametervaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestparametervaluecodeableconceptcodinglist = supplyrequestparametervaluecodeableconcept.getCoding();
		for(int supplyrequestparametervaluecodeableconceptcodingi = 0; supplyrequestparametervaluecodeableconceptcodingi<supplyrequestparametervaluecodeableconceptcodinglist.size();supplyrequestparametervaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestparametervaluecodeableconceptcoding = supplyrequestparametervaluecodeableconceptcodinglist.get(supplyrequestparametervaluecodeableconceptcodingi);

		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcodingi == 0) {s.addSpplyRqstPrmtrVlCdbleCncptCdgDsply("[[");}
		if(supplyrequestparametervaluecodeableconceptcoding.hasDisplay()) {

			s.addSpplyRqstPrmtrVlCdbleCncptCdgDsply(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getDisplay()));
		} else {
			s.addSpplyRqstPrmtrVlCdbleCncptCdgDsply("NULL");
		}

		if(supplyrequestparametervaluecodeableconceptcodingi == supplyrequestparametervaluecodeableconceptcodinglist.size()-1) {s.addSpplyRqstPrmtrVlCdbleCncptCdgDsply("]]");}


		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcodingi == 0) {s.addSpplyRqstPrmtrVlCdbleCncptCdgVrsn("[[");}
		if(supplyrequestparametervaluecodeableconceptcoding.hasVersion()) {

			s.addSpplyRqstPrmtrVlCdbleCncptCdgVrsn(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getVersion()));
		} else {
			s.addSpplyRqstPrmtrVlCdbleCncptCdgVrsn("NULL");
		}

		if(supplyrequestparametervaluecodeableconceptcodingi == supplyrequestparametervaluecodeableconceptcodinglist.size()-1) {s.addSpplyRqstPrmtrVlCdbleCncptCdgVrsn("]]");}


		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcodingi == 0) {s.addSpplyRqstPrmtrVlCdbleCncptCdgCd("[[");}
		if(supplyrequestparametervaluecodeableconceptcoding.hasCode()) {

			s.addSpplyRqstPrmtrVlCdbleCncptCdgCd(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getCode()));
		} else {
			s.addSpplyRqstPrmtrVlCdbleCncptCdgCd("NULL");
		}

		if(supplyrequestparametervaluecodeableconceptcodingi == supplyrequestparametervaluecodeableconceptcodinglist.size()-1) {s.addSpplyRqstPrmtrVlCdbleCncptCdgCd("]]");}


		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcodingi == 0) {s.addSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd("[[");}
		if(supplyrequestparametervaluecodeableconceptcoding.hasUserSelected()) {

			s.addSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getUserSelected()));
		} else {
			s.addSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(supplyrequestparametervaluecodeableconceptcodingi == supplyrequestparametervaluecodeableconceptcodinglist.size()-1) {s.addSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd("]]");}


		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcodingi == 0) {s.addSpplyRqstPrmtrVlCdbleCncptCdgSys("[[");}
		if(supplyrequestparametervaluecodeableconceptcoding.hasSystem()) {

			s.addSpplyRqstPrmtrVlCdbleCncptCdgSys(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getSystem()));
		} else {
			s.addSpplyRqstPrmtrVlCdbleCncptCdgSys("NULL");
		}

		if(supplyrequestparametervaluecodeableconceptcodingi == supplyrequestparametervaluecodeableconceptcodinglist.size()-1) {s.addSpplyRqstPrmtrVlCdbleCncptCdgSys("]]");}


		 };
		/******************** supplyrequestparametervaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplyrequestparametervaluerange = supplyrequestparameter.getValueRange();

		/******************** supplyrequestparametervaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluerangelow = supplyrequestparametervaluerange.getLow();

		/******************** SpplyRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngLwVl("[");}
		if(supplyrequestparametervaluerangelow.hasValue()) {

			s.addSpplyRqstPrmtrVlRngLwVl(String.valueOf(supplyrequestparametervaluerangelow.getValue()));
		} else {
			s.addSpplyRqstPrmtrVlRngLwVl("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngLwVl("]");}


		/******************** supplyrequestparametervaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestparametervaluerangelowcomparator = supplyrequestparametervaluerangelow.getComparator();
		if(supplyrequestparametervaluerangelowcomparator!=null) {
		if(supplyrequestparameteri == 0) {

		s.addSpplyRqstPrmtrVlRngLwCmprtr("[");		}
			s.addSpplyRqstPrmtrVlRngLwCmprtr(supplyrequestparametervaluerangelowcomparator.toCode());
		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {

		s.addSpplyRqstPrmtrVlRngLwCmprtr("]");		}

		} else {
			s.addSpplyRqstPrmtrVlRngLwCmprtr("NULL");
		}

		/******************** SpplyRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngLwCd("[");}
		if(supplyrequestparametervaluerangelow.hasCode()) {

			s.addSpplyRqstPrmtrVlRngLwCd(String.valueOf(supplyrequestparametervaluerangelow.getCode()));
		} else {
			s.addSpplyRqstPrmtrVlRngLwCd("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngLwCd("]");}


		/******************** SpplyRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngLwUnt("[");}
		if(supplyrequestparametervaluerangelow.hasUnit()) {

			s.addSpplyRqstPrmtrVlRngLwUnt(String.valueOf(supplyrequestparametervaluerangelow.getUnit()));
		} else {
			s.addSpplyRqstPrmtrVlRngLwUnt("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngLwUnt("]");}


		/******************** SpplyRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngLwSys("[");}
		if(supplyrequestparametervaluerangelow.hasSystem()) {

			s.addSpplyRqstPrmtrVlRngLwSys(String.valueOf(supplyrequestparametervaluerangelow.getSystem()));
		} else {
			s.addSpplyRqstPrmtrVlRngLwSys("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngLwSys("]");}


		/******************** supplyrequestparametervaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluerangehigh = supplyrequestparametervaluerange.getHigh();

		/******************** SpplyRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngHiVl("[");}
		if(supplyrequestparametervaluerangehigh.hasValue()) {

			s.addSpplyRqstPrmtrVlRngHiVl(String.valueOf(supplyrequestparametervaluerangehigh.getValue()));
		} else {
			s.addSpplyRqstPrmtrVlRngHiVl("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngHiVl("]");}


		/******************** supplyrequestparametervaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestparametervaluerangehighcomparator = supplyrequestparametervaluerangehigh.getComparator();
		if(supplyrequestparametervaluerangehighcomparator!=null) {
		if(supplyrequestparameteri == 0) {

		s.addSpplyRqstPrmtrVlRngHiCmprtr("[");		}
			s.addSpplyRqstPrmtrVlRngHiCmprtr(supplyrequestparametervaluerangehighcomparator.toCode());
		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {

		s.addSpplyRqstPrmtrVlRngHiCmprtr("]");		}

		} else {
			s.addSpplyRqstPrmtrVlRngHiCmprtr("NULL");
		}

		/******************** SpplyRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngHiCd("[");}
		if(supplyrequestparametervaluerangehigh.hasCode()) {

			s.addSpplyRqstPrmtrVlRngHiCd(String.valueOf(supplyrequestparametervaluerangehigh.getCode()));
		} else {
			s.addSpplyRqstPrmtrVlRngHiCd("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngHiCd("]");}


		/******************** SpplyRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngHiUnt("[");}
		if(supplyrequestparametervaluerangehigh.hasUnit()) {

			s.addSpplyRqstPrmtrVlRngHiUnt(String.valueOf(supplyrequestparametervaluerangehigh.getUnit()));
		} else {
			s.addSpplyRqstPrmtrVlRngHiUnt("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngHiUnt("]");}


		/******************** SpplyRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlRngHiSys("[");}
		if(supplyrequestparametervaluerangehigh.hasSystem()) {

			s.addSpplyRqstPrmtrVlRngHiSys(String.valueOf(supplyrequestparametervaluerangehigh.getSystem()));
		} else {
			s.addSpplyRqstPrmtrVlRngHiSys("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlRngHiSys("]");}


		/******************** supplyrequestparametervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluequantity = supplyrequestparameter.getValueQuantity();

		/******************** SpplyRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlQntyVl("[");}
		if(supplyrequestparametervaluequantity.hasValue()) {

			s.addSpplyRqstPrmtrVlQntyVl(String.valueOf(supplyrequestparametervaluequantity.getValue()));
		} else {
			s.addSpplyRqstPrmtrVlQntyVl("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlQntyVl("]");}


		/******************** supplyrequestparametervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestparametervaluequantitycomparator = supplyrequestparametervaluequantity.getComparator();
		if(supplyrequestparametervaluequantitycomparator!=null) {
		if(supplyrequestparameteri == 0) {

		s.addSpplyRqstPrmtrVlQntyCmprtr("[");		}
			s.addSpplyRqstPrmtrVlQntyCmprtr(supplyrequestparametervaluequantitycomparator.toCode());
		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {

		s.addSpplyRqstPrmtrVlQntyCmprtr("]");		}

		} else {
			s.addSpplyRqstPrmtrVlQntyCmprtr("NULL");
		}

		/******************** SpplyRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlQntyCd("[");}
		if(supplyrequestparametervaluequantity.hasCode()) {

			s.addSpplyRqstPrmtrVlQntyCd(String.valueOf(supplyrequestparametervaluequantity.getCode()));
		} else {
			s.addSpplyRqstPrmtrVlQntyCd("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlQntyCd("]");}


		/******************** SpplyRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlQntyUnt("[");}
		if(supplyrequestparametervaluequantity.hasUnit()) {

			s.addSpplyRqstPrmtrVlQntyUnt(String.valueOf(supplyrequestparametervaluequantity.getUnit()));
		} else {
			s.addSpplyRqstPrmtrVlQntyUnt("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlQntyUnt("]");}


		/******************** SpplyRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(supplyrequestparameteri == 0) {s.addSpplyRqstPrmtrVlQntySys("[");}
		if(supplyrequestparametervaluequantity.hasSystem()) {

			s.addSpplyRqstPrmtrVlQntySys(String.valueOf(supplyrequestparametervaluequantity.getSystem()));
		} else {
			s.addSpplyRqstPrmtrVlQntySys("NULL");
		}

		if(supplyrequestparameteri == supplyrequestparameterlist.size()-1) {s.addSpplyRqstPrmtrVlQntySys("]");}


		 };
		/******************** SpplyRqst_ItmRfrnc ********************************************************************************/
		if(supplyrequest.hasItemReference()) {

			if(supplyrequest.getItemReference().getReference() != null) {
			s.addSpplyRqstItmRfrnc(supplyrequest.getItemReference().getReference());
			}
		} else {
			s.addSpplyRqstItmRfrnc("NULL");
		}


		/******************** SpplyRqst_DeliverFrom ********************************************************************************/
		if(supplyrequest.hasDeliverFrom()) {

			if(supplyrequest.getDeliverFrom().getReference() != null) {
			s.addSpplyRqstDeliverFrom(supplyrequest.getDeliverFrom().getReference());
			}
		} else {
			s.addSpplyRqstDeliverFrom("NULL");
		}


		/******************** SpplyRqst_DeliverTo ********************************************************************************/
		if(supplyrequest.hasDeliverTo()) {

			if(supplyrequest.getDeliverTo().getReference() != null) {
			s.addSpplyRqstDeliverTo(supplyrequest.getDeliverTo().getReference());
			}
		} else {
			s.addSpplyRqstDeliverTo("NULL");
		}


		/******************** SpplyRqst_Supplier ********************************************************************************/
		if(supplyrequest.hasSupplier()) {

			String  array = "[";
			for(int incr=0; incr<supplyrequest.getSupplier().size(); incr++) {
				array = array + supplyrequest.getSupplier().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyRqstSupplier(array);

		} else {
			s.addSpplyRqstSupplier("NULL");
		}


		/******************** supplyrequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing supplyrequestoccurrencetiming = supplyrequest.getOccurrenceTiming();

		/******************** supplyrequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestoccurrencetimingcode = supplyrequestoccurrencetiming.getCode();

		/******************** SpplyRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(supplyrequestoccurrencetimingcode.hasText()) {

			s.addSpplyRqstOccrnceTmgCdTxt(String.valueOf(supplyrequestoccurrencetimingcode.getText()));
		} else {
			s.addSpplyRqstOccrnceTmgCdTxt("NULL");
		}


		/******************** supplyrequestoccurrencetimingcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestoccurrencetimingcodecodinglist = supplyrequestoccurrencetimingcode.getCoding();
		for(int supplyrequestoccurrencetimingcodecodingi = 0; supplyrequestoccurrencetimingcodecodingi<supplyrequestoccurrencetimingcodecodinglist.size();supplyrequestoccurrencetimingcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestoccurrencetimingcodecoding = supplyrequestoccurrencetimingcodecodinglist.get(supplyrequestoccurrencetimingcodecodingi);

		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecodingi == 0) {s.addSpplyRqstOccrnceTmgCdCdgDsply("[");}
		if(supplyrequestoccurrencetimingcodecoding.hasDisplay()) {

			s.addSpplyRqstOccrnceTmgCdCdgDsply(String.valueOf(supplyrequestoccurrencetimingcodecoding.getDisplay()));
		} else {
			s.addSpplyRqstOccrnceTmgCdCdgDsply("NULL");
		}

		if(supplyrequestoccurrencetimingcodecodingi == supplyrequestoccurrencetimingcodecodinglist.size()-1) {s.addSpplyRqstOccrnceTmgCdCdgDsply("]");}


		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecodingi == 0) {s.addSpplyRqstOccrnceTmgCdCdgVrsn("[");}
		if(supplyrequestoccurrencetimingcodecoding.hasVersion()) {

			s.addSpplyRqstOccrnceTmgCdCdgVrsn(String.valueOf(supplyrequestoccurrencetimingcodecoding.getVersion()));
		} else {
			s.addSpplyRqstOccrnceTmgCdCdgVrsn("NULL");
		}

		if(supplyrequestoccurrencetimingcodecodingi == supplyrequestoccurrencetimingcodecodinglist.size()-1) {s.addSpplyRqstOccrnceTmgCdCdgVrsn("]");}


		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecodingi == 0) {s.addSpplyRqstOccrnceTmgCdCdgCd("[");}
		if(supplyrequestoccurrencetimingcodecoding.hasCode()) {

			s.addSpplyRqstOccrnceTmgCdCdgCd(String.valueOf(supplyrequestoccurrencetimingcodecoding.getCode()));
		} else {
			s.addSpplyRqstOccrnceTmgCdCdgCd("NULL");
		}

		if(supplyrequestoccurrencetimingcodecodingi == supplyrequestoccurrencetimingcodecodinglist.size()-1) {s.addSpplyRqstOccrnceTmgCdCdgCd("]");}


		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecodingi == 0) {s.addSpplyRqstOccrnceTmgCdCdgUsrSltd("[");}
		if(supplyrequestoccurrencetimingcodecoding.hasUserSelected()) {

			s.addSpplyRqstOccrnceTmgCdCdgUsrSltd(String.valueOf(supplyrequestoccurrencetimingcodecoding.getUserSelected()));
		} else {
			s.addSpplyRqstOccrnceTmgCdCdgUsrSltd("NULL");
		}

		if(supplyrequestoccurrencetimingcodecodingi == supplyrequestoccurrencetimingcodecodinglist.size()-1) {s.addSpplyRqstOccrnceTmgCdCdgUsrSltd("]");}


		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecodingi == 0) {s.addSpplyRqstOccrnceTmgCdCdgSys("[");}
		if(supplyrequestoccurrencetimingcodecoding.hasSystem()) {

			s.addSpplyRqstOccrnceTmgCdCdgSys(String.valueOf(supplyrequestoccurrencetimingcodecoding.getSystem()));
		} else {
			s.addSpplyRqstOccrnceTmgCdCdgSys("NULL");
		}

		if(supplyrequestoccurrencetimingcodecodingi == supplyrequestoccurrencetimingcodecodinglist.size()-1) {s.addSpplyRqstOccrnceTmgCdCdgSys("]");}


		 };
		/******************** SpplyRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(supplyrequestoccurrencetiming.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<supplyrequestoccurrencetiming.getEvent().size(); incr++) {
				array = array + supplyrequestoccurrencetiming.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyRqstOccrnceTmgEvnt(array);

		} else {
			s.addSpplyRqstOccrnceTmgEvnt("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent supplyrequestoccurrencetimingrepeat = supplyrequestoccurrencetiming.getRepeat();

		/******************** SpplyRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasOffset()) {

			s.addSpplyRqstOccrnceTmgRptOff(String.valueOf(supplyrequestoccurrencetimingrepeat.getOffset()));
		} else {
			s.addSpplyRqstOccrnceTmgRptOff("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasCount()) {

			s.addSpplyRqstOccrnceTmgRptCnt(String.valueOf(supplyrequestoccurrencetimingrepeat.getCount()));
		} else {
			s.addSpplyRqstOccrnceTmgRptCnt("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasPeriod()) {

			s.addSpplyRqstOccrnceTmgRptPrd(String.valueOf(supplyrequestoccurrencetimingrepeat.getPeriod()));
		} else {
			s.addSpplyRqstOccrnceTmgRptPrd("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasCountMax()) {

			s.addSpplyRqstOccrnceTmgRptCntMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getCountMax()));
		} else {
			s.addSpplyRqstOccrnceTmgRptCntMx("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasDurationMax()) {

			s.addSpplyRqstOccrnceTmgRptDurationMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getDurationMax()));
		} else {
			s.addSpplyRqstOccrnceTmgRptDurationMx("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestoccurrencetimingrepeatboundsperiod = supplyrequestoccurrencetimingrepeat.getBoundsPeriod();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsperiod.hasStart()) {

			s.addSpplyRqstOccrnceTmgRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequestoccurrencetimingrepeatboundsperiod.getStart())+"\"");
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsPrdStrt("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsperiod.hasEnd()) {

			s.addSpplyRqstOccrnceTmgRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequestoccurrencetimingrepeatboundsperiod.getEnd())+"\"");
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsPrdEnd("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplyrequestoccurrencetimingrepeatdurationunit = supplyrequestoccurrencetimingrepeat.getDurationUnit();
		if(supplyrequestoccurrencetimingrepeatdurationunit!=null) {
			s.addSpplyRqstOccrnceTmgRptDurationUnt(supplyrequestoccurrencetimingrepeatdurationunit.toCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptDurationUnt("NULL");
		}

		/******************** supplyrequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration supplyrequestoccurrencetimingrepeatboundsduration = supplyrequestoccurrencetimingrepeat.getBoundsDuration();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsduration.hasValue()) {

			s.addSpplyRqstOccrnceTmgRptBndsDurationVl(String.valueOf(supplyrequestoccurrencetimingrepeatboundsduration.getValue()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsDurationVl("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestoccurrencetimingrepeatboundsdurationcomparator = supplyrequestoccurrencetimingrepeatboundsduration.getComparator();
		if(supplyrequestoccurrencetimingrepeatboundsdurationcomparator!=null) {
			s.addSpplyRqstOccrnceTmgRptBndsDurationCmprtr(supplyrequestoccurrencetimingrepeatboundsdurationcomparator.toCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsDurationCmprtr("NULL");
		}

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsduration.hasCode()) {

			s.addSpplyRqstOccrnceTmgRptBndsDurationCd(String.valueOf(supplyrequestoccurrencetimingrepeatboundsduration.getCode()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsDurationCd("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsduration.hasUnit()) {

			s.addSpplyRqstOccrnceTmgRptBndsDurationUnt(String.valueOf(supplyrequestoccurrencetimingrepeatboundsduration.getUnit()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsDurationUnt("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsduration.hasSystem()) {

			s.addSpplyRqstOccrnceTmgRptBndsDurationSys(String.valueOf(supplyrequestoccurrencetimingrepeatboundsduration.getSystem()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsDurationSys("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplyrequestoccurrencetimingrepeatboundsrange = supplyrequestoccurrencetimingrepeat.getBoundsRange();

		/******************** supplyrequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestoccurrencetimingrepeatboundsrangelow = supplyrequestoccurrencetimingrepeatboundsrange.getLow();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasValue()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngLwVl(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getValue()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngLwVl("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestoccurrencetimingrepeatboundsrangelowcomparator = supplyrequestoccurrencetimingrepeatboundsrangelow.getComparator();
		if(supplyrequestoccurrencetimingrepeatboundsrangelowcomparator!=null) {
			s.addSpplyRqstOccrnceTmgRptBndsRngLwCmprtr(supplyrequestoccurrencetimingrepeatboundsrangelowcomparator.toCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngLwCmprtr("NULL");
		}

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasCode()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngLwCd(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getCode()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngLwCd("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasUnit()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngLwUnt(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getUnit()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngLwUnt("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasSystem()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngLwSys(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getSystem()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngLwSys("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestoccurrencetimingrepeatboundsrangehigh = supplyrequestoccurrencetimingrepeatboundsrange.getHigh();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasValue()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngHiVl(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getValue()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngHiVl("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestoccurrencetimingrepeatboundsrangehighcomparator = supplyrequestoccurrencetimingrepeatboundsrangehigh.getComparator();
		if(supplyrequestoccurrencetimingrepeatboundsrangehighcomparator!=null) {
			s.addSpplyRqstOccrnceTmgRptBndsRngHiCmprtr(supplyrequestoccurrencetimingrepeatboundsrangehighcomparator.toCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngHiCmprtr("NULL");
		}

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasCode()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngHiCd(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getCode()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngHiCd("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasUnit()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngHiUnt(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getUnit()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngHiUnt("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasSystem()) {

			s.addSpplyRqstOccrnceTmgRptBndsRngHiSys(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getSystem()));
		} else {
			s.addSpplyRqstOccrnceTmgRptBndsRngHiSys("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasFrequencyMax()) {

			s.addSpplyRqstOccrnceTmgRptFrqncyMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getFrequencyMax()));
		} else {
			s.addSpplyRqstOccrnceTmgRptFrqncyMx("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> supplyrequestoccurrencetimingrepeatwhenlist = supplyrequestoccurrencetimingrepeat.getWhen();
		for(int supplyrequestoccurrencetimingrepeatwheni = 0; supplyrequestoccurrencetimingrepeatwheni<supplyrequestoccurrencetimingrepeatwhenlist.size();supplyrequestoccurrencetimingrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  supplyrequestoccurrencetimingrepeatwhen = supplyrequestoccurrencetimingrepeatwhenlist.get(supplyrequestoccurrencetimingrepeatwheni);
		if(supplyrequestoccurrencetimingrepeatwhen!=null) {
			s.addSpplyRqstOccrnceTmgRptWhen(supplyrequestoccurrencetimingrepeatwhen.getCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptWhen("NULL");
		}
		 };

		/******************** supplyrequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplyrequestoccurrencetimingrepeatperiodunit = supplyrequestoccurrencetimingrepeat.getPeriodUnit();
		if(supplyrequestoccurrencetimingrepeatperiodunit!=null) {
			s.addSpplyRqstOccrnceTmgRptPrdUnt(supplyrequestoccurrencetimingrepeatperiodunit.toCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptPrdUnt("NULL");
		}

		/******************** SpplyRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasPeriodMax()) {

			s.addSpplyRqstOccrnceTmgRptPrdMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getPeriodMax()));
		} else {
			s.addSpplyRqstOccrnceTmgRptPrdMx("NULL");
		}


		/******************** supplyrequestoccurrencetimingrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> supplyrequestoccurrencetimingrepeatdayofweeklist = supplyrequestoccurrencetimingrepeat.getDayOfWeek();
		for(int supplyrequestoccurrencetimingrepeatdayofweeki = 0; supplyrequestoccurrencetimingrepeatdayofweeki<supplyrequestoccurrencetimingrepeatdayofweeklist.size();supplyrequestoccurrencetimingrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  supplyrequestoccurrencetimingrepeatdayofweek = supplyrequestoccurrencetimingrepeatdayofweeklist.get(supplyrequestoccurrencetimingrepeatdayofweeki);
		if(supplyrequestoccurrencetimingrepeatdayofweek!=null) {
			s.addSpplyRqstOccrnceTmgRptDayOfWeek(supplyrequestoccurrencetimingrepeatdayofweek.getCode());
		} else {
			s.addSpplyRqstOccrnceTmgRptDayOfWeek("NULL");
		}
		 };

		/******************** SpplyRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<supplyrequestoccurrencetimingrepeat.getTimeOfDay().size(); incr++) {
				array = array + supplyrequestoccurrencetimingrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addSpplyRqstOccrnceTmgRptTimeOfDay(array);

		} else {
			s.addSpplyRqstOccrnceTmgRptTimeOfDay("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasDuration()) {

			s.addSpplyRqstOccrnceTmgRptDuration(String.valueOf(supplyrequestoccurrencetimingrepeat.getDuration()));
		} else {
			s.addSpplyRqstOccrnceTmgRptDuration("NULL");
		}


		/******************** SpplyRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasFrequency()) {

			s.addSpplyRqstOccrnceTmgRptFrqncy(String.valueOf(supplyrequestoccurrencetimingrepeat.getFrequency()));
		} else {
			s.addSpplyRqstOccrnceTmgRptFrqncy("NULL");
		}


		/******************** supplyrequestitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestitemcodeableconcept = supplyrequest.getItemCodeableConcept();

		/******************** SpplyRqst_ItmCdbleCncpt_Txt ********************************************************************************/
		if(supplyrequestitemcodeableconcept.hasText()) {

			s.addSpplyRqstItmCdbleCncptTxt(String.valueOf(supplyrequestitemcodeableconcept.getText()));
		} else {
			s.addSpplyRqstItmCdbleCncptTxt("NULL");
		}


		/******************** supplyrequestitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> supplyrequestitemcodeableconceptcodinglist = supplyrequestitemcodeableconcept.getCoding();
		for(int supplyrequestitemcodeableconceptcodingi = 0; supplyrequestitemcodeableconceptcodingi<supplyrequestitemcodeableconceptcodinglist.size();supplyrequestitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  supplyrequestitemcodeableconceptcoding = supplyrequestitemcodeableconceptcodinglist.get(supplyrequestitemcodeableconceptcodingi);

		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(supplyrequestitemcodeableconceptcodingi == 0) {s.addSpplyRqstItmCdbleCncptCdgDsply("[");}
		if(supplyrequestitemcodeableconceptcoding.hasDisplay()) {

			s.addSpplyRqstItmCdbleCncptCdgDsply(String.valueOf(supplyrequestitemcodeableconceptcoding.getDisplay()));
		} else {
			s.addSpplyRqstItmCdbleCncptCdgDsply("NULL");
		}

		if(supplyrequestitemcodeableconceptcodingi == supplyrequestitemcodeableconceptcodinglist.size()-1) {s.addSpplyRqstItmCdbleCncptCdgDsply("]");}


		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestitemcodeableconceptcodingi == 0) {s.addSpplyRqstItmCdbleCncptCdgVrsn("[");}
		if(supplyrequestitemcodeableconceptcoding.hasVersion()) {

			s.addSpplyRqstItmCdbleCncptCdgVrsn(String.valueOf(supplyrequestitemcodeableconceptcoding.getVersion()));
		} else {
			s.addSpplyRqstItmCdbleCncptCdgVrsn("NULL");
		}

		if(supplyrequestitemcodeableconceptcodingi == supplyrequestitemcodeableconceptcodinglist.size()-1) {s.addSpplyRqstItmCdbleCncptCdgVrsn("]");}


		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(supplyrequestitemcodeableconceptcodingi == 0) {s.addSpplyRqstItmCdbleCncptCdgCd("[");}
		if(supplyrequestitemcodeableconceptcoding.hasCode()) {

			s.addSpplyRqstItmCdbleCncptCdgCd(String.valueOf(supplyrequestitemcodeableconceptcoding.getCode()));
		} else {
			s.addSpplyRqstItmCdbleCncptCdgCd("NULL");
		}

		if(supplyrequestitemcodeableconceptcodingi == supplyrequestitemcodeableconceptcodinglist.size()-1) {s.addSpplyRqstItmCdbleCncptCdgCd("]");}


		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestitemcodeableconceptcodingi == 0) {s.addSpplyRqstItmCdbleCncptCdgUsrSltd("[");}
		if(supplyrequestitemcodeableconceptcoding.hasUserSelected()) {

			s.addSpplyRqstItmCdbleCncptCdgUsrSltd(String.valueOf(supplyrequestitemcodeableconceptcoding.getUserSelected()));
		} else {
			s.addSpplyRqstItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(supplyrequestitemcodeableconceptcodingi == supplyrequestitemcodeableconceptcodinglist.size()-1) {s.addSpplyRqstItmCdbleCncptCdgUsrSltd("]");}


		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(supplyrequestitemcodeableconceptcodingi == 0) {s.addSpplyRqstItmCdbleCncptCdgSys("[");}
		if(supplyrequestitemcodeableconceptcoding.hasSystem()) {

			s.addSpplyRqstItmCdbleCncptCdgSys(String.valueOf(supplyrequestitemcodeableconceptcoding.getSystem()));
		} else {
			s.addSpplyRqstItmCdbleCncptCdgSys("NULL");
		}

		if(supplyrequestitemcodeableconceptcodingi == supplyrequestitemcodeableconceptcodinglist.size()-1) {s.addSpplyRqstItmCdbleCncptCdgSys("]");}


		 };
		/******************** supplyrequestquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestquantity = supplyrequest.getQuantity();

		/******************** SpplyRqst_Qnty_Vl ********************************************************************************/
		if(supplyrequestquantity.hasValue()) {

			s.addSpplyRqstQntyVl(String.valueOf(supplyrequestquantity.getValue()));
		} else {
			s.addSpplyRqstQntyVl("NULL");
		}


		/******************** supplyrequestquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestquantitycomparator = supplyrequestquantity.getComparator();
		if(supplyrequestquantitycomparator!=null) {
			s.addSpplyRqstQntyCmprtr(supplyrequestquantitycomparator.toCode());
		} else {
			s.addSpplyRqstQntyCmprtr("NULL");
		}

		/******************** SpplyRqst_Qnty_Cd ********************************************************************************/
		if(supplyrequestquantity.hasCode()) {

			s.addSpplyRqstQntyCd(String.valueOf(supplyrequestquantity.getCode()));
		} else {
			s.addSpplyRqstQntyCd("NULL");
		}


		/******************** SpplyRqst_Qnty_Unt ********************************************************************************/
		if(supplyrequestquantity.hasUnit()) {

			s.addSpplyRqstQntyUnt(String.valueOf(supplyrequestquantity.getUnit()));
		} else {
			s.addSpplyRqstQntyUnt("NULL");
		}


		/******************** SpplyRqst_Qnty_Sys ********************************************************************************/
		if(supplyrequestquantity.hasSystem()) {

			s.addSpplyRqstQntySys(String.valueOf(supplyrequestquantity.getSystem()));
		} else {
			s.addSpplyRqstQntySys("NULL");
		}


		/******************** SpplyRqst_AthredOn ********************************************************************************/
		if(supplyrequest.hasAuthoredOn()) {

			s.addSpplyRqstAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(supplyrequest.getAuthoredOn())+"\"");
		} else {
			s.addSpplyRqstAthredOn("NULL");
		}


		return s;
	}
}
