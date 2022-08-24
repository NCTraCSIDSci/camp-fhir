package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DiagnosticReport;
public class DiagnosticReportBidirectionalConversion 
{
	public DiagnosticReport DiagnosticReports(org.hl7.fhir.r4.model.DiagnosticReport diagnosticreport) throws ParseException
	{
		 main.java.com.campfhir.model.DiagnosticReport d = new  main.java.com.campfhir.model.DiagnosticReport();

		/******************** id ********************************************************************************/
		d.setId(diagnosticreport.getIdElement().getIdPart());

		/******************** DiagnosticRpt_Rslt ********************************************************************************/
		if(diagnosticreport.hasResult()) {

			String  array = "[";
			for(int incr=0; incr<diagnosticreport.getResult().size(); incr++) {
				array = array + diagnosticreport.getResult().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDiagnosticRptRslt(array);

		} else {
			d.addDiagnosticRptRslt("NULL");
		}


		/******************** diagnosticreportcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportcode = diagnosticreport.getCode();

		/******************** DiagnosticRpt_Cd_Txt ********************************************************************************/
		if(diagnosticreportcode.hasText()) {

			d.addDiagnosticRptCdTxt(String.valueOf(diagnosticreportcode.getText()));
		} else {
			d.addDiagnosticRptCdTxt("NULL");
		}


		/******************** diagnosticreportcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> diagnosticreportcodecodinglist = diagnosticreportcode.getCoding();
		for(int diagnosticreportcodecodingi = 0; diagnosticreportcodecodingi<diagnosticreportcodecodinglist.size();diagnosticreportcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  diagnosticreportcodecoding = diagnosticreportcodecodinglist.get(diagnosticreportcodecodingi);

		/******************** DiagnosticRpt_Cd_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportcodecodingi == 0) {d.addDiagnosticRptCdCdgDsply("[");}
		if(diagnosticreportcodecoding.hasDisplay()) {

			d.addDiagnosticRptCdCdgDsply(String.valueOf(diagnosticreportcodecoding.getDisplay()));
		} else {
			d.addDiagnosticRptCdCdgDsply("NULL");
		}

		if(diagnosticreportcodecodingi == diagnosticreportcodecodinglist.size()-1) {d.addDiagnosticRptCdCdgDsply("]");}


		/******************** DiagnosticRpt_Cd_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportcodecodingi == 0) {d.addDiagnosticRptCdCdgVrsn("[");}
		if(diagnosticreportcodecoding.hasVersion()) {

			d.addDiagnosticRptCdCdgVrsn(String.valueOf(diagnosticreportcodecoding.getVersion()));
		} else {
			d.addDiagnosticRptCdCdgVrsn("NULL");
		}

		if(diagnosticreportcodecodingi == diagnosticreportcodecodinglist.size()-1) {d.addDiagnosticRptCdCdgVrsn("]");}


		/******************** DiagnosticRpt_Cd_Cdg_Cd ********************************************************************************/
		if(diagnosticreportcodecodingi == 0) {d.addDiagnosticRptCdCdgCd("[");}
		if(diagnosticreportcodecoding.hasCode()) {

			d.addDiagnosticRptCdCdgCd(String.valueOf(diagnosticreportcodecoding.getCode()));
		} else {
			d.addDiagnosticRptCdCdgCd("NULL");
		}

		if(diagnosticreportcodecodingi == diagnosticreportcodecodinglist.size()-1) {d.addDiagnosticRptCdCdgCd("]");}


		/******************** DiagnosticRpt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportcodecodingi == 0) {d.addDiagnosticRptCdCdgUsrSltd("[");}
		if(diagnosticreportcodecoding.hasUserSelected()) {

			d.addDiagnosticRptCdCdgUsrSltd(String.valueOf(diagnosticreportcodecoding.getUserSelected()));
		} else {
			d.addDiagnosticRptCdCdgUsrSltd("NULL");
		}

		if(diagnosticreportcodecodingi == diagnosticreportcodecodinglist.size()-1) {d.addDiagnosticRptCdCdgUsrSltd("]");}


		/******************** DiagnosticRpt_Cd_Cdg_Sys ********************************************************************************/
		if(diagnosticreportcodecodingi == 0) {d.addDiagnosticRptCdCdgSys("[");}
		if(diagnosticreportcodecoding.hasSystem()) {

			d.addDiagnosticRptCdCdgSys(String.valueOf(diagnosticreportcodecoding.getSystem()));
		} else {
			d.addDiagnosticRptCdCdgSys("NULL");
		}

		if(diagnosticreportcodecodingi == diagnosticreportcodecodinglist.size()-1) {d.addDiagnosticRptCdCdgSys("]");}


		 };
		/******************** DiagnosticRpt_Sbjct ********************************************************************************/
		if(diagnosticreport.hasSubject()) {

			if(diagnosticreport.getSubject().getReference() != null) {
			d.addDiagnosticRptSbjct(diagnosticreport.getSubject().getReference());
			}
		} else {
			d.addDiagnosticRptSbjct("NULL");
		}


		/******************** diagnosticreportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatus diagnosticreportstatus = diagnosticreport.getStatus();
		if(diagnosticreportstatus!=null) {
			d.addDiagnosticRptSts(diagnosticreportstatus.toCode());
		} else {
			d.addDiagnosticRptSts("NULL");
		}

		/******************** DiagnosticRpt_Enc ********************************************************************************/
		if(diagnosticreport.hasEncounter()) {

			if(diagnosticreport.getEncounter().getReference() != null) {
			d.addDiagnosticRptEnc(diagnosticreport.getEncounter().getReference());
			}
		} else {
			d.addDiagnosticRptEnc("NULL");
		}


		/******************** DiagnosticRpt_BasedOn ********************************************************************************/
		if(diagnosticreport.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<diagnosticreport.getBasedOn().size(); incr++) {
				array = array + diagnosticreport.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDiagnosticRptBasedOn(array);

		} else {
			d.addDiagnosticRptBasedOn("NULL");
		}


		/******************** diagnosticreportidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> diagnosticreportidentifierlist = diagnosticreport.getIdentifier();
		for(int diagnosticreportidentifieri = 0; diagnosticreportidentifieri<diagnosticreportidentifierlist.size();diagnosticreportidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  diagnosticreportidentifier = diagnosticreportidentifierlist.get(diagnosticreportidentifieri);

		/******************** DiagnosticRpt_Id_Vl ********************************************************************************/
		if(diagnosticreportidentifieri == 0) {d.addDiagnosticRptIdVl("[");}
		if(diagnosticreportidentifier.hasValue()) {

			d.addDiagnosticRptIdVl(String.valueOf(diagnosticreportidentifier.getValue()));
		} else {
			d.addDiagnosticRptIdVl("NULL");
		}

		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {d.addDiagnosticRptIdVl("]");}


		/******************** diagnosticreportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportidentifiertype = diagnosticreportidentifier.getType();

		/******************** DiagnosticRpt_Id_Typ_Txt ********************************************************************************/
		if(diagnosticreportidentifieri == 0) {d.addDiagnosticRptIdTypTxt("[");}
		if(diagnosticreportidentifiertype.hasText()) {

			d.addDiagnosticRptIdTypTxt(String.valueOf(diagnosticreportidentifiertype.getText()));
		} else {
			d.addDiagnosticRptIdTypTxt("NULL");
		}

		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {d.addDiagnosticRptIdTypTxt("]");}


		/******************** diagnosticreportidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> diagnosticreportidentifiertypecodinglist = diagnosticreportidentifiertype.getCoding();
		for(int diagnosticreportidentifiertypecodingi = 0; diagnosticreportidentifiertypecodingi<diagnosticreportidentifiertypecodinglist.size();diagnosticreportidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  diagnosticreportidentifiertypecoding = diagnosticreportidentifiertypecodinglist.get(diagnosticreportidentifiertypecodingi);

		/******************** DiagnosticRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportidentifiertypecodingi == 0) {d.addDiagnosticRptIdTypCdgDsply("[[");}
		if(diagnosticreportidentifiertypecoding.hasDisplay()) {

			d.addDiagnosticRptIdTypCdgDsply(String.valueOf(diagnosticreportidentifiertypecoding.getDisplay()));
		} else {
			d.addDiagnosticRptIdTypCdgDsply("NULL");
		}

		if(diagnosticreportidentifiertypecodingi == diagnosticreportidentifiertypecodinglist.size()-1) {d.addDiagnosticRptIdTypCdgDsply("]]");}


		/******************** DiagnosticRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportidentifiertypecodingi == 0) {d.addDiagnosticRptIdTypCdgVrsn("[[");}
		if(diagnosticreportidentifiertypecoding.hasVersion()) {

			d.addDiagnosticRptIdTypCdgVrsn(String.valueOf(diagnosticreportidentifiertypecoding.getVersion()));
		} else {
			d.addDiagnosticRptIdTypCdgVrsn("NULL");
		}

		if(diagnosticreportidentifiertypecodingi == diagnosticreportidentifiertypecodinglist.size()-1) {d.addDiagnosticRptIdTypCdgVrsn("]]");}


		/******************** DiagnosticRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(diagnosticreportidentifiertypecodingi == 0) {d.addDiagnosticRptIdTypCdgCd("[[");}
		if(diagnosticreportidentifiertypecoding.hasCode()) {

			d.addDiagnosticRptIdTypCdgCd(String.valueOf(diagnosticreportidentifiertypecoding.getCode()));
		} else {
			d.addDiagnosticRptIdTypCdgCd("NULL");
		}

		if(diagnosticreportidentifiertypecodingi == diagnosticreportidentifiertypecodinglist.size()-1) {d.addDiagnosticRptIdTypCdgCd("]]");}


		/******************** DiagnosticRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportidentifiertypecodingi == 0) {d.addDiagnosticRptIdTypCdgUsrSltd("[[");}
		if(diagnosticreportidentifiertypecoding.hasUserSelected()) {

			d.addDiagnosticRptIdTypCdgUsrSltd(String.valueOf(diagnosticreportidentifiertypecoding.getUserSelected()));
		} else {
			d.addDiagnosticRptIdTypCdgUsrSltd("NULL");
		}

		if(diagnosticreportidentifiertypecodingi == diagnosticreportidentifiertypecodinglist.size()-1) {d.addDiagnosticRptIdTypCdgUsrSltd("]]");}


		/******************** DiagnosticRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(diagnosticreportidentifiertypecodingi == 0) {d.addDiagnosticRptIdTypCdgSys("[[");}
		if(diagnosticreportidentifiertypecoding.hasSystem()) {

			d.addDiagnosticRptIdTypCdgSys(String.valueOf(diagnosticreportidentifiertypecoding.getSystem()));
		} else {
			d.addDiagnosticRptIdTypCdgSys("NULL");
		}

		if(diagnosticreportidentifiertypecodingi == diagnosticreportidentifiertypecodinglist.size()-1) {d.addDiagnosticRptIdTypCdgSys("]]");}


		 };
		/******************** diagnosticreportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period diagnosticreportidentifierperiod = diagnosticreportidentifier.getPeriod();

		/******************** DiagnosticRpt_Id_Prd_Strt ********************************************************************************/
		if(diagnosticreportidentifieri == 0) {d.addDiagnosticRptIdPrdStrt("[");}
		if(diagnosticreportidentifierperiod.hasStart()) {

			d.addDiagnosticRptIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(diagnosticreportidentifierperiod.getStart())+"\"");
		} else {
			d.addDiagnosticRptIdPrdStrt("NULL");
		}

		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {d.addDiagnosticRptIdPrdStrt("]");}


		/******************** DiagnosticRpt_Id_Prd_End ********************************************************************************/
		if(diagnosticreportidentifieri == 0) {d.addDiagnosticRptIdPrdEnd("[");}
		if(diagnosticreportidentifierperiod.hasEnd()) {

			d.addDiagnosticRptIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(diagnosticreportidentifierperiod.getEnd())+"\"");
		} else {
			d.addDiagnosticRptIdPrdEnd("NULL");
		}

		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {d.addDiagnosticRptIdPrdEnd("]");}


		/******************** diagnosticreportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse diagnosticreportidentifieruse = diagnosticreportidentifier.getUse();
		if(diagnosticreportidentifieruse!=null) {
		if(diagnosticreportidentifieri == 0) {

		d.addDiagnosticRptIdUse("[");		}
			d.addDiagnosticRptIdUse(diagnosticreportidentifieruse.toCode());
		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {

		d.addDiagnosticRptIdUse("]");		}

		} else {
			d.addDiagnosticRptIdUse("NULL");
		}

		/******************** DiagnosticRpt_Id_Assigner ********************************************************************************/
		if(diagnosticreportidentifieri == 0) {d.addDiagnosticRptIdAssigner("[");}
		if(diagnosticreportidentifier.hasAssigner()) {

			if(diagnosticreportidentifier.getAssigner().getReference() != null) {
			d.addDiagnosticRptIdAssigner(diagnosticreportidentifier.getAssigner().getReference());
			}
		} else {
			d.addDiagnosticRptIdAssigner("NULL");
		}

		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {d.addDiagnosticRptIdAssigner("]");}


		/******************** DiagnosticRpt_Id_Sys ********************************************************************************/
		if(diagnosticreportidentifieri == 0) {d.addDiagnosticRptIdSys("[");}
		if(diagnosticreportidentifier.hasSystem()) {

			d.addDiagnosticRptIdSys(String.valueOf(diagnosticreportidentifier.getSystem()));
		} else {
			d.addDiagnosticRptIdSys("NULL");
		}

		if(diagnosticreportidentifieri == diagnosticreportidentifierlist.size()-1) {d.addDiagnosticRptIdSys("]");}


		 };
		/******************** diagnosticreportcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> diagnosticreportcategorylist = diagnosticreport.getCategory();
		for(int diagnosticreportcategoryi = 0; diagnosticreportcategoryi<diagnosticreportcategorylist.size();diagnosticreportcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  diagnosticreportcategory = diagnosticreportcategorylist.get(diagnosticreportcategoryi);

		/******************** DiagnosticRpt_Ctgry_Txt ********************************************************************************/
		if(diagnosticreportcategoryi == 0) {d.addDiagnosticRptCtgryTxt("[");}
		if(diagnosticreportcategory.hasText()) {

			d.addDiagnosticRptCtgryTxt(String.valueOf(diagnosticreportcategory.getText()));
		} else {
			d.addDiagnosticRptCtgryTxt("NULL");
		}

		if(diagnosticreportcategoryi == diagnosticreportcategorylist.size()-1) {d.addDiagnosticRptCtgryTxt("]");}


		/******************** diagnosticreportcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> diagnosticreportcategorycodinglist = diagnosticreportcategory.getCoding();
		for(int diagnosticreportcategorycodingi = 0; diagnosticreportcategorycodingi<diagnosticreportcategorycodinglist.size();diagnosticreportcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  diagnosticreportcategorycoding = diagnosticreportcategorycodinglist.get(diagnosticreportcategorycodingi);

		/******************** DiagnosticRpt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportcategorycodingi == 0) {d.addDiagnosticRptCtgryCdgDsply("[[");}
		if(diagnosticreportcategorycoding.hasDisplay()) {

			d.addDiagnosticRptCtgryCdgDsply(String.valueOf(diagnosticreportcategorycoding.getDisplay()));
		} else {
			d.addDiagnosticRptCtgryCdgDsply("NULL");
		}

		if(diagnosticreportcategorycodingi == diagnosticreportcategorycodinglist.size()-1) {d.addDiagnosticRptCtgryCdgDsply("]]");}


		/******************** DiagnosticRpt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportcategorycodingi == 0) {d.addDiagnosticRptCtgryCdgVrsn("[[");}
		if(diagnosticreportcategorycoding.hasVersion()) {

			d.addDiagnosticRptCtgryCdgVrsn(String.valueOf(diagnosticreportcategorycoding.getVersion()));
		} else {
			d.addDiagnosticRptCtgryCdgVrsn("NULL");
		}

		if(diagnosticreportcategorycodingi == diagnosticreportcategorycodinglist.size()-1) {d.addDiagnosticRptCtgryCdgVrsn("]]");}


		/******************** DiagnosticRpt_Ctgry_Cdg_Cd ********************************************************************************/
		if(diagnosticreportcategorycodingi == 0) {d.addDiagnosticRptCtgryCdgCd("[[");}
		if(diagnosticreportcategorycoding.hasCode()) {

			d.addDiagnosticRptCtgryCdgCd(String.valueOf(diagnosticreportcategorycoding.getCode()));
		} else {
			d.addDiagnosticRptCtgryCdgCd("NULL");
		}

		if(diagnosticreportcategorycodingi == diagnosticreportcategorycodinglist.size()-1) {d.addDiagnosticRptCtgryCdgCd("]]");}


		/******************** DiagnosticRpt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportcategorycodingi == 0) {d.addDiagnosticRptCtgryCdgUsrSltd("[[");}
		if(diagnosticreportcategorycoding.hasUserSelected()) {

			d.addDiagnosticRptCtgryCdgUsrSltd(String.valueOf(diagnosticreportcategorycoding.getUserSelected()));
		} else {
			d.addDiagnosticRptCtgryCdgUsrSltd("NULL");
		}

		if(diagnosticreportcategorycodingi == diagnosticreportcategorycodinglist.size()-1) {d.addDiagnosticRptCtgryCdgUsrSltd("]]");}


		/******************** DiagnosticRpt_Ctgry_Cdg_Sys ********************************************************************************/
		if(diagnosticreportcategorycodingi == 0) {d.addDiagnosticRptCtgryCdgSys("[[");}
		if(diagnosticreportcategorycoding.hasSystem()) {

			d.addDiagnosticRptCtgryCdgSys(String.valueOf(diagnosticreportcategorycoding.getSystem()));
		} else {
			d.addDiagnosticRptCtgryCdgSys("NULL");
		}

		if(diagnosticreportcategorycodingi == diagnosticreportcategorycodinglist.size()-1) {d.addDiagnosticRptCtgryCdgSys("]]");}


		 };
		 };
		/******************** DiagnosticRpt_EfctiveDtTimeTyp ********************************************************************************/
		if(diagnosticreport.hasEffectiveDateTimeType()) {

			d.addDiagnosticRptEfctiveDtTimeTyp("\""+diagnosticreport.getEffectiveDateTimeType().getValueAsString()+"\"");
		} else {
			d.addDiagnosticRptEfctiveDtTimeTyp("NULL");
		}


		/******************** DiagnosticRpt_RsltsInterpreter ********************************************************************************/
		if(diagnosticreport.hasResultsInterpreter()) {

			String  array = "[";
			for(int incr=0; incr<diagnosticreport.getResultsInterpreter().size(); incr++) {
				array = array + diagnosticreport.getResultsInterpreter().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDiagnosticRptRsltsInterpreter(array);

		} else {
			d.addDiagnosticRptRsltsInterpreter("NULL");
		}


		/******************** DiagnosticRpt_Prfrmr ********************************************************************************/
		if(diagnosticreport.hasPerformer()) {

			String  array = "[";
			for(int incr=0; incr<diagnosticreport.getPerformer().size(); incr++) {
				array = array + diagnosticreport.getPerformer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDiagnosticRptPrfrmr(array);

		} else {
			d.addDiagnosticRptPrfrmr("NULL");
		}


		/******************** DiagnosticRpt_Issued ********************************************************************************/
		if(diagnosticreport.hasIssued()) {

			d.addDiagnosticRptIssued("\""+ca.uhn.fhir.util.DateUtils.formatDate(diagnosticreport.getIssued())+"\"");
		} else {
			d.addDiagnosticRptIssued("NULL");
		}


		/******************** diagnosticreporteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period diagnosticreporteffectiveperiod = diagnosticreport.getEffectivePeriod();

		/******************** DiagnosticRpt_EfctivePrd_Strt ********************************************************************************/
		if(diagnosticreporteffectiveperiod.hasStart()) {

			d.addDiagnosticRptEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(diagnosticreporteffectiveperiod.getStart())+"\"");
		} else {
			d.addDiagnosticRptEfctivePrdStrt("NULL");
		}


		/******************** DiagnosticRpt_EfctivePrd_End ********************************************************************************/
		if(diagnosticreporteffectiveperiod.hasEnd()) {

			d.addDiagnosticRptEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(diagnosticreporteffectiveperiod.getEnd())+"\"");
		} else {
			d.addDiagnosticRptEfctivePrdEnd("NULL");
		}


		/******************** DiagnosticRpt_ImgngStdy ********************************************************************************/
		if(diagnosticreport.hasImagingStudy()) {

			String  array = "[";
			for(int incr=0; incr<diagnosticreport.getImagingStudy().size(); incr++) {
				array = array + diagnosticreport.getImagingStudy().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDiagnosticRptImgngStdy(array);

		} else {
			d.addDiagnosticRptImgngStdy("NULL");
		}


		/******************** diagnosticreportmedia ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent> diagnosticreportmedialist = diagnosticreport.getMedia();
		for(int diagnosticreportmediai = 0; diagnosticreportmediai<diagnosticreportmedialist.size();diagnosticreportmediai++ ) {
		org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent  diagnosticreportmedia = diagnosticreportmedialist.get(diagnosticreportmediai);

		/******************** DiagnosticRpt_Media_Comment ********************************************************************************/
		if(diagnosticreportmediai == 0) {d.addDiagnosticRptMediaComment("[");}
		if(diagnosticreportmedia.hasComment()) {

			d.addDiagnosticRptMediaComment(String.valueOf(diagnosticreportmedia.getComment()));
		} else {
			d.addDiagnosticRptMediaComment("NULL");
		}

		if(diagnosticreportmediai == diagnosticreportmedialist.size()-1) {d.addDiagnosticRptMediaComment("]");}


		/******************** DiagnosticRpt_Media_Link ********************************************************************************/
		if(diagnosticreportmediai == 0) {d.addDiagnosticRptMediaLink("[");}
		if(diagnosticreportmedia.hasLink()) {

			if(diagnosticreportmedia.getLink().getReference() != null) {
			d.addDiagnosticRptMediaLink(diagnosticreportmedia.getLink().getReference());
			}
		} else {
			d.addDiagnosticRptMediaLink("NULL");
		}

		if(diagnosticreportmediai == diagnosticreportmedialist.size()-1) {d.addDiagnosticRptMediaLink("]");}


		 };
		/******************** DiagnosticRpt_Spcmn ********************************************************************************/
		if(diagnosticreport.hasSpecimen()) {

			String  array = "[";
			for(int incr=0; incr<diagnosticreport.getSpecimen().size(); incr++) {
				array = array + diagnosticreport.getSpecimen().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDiagnosticRptSpcmn(array);

		} else {
			d.addDiagnosticRptSpcmn("NULL");
		}


		/******************** diagnosticreportpresentedform ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> diagnosticreportpresentedformlist = diagnosticreport.getPresentedForm();
		for(int diagnosticreportpresentedformi = 0; diagnosticreportpresentedformi<diagnosticreportpresentedformlist.size();diagnosticreportpresentedformi++ ) {
		org.hl7.fhir.r4.model.Attachment  diagnosticreportpresentedform = diagnosticreportpresentedformlist.get(diagnosticreportpresentedformi);

		/******************** DiagnosticRpt_PresentedFrm_Sz ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmSz("[");}
		if(diagnosticreportpresentedform.hasSize()) {

			d.addDiagnosticRptPresentedFrmSz(String.valueOf(diagnosticreportpresentedform.getSize()));
		} else {
			d.addDiagnosticRptPresentedFrmSz("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmSz("]");}


		/******************** DiagnosticRpt_PresentedFrm_Lnguage ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmLnguage("[");}
		if(diagnosticreportpresentedform.hasLanguage()) {

			d.addDiagnosticRptPresentedFrmLnguage(String.valueOf(diagnosticreportpresentedform.getLanguage()));
		} else {
			d.addDiagnosticRptPresentedFrmLnguage("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmLnguage("]");}


		/******************** DiagnosticRpt_PresentedFrm_CntntTyp ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmCntntTyp("[");}
		if(diagnosticreportpresentedform.hasContentType()) {

			d.addDiagnosticRptPresentedFrmCntntTyp(String.valueOf(diagnosticreportpresentedform.getContentType()));
		} else {
			d.addDiagnosticRptPresentedFrmCntntTyp("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmCntntTyp("]");}


		/******************** DiagnosticRpt_PresentedFrm_Hash ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmHash("[");}
		if(diagnosticreportpresentedform.hasHash()) {

			d.addDiagnosticRptPresentedFrmHash(new String(diagnosticreportpresentedform.getHash()));
		} else {
			d.addDiagnosticRptPresentedFrmHash("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmHash("]");}


		/******************** DiagnosticRpt_PresentedFrm_Data ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmData("[");}
		if(diagnosticreportpresentedform.hasData()) {

			d.addDiagnosticRptPresentedFrmData(new String(diagnosticreportpresentedform.getData()));
		} else {
			d.addDiagnosticRptPresentedFrmData("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmData("]");}


		/******************** DiagnosticRpt_PresentedFrm_Creation ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmCreation("[");}
		if(diagnosticreportpresentedform.hasCreation()) {

			d.addDiagnosticRptPresentedFrmCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(diagnosticreportpresentedform.getCreation())+"\"");
		} else {
			d.addDiagnosticRptPresentedFrmCreation("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmCreation("]");}


		/******************** DiagnosticRpt_PresentedFrm_Ttl ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmTtl("[");}
		if(diagnosticreportpresentedform.hasTitle()) {

			d.addDiagnosticRptPresentedFrmTtl(String.valueOf(diagnosticreportpresentedform.getTitle()));
		} else {
			d.addDiagnosticRptPresentedFrmTtl("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmTtl("]");}


		/******************** DiagnosticRpt_PresentedFrm_Url ********************************************************************************/
		if(diagnosticreportpresentedformi == 0) {d.addDiagnosticRptPresentedFrmUrl("[");}
		if(diagnosticreportpresentedform.hasUrl()) {

			d.addDiagnosticRptPresentedFrmUrl(String.valueOf(diagnosticreportpresentedform.getUrl()));
		} else {
			d.addDiagnosticRptPresentedFrmUrl("NULL");
		}

		if(diagnosticreportpresentedformi == diagnosticreportpresentedformlist.size()-1) {d.addDiagnosticRptPresentedFrmUrl("]");}


		 };
		/******************** diagnosticreportconclusioncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> diagnosticreportconclusioncodelist = diagnosticreport.getConclusionCode();
		for(int diagnosticreportconclusioncodei = 0; diagnosticreportconclusioncodei<diagnosticreportconclusioncodelist.size();diagnosticreportconclusioncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  diagnosticreportconclusioncode = diagnosticreportconclusioncodelist.get(diagnosticreportconclusioncodei);

		/******************** DiagnosticRpt_ConclusionCd_Txt ********************************************************************************/
		if(diagnosticreportconclusioncodei == 0) {d.addDiagnosticRptConclusionCdTxt("[");}
		if(diagnosticreportconclusioncode.hasText()) {

			d.addDiagnosticRptConclusionCdTxt(String.valueOf(diagnosticreportconclusioncode.getText()));
		} else {
			d.addDiagnosticRptConclusionCdTxt("NULL");
		}

		if(diagnosticreportconclusioncodei == diagnosticreportconclusioncodelist.size()-1) {d.addDiagnosticRptConclusionCdTxt("]");}


		/******************** diagnosticreportconclusioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> diagnosticreportconclusioncodecodinglist = diagnosticreportconclusioncode.getCoding();
		for(int diagnosticreportconclusioncodecodingi = 0; diagnosticreportconclusioncodecodingi<diagnosticreportconclusioncodecodinglist.size();diagnosticreportconclusioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  diagnosticreportconclusioncodecoding = diagnosticreportconclusioncodecodinglist.get(diagnosticreportconclusioncodecodingi);

		/******************** DiagnosticRpt_ConclusionCd_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportconclusioncodecodingi == 0) {d.addDiagnosticRptConclusionCdCdgDsply("[[");}
		if(diagnosticreportconclusioncodecoding.hasDisplay()) {

			d.addDiagnosticRptConclusionCdCdgDsply(String.valueOf(diagnosticreportconclusioncodecoding.getDisplay()));
		} else {
			d.addDiagnosticRptConclusionCdCdgDsply("NULL");
		}

		if(diagnosticreportconclusioncodecodingi == diagnosticreportconclusioncodecodinglist.size()-1) {d.addDiagnosticRptConclusionCdCdgDsply("]]");}


		/******************** DiagnosticRpt_ConclusionCd_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportconclusioncodecodingi == 0) {d.addDiagnosticRptConclusionCdCdgVrsn("[[");}
		if(diagnosticreportconclusioncodecoding.hasVersion()) {

			d.addDiagnosticRptConclusionCdCdgVrsn(String.valueOf(diagnosticreportconclusioncodecoding.getVersion()));
		} else {
			d.addDiagnosticRptConclusionCdCdgVrsn("NULL");
		}

		if(diagnosticreportconclusioncodecodingi == diagnosticreportconclusioncodecodinglist.size()-1) {d.addDiagnosticRptConclusionCdCdgVrsn("]]");}


		/******************** DiagnosticRpt_ConclusionCd_Cdg_Cd ********************************************************************************/
		if(diagnosticreportconclusioncodecodingi == 0) {d.addDiagnosticRptConclusionCdCdgCd("[[");}
		if(diagnosticreportconclusioncodecoding.hasCode()) {

			d.addDiagnosticRptConclusionCdCdgCd(String.valueOf(diagnosticreportconclusioncodecoding.getCode()));
		} else {
			d.addDiagnosticRptConclusionCdCdgCd("NULL");
		}

		if(diagnosticreportconclusioncodecodingi == diagnosticreportconclusioncodecodinglist.size()-1) {d.addDiagnosticRptConclusionCdCdgCd("]]");}


		/******************** DiagnosticRpt_ConclusionCd_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportconclusioncodecodingi == 0) {d.addDiagnosticRptConclusionCdCdgUsrSltd("[[");}
		if(diagnosticreportconclusioncodecoding.hasUserSelected()) {

			d.addDiagnosticRptConclusionCdCdgUsrSltd(String.valueOf(diagnosticreportconclusioncodecoding.getUserSelected()));
		} else {
			d.addDiagnosticRptConclusionCdCdgUsrSltd("NULL");
		}

		if(diagnosticreportconclusioncodecodingi == diagnosticreportconclusioncodecodinglist.size()-1) {d.addDiagnosticRptConclusionCdCdgUsrSltd("]]");}


		/******************** DiagnosticRpt_ConclusionCd_Cdg_Sys ********************************************************************************/
		if(diagnosticreportconclusioncodecodingi == 0) {d.addDiagnosticRptConclusionCdCdgSys("[[");}
		if(diagnosticreportconclusioncodecoding.hasSystem()) {

			d.addDiagnosticRptConclusionCdCdgSys(String.valueOf(diagnosticreportconclusioncodecoding.getSystem()));
		} else {
			d.addDiagnosticRptConclusionCdCdgSys("NULL");
		}

		if(diagnosticreportconclusioncodecodingi == diagnosticreportconclusioncodecodinglist.size()-1) {d.addDiagnosticRptConclusionCdCdgSys("]]");}


		 };
		 };
		/******************** DiagnosticRpt_Conclusion ********************************************************************************/
		if(diagnosticreport.hasConclusion()) {

			d.addDiagnosticRptConclusion(String.valueOf(diagnosticreport.getConclusion()));
		} else {
			d.addDiagnosticRptConclusion("NULL");
		}


		return d;
	}
}
