package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImagingStudy;
public class ImagingStudyConversion 
{
	public org.hl7.fhir.r4.model.ImagingStudy ImagingStudys(ImagingStudy i) throws ParseException
	{
		org.hl7.fhir.r4.model.ImagingStudy imagingstudy = new org.hl7.fhir.r4.model.ImagingStudy();

		/******************** id ********************************************************************************/
		imagingstudy.setId(i.getId());

		/******************** ImgngStdy_BasedOn ********************************************************************************/
		if(i.getImgngStdyBasedOn() != null) {
			imagingstudy.addBasedOn( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyBasedOn()));
		}
		/******************** ImgngStdy_Dscrptn ********************************************************************************/
		if(i.getImgngStdyDscrptn() != null) {
			imagingstudy.setDescription(i.getImgngStdyDscrptn());
		}
		/******************** ImgngStdy_Enc ********************************************************************************/
		if(i.getImgngStdyEnc() != null) {
			imagingstudy.setEncounter( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyEnc()));
		}
		/******************** ImgngStdy_Endpoint ********************************************************************************/
		if(i.getImgngStdyEndpoint() != null) {
			imagingstudy.addEndpoint( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyEndpoint()));
		}
		/******************** imagingstudyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier imagingstudyidentifier =  new org.hl7.fhir.r4.model.Identifier();
		imagingstudy.addIdentifier(imagingstudyidentifier);

		/******************** ImgngStdy_Id_Assigner ********************************************************************************/
		if(i.getImgngStdyIdAssigner() != null) {
			imagingstudyidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyIdAssigner()));
		}
		/******************** imagingstudyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period imagingstudyidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		imagingstudyidentifier.setPeriod(imagingstudyidentifierperiod);

		/******************** ImgngStdy_Id_Prd_End ********************************************************************************/
		if(i.getImgngStdyIdPrdEnd() != null) {
			java.text.SimpleDateFormat ImgngStdy_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImgngStdy_Id_Prd_Enddate = ImgngStdy_Id_Prd_Endsdf.parse(i.getImgngStdyIdPrdEnd());
			imagingstudyidentifierperiod.setEnd(ImgngStdy_Id_Prd_Enddate);
		}
		/******************** ImgngStdy_Id_Prd_Strt ********************************************************************************/
		if(i.getImgngStdyIdPrdStrt() != null) {
			java.text.SimpleDateFormat ImgngStdy_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImgngStdy_Id_Prd_Strtdate = ImgngStdy_Id_Prd_Strtsdf.parse(i.getImgngStdyIdPrdStrt());
			imagingstudyidentifierperiod.setStart(ImgngStdy_Id_Prd_Strtdate);
		}
		/******************** ImgngStdy_Id_Sys ********************************************************************************/
		if(i.getImgngStdyIdSys() != null) {
			imagingstudyidentifier.setSystem(i.getImgngStdyIdSys());
		}
		/******************** imagingstudyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		imagingstudyidentifier.setType(imagingstudyidentifiertype);

		/******************** imagingstudyidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyidentifiertype.addCoding(imagingstudyidentifiertypecoding);

		/******************** ImgngStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdyIdTypCdgCd() != null) {
			imagingstudyidentifiertypecoding.setCode(i.getImgngStdyIdTypCdgCd());
		}
		/******************** ImgngStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdyIdTypCdgDsply() != null) {
			imagingstudyidentifiertypecoding.setDisplay(i.getImgngStdyIdTypCdgDsply());
		}
		/******************** ImgngStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdyIdTypCdgSys() != null) {
			imagingstudyidentifiertypecoding.setSystem(i.getImgngStdyIdTypCdgSys());
		}
		/******************** ImgngStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdyIdTypCdgUsrSltd() != null) {
			imagingstudyidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getImgngStdyIdTypCdgUsrSltd()));
		}
		/******************** ImgngStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdyIdTypCdgVrsn() != null) {
			imagingstudyidentifiertypecoding.setVersion(i.getImgngStdyIdTypCdgVrsn());
		}
		/******************** ImgngStdy_Id_Typ_Txt ********************************************************************************/
		if(i.getImgngStdyIdTypTxt() != null) {
			imagingstudyidentifiertype.setText(i.getImgngStdyIdTypTxt());
		}
		/******************** imagingstudyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory imagingstudyidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		imagingstudyidentifier.setUse(imagingstudyidentifieruse.fromCode(i.getImgngStdyIdUse()));

		/******************** ImgngStdy_Id_Vl ********************************************************************************/
		if(i.getImgngStdyIdVl() != null) {
			imagingstudyidentifier.setValue(i.getImgngStdyIdVl());
		}
		/******************** ImgngStdy_Interpreter ********************************************************************************/
		if(i.getImgngStdyInterpreter() != null) {
			imagingstudy.addInterpreter( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyInterpreter()));
		}
		/******************** ImgngStdy_Lctn ********************************************************************************/
		if(i.getImgngStdyLctn() != null) {
			imagingstudy.setLocation( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyLctn()));
		}
		/******************** imagingstudymodality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudymodality =  new org.hl7.fhir.r4.model.Coding();
		imagingstudy.addModality(imagingstudymodality);

		/******************** ImgngStdy_Modality_Cd ********************************************************************************/
		if(i.getImgngStdyModalityCd() != null) {
			imagingstudymodality.setCode(i.getImgngStdyModalityCd());
		}
		/******************** ImgngStdy_Modality_Dsply ********************************************************************************/
		if(i.getImgngStdyModalityDsply() != null) {
			imagingstudymodality.setDisplay(i.getImgngStdyModalityDsply());
		}
		/******************** ImgngStdy_Modality_Sys ********************************************************************************/
		if(i.getImgngStdyModalitySys() != null) {
			imagingstudymodality.setSystem(i.getImgngStdyModalitySys());
		}
		/******************** ImgngStdy_Modality_UsrSltd ********************************************************************************/
		if(i.getImgngStdyModalityUsrSltd() != null) {
			imagingstudymodality.setUserSelected(Boolean.parseBoolean(i.getImgngStdyModalityUsrSltd()));
		}
		/******************** ImgngStdy_Modality_Vrsn ********************************************************************************/
		if(i.getImgngStdyModalityVrsn() != null) {
			imagingstudymodality.setVersion(i.getImgngStdyModalityVrsn());
		}
		/******************** imagingstudynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation imagingstudynote =  new org.hl7.fhir.r4.model.Annotation();
		imagingstudy.addNote(imagingstudynote);

		/******************** ImgngStdy_Nt_AthrRfrnc ********************************************************************************/
		if(i.getImgngStdyNtAthrRfrnc() != null) {
			imagingstudynote.setAuthor( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyNtAthrRfrnc()));
		}
		/******************** ImgngStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(i.getImgngStdyNtAthrStrgTyp() != null) {
			imagingstudynote.setAuthor( new org.hl7.fhir.r4.model.StringType(i.getImgngStdyNtAthrStrgTyp()));
		}
		/******************** ImgngStdy_Nt_Txt ********************************************************************************/
		if(i.getImgngStdyNtTxt() != null) {
			imagingstudynote.setText(i.getImgngStdyNtTxt());
		}
		/******************** ImgngStdy_Nt_Time ********************************************************************************/
		if(i.getImgngStdyNtTime() != null) {
			java.text.SimpleDateFormat ImgngStdy_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImgngStdy_Nt_Timedate = ImgngStdy_Nt_Timesdf.parse(i.getImgngStdyNtTime());
			imagingstudynote.setTime(ImgngStdy_Nt_Timedate);
		}
		/******************** ImgngStdy_NmbrOfInstances ********************************************************************************/
		if(i.getImgngStdyNmbrOfInstances() != null) {
			imagingstudy.setNumberOfInstances(Integer.parseInt(i.getImgngStdyNmbrOfInstances()));
		}
		/******************** ImgngStdy_NmbrOfSeries ********************************************************************************/
		if(i.getImgngStdyNmbrOfSeries() != null) {
			imagingstudy.setNumberOfSeries(Integer.parseInt(i.getImgngStdyNmbrOfSeries()));
		}
		/******************** imagingstudyprocedurecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyprocedurecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		imagingstudy.addProcedureCode(imagingstudyprocedurecode);

		/******************** imagingstudyprocedurecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyprocedurecodecoding =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyprocedurecode.addCoding(imagingstudyprocedurecodecoding);

		/******************** ImgngStdy_PrcdrCd_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgCd() != null) {
			imagingstudyprocedurecodecoding.setCode(i.getImgngStdyPrcdrCdCdgCd());
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgDsply() != null) {
			imagingstudyprocedurecodecoding.setDisplay(i.getImgngStdyPrcdrCdCdgDsply());
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgSys() != null) {
			imagingstudyprocedurecodecoding.setSystem(i.getImgngStdyPrcdrCdCdgSys());
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgUsrSltd() != null) {
			imagingstudyprocedurecodecoding.setUserSelected(Boolean.parseBoolean(i.getImgngStdyPrcdrCdCdgUsrSltd()));
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgVrsn() != null) {
			imagingstudyprocedurecodecoding.setVersion(i.getImgngStdyPrcdrCdCdgVrsn());
		}
		/******************** ImgngStdy_PrcdrCd_Txt ********************************************************************************/
		if(i.getImgngStdyPrcdrCdTxt() != null) {
			imagingstudyprocedurecode.setText(i.getImgngStdyPrcdrCdTxt());
		}
		/******************** ImgngStdy_PrcdrRfrnc ********************************************************************************/
		if(i.getImgngStdyPrcdrRfrnc() != null) {
			imagingstudy.setProcedureReference( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyPrcdrRfrnc()));
		}
		/******************** imagingstudyreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		imagingstudy.addReasonCode(imagingstudyreasoncode);

		/******************** imagingstudyreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyreasoncode.addCoding(imagingstudyreasoncodecoding);

		/******************** ImgngStdy_RsnCd_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgCd() != null) {
			imagingstudyreasoncodecoding.setCode(i.getImgngStdyRsnCdCdgCd());
		}
		/******************** ImgngStdy_RsnCd_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgDsply() != null) {
			imagingstudyreasoncodecoding.setDisplay(i.getImgngStdyRsnCdCdgDsply());
		}
		/******************** ImgngStdy_RsnCd_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgSys() != null) {
			imagingstudyreasoncodecoding.setSystem(i.getImgngStdyRsnCdCdgSys());
		}
		/******************** ImgngStdy_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgUsrSltd() != null) {
			imagingstudyreasoncodecoding.setUserSelected(Boolean.parseBoolean(i.getImgngStdyRsnCdCdgUsrSltd()));
		}
		/******************** ImgngStdy_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgVrsn() != null) {
			imagingstudyreasoncodecoding.setVersion(i.getImgngStdyRsnCdCdgVrsn());
		}
		/******************** ImgngStdy_RsnCd_Txt ********************************************************************************/
		if(i.getImgngStdyRsnCdTxt() != null) {
			imagingstudyreasoncode.setText(i.getImgngStdyRsnCdTxt());
		}
		/******************** ImgngStdy_RsnRfrnc ********************************************************************************/
		if(i.getImgngStdyRsnRfrnc() != null) {
			imagingstudy.addReasonReference( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyRsnRfrnc()));
		}
		/******************** ImgngStdy_Referrer ********************************************************************************/
		if(i.getImgngStdyReferrer() != null) {
			imagingstudy.setReferrer( new org.hl7.fhir.r4.model.Reference(i.getImgngStdyReferrer()));
		}
		/******************** imagingstudyseries ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent imagingstudyseries =  new org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent();
		imagingstudy.addSeries(imagingstudyseries);

		/******************** imagingstudyseriesbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesbodysite =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyseries.setBodySite(imagingstudyseriesbodysite);

		/******************** ImgngStdy_Series_BodySite_Cd ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteCd() != null) {
			imagingstudyseriesbodysite.setCode(i.getImgngStdySeriesBodySiteCd());
		}
		/******************** ImgngStdy_Series_BodySite_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteDsply() != null) {
			imagingstudyseriesbodysite.setDisplay(i.getImgngStdySeriesBodySiteDsply());
		}
		/******************** ImgngStdy_Series_BodySite_Sys ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteSys() != null) {
			imagingstudyseriesbodysite.setSystem(i.getImgngStdySeriesBodySiteSys());
		}
		/******************** ImgngStdy_Series_BodySite_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteUsrSltd() != null) {
			imagingstudyseriesbodysite.setUserSelected(Boolean.parseBoolean(i.getImgngStdySeriesBodySiteUsrSltd()));
		}
		/******************** ImgngStdy_Series_BodySite_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteVrsn() != null) {
			imagingstudyseriesbodysite.setVersion(i.getImgngStdySeriesBodySiteVrsn());
		}
		/******************** ImgngStdy_Series_Dscrptn ********************************************************************************/
		if(i.getImgngStdySeriesDscrptn() != null) {
			imagingstudyseries.setDescription(i.getImgngStdySeriesDscrptn());
		}
		/******************** ImgngStdy_Series_Endpoint ********************************************************************************/
		if(i.getImgngStdySeriesEndpoint() != null) {
			imagingstudyseries.addEndpoint( new org.hl7.fhir.r4.model.Reference(i.getImgngStdySeriesEndpoint()));
		}
		/******************** imagingstudyseriesinstance ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent imagingstudyseriesinstance =  new org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent();
		imagingstudyseries.addInstance(imagingstudyseriesinstance);

		/******************** ImgngStdy_Series_Instance_Nmbr ********************************************************************************/
		if(i.getImgngStdySeriesInstanceNmbr() != null) {
			imagingstudyseriesinstance.setNumber(Integer.parseInt(i.getImgngStdySeriesInstanceNmbr()));
		}
		/******************** imagingstudyseriesinstancesopclass ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesinstancesopclass =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyseriesinstance.setSopClass(imagingstudyseriesinstancesopclass);

		/******************** ImgngStdy_Series_Instance_SopCls_Cd ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsCd() != null) {
			imagingstudyseriesinstancesopclass.setCode(i.getImgngStdySeriesInstanceSopClsCd());
		}
		/******************** ImgngStdy_Series_Instance_SopCls_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsDsply() != null) {
			imagingstudyseriesinstancesopclass.setDisplay(i.getImgngStdySeriesInstanceSopClsDsply());
		}
		/******************** ImgngStdy_Series_Instance_SopCls_Sys ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsSys() != null) {
			imagingstudyseriesinstancesopclass.setSystem(i.getImgngStdySeriesInstanceSopClsSys());
		}
		/******************** ImgngStdy_Series_Instance_SopCls_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsUsrSltd() != null) {
			imagingstudyseriesinstancesopclass.setUserSelected(Boolean.parseBoolean(i.getImgngStdySeriesInstanceSopClsUsrSltd()));
		}
		/******************** ImgngStdy_Series_Instance_SopCls_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsVrsn() != null) {
			imagingstudyseriesinstancesopclass.setVersion(i.getImgngStdySeriesInstanceSopClsVrsn());
		}
		/******************** ImgngStdy_Series_Instance_Ttl ********************************************************************************/
		if(i.getImgngStdySeriesInstanceTtl() != null) {
			imagingstudyseriesinstance.setTitle(i.getImgngStdySeriesInstanceTtl());
		}
		/******************** ImgngStdy_Series_Instance_Uid ********************************************************************************/
		if(i.getImgngStdySeriesInstanceUid() != null) {
			imagingstudyseriesinstance.setUid(i.getImgngStdySeriesInstanceUid());
		}
		/******************** imagingstudyserieslaterality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyserieslaterality =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyseries.setLaterality(imagingstudyserieslaterality);

		/******************** ImgngStdy_Series_Laterality_Cd ********************************************************************************/
		if(i.getImgngStdySeriesLateralityCd() != null) {
			imagingstudyserieslaterality.setCode(i.getImgngStdySeriesLateralityCd());
		}
		/******************** ImgngStdy_Series_Laterality_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesLateralityDsply() != null) {
			imagingstudyserieslaterality.setDisplay(i.getImgngStdySeriesLateralityDsply());
		}
		/******************** ImgngStdy_Series_Laterality_Sys ********************************************************************************/
		if(i.getImgngStdySeriesLateralitySys() != null) {
			imagingstudyserieslaterality.setSystem(i.getImgngStdySeriesLateralitySys());
		}
		/******************** ImgngStdy_Series_Laterality_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesLateralityUsrSltd() != null) {
			imagingstudyserieslaterality.setUserSelected(Boolean.parseBoolean(i.getImgngStdySeriesLateralityUsrSltd()));
		}
		/******************** ImgngStdy_Series_Laterality_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesLateralityVrsn() != null) {
			imagingstudyserieslaterality.setVersion(i.getImgngStdySeriesLateralityVrsn());
		}
		/******************** imagingstudyseriesmodality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesmodality =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyseries.setModality(imagingstudyseriesmodality);

		/******************** ImgngStdy_Series_Modality_Cd ********************************************************************************/
		if(i.getImgngStdySeriesModalityCd() != null) {
			imagingstudyseriesmodality.setCode(i.getImgngStdySeriesModalityCd());
		}
		/******************** ImgngStdy_Series_Modality_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesModalityDsply() != null) {
			imagingstudyseriesmodality.setDisplay(i.getImgngStdySeriesModalityDsply());
		}
		/******************** ImgngStdy_Series_Modality_Sys ********************************************************************************/
		if(i.getImgngStdySeriesModalitySys() != null) {
			imagingstudyseriesmodality.setSystem(i.getImgngStdySeriesModalitySys());
		}
		/******************** ImgngStdy_Series_Modality_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesModalityUsrSltd() != null) {
			imagingstudyseriesmodality.setUserSelected(Boolean.parseBoolean(i.getImgngStdySeriesModalityUsrSltd()));
		}
		/******************** ImgngStdy_Series_Modality_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesModalityVrsn() != null) {
			imagingstudyseriesmodality.setVersion(i.getImgngStdySeriesModalityVrsn());
		}
		/******************** ImgngStdy_Series_Nmbr ********************************************************************************/
		if(i.getImgngStdySeriesNmbr() != null) {
			imagingstudyseries.setNumber(Integer.parseInt(i.getImgngStdySeriesNmbr()));
		}
		/******************** ImgngStdy_Series_NmbrOfInstances ********************************************************************************/
		if(i.getImgngStdySeriesNmbrOfInstances() != null) {
			imagingstudyseries.setNumberOfInstances(Integer.parseInt(i.getImgngStdySeriesNmbrOfInstances()));
		}
		/******************** imagingstudyseriesperformer ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent imagingstudyseriesperformer =  new org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent();
		imagingstudyseries.addPerformer(imagingstudyseriesperformer);

		/******************** ImgngStdy_Series_Prfrmr_Actor ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrActor() != null) {
			imagingstudyseriesperformer.setActor( new org.hl7.fhir.r4.model.Reference(i.getImgngStdySeriesPrfrmrActor()));
		}
		/******************** imagingstudyseriesperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyseriesperformerfunction =  new org.hl7.fhir.r4.model.CodeableConcept();
		imagingstudyseriesperformer.setFunction(imagingstudyseriesperformerfunction);

		/******************** imagingstudyseriesperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesperformerfunctioncoding =  new org.hl7.fhir.r4.model.Coding();
		imagingstudyseriesperformerfunction.addCoding(imagingstudyseriesperformerfunctioncoding);

		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgCd() != null) {
			imagingstudyseriesperformerfunctioncoding.setCode(i.getImgngStdySeriesPrfrmrFunctionCdgCd());
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgDsply() != null) {
			imagingstudyseriesperformerfunctioncoding.setDisplay(i.getImgngStdySeriesPrfrmrFunctionCdgDsply());
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgSys() != null) {
			imagingstudyseriesperformerfunctioncoding.setSystem(i.getImgngStdySeriesPrfrmrFunctionCdgSys());
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgUsrSltd() != null) {
			imagingstudyseriesperformerfunctioncoding.setUserSelected(Boolean.parseBoolean(i.getImgngStdySeriesPrfrmrFunctionCdgUsrSltd()));
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgVrsn() != null) {
			imagingstudyseriesperformerfunctioncoding.setVersion(i.getImgngStdySeriesPrfrmrFunctionCdgVrsn());
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Txt ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionTxt() != null) {
			imagingstudyseriesperformerfunction.setText(i.getImgngStdySeriesPrfrmrFunctionTxt());
		}
		/******************** ImgngStdy_Series_Spcmn ********************************************************************************/
		if(i.getImgngStdySeriesSpcmn() != null) {
			imagingstudyseries.addSpecimen( new org.hl7.fhir.r4.model.Reference(i.getImgngStdySeriesSpcmn()));
		}
		/******************** ImgngStdy_Series_Strted ********************************************************************************/
		if(i.getImgngStdySeriesStrted() != null) {
			java.text.SimpleDateFormat ImgngStdy_Series_Strtedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImgngStdy_Series_Strteddate = ImgngStdy_Series_Strtedsdf.parse(i.getImgngStdySeriesStrted());
			imagingstudyseries.setStarted(ImgngStdy_Series_Strteddate);
		}
		/******************** ImgngStdy_Series_Uid ********************************************************************************/
		if(i.getImgngStdySeriesUid() != null) {
			imagingstudyseries.setUid(i.getImgngStdySeriesUid());
		}
		/******************** ImgngStdy_Strted ********************************************************************************/
		if(i.getImgngStdyStrted() != null) {
			java.text.SimpleDateFormat ImgngStdy_Strtedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ImgngStdy_Strteddate = ImgngStdy_Strtedsdf.parse(i.getImgngStdyStrted());
			imagingstudy.setStarted(ImgngStdy_Strteddate);
		}
		/******************** imagingstudystatus ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudyStatusEnumFactory imagingstudystatus =  new org.hl7.fhir.r4.model.ImagingStudy.ImagingStudyStatusEnumFactory();
		imagingstudy.setStatus(imagingstudystatus.fromCode(i.getImgngStdySts()));

		/******************** ImgngStdy_Sbjct ********************************************************************************/
		if(i.getImgngStdySbjct() != null) {
			imagingstudy.setSubject( new org.hl7.fhir.r4.model.Reference(i.getImgngStdySbjct()));
		}
		return imagingstudy;
	}
}
