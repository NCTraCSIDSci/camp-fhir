package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImagingStudy;
public class ImagingStudyBidirectionalConversion 
{
	public ImagingStudy ImagingStudys(org.hl7.fhir.r4.model.ImagingStudy imagingstudy) throws ParseException
	{
		 main.java.com.campfhir.model.ImagingStudy i = new  main.java.com.campfhir.model.ImagingStudy();

		/******************** id ********************************************************************************/
		imagingstudy.setId(i.getId());

		/******************** ImgngStdy_Lctn ********************************************************************************/
		if(imagingstudy.hasLocation()) {
			i.setImgngStdyLctn(String.valueOf(imagingstudy.getLocation()));
		}
		/******************** ImgngStdy_Enc ********************************************************************************/
		if(imagingstudy.hasEncounter()) {
			i.setImgngStdyEnc(String.valueOf(imagingstudy.getEncounter()));
		}
		/******************** ImgngStdy_Sbjct ********************************************************************************/
		if(imagingstudy.hasSubject()) {
			i.setImgngStdySbjct(String.valueOf(imagingstudy.getSubject()));
		}
		/******************** imagingstudystatus ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudyStatus imagingstudystatus = imagingstudy.getStatus();
		i.setImgngStdySts(imagingstudystatus.toCode());

		/******************** ImgngStdy_Strted ********************************************************************************/
		if(imagingstudy.hasStarted()) {
			i.setImgngStdyStrted(String.valueOf(imagingstudy.getStarted()));
		}
		/******************** ImgngStdy_Referrer ********************************************************************************/
		if(imagingstudy.hasReferrer()) {
			i.setImgngStdyReferrer(String.valueOf(imagingstudy.getReferrer()));
		}
		/******************** ImgngStdy_BasedOn ********************************************************************************/
		if(imagingstudy.hasBasedOn()) {
			i.setImgngStdyBasedOn(String.valueOf(imagingstudy.getBasedOnFirstRep()));
		}
		/******************** ImgngStdy_NmbrOfSeries ********************************************************************************/
		if(imagingstudy.hasNumberOfSeries()) {
			i.setImgngStdyNmbrOfSeries(String.valueOf(imagingstudy.getNumberOfSeries()));
		}
		/******************** imagingstudyseries ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesComponent imagingstudyseries = imagingstudy.getSeriesFirstRep();

		/******************** ImgngStdy_Series_Nmbr ********************************************************************************/
		if(imagingstudyseries.hasNumber()) {
			i.setImgngStdySeriesNmbr(String.valueOf(imagingstudyseries.getNumber()));
		}
		/******************** imagingstudyseriesmodality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesmodality = imagingstudyseries.getModality();

		/******************** ImgngStdy_Series_Modality_Vrsn ********************************************************************************/
		if(imagingstudyseriesmodality.hasVersion()) {
			i.setImgngStdySeriesModalityVrsn(String.valueOf(imagingstudyseriesmodality.getVersion()));
		}
		/******************** ImgngStdy_Series_Modality_Dsply ********************************************************************************/
		if(imagingstudyseriesmodality.hasDisplay()) {
			i.setImgngStdySeriesModalityDsply(String.valueOf(imagingstudyseriesmodality.getDisplay()));
		}
		/******************** ImgngStdy_Series_Modality_Cd ********************************************************************************/
		if(imagingstudyseriesmodality.hasCode()) {
			i.setImgngStdySeriesModalityCd(String.valueOf(imagingstudyseriesmodality.getCode()));
		}
		/******************** ImgngStdy_Series_Modality_UsrSltd ********************************************************************************/
		if(imagingstudyseriesmodality.hasUserSelected()) {
			i.setImgngStdySeriesModalityUsrSltd(String.valueOf(imagingstudyseriesmodality.getUserSelected()));
		}
		/******************** ImgngStdy_Series_Modality_Sys ********************************************************************************/
		if(imagingstudyseriesmodality.hasSystem()) {
			i.setImgngStdySeriesModalitySys(String.valueOf(imagingstudyseriesmodality.getSystem()));
		}
		/******************** ImgngStdy_Series_Strted ********************************************************************************/
		if(imagingstudyseries.hasStarted()) {
			i.setImgngStdySeriesStrted(String.valueOf(imagingstudyseries.getStarted()));
		}
		/******************** ImgngStdy_Series_Dscrptn ********************************************************************************/
		if(imagingstudyseries.hasDescription()) {
			i.setImgngStdySeriesDscrptn(String.valueOf(imagingstudyseries.getDescription()));
		}
		/******************** ImgngStdy_Series_Uid ********************************************************************************/
		if(imagingstudyseries.hasUid()) {
			i.setImgngStdySeriesUid(String.valueOf(imagingstudyseries.getUid()));
		}
		/******************** imagingstudyserieslaterality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyserieslaterality = imagingstudyseries.getLaterality();

		/******************** ImgngStdy_Series_Laterality_Vrsn ********************************************************************************/
		if(imagingstudyserieslaterality.hasVersion()) {
			i.setImgngStdySeriesLateralityVrsn(String.valueOf(imagingstudyserieslaterality.getVersion()));
		}
		/******************** ImgngStdy_Series_Laterality_Dsply ********************************************************************************/
		if(imagingstudyserieslaterality.hasDisplay()) {
			i.setImgngStdySeriesLateralityDsply(String.valueOf(imagingstudyserieslaterality.getDisplay()));
		}
		/******************** ImgngStdy_Series_Laterality_Cd ********************************************************************************/
		if(imagingstudyserieslaterality.hasCode()) {
			i.setImgngStdySeriesLateralityCd(String.valueOf(imagingstudyserieslaterality.getCode()));
		}
		/******************** ImgngStdy_Series_Laterality_UsrSltd ********************************************************************************/
		if(imagingstudyserieslaterality.hasUserSelected()) {
			i.setImgngStdySeriesLateralityUsrSltd(String.valueOf(imagingstudyserieslaterality.getUserSelected()));
		}
		/******************** ImgngStdy_Series_Laterality_Sys ********************************************************************************/
		if(imagingstudyserieslaterality.hasSystem()) {
			i.setImgngStdySeriesLateralitySys(String.valueOf(imagingstudyserieslaterality.getSystem()));
		}
		/******************** imagingstudyseriesinstance ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesInstanceComponent imagingstudyseriesinstance = imagingstudyseries.getInstanceFirstRep();

		/******************** ImgngStdy_Series_Instance_Nmbr ********************************************************************************/
		if(imagingstudyseriesinstance.hasNumber()) {
			i.setImgngStdySeriesInstanceNmbr(String.valueOf(imagingstudyseriesinstance.getNumber()));
		}
		/******************** ImgngStdy_Series_Instance_Ttl ********************************************************************************/
		if(imagingstudyseriesinstance.hasTitle()) {
			i.setImgngStdySeriesInstanceTtl(String.valueOf(imagingstudyseriesinstance.getTitle()));
		}
		/******************** ImgngStdy_Series_Instance_Uid ********************************************************************************/
		if(imagingstudyseriesinstance.hasUid()) {
			i.setImgngStdySeriesInstanceUid(String.valueOf(imagingstudyseriesinstance.getUid()));
		}
		/******************** imagingstudyseriesinstancesopclass ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesinstancesopclass = imagingstudyseriesinstance.getSopClass();

		/******************** ImgngStdy_Series_Instance_SopCls_Vrsn ********************************************************************************/
		if(imagingstudyseriesinstancesopclass.hasVersion()) {
			i.setImgngStdySeriesInstanceSopClsVrsn(String.valueOf(imagingstudyseriesinstancesopclass.getVersion()));
		}
		/******************** ImgngStdy_Series_Instance_SopCls_Dsply ********************************************************************************/
		if(imagingstudyseriesinstancesopclass.hasDisplay()) {
			i.setImgngStdySeriesInstanceSopClsDsply(String.valueOf(imagingstudyseriesinstancesopclass.getDisplay()));
		}
		/******************** ImgngStdy_Series_Instance_SopCls_Cd ********************************************************************************/
		if(imagingstudyseriesinstancesopclass.hasCode()) {
			i.setImgngStdySeriesInstanceSopClsCd(String.valueOf(imagingstudyseriesinstancesopclass.getCode()));
		}
		/******************** ImgngStdy_Series_Instance_SopCls_UsrSltd ********************************************************************************/
		if(imagingstudyseriesinstancesopclass.hasUserSelected()) {
			i.setImgngStdySeriesInstanceSopClsUsrSltd(String.valueOf(imagingstudyseriesinstancesopclass.getUserSelected()));
		}
		/******************** ImgngStdy_Series_Instance_SopCls_Sys ********************************************************************************/
		if(imagingstudyseriesinstancesopclass.hasSystem()) {
			i.setImgngStdySeriesInstanceSopClsSys(String.valueOf(imagingstudyseriesinstancesopclass.getSystem()));
		}
		/******************** imagingstudyseriesbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesbodysite = imagingstudyseries.getBodySite();

		/******************** ImgngStdy_Series_BodySite_Vrsn ********************************************************************************/
		if(imagingstudyseriesbodysite.hasVersion()) {
			i.setImgngStdySeriesBodySiteVrsn(String.valueOf(imagingstudyseriesbodysite.getVersion()));
		}
		/******************** ImgngStdy_Series_BodySite_Dsply ********************************************************************************/
		if(imagingstudyseriesbodysite.hasDisplay()) {
			i.setImgngStdySeriesBodySiteDsply(String.valueOf(imagingstudyseriesbodysite.getDisplay()));
		}
		/******************** ImgngStdy_Series_BodySite_Cd ********************************************************************************/
		if(imagingstudyseriesbodysite.hasCode()) {
			i.setImgngStdySeriesBodySiteCd(String.valueOf(imagingstudyseriesbodysite.getCode()));
		}
		/******************** ImgngStdy_Series_BodySite_UsrSltd ********************************************************************************/
		if(imagingstudyseriesbodysite.hasUserSelected()) {
			i.setImgngStdySeriesBodySiteUsrSltd(String.valueOf(imagingstudyseriesbodysite.getUserSelected()));
		}
		/******************** ImgngStdy_Series_BodySite_Sys ********************************************************************************/
		if(imagingstudyseriesbodysite.hasSystem()) {
			i.setImgngStdySeriesBodySiteSys(String.valueOf(imagingstudyseriesbodysite.getSystem()));
		}
		/******************** ImgngStdy_Series_NmbrOfInstances ********************************************************************************/
		if(imagingstudyseries.hasNumberOfInstances()) {
			i.setImgngStdySeriesNmbrOfInstances(String.valueOf(imagingstudyseries.getNumberOfInstances()));
		}
		/******************** ImgngStdy_Series_Endpoint ********************************************************************************/
		if(imagingstudyseries.hasEndpoint()) {
			i.setImgngStdySeriesEndpoint(String.valueOf(imagingstudyseries.getEndpointFirstRep()));
		}
		/******************** ImgngStdy_Series_Spcmn ********************************************************************************/
		if(imagingstudyseries.hasSpecimen()) {
			i.setImgngStdySeriesSpcmn(String.valueOf(imagingstudyseries.getSpecimenFirstRep()));
		}
		/******************** imagingstudyseriesperformer ********************************************************************************/
		org.hl7.fhir.r4.model.ImagingStudy.ImagingStudySeriesPerformerComponent imagingstudyseriesperformer = imagingstudyseries.getPerformerFirstRep();

		/******************** imagingstudyseriesperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyseriesperformerfunction = imagingstudyseriesperformer.getFunction();

		/******************** ImgngStdy_Series_Prfrmr_Function_Txt ********************************************************************************/
		if(imagingstudyseriesperformerfunction.hasText()) {
			i.setImgngStdySeriesPrfrmrFunctionTxt(String.valueOf(imagingstudyseriesperformerfunction.getText()));
		}
		/******************** imagingstudyseriesperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyseriesperformerfunctioncoding = imagingstudyseriesperformerfunction.getCodingFirstRep();

		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncoding.hasVersion()) {
			i.setImgngStdySeriesPrfrmrFunctionCdgVrsn(String.valueOf(imagingstudyseriesperformerfunctioncoding.getVersion()));
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncoding.hasDisplay()) {
			i.setImgngStdySeriesPrfrmrFunctionCdgDsply(String.valueOf(imagingstudyseriesperformerfunctioncoding.getDisplay()));
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncoding.hasCode()) {
			i.setImgngStdySeriesPrfrmrFunctionCdgCd(String.valueOf(imagingstudyseriesperformerfunctioncoding.getCode()));
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncoding.hasUserSelected()) {
			i.setImgngStdySeriesPrfrmrFunctionCdgUsrSltd(String.valueOf(imagingstudyseriesperformerfunctioncoding.getUserSelected()));
		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(imagingstudyseriesperformerfunctioncoding.hasSystem()) {
			i.setImgngStdySeriesPrfrmrFunctionCdgSys(String.valueOf(imagingstudyseriesperformerfunctioncoding.getSystem()));
		}
		/******************** ImgngStdy_Series_Prfrmr_Actor ********************************************************************************/
		if(imagingstudyseriesperformer.hasActor()) {
			i.setImgngStdySeriesPrfrmrActor(String.valueOf(imagingstudyseriesperformer.getActor()));
		}
		/******************** imagingstudynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation imagingstudynote = imagingstudy.getNoteFirstRep();

		/******************** ImgngStdy_Nt_Time ********************************************************************************/
		if(imagingstudynote.hasTime()) {
			i.setImgngStdyNtTime(String.valueOf(imagingstudynote.getTime()));
		}
		/******************** ImgngStdy_Nt_Txt ********************************************************************************/
		if(imagingstudynote.hasText()) {
			i.setImgngStdyNtTxt(String.valueOf(imagingstudynote.getText()));
		}
		/******************** ImgngStdy_Nt_AthrRfrnc ********************************************************************************/
		if(imagingstudynote.hasAuthorReference()) {
			i.setImgngStdyNtAthrRfrnc(String.valueOf(imagingstudynote.getAuthorReference()));
		}
		/******************** ImgngStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(imagingstudynote.hasAuthorStringType()) {
			i.setImgngStdyNtAthrStrgTyp(String.valueOf(imagingstudynote.getAuthorStringType()));
		}
		/******************** ImgngStdy_Dscrptn ********************************************************************************/
		if(imagingstudy.hasDescription()) {
			i.setImgngStdyDscrptn(String.valueOf(imagingstudy.getDescription()));
		}
		/******************** imagingstudyprocedurecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyprocedurecode = imagingstudy.getProcedureCodeFirstRep();

		/******************** ImgngStdy_PrcdrCd_Txt ********************************************************************************/
		if(imagingstudyprocedurecode.hasText()) {
			i.setImgngStdyPrcdrCdTxt(String.valueOf(imagingstudyprocedurecode.getText()));
		}
		/******************** imagingstudyprocedurecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyprocedurecodecoding = imagingstudyprocedurecode.getCodingFirstRep();

		/******************** ImgngStdy_PrcdrCd_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyprocedurecodecoding.hasVersion()) {
			i.setImgngStdyPrcdrCdCdgVrsn(String.valueOf(imagingstudyprocedurecodecoding.getVersion()));
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Dsply ********************************************************************************/
		if(imagingstudyprocedurecodecoding.hasDisplay()) {
			i.setImgngStdyPrcdrCdCdgDsply(String.valueOf(imagingstudyprocedurecodecoding.getDisplay()));
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Cd ********************************************************************************/
		if(imagingstudyprocedurecodecoding.hasCode()) {
			i.setImgngStdyPrcdrCdCdgCd(String.valueOf(imagingstudyprocedurecodecoding.getCode()));
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyprocedurecodecoding.hasUserSelected()) {
			i.setImgngStdyPrcdrCdCdgUsrSltd(String.valueOf(imagingstudyprocedurecodecoding.getUserSelected()));
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Sys ********************************************************************************/
		if(imagingstudyprocedurecodecoding.hasSystem()) {
			i.setImgngStdyPrcdrCdCdgSys(String.valueOf(imagingstudyprocedurecodecoding.getSystem()));
		}
		/******************** ImgngStdy_NmbrOfInstances ********************************************************************************/
		if(imagingstudy.hasNumberOfInstances()) {
			i.setImgngStdyNmbrOfInstances(String.valueOf(imagingstudy.getNumberOfInstances()));
		}
		/******************** imagingstudymodality ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudymodality = imagingstudy.getModalityFirstRep();

		/******************** ImgngStdy_Modality_Vrsn ********************************************************************************/
		if(imagingstudymodality.hasVersion()) {
			i.setImgngStdyModalityVrsn(String.valueOf(imagingstudymodality.getVersion()));
		}
		/******************** ImgngStdy_Modality_Dsply ********************************************************************************/
		if(imagingstudymodality.hasDisplay()) {
			i.setImgngStdyModalityDsply(String.valueOf(imagingstudymodality.getDisplay()));
		}
		/******************** ImgngStdy_Modality_Cd ********************************************************************************/
		if(imagingstudymodality.hasCode()) {
			i.setImgngStdyModalityCd(String.valueOf(imagingstudymodality.getCode()));
		}
		/******************** ImgngStdy_Modality_UsrSltd ********************************************************************************/
		if(imagingstudymodality.hasUserSelected()) {
			i.setImgngStdyModalityUsrSltd(String.valueOf(imagingstudymodality.getUserSelected()));
		}
		/******************** ImgngStdy_Modality_Sys ********************************************************************************/
		if(imagingstudymodality.hasSystem()) {
			i.setImgngStdyModalitySys(String.valueOf(imagingstudymodality.getSystem()));
		}
		/******************** imagingstudyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier imagingstudyidentifier = imagingstudy.getIdentifierFirstRep();

		/******************** ImgngStdy_Id_Vl ********************************************************************************/
		if(imagingstudyidentifier.hasValue()) {
			i.setImgngStdyIdVl(String.valueOf(imagingstudyidentifier.getValue()));
		}
		/******************** imagingstudyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyidentifiertype = imagingstudyidentifier.getType();

		/******************** ImgngStdy_Id_Typ_Txt ********************************************************************************/
		if(imagingstudyidentifiertype.hasText()) {
			i.setImgngStdyIdTypTxt(String.valueOf(imagingstudyidentifiertype.getText()));
		}
		/******************** imagingstudyidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyidentifiertypecoding = imagingstudyidentifiertype.getCodingFirstRep();

		/******************** ImgngStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyidentifiertypecoding.hasVersion()) {
			i.setImgngStdyIdTypCdgVrsn(String.valueOf(imagingstudyidentifiertypecoding.getVersion()));
		}
		/******************** ImgngStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(imagingstudyidentifiertypecoding.hasDisplay()) {
			i.setImgngStdyIdTypCdgDsply(String.valueOf(imagingstudyidentifiertypecoding.getDisplay()));
		}
		/******************** ImgngStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(imagingstudyidentifiertypecoding.hasCode()) {
			i.setImgngStdyIdTypCdgCd(String.valueOf(imagingstudyidentifiertypecoding.getCode()));
		}
		/******************** ImgngStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyidentifiertypecoding.hasUserSelected()) {
			i.setImgngStdyIdTypCdgUsrSltd(String.valueOf(imagingstudyidentifiertypecoding.getUserSelected()));
		}
		/******************** ImgngStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(imagingstudyidentifiertypecoding.hasSystem()) {
			i.setImgngStdyIdTypCdgSys(String.valueOf(imagingstudyidentifiertypecoding.getSystem()));
		}
		/******************** imagingstudyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period imagingstudyidentifierperiod = imagingstudyidentifier.getPeriod();

		/******************** ImgngStdy_Id_Prd_Strt ********************************************************************************/
		if(imagingstudyidentifierperiod.hasStart()) {
			i.setImgngStdyIdPrdStrt(String.valueOf(imagingstudyidentifierperiod.getStart()));
		}
		/******************** ImgngStdy_Id_Prd_End ********************************************************************************/
		if(imagingstudyidentifierperiod.hasEnd()) {
			i.setImgngStdyIdPrdEnd(String.valueOf(imagingstudyidentifierperiod.getEnd()));
		}
		/******************** ImgngStdy_Id_Assigner ********************************************************************************/
		if(imagingstudyidentifier.hasAssigner()) {
			i.setImgngStdyIdAssigner(String.valueOf(imagingstudyidentifier.getAssigner()));
		}
		/******************** ImgngStdy_Id_Sys ********************************************************************************/
		if(imagingstudyidentifier.hasSystem()) {
			i.setImgngStdyIdSys(String.valueOf(imagingstudyidentifier.getSystem()));
		}
		/******************** imagingstudyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse imagingstudyidentifieruse = imagingstudyidentifier.getUse();
		i.setImgngStdyIdUse(imagingstudyidentifieruse.toCode());

		/******************** ImgngStdy_Interpreter ********************************************************************************/
		if(imagingstudy.hasInterpreter()) {
			i.setImgngStdyInterpreter(String.valueOf(imagingstudy.getInterpreterFirstRep()));
		}
		/******************** ImgngStdy_Endpoint ********************************************************************************/
		if(imagingstudy.hasEndpoint()) {
			i.setImgngStdyEndpoint(String.valueOf(imagingstudy.getEndpointFirstRep()));
		}
		/******************** ImgngStdy_PrcdrRfrnc ********************************************************************************/
		if(imagingstudy.hasProcedureReference()) {
			i.setImgngStdyPrcdrRfrnc(String.valueOf(imagingstudy.getProcedureReference()));
		}
		/******************** imagingstudyreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept imagingstudyreasoncode = imagingstudy.getReasonCodeFirstRep();

		/******************** ImgngStdy_RsnCd_Txt ********************************************************************************/
		if(imagingstudyreasoncode.hasText()) {
			i.setImgngStdyRsnCdTxt(String.valueOf(imagingstudyreasoncode.getText()));
		}
		/******************** imagingstudyreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding imagingstudyreasoncodecoding = imagingstudyreasoncode.getCodingFirstRep();

		/******************** ImgngStdy_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(imagingstudyreasoncodecoding.hasVersion()) {
			i.setImgngStdyRsnCdCdgVrsn(String.valueOf(imagingstudyreasoncodecoding.getVersion()));
		}
		/******************** ImgngStdy_RsnCd_Cdg_Dsply ********************************************************************************/
		if(imagingstudyreasoncodecoding.hasDisplay()) {
			i.setImgngStdyRsnCdCdgDsply(String.valueOf(imagingstudyreasoncodecoding.getDisplay()));
		}
		/******************** ImgngStdy_RsnCd_Cdg_Cd ********************************************************************************/
		if(imagingstudyreasoncodecoding.hasCode()) {
			i.setImgngStdyRsnCdCdgCd(String.valueOf(imagingstudyreasoncodecoding.getCode()));
		}
		/******************** ImgngStdy_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(imagingstudyreasoncodecoding.hasUserSelected()) {
			i.setImgngStdyRsnCdCdgUsrSltd(String.valueOf(imagingstudyreasoncodecoding.getUserSelected()));
		}
		/******************** ImgngStdy_RsnCd_Cdg_Sys ********************************************************************************/
		if(imagingstudyreasoncodecoding.hasSystem()) {
			i.setImgngStdyRsnCdCdgSys(String.valueOf(imagingstudyreasoncodecoding.getSystem()));
		}
		/******************** ImgngStdy_RsnRfrnc ********************************************************************************/
		if(imagingstudy.hasReasonReference()) {
			i.setImgngStdyRsnRfrnc(String.valueOf(imagingstudy.getReasonReferenceFirstRep()));
		}
		return i;
	}
}
