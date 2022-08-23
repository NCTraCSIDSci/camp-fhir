package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImagingStudy;
public class ImagingStudyBidirectionalConversion 
{
	public ImagingStudy ImagingStudys(org.hl7.fhir.r4.model.ImagingStudy imagingstudy) throws ParseException
	{
		 main.java.com.campfhir.model.ImagingStudy i = new  main.java.com.campfhir.model.ImagingStudy();

		/******************** id ********************************************************************************/
		i.setId(imagingstudy.getIdElement().getIdPart());

		/******************** ImgngStdy_Lctn ********************************************************************************/
		if(imagingstudy.hasLocation()) {

			if(imagingstudy.getLocation().getReference() != null) {
			i.addImgngStdyLctn(imagingstudy.getLocation().getReference());
			}
		} else {
			i.addImgngStdyLctn("NULL");
		}


		/******************** imagingstudymodality ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> imagingstudymodalitylist = imagingstudy.getModality();
		for(int imagingstudymodalityi = 0; imagingstudymodalityi<imagingstudymodalitylist.size();imagingstudymodalityi++ ) {
		org.hl7.fhir.r4.model.Coding  imagingstudymodality = imagingstudymodalitylist.get(imagingstudymodalityi);

		/******************** ImgngStdy_Modality_Dsply ********************************************************************************/
		if(imagingstudymodalityi == 0) {i.addImgngStdyModalityDsply("[");}
		if(imagingstudymodality.hasDisplay()) {

			i.addImgngStdyModalityDsply(String.valueOf(imagingstudymodality.getDisplay()));
		} else {
			i.addImgngStdyModalityDsply("NULL");
		}

		if(imagingstudymodalityi == imagingstudymodalitylist.size()-1) {i.addImgngStdyModalityDsply("]");}


		/******************** ImgngStdy_Modality_Vrsn ********************************************************************************/
		if(imagingstudymodalityi == 0) {i.addImgngStdyModalityVrsn("[");}
		if(imagingstudymodality.hasVersion()) {

			i.addImgngStdyModalityVrsn(String.valueOf(imagingstudymodality.getVersion()));
		} else {
			i.addImgngStdyModalityVrsn("NULL");
		}

		if(imagingstudymodalityi == imagingstudymodalitylist.size()-1) {i.addImgngStdyModalityVrsn("]");}


		/******************** ImgngStdy_Modality_Cd ********************************************************************************/
		if(imagingstudymodalityi == 0) {i.addImgngStdyModalityCd("[");}
		if(imagingstudymodality.hasCode()) {

			i.addImgngStdyModalityCd(String.valueOf(imagingstudymodality.getCode()));
		} else {
			i.addImgngStdyModalityCd("NULL");
		}

		if(imagingstudymodalityi == imagingstudymodalitylist.size()-1) {i.addImgngStdyModalityCd("]");}


		/******************** ImgngStdy_Modality_UsrSltd ********************************************************************************/
		if(imagingstudymodalityi == 0) {i.addImgngStdyModalityUsrSltd("[");}
		if(imagingstudymodality.hasUserSelected()) {

			i.addImgngStdyModalityUsrSltd(String.valueOf(imagingstudymodality.getUserSelected()));
		} else {
			i.addImgngStdyModalityUsrSltd("NULL");
		}

		if(imagingstudymodalityi == imagingstudymodalitylist.size()-1) {i.addImgngStdyModalityUsrSltd("]");}


		/******************** ImgngStdy_Modality_Sys ********************************************************************************/
		if(imagingstudymodalityi == 0) {i.addImgngStdyModalitySys("[");}
		if(imagingstudymodality.hasSystem()) {

			i.addImgngStdyModalitySys(String.valueOf(imagingstudymodality.getSystem()));
		} else {
			i.addImgngStdyModalitySys("NULL");
		}

		if(imagingstudymodalityi == imagingstudymodalitylist.size()-1) {i.addImgngStdyModalitySys("]");}


		 };
		/******************** ImgngStdy_Sbjct ********************************************************************************/
		if(imagingstudy.hasSubject()) {

			if(imagingstudy.getSubject().getReference() != null) {
			i.addImgngStdySbjct(imagingstudy.getSubject().getReference());
			}
		} else {
			i.addImgngStdySbjct("NULL");
		}


		/******************** imagingstudystatus ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudyStatus imagingstudystatus = imagingstudy.getStatus();
		if(imagingstudystatus!=null) {
			i.addImgngStdySts(imagingstudystatus.toCode());
		} else {
			i.addImgngStdySts("NULL");
		}

		/******************** ImgngStdy_Enc ********************************************************************************/
		if(imagingstudy.hasEncounter()) {

			if(imagingstudy.getEncounter().getReference() != null) {
			i.addImgngStdyEnc(imagingstudy.getEncounter().getReference());
			}
		} else {
			i.addImgngStdyEnc("NULL");
		}


		/******************** ImgngStdy_Referrer ********************************************************************************/
		if(imagingstudy.hasReferrer()) {

			if(imagingstudy.getReferrer().getReference() != null) {
			i.addImgngStdyReferrer(imagingstudy.getReferrer().getReference());
			}
		} else {
			i.addImgngStdyReferrer("NULL");
		}


		/******************** ImgngStdy_BasedOn ********************************************************************************/
		if(imagingstudy.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<imagingstudy.getBasedOn().size(); incr++) {
				array = array + imagingstudy.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImgngStdyBasedOn(array);

		} else {
			i.addImgngStdyBasedOn("NULL");
		}


		/******************** ImgngStdy_Strted ********************************************************************************/
		if(imagingstudy.hasStarted()) {

			i.addImgngStdyStrted("\""+ca.uhn.fhir.util.DateUtils.formatDate(imagingstudy.getStarted())+"\"");
		} else {
			i.addImgngStdyStrted("NULL");
		}


		/******************** ImgngStdy_Endpoint ********************************************************************************/
		if(imagingstudy.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<imagingstudy.getEndpoint().size(); incr++) {
				array = array + imagingstudy.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImgngStdyEndpoint(array);

		} else {
			i.addImgngStdyEndpoint("NULL");
		}


		/******************** ImgngStdy_Interpreter ********************************************************************************/
		if(imagingstudy.hasInterpreter()) {

			String  array = "[";
			for(int incr=0; incr<imagingstudy.getInterpreter().size(); incr++) {
				array = array + imagingstudy.getInterpreter().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImgngStdyInterpreter(array);

		} else {
			i.addImgngStdyInterpreter("NULL");
		}


		/******************** ImgngStdy_NmbrOfSeries ********************************************************************************/
		if(imagingstudy.hasNumberOfSeries()) {

			i.addImgngStdyNmbrOfSeries(String.valueOf(imagingstudy.getNumberOfSeries()));
		} else {
			i.addImgngStdyNmbrOfSeries("NULL");
		}


		/******************** imagingstudyreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> imagingstudyreasoncodelist = imagingstudy.getReasonCode();
		for(int imagingstudyreasoncodei = 0; imagingstudyreasoncodei<imagingstudyreasoncodelist.size();imagingstudyreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  imagingstudyreasoncode = imagingstudyreasoncodelist.get(imagingstudyreasoncodei);

		/******************** ImgngStdy_RsnCd_Txt ********************************************************************************/
		if(imagingstudyreasoncodei == 0) {i.addImgngStdyRsnCdTxt("[");}
		if(imagingstudyreasoncode.hasText()) {

			i.addImgngStdyRsnCdTxt(String.valueOf(imagingstudyreasoncode.getText()));
		} else {
			i.addImgngStdyRsnCdTxt("NULL");
		}

		if(imagingstudyreasoncodei == imagingstudyreasoncodelist.size()-1) {i.addImgngStdyRsnCdTxt("]");}


		/******************** imagingstudyreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> imagingstudyreasoncodecodinglist = imagingstudyreasoncode.getCoding();
		for(int imagingstudyreasoncodecodingi = 0; imagingstudyreasoncodecodingi<imagingstudyreasoncodecodinglist.size();imagingstudyreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  imagingstudyreasoncodecoding = imagingstudyreasoncodecodinglist.get(imagingstudyreasoncodecodingi);

		/******************** ImgngStdy_RsnCd_Cdg_Dsply ********************************************************************************/
		if(imagingstudyreasoncodecodingi == 0) {i.addImgngStdyRsnCdCdgDsply("[[");}
		if(imagingstudyreasoncodecoding.hasDisplay()) {

			i.addImgngStdyRsnCdCdgDsply(String.valueOf(imagingstudyreasoncodecoding.getDisplay()));
		} else {
			i.addImgngStdyRsnCdCdgDsply("NULL");
		}

		if(imagingstudyreasoncodecodingi == imagingstudyreasoncodecodinglist.size()-1) {i.addImgngStdyRsnCdCdgDsply("]]");}


		/******************** ImgngStdy_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyreasoncodecodingi == 0) {i.addImgngStdyRsnCdCdgVrsn("[[");}
		if(imagingstudyreasoncodecoding.hasVersion()) {

			i.addImgngStdyRsnCdCdgVrsn(String.valueOf(imagingstudyreasoncodecoding.getVersion()));
		} else {
			i.addImgngStdyRsnCdCdgVrsn("NULL");
		}

		if(imagingstudyreasoncodecodingi == imagingstudyreasoncodecodinglist.size()-1) {i.addImgngStdyRsnCdCdgVrsn("]]");}


		/******************** ImgngStdy_RsnCd_Cdg_Cd ********************************************************************************/
		if(imagingstudyreasoncodecodingi == 0) {i.addImgngStdyRsnCdCdgCd("[[");}
		if(imagingstudyreasoncodecoding.hasCode()) {

			i.addImgngStdyRsnCdCdgCd(String.valueOf(imagingstudyreasoncodecoding.getCode()));
		} else {
			i.addImgngStdyRsnCdCdgCd("NULL");
		}

		if(imagingstudyreasoncodecodingi == imagingstudyreasoncodecodinglist.size()-1) {i.addImgngStdyRsnCdCdgCd("]]");}


		/******************** ImgngStdy_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyreasoncodecodingi == 0) {i.addImgngStdyRsnCdCdgUsrSltd("[[");}
		if(imagingstudyreasoncodecoding.hasUserSelected()) {

			i.addImgngStdyRsnCdCdgUsrSltd(String.valueOf(imagingstudyreasoncodecoding.getUserSelected()));
		} else {
			i.addImgngStdyRsnCdCdgUsrSltd("NULL");
		}

		if(imagingstudyreasoncodecodingi == imagingstudyreasoncodecodinglist.size()-1) {i.addImgngStdyRsnCdCdgUsrSltd("]]");}


		/******************** ImgngStdy_RsnCd_Cdg_Sys ********************************************************************************/
		if(imagingstudyreasoncodecodingi == 0) {i.addImgngStdyRsnCdCdgSys("[[");}
		if(imagingstudyreasoncodecoding.hasSystem()) {

			i.addImgngStdyRsnCdCdgSys(String.valueOf(imagingstudyreasoncodecoding.getSystem()));
		} else {
			i.addImgngStdyRsnCdCdgSys("NULL");
		}

		if(imagingstudyreasoncodecodingi == imagingstudyreasoncodecodinglist.size()-1) {i.addImgngStdyRsnCdCdgSys("]]");}


		 };
		 };
		/******************** imagingstudyprocedurecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> imagingstudyprocedurecodelist = imagingstudy.getProcedureCode();
		for(int imagingstudyprocedurecodei = 0; imagingstudyprocedurecodei<imagingstudyprocedurecodelist.size();imagingstudyprocedurecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  imagingstudyprocedurecode = imagingstudyprocedurecodelist.get(imagingstudyprocedurecodei);

		/******************** ImgngStdy_PrcdrCd_Txt ********************************************************************************/
		if(imagingstudyprocedurecodei == 0) {i.addImgngStdyPrcdrCdTxt("[");}
		if(imagingstudyprocedurecode.hasText()) {

			i.addImgngStdyPrcdrCdTxt(String.valueOf(imagingstudyprocedurecode.getText()));
		} else {
			i.addImgngStdyPrcdrCdTxt("NULL");
		}

		if(imagingstudyprocedurecodei == imagingstudyprocedurecodelist.size()-1) {i.addImgngStdyPrcdrCdTxt("]");}


		/******************** imagingstudyprocedurecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> imagingstudyprocedurecodecodinglist = imagingstudyprocedurecode.getCoding();
		for(int imagingstudyprocedurecodecodingi = 0; imagingstudyprocedurecodecodingi<imagingstudyprocedurecodecodinglist.size();imagingstudyprocedurecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  imagingstudyprocedurecodecoding = imagingstudyprocedurecodecodinglist.get(imagingstudyprocedurecodecodingi);

		/******************** ImgngStdy_PrcdrCd_Cdg_Dsply ********************************************************************************/
		if(imagingstudyprocedurecodecodingi == 0) {i.addImgngStdyPrcdrCdCdgDsply("[[");}
		if(imagingstudyprocedurecodecoding.hasDisplay()) {

			i.addImgngStdyPrcdrCdCdgDsply(String.valueOf(imagingstudyprocedurecodecoding.getDisplay()));
		} else {
			i.addImgngStdyPrcdrCdCdgDsply("NULL");
		}

		if(imagingstudyprocedurecodecodingi == imagingstudyprocedurecodecodinglist.size()-1) {i.addImgngStdyPrcdrCdCdgDsply("]]");}


		/******************** ImgngStdy_PrcdrCd_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyprocedurecodecodingi == 0) {i.addImgngStdyPrcdrCdCdgVrsn("[[");}
		if(imagingstudyprocedurecodecoding.hasVersion()) {

			i.addImgngStdyPrcdrCdCdgVrsn(String.valueOf(imagingstudyprocedurecodecoding.getVersion()));
		} else {
			i.addImgngStdyPrcdrCdCdgVrsn("NULL");
		}

		if(imagingstudyprocedurecodecodingi == imagingstudyprocedurecodecodinglist.size()-1) {i.addImgngStdyPrcdrCdCdgVrsn("]]");}


		/******************** ImgngStdy_PrcdrCd_Cdg_Cd ********************************************************************************/
		if(imagingstudyprocedurecodecodingi == 0) {i.addImgngStdyPrcdrCdCdgCd("[[");}
		if(imagingstudyprocedurecodecoding.hasCode()) {

			i.addImgngStdyPrcdrCdCdgCd(String.valueOf(imagingstudyprocedurecodecoding.getCode()));
		} else {
			i.addImgngStdyPrcdrCdCdgCd("NULL");
		}

		if(imagingstudyprocedurecodecodingi == imagingstudyprocedurecodecodinglist.size()-1) {i.addImgngStdyPrcdrCdCdgCd("]]");}


		/******************** ImgngStdy_PrcdrCd_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyprocedurecodecodingi == 0) {i.addImgngStdyPrcdrCdCdgUsrSltd("[[");}
		if(imagingstudyprocedurecodecoding.hasUserSelected()) {

			i.addImgngStdyPrcdrCdCdgUsrSltd(String.valueOf(imagingstudyprocedurecodecoding.getUserSelected()));
		} else {
			i.addImgngStdyPrcdrCdCdgUsrSltd("NULL");
		}

		if(imagingstudyprocedurecodecodingi == imagingstudyprocedurecodecodinglist.size()-1) {i.addImgngStdyPrcdrCdCdgUsrSltd("]]");}


		/******************** ImgngStdy_PrcdrCd_Cdg_Sys ********************************************************************************/
		if(imagingstudyprocedurecodecodingi == 0) {i.addImgngStdyPrcdrCdCdgSys("[[");}
		if(imagingstudyprocedurecodecoding.hasSystem()) {

			i.addImgngStdyPrcdrCdCdgSys(String.valueOf(imagingstudyprocedurecodecoding.getSystem()));
		} else {
			i.addImgngStdyPrcdrCdCdgSys("NULL");
		}

		if(imagingstudyprocedurecodecodingi == imagingstudyprocedurecodecodinglist.size()-1) {i.addImgngStdyPrcdrCdCdgSys("]]");}


		 };
		 };
		/******************** imagingstudyseries ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent> imagingstudyserieslist = imagingstudy.getSeries();
		for(int imagingstudyseriesi = 0; imagingstudyseriesi<imagingstudyserieslist.size();imagingstudyseriesi++ ) {
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent  imagingstudyseries = imagingstudyserieslist.get(imagingstudyseriesi);

		/******************** imagingstudyseriesinstance ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent> imagingstudyseriesinstancelist = imagingstudyseries.getInstance();
		for(int imagingstudyseriesinstancei = 0; imagingstudyseriesinstancei<imagingstudyseriesinstancelist.size();imagingstudyseriesinstancei++ ) {
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent  imagingstudyseriesinstance = imagingstudyseriesinstancelist.get(imagingstudyseriesinstancei);

		/******************** ImgngStdy_Series_Instance_Nmbr ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceNmbr("[[");}
		if(imagingstudyseriesinstance.hasNumber()) {

			i.addImgngStdySeriesInstanceNmbr(String.valueOf(imagingstudyseriesinstance.getNumber()));
		} else {
			i.addImgngStdySeriesInstanceNmbr("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceNmbr("]]");}


		/******************** ImgngStdy_Series_Instance_Ttl ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceTtl("[[");}
		if(imagingstudyseriesinstance.hasTitle()) {

			i.addImgngStdySeriesInstanceTtl(String.valueOf(imagingstudyseriesinstance.getTitle()));
		} else {
			i.addImgngStdySeriesInstanceTtl("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceTtl("]]");}


		/******************** ImgngStdy_Series_Instance_Uid ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceUid("[[");}
		if(imagingstudyseriesinstance.hasUid()) {

			i.addImgngStdySeriesInstanceUid(String.valueOf(imagingstudyseriesinstance.getUid()));
		} else {
			i.addImgngStdySeriesInstanceUid("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceUid("]]");}


		/******************** imagingstudyseriesinstancesopclass ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesinstancesopclass = imagingstudyseriesinstance.getSopClass();

		/******************** ImgngStdy_Series_Instance_SopCls_Dsply ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceSopClsDsply("[[");}
		if(imagingstudyseriesinstancesopclass.hasDisplay()) {

			i.addImgngStdySeriesInstanceSopClsDsply(String.valueOf(imagingstudyseriesinstancesopclass.getDisplay()));
		} else {
			i.addImgngStdySeriesInstanceSopClsDsply("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceSopClsDsply("]]");}


		/******************** ImgngStdy_Series_Instance_SopCls_Vrsn ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceSopClsVrsn("[[");}
		if(imagingstudyseriesinstancesopclass.hasVersion()) {

			i.addImgngStdySeriesInstanceSopClsVrsn(String.valueOf(imagingstudyseriesinstancesopclass.getVersion()));
		} else {
			i.addImgngStdySeriesInstanceSopClsVrsn("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceSopClsVrsn("]]");}


		/******************** ImgngStdy_Series_Instance_SopCls_Cd ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceSopClsCd("[[");}
		if(imagingstudyseriesinstancesopclass.hasCode()) {

			i.addImgngStdySeriesInstanceSopClsCd(String.valueOf(imagingstudyseriesinstancesopclass.getCode()));
		} else {
			i.addImgngStdySeriesInstanceSopClsCd("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceSopClsCd("]]");}


		/******************** ImgngStdy_Series_Instance_SopCls_UsrSltd ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceSopClsUsrSltd("[[");}
		if(imagingstudyseriesinstancesopclass.hasUserSelected()) {

			i.addImgngStdySeriesInstanceSopClsUsrSltd(String.valueOf(imagingstudyseriesinstancesopclass.getUserSelected()));
		} else {
			i.addImgngStdySeriesInstanceSopClsUsrSltd("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceSopClsUsrSltd("]]");}


		/******************** ImgngStdy_Series_Instance_SopCls_Sys ********************************************************************************/
		if(imagingstudyseriesinstancei == 0) {i.addImgngStdySeriesInstanceSopClsSys("[[");}
		if(imagingstudyseriesinstancesopclass.hasSystem()) {

			i.addImgngStdySeriesInstanceSopClsSys(String.valueOf(imagingstudyseriesinstancesopclass.getSystem()));
		} else {
			i.addImgngStdySeriesInstanceSopClsSys("NULL");
		}

		if(imagingstudyseriesinstancei == imagingstudyseriesinstancelist.size()-1) {i.addImgngStdySeriesInstanceSopClsSys("]]");}


		 };
		/******************** ImgngStdy_Series_Nmbr ********************************************************************************/
		if(imagingstudyseries.hasNumber()) {

			i.addImgngStdySeriesNmbr(String.valueOf(imagingstudyseries.getNumber()));
		} else {
			i.addImgngStdySeriesNmbr("NULL");
		}


		/******************** imagingstudyseriesmodality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesmodality = imagingstudyseries.getModality();

		/******************** ImgngStdy_Series_Modality_Dsply ********************************************************************************/
		if(imagingstudyseriesmodality.hasDisplay()) {

			i.addImgngStdySeriesModalityDsply(String.valueOf(imagingstudyseriesmodality.getDisplay()));
		} else {
			i.addImgngStdySeriesModalityDsply("NULL");
		}


		/******************** ImgngStdy_Series_Modality_Vrsn ********************************************************************************/
		if(imagingstudyseriesmodality.hasVersion()) {

			i.addImgngStdySeriesModalityVrsn(String.valueOf(imagingstudyseriesmodality.getVersion()));
		} else {
			i.addImgngStdySeriesModalityVrsn("NULL");
		}


		/******************** ImgngStdy_Series_Modality_Cd ********************************************************************************/
		if(imagingstudyseriesmodality.hasCode()) {

			i.addImgngStdySeriesModalityCd(String.valueOf(imagingstudyseriesmodality.getCode()));
		} else {
			i.addImgngStdySeriesModalityCd("NULL");
		}


		/******************** ImgngStdy_Series_Modality_UsrSltd ********************************************************************************/
		if(imagingstudyseriesmodality.hasUserSelected()) {

			i.addImgngStdySeriesModalityUsrSltd(String.valueOf(imagingstudyseriesmodality.getUserSelected()));
		} else {
			i.addImgngStdySeriesModalityUsrSltd("NULL");
		}


		/******************** ImgngStdy_Series_Modality_Sys ********************************************************************************/
		if(imagingstudyseriesmodality.hasSystem()) {

			i.addImgngStdySeriesModalitySys(String.valueOf(imagingstudyseriesmodality.getSystem()));
		} else {
			i.addImgngStdySeriesModalitySys("NULL");
		}


		/******************** ImgngStdy_Series_Strted ********************************************************************************/
		if(imagingstudyseries.hasStarted()) {

			i.addImgngStdySeriesStrted("\""+ca.uhn.fhir.util.DateUtils.formatDate(imagingstudyseries.getStarted())+"\"");
		} else {
			i.addImgngStdySeriesStrted("NULL");
		}


		/******************** ImgngStdy_Series_Endpoint ********************************************************************************/
		if(imagingstudyseries.hasEndpoint()) {

			String  array = "[";
			for(int incr=0; incr<imagingstudyseries.getEndpoint().size(); incr++) {
				array = array + imagingstudyseries.getEndpoint().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImgngStdySeriesEndpoint(array);

		} else {
			i.addImgngStdySeriesEndpoint("NULL");
		}


		/******************** ImgngStdy_Series_Dscrptn ********************************************************************************/
		if(imagingstudyseries.hasDescription()) {

			i.addImgngStdySeriesDscrptn(String.valueOf(imagingstudyseries.getDescription()));
		} else {
			i.addImgngStdySeriesDscrptn("NULL");
		}


		/******************** ImgngStdy_Series_NmbrOfInstances ********************************************************************************/
		if(imagingstudyseries.hasNumberOfInstances()) {

			i.addImgngStdySeriesNmbrOfInstances(String.valueOf(imagingstudyseries.getNumberOfInstances()));
		} else {
			i.addImgngStdySeriesNmbrOfInstances("NULL");
		}


		/******************** imagingstudyseriesbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesbodysite = imagingstudyseries.getBodySite();

		/******************** ImgngStdy_Series_BodySite_Dsply ********************************************************************************/
		if(imagingstudyseriesbodysite.hasDisplay()) {

			i.addImgngStdySeriesBodySiteDsply(String.valueOf(imagingstudyseriesbodysite.getDisplay()));
		} else {
			i.addImgngStdySeriesBodySiteDsply("NULL");
		}


		/******************** ImgngStdy_Series_BodySite_Vrsn ********************************************************************************/
		if(imagingstudyseriesbodysite.hasVersion()) {

			i.addImgngStdySeriesBodySiteVrsn(String.valueOf(imagingstudyseriesbodysite.getVersion()));
		} else {
			i.addImgngStdySeriesBodySiteVrsn("NULL");
		}


		/******************** ImgngStdy_Series_BodySite_Cd ********************************************************************************/
		if(imagingstudyseriesbodysite.hasCode()) {

			i.addImgngStdySeriesBodySiteCd(String.valueOf(imagingstudyseriesbodysite.getCode()));
		} else {
			i.addImgngStdySeriesBodySiteCd("NULL");
		}


		/******************** ImgngStdy_Series_BodySite_UsrSltd ********************************************************************************/
		if(imagingstudyseriesbodysite.hasUserSelected()) {

			i.addImgngStdySeriesBodySiteUsrSltd(String.valueOf(imagingstudyseriesbodysite.getUserSelected()));
		} else {
			i.addImgngStdySeriesBodySiteUsrSltd("NULL");
		}


		/******************** ImgngStdy_Series_BodySite_Sys ********************************************************************************/
		if(imagingstudyseriesbodysite.hasSystem()) {

			i.addImgngStdySeriesBodySiteSys(String.valueOf(imagingstudyseriesbodysite.getSystem()));
		} else {
			i.addImgngStdySeriesBodySiteSys("NULL");
		}


		/******************** imagingstudyseriesperformer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent> imagingstudyseriesperformerlist = imagingstudyseries.getPerformer();
		for(int imagingstudyseriesperformeri = 0; imagingstudyseriesperformeri<imagingstudyseriesperformerlist.size();imagingstudyseriesperformeri++ ) {
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent  imagingstudyseriesperformer = imagingstudyseriesperformerlist.get(imagingstudyseriesperformeri);

		/******************** imagingstudyseriesperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyseriesperformerfunction = imagingstudyseriesperformer.getFunction();

		/******************** ImgngStdy_Series_Prfrmr_Function_Txt ********************************************************************************/
		if(imagingstudyseriesperformeri == 0) {i.addImgngStdySeriesPrfrmrFunctionTxt("[[");}
		if(imagingstudyseriesperformerfunction.hasText()) {

			i.addImgngStdySeriesPrfrmrFunctionTxt(String.valueOf(imagingstudyseriesperformerfunction.getText()));
		} else {
			i.addImgngStdySeriesPrfrmrFunctionTxt("NULL");
		}

		if(imagingstudyseriesperformeri == imagingstudyseriesperformerlist.size()-1) {i.addImgngStdySeriesPrfrmrFunctionTxt("]]");}


		/******************** imagingstudyseriesperformerfunctioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> imagingstudyseriesperformerfunctioncodinglist = imagingstudyseriesperformerfunction.getCoding();
		for(int imagingstudyseriesperformerfunctioncodingi = 0; imagingstudyseriesperformerfunctioncodingi<imagingstudyseriesperformerfunctioncodinglist.size();imagingstudyseriesperformerfunctioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  imagingstudyseriesperformerfunctioncoding = imagingstudyseriesperformerfunctioncodinglist.get(imagingstudyseriesperformerfunctioncodingi);

		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncodingi == 0) {i.addImgngStdySeriesPrfrmrFunctionCdgDsply("[[[");}
		if(imagingstudyseriesperformerfunctioncoding.hasDisplay()) {

			i.addImgngStdySeriesPrfrmrFunctionCdgDsply(String.valueOf(imagingstudyseriesperformerfunctioncoding.getDisplay()));
		} else {
			i.addImgngStdySeriesPrfrmrFunctionCdgDsply("NULL");
		}

		if(imagingstudyseriesperformerfunctioncodingi == imagingstudyseriesperformerfunctioncodinglist.size()-1) {i.addImgngStdySeriesPrfrmrFunctionCdgDsply("]]]");}


		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncodingi == 0) {i.addImgngStdySeriesPrfrmrFunctionCdgVrsn("[[[");}
		if(imagingstudyseriesperformerfunctioncoding.hasVersion()) {

			i.addImgngStdySeriesPrfrmrFunctionCdgVrsn(String.valueOf(imagingstudyseriesperformerfunctioncoding.getVersion()));
		} else {
			i.addImgngStdySeriesPrfrmrFunctionCdgVrsn("NULL");
		}

		if(imagingstudyseriesperformerfunctioncodingi == imagingstudyseriesperformerfunctioncodinglist.size()-1) {i.addImgngStdySeriesPrfrmrFunctionCdgVrsn("]]]");}


		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncodingi == 0) {i.addImgngStdySeriesPrfrmrFunctionCdgCd("[[[");}
		if(imagingstudyseriesperformerfunctioncoding.hasCode()) {

			i.addImgngStdySeriesPrfrmrFunctionCdgCd(String.valueOf(imagingstudyseriesperformerfunctioncoding.getCode()));
		} else {
			i.addImgngStdySeriesPrfrmrFunctionCdgCd("NULL");
		}

		if(imagingstudyseriesperformerfunctioncodingi == imagingstudyseriesperformerfunctioncodinglist.size()-1) {i.addImgngStdySeriesPrfrmrFunctionCdgCd("]]]");}


		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncodingi == 0) {i.addImgngStdySeriesPrfrmrFunctionCdgUsrSltd("[[[");}
		if(imagingstudyseriesperformerfunctioncoding.hasUserSelected()) {

			i.addImgngStdySeriesPrfrmrFunctionCdgUsrSltd(String.valueOf(imagingstudyseriesperformerfunctioncoding.getUserSelected()));
		} else {
			i.addImgngStdySeriesPrfrmrFunctionCdgUsrSltd("NULL");
		}

		if(imagingstudyseriesperformerfunctioncodingi == imagingstudyseriesperformerfunctioncodinglist.size()-1) {i.addImgngStdySeriesPrfrmrFunctionCdgUsrSltd("]]]");}


		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncodingi == 0) {i.addImgngStdySeriesPrfrmrFunctionCdgSys("[[[");}
		if(imagingstudyseriesperformerfunctioncoding.hasSystem()) {

			i.addImgngStdySeriesPrfrmrFunctionCdgSys(String.valueOf(imagingstudyseriesperformerfunctioncoding.getSystem()));
		} else {
			i.addImgngStdySeriesPrfrmrFunctionCdgSys("NULL");
		}

		if(imagingstudyseriesperformerfunctioncodingi == imagingstudyseriesperformerfunctioncodinglist.size()-1) {i.addImgngStdySeriesPrfrmrFunctionCdgSys("]]]");}


		 };
		/******************** ImgngStdy_Series_Prfrmr_Actor ********************************************************************************/
		if(imagingstudyseriesperformeri == 0) {i.addImgngStdySeriesPrfrmrActor("[[");}
		if(imagingstudyseriesperformer.hasActor()) {

			if(imagingstudyseriesperformer.getActor().getReference() != null) {
			i.addImgngStdySeriesPrfrmrActor(imagingstudyseriesperformer.getActor().getReference());
			}
		} else {
			i.addImgngStdySeriesPrfrmrActor("NULL");
		}

		if(imagingstudyseriesperformeri == imagingstudyseriesperformerlist.size()-1) {i.addImgngStdySeriesPrfrmrActor("]]");}


		 };
		/******************** ImgngStdy_Series_Uid ********************************************************************************/
		if(imagingstudyseries.hasUid()) {

			i.addImgngStdySeriesUid(String.valueOf(imagingstudyseries.getUid()));
		} else {
			i.addImgngStdySeriesUid("NULL");
		}


		/******************** imagingstudyserieslaterality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyserieslaterality = imagingstudyseries.getLaterality();

		/******************** ImgngStdy_Series_Laterality_Dsply ********************************************************************************/
		if(imagingstudyserieslaterality.hasDisplay()) {

			i.addImgngStdySeriesLateralityDsply(String.valueOf(imagingstudyserieslaterality.getDisplay()));
		} else {
			i.addImgngStdySeriesLateralityDsply("NULL");
		}


		/******************** ImgngStdy_Series_Laterality_Vrsn ********************************************************************************/
		if(imagingstudyserieslaterality.hasVersion()) {

			i.addImgngStdySeriesLateralityVrsn(String.valueOf(imagingstudyserieslaterality.getVersion()));
		} else {
			i.addImgngStdySeriesLateralityVrsn("NULL");
		}


		/******************** ImgngStdy_Series_Laterality_Cd ********************************************************************************/
		if(imagingstudyserieslaterality.hasCode()) {

			i.addImgngStdySeriesLateralityCd(String.valueOf(imagingstudyserieslaterality.getCode()));
		} else {
			i.addImgngStdySeriesLateralityCd("NULL");
		}


		/******************** ImgngStdy_Series_Laterality_UsrSltd ********************************************************************************/
		if(imagingstudyserieslaterality.hasUserSelected()) {

			i.addImgngStdySeriesLateralityUsrSltd(String.valueOf(imagingstudyserieslaterality.getUserSelected()));
		} else {
			i.addImgngStdySeriesLateralityUsrSltd("NULL");
		}


		/******************** ImgngStdy_Series_Laterality_Sys ********************************************************************************/
		if(imagingstudyserieslaterality.hasSystem()) {

			i.addImgngStdySeriesLateralitySys(String.valueOf(imagingstudyserieslaterality.getSystem()));
		} else {
			i.addImgngStdySeriesLateralitySys("NULL");
		}


		/******************** ImgngStdy_Series_Spcmn ********************************************************************************/
		if(imagingstudyseries.hasSpecimen()) {

			String  array = "[";
			for(int incr=0; incr<imagingstudyseries.getSpecimen().size(); incr++) {
				array = array + imagingstudyseries.getSpecimen().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImgngStdySeriesSpcmn(array);

		} else {
			i.addImgngStdySeriesSpcmn("NULL");
		}


		 };
		/******************** ImgngStdy_Dscrptn ********************************************************************************/
		if(imagingstudy.hasDescription()) {

			i.addImgngStdyDscrptn(String.valueOf(imagingstudy.getDescription()));
		} else {
			i.addImgngStdyDscrptn("NULL");
		}


		/******************** imagingstudynote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> imagingstudynotelist = imagingstudy.getNote();
		for(int imagingstudynotei = 0; imagingstudynotei<imagingstudynotelist.size();imagingstudynotei++ ) {
		org.hl7.fhir.r4.model.Annotation  imagingstudynote = imagingstudynotelist.get(imagingstudynotei);

		/******************** ImgngStdy_Nt_Time ********************************************************************************/
		if(imagingstudynotei == 0) {i.addImgngStdyNtTime("[");}
		if(imagingstudynote.hasTime()) {

			i.addImgngStdyNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(imagingstudynote.getTime())+"\"");
		} else {
			i.addImgngStdyNtTime("NULL");
		}

		if(imagingstudynotei == imagingstudynotelist.size()-1) {i.addImgngStdyNtTime("]");}


		/******************** ImgngStdy_Nt_AthrRfrnc ********************************************************************************/
		if(imagingstudynotei == 0) {i.addImgngStdyNtAthrRfrnc("[");}
		if(imagingstudynote.hasAuthorReference()) {

			if(imagingstudynote.getAuthorReference().getReference() != null) {
			i.addImgngStdyNtAthrRfrnc(imagingstudynote.getAuthorReference().getReference());
			}
		} else {
			i.addImgngStdyNtAthrRfrnc("NULL");
		}

		if(imagingstudynotei == imagingstudynotelist.size()-1) {i.addImgngStdyNtAthrRfrnc("]");}


		/******************** ImgngStdy_Nt_Txt ********************************************************************************/
		if(imagingstudynotei == 0) {i.addImgngStdyNtTxt("[");}
		if(imagingstudynote.hasText()) {

			i.addImgngStdyNtTxt(String.valueOf(imagingstudynote.getText()));
		} else {
			i.addImgngStdyNtTxt("NULL");
		}

		if(imagingstudynotei == imagingstudynotelist.size()-1) {i.addImgngStdyNtTxt("]");}


		/******************** ImgngStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(imagingstudynotei == 0) {i.addImgngStdyNtAthrStrgTyp("[");}
		if(imagingstudynote.hasAuthorStringType()) {

			i.addImgngStdyNtAthrStrgTyp("\""+imagingstudynote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			i.addImgngStdyNtAthrStrgTyp("NULL");
		}

		if(imagingstudynotei == imagingstudynotelist.size()-1) {i.addImgngStdyNtAthrStrgTyp("]");}


		 };
		/******************** ImgngStdy_RsnRfrnc ********************************************************************************/
		if(imagingstudy.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<imagingstudy.getReasonReference().size(); incr++) {
				array = array + imagingstudy.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			i.addImgngStdyRsnRfrnc(array);

		} else {
			i.addImgngStdyRsnRfrnc("NULL");
		}


		/******************** imagingstudyidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> imagingstudyidentifierlist = imagingstudy.getIdentifier();
		for(int imagingstudyidentifieri = 0; imagingstudyidentifieri<imagingstudyidentifierlist.size();imagingstudyidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  imagingstudyidentifier = imagingstudyidentifierlist.get(imagingstudyidentifieri);

		/******************** ImgngStdy_Id_Vl ********************************************************************************/
		if(imagingstudyidentifieri == 0) {i.addImgngStdyIdVl("[");}
		if(imagingstudyidentifier.hasValue()) {

			i.addImgngStdyIdVl(String.valueOf(imagingstudyidentifier.getValue()));
		} else {
			i.addImgngStdyIdVl("NULL");
		}

		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {i.addImgngStdyIdVl("]");}


		/******************** imagingstudyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyidentifiertype = imagingstudyidentifier.getType();

		/******************** ImgngStdy_Id_Typ_Txt ********************************************************************************/
		if(imagingstudyidentifieri == 0) {i.addImgngStdyIdTypTxt("[");}
		if(imagingstudyidentifiertype.hasText()) {

			i.addImgngStdyIdTypTxt(String.valueOf(imagingstudyidentifiertype.getText()));
		} else {
			i.addImgngStdyIdTypTxt("NULL");
		}

		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {i.addImgngStdyIdTypTxt("]");}


		/******************** imagingstudyidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> imagingstudyidentifiertypecodinglist = imagingstudyidentifiertype.getCoding();
		for(int imagingstudyidentifiertypecodingi = 0; imagingstudyidentifiertypecodingi<imagingstudyidentifiertypecodinglist.size();imagingstudyidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  imagingstudyidentifiertypecoding = imagingstudyidentifiertypecodinglist.get(imagingstudyidentifiertypecodingi);

		/******************** ImgngStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(imagingstudyidentifiertypecodingi == 0) {i.addImgngStdyIdTypCdgDsply("[[");}
		if(imagingstudyidentifiertypecoding.hasDisplay()) {

			i.addImgngStdyIdTypCdgDsply(String.valueOf(imagingstudyidentifiertypecoding.getDisplay()));
		} else {
			i.addImgngStdyIdTypCdgDsply("NULL");
		}

		if(imagingstudyidentifiertypecodingi == imagingstudyidentifiertypecodinglist.size()-1) {i.addImgngStdyIdTypCdgDsply("]]");}


		/******************** ImgngStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyidentifiertypecodingi == 0) {i.addImgngStdyIdTypCdgVrsn("[[");}
		if(imagingstudyidentifiertypecoding.hasVersion()) {

			i.addImgngStdyIdTypCdgVrsn(String.valueOf(imagingstudyidentifiertypecoding.getVersion()));
		} else {
			i.addImgngStdyIdTypCdgVrsn("NULL");
		}

		if(imagingstudyidentifiertypecodingi == imagingstudyidentifiertypecodinglist.size()-1) {i.addImgngStdyIdTypCdgVrsn("]]");}


		/******************** ImgngStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(imagingstudyidentifiertypecodingi == 0) {i.addImgngStdyIdTypCdgCd("[[");}
		if(imagingstudyidentifiertypecoding.hasCode()) {

			i.addImgngStdyIdTypCdgCd(String.valueOf(imagingstudyidentifiertypecoding.getCode()));
		} else {
			i.addImgngStdyIdTypCdgCd("NULL");
		}

		if(imagingstudyidentifiertypecodingi == imagingstudyidentifiertypecodinglist.size()-1) {i.addImgngStdyIdTypCdgCd("]]");}


		/******************** ImgngStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyidentifiertypecodingi == 0) {i.addImgngStdyIdTypCdgUsrSltd("[[");}
		if(imagingstudyidentifiertypecoding.hasUserSelected()) {

			i.addImgngStdyIdTypCdgUsrSltd(String.valueOf(imagingstudyidentifiertypecoding.getUserSelected()));
		} else {
			i.addImgngStdyIdTypCdgUsrSltd("NULL");
		}

		if(imagingstudyidentifiertypecodingi == imagingstudyidentifiertypecodinglist.size()-1) {i.addImgngStdyIdTypCdgUsrSltd("]]");}


		/******************** ImgngStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(imagingstudyidentifiertypecodingi == 0) {i.addImgngStdyIdTypCdgSys("[[");}
		if(imagingstudyidentifiertypecoding.hasSystem()) {

			i.addImgngStdyIdTypCdgSys(String.valueOf(imagingstudyidentifiertypecoding.getSystem()));
		} else {
			i.addImgngStdyIdTypCdgSys("NULL");
		}

		if(imagingstudyidentifiertypecodingi == imagingstudyidentifiertypecodinglist.size()-1) {i.addImgngStdyIdTypCdgSys("]]");}


		 };
		/******************** imagingstudyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period imagingstudyidentifierperiod = imagingstudyidentifier.getPeriod();

		/******************** ImgngStdy_Id_Prd_Strt ********************************************************************************/
		if(imagingstudyidentifieri == 0) {i.addImgngStdyIdPrdStrt("[");}
		if(imagingstudyidentifierperiod.hasStart()) {

			i.addImgngStdyIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(imagingstudyidentifierperiod.getStart())+"\"");
		} else {
			i.addImgngStdyIdPrdStrt("NULL");
		}

		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {i.addImgngStdyIdPrdStrt("]");}


		/******************** ImgngStdy_Id_Prd_End ********************************************************************************/
		if(imagingstudyidentifieri == 0) {i.addImgngStdyIdPrdEnd("[");}
		if(imagingstudyidentifierperiod.hasEnd()) {

			i.addImgngStdyIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(imagingstudyidentifierperiod.getEnd())+"\"");
		} else {
			i.addImgngStdyIdPrdEnd("NULL");
		}

		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {i.addImgngStdyIdPrdEnd("]");}


		/******************** imagingstudyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse imagingstudyidentifieruse = imagingstudyidentifier.getUse();
		if(imagingstudyidentifieruse!=null) {
		if(imagingstudyidentifieri == 0) {

		i.addImgngStdyIdUse("[");		}
			i.addImgngStdyIdUse(imagingstudyidentifieruse.toCode());
		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {

		i.addImgngStdyIdUse("]");		}

		} else {
			i.addImgngStdyIdUse("NULL");
		}

		/******************** ImgngStdy_Id_Assigner ********************************************************************************/
		if(imagingstudyidentifieri == 0) {i.addImgngStdyIdAssigner("[");}
		if(imagingstudyidentifier.hasAssigner()) {

			if(imagingstudyidentifier.getAssigner().getReference() != null) {
			i.addImgngStdyIdAssigner(imagingstudyidentifier.getAssigner().getReference());
			}
		} else {
			i.addImgngStdyIdAssigner("NULL");
		}

		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {i.addImgngStdyIdAssigner("]");}


		/******************** ImgngStdy_Id_Sys ********************************************************************************/
		if(imagingstudyidentifieri == 0) {i.addImgngStdyIdSys("[");}
		if(imagingstudyidentifier.hasSystem()) {

			i.addImgngStdyIdSys(String.valueOf(imagingstudyidentifier.getSystem()));
		} else {
			i.addImgngStdyIdSys("NULL");
		}

		if(imagingstudyidentifieri == imagingstudyidentifierlist.size()-1) {i.addImgngStdyIdSys("]");}


		 };
		/******************** ImgngStdy_PrcdrRfrnc ********************************************************************************/
		if(imagingstudy.hasProcedureReference()) {

			if(imagingstudy.getProcedureReference().getReference() != null) {
			i.addImgngStdyPrcdrRfrnc(imagingstudy.getProcedureReference().getReference());
			}
		} else {
			i.addImgngStdyPrcdrRfrnc("NULL");
		}


		/******************** ImgngStdy_NmbrOfInstances ********************************************************************************/
		if(imagingstudy.hasNumberOfInstances()) {

			i.addImgngStdyNmbrOfInstances(String.valueOf(imagingstudy.getNumberOfInstances()));
		} else {
			i.addImgngStdyNmbrOfInstances("NULL");
		}


		return i;
	}
}
