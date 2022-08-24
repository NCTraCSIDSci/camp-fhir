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
		if(i.getImgngStdyBasedOn() != null ) {

				for( String currListStrSplit : i.getImgngStdyBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			imagingstudy.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ImgngStdy_Dscrptn ********************************************************************************/
		if(i.getImgngStdyDscrptn() != null ) {

			if(i.getImgngStdyDscrptn().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyDscrptn()==null) {} else {
			imagingstudy.setDescription(i.getImgngStdyDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ImgngStdy_Enc ********************************************************************************/
		if(i.getImgngStdyEnc() != null ) {

			if(i.getImgngStdyEnc().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyEnc()==null) {} else {
			imagingstudy.setEncounter(new org.hl7.fhir.r4.model.Reference(i.getImgngStdyEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_Endpoint ********************************************************************************/
		if(i.getImgngStdyEndpoint() != null ) {

				for( String currListStrSplit : i.getImgngStdyEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			imagingstudy.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ImgngStdy_Id_Assigner ********************************************************************************/
		if(i.getImgngStdyIdAssigner() != null ) {

			String[] arrayi0 = i.getImgngStdyIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Id_Prd_End ********************************************************************************/
		if(i.getImgngStdyIdPrdEnd() != null ) {

			String[] arrayi0 = i.getImgngStdyIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Id_Prd_Strt ********************************************************************************/
		if(i.getImgngStdyIdPrdStrt() != null ) {

			String[] arrayi0 = i.getImgngStdyIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Id_Sys ********************************************************************************/
		if(i.getImgngStdyIdSys() != null ) {

			String[] arrayi0 = i.getImgngStdyIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdyIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getImgngStdyIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				String[] arrayi1 = i.getImgngStdyIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { imagingstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdyIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getImgngStdyIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				String[] arrayi1 = i.getImgngStdyIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { imagingstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdyIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getImgngStdyIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				String[] arrayi1 = i.getImgngStdyIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { imagingstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdyIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdyIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				String[] arrayi1 = i.getImgngStdyIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { imagingstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdyIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdyIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				String[] arrayi1 = i.getImgngStdyIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { imagingstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Id_Typ_Txt ********************************************************************************/
		if(i.getImgngStdyIdTypTxt() != null ) {

			String[] arrayi0 = i.getImgngStdyIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Id_Use ********************************************************************************/
		if(i.getImgngStdyIdUse() != null ) {

			String[] arrayi0 = i.getImgngStdyIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Id_Vl ********************************************************************************/
		if(i.getImgngStdyIdVl() != null ) {

			String[] arrayi0 = i.getImgngStdyIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getIdentifier().size() < i0+1) { imagingstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Interpreter ********************************************************************************/
		if(i.getImgngStdyInterpreter() != null ) {

				for( String currListStrSplit : i.getImgngStdyInterpreter().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			imagingstudy.addInterpreter(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ImgngStdy_Lctn ********************************************************************************/
		if(i.getImgngStdyLctn() != null ) {

			if(i.getImgngStdyLctn().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyLctn()==null) {} else {
			imagingstudy.setLocation(new org.hl7.fhir.r4.model.Reference(i.getImgngStdyLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_Modality_Cd ********************************************************************************/
		if(i.getImgngStdyModalityCd() != null ) {

			String[] arrayi0 = i.getImgngStdyModalityCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getModality().size() < i0+1) { imagingstudy.addModality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getModality().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Modality_Dsply ********************************************************************************/
		if(i.getImgngStdyModalityDsply() != null ) {

			String[] arrayi0 = i.getImgngStdyModalityDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getModality().size() < i0+1) { imagingstudy.addModality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getModality().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Modality_Sys ********************************************************************************/
		if(i.getImgngStdyModalitySys() != null ) {

			String[] arrayi0 = i.getImgngStdyModalitySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getModality().size() < i0+1) { imagingstudy.addModality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getModality().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Modality_UsrSltd ********************************************************************************/
		if(i.getImgngStdyModalityUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdyModalityUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getModality().size() < i0+1) { imagingstudy.addModality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getModality().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Modality_Vrsn ********************************************************************************/
		if(i.getImgngStdyModalityVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdyModalityVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getModality().size() < i0+1) { imagingstudy.addModality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getModality().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Nt_AthrRfrnc ********************************************************************************/
		if(i.getImgngStdyNtAthrRfrnc() != null ) {

			String[] arrayi0 = i.getImgngStdyNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getNote().size() < i0+1) { imagingstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(i.getImgngStdyNtAthrStrgTyp() != null ) {

			String[] arrayi0 = i.getImgngStdyNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getNote().size() < i0+1) { imagingstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Nt_Txt ********************************************************************************/
		if(i.getImgngStdyNtTxt() != null ) {

			String[] arrayi0 = i.getImgngStdyNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getNote().size() < i0+1) { imagingstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Nt_Time ********************************************************************************/
		if(i.getImgngStdyNtTime() != null ) {

			String[] arrayi0 = i.getImgngStdyNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getNote().size() < i0+1) { imagingstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_NmbrOfInstances ********************************************************************************/
		if(i.getImgngStdyNmbrOfInstances() != null ) {

			if(i.getImgngStdyNmbrOfInstances().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyNmbrOfInstances()==null) {} else {
			imagingstudy.setNumberOfInstances(Integer.parseInt(i.getImgngStdyNmbrOfInstances().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_NmbrOfSeries ********************************************************************************/
		if(i.getImgngStdyNmbrOfSeries() != null ) {

			if(i.getImgngStdyNmbrOfSeries().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyNmbrOfSeries()==null) {} else {
			imagingstudy.setNumberOfSeries(Integer.parseInt(i.getImgngStdyNmbrOfSeries().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgCd() != null ) {

			String[] arrayi0 = i.getImgngStdyPrcdrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getProcedureCode().size() < i0+1) { imagingstudy.addProcedureCode(); }
				String[] arrayi1 = i.getImgngStdyPrcdrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getProcedureCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getProcedureCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getProcedureCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImgngStdyPrcdrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getProcedureCode().size() < i0+1) { imagingstudy.addProcedureCode(); }
				String[] arrayi1 = i.getImgngStdyPrcdrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getProcedureCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getProcedureCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getProcedureCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgSys() != null ) {

			String[] arrayi0 = i.getImgngStdyPrcdrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getProcedureCode().size() < i0+1) { imagingstudy.addProcedureCode(); }
				String[] arrayi1 = i.getImgngStdyPrcdrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getProcedureCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getProcedureCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getProcedureCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_PrcdrCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdyPrcdrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getProcedureCode().size() < i0+1) { imagingstudy.addProcedureCode(); }
				String[] arrayi1 = i.getImgngStdyPrcdrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getProcedureCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getProcedureCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getProcedureCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_PrcdrCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdyPrcdrCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdyPrcdrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getProcedureCode().size() < i0+1) { imagingstudy.addProcedureCode(); }
				String[] arrayi1 = i.getImgngStdyPrcdrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getProcedureCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getProcedureCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getProcedureCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_PrcdrCd_Txt ********************************************************************************/
		if(i.getImgngStdyPrcdrCdTxt() != null ) {

			String[] arrayi0 = i.getImgngStdyPrcdrCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getProcedureCode().size() < i0+1) { imagingstudy.addProcedureCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getProcedureCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_PrcdrRfrnc ********************************************************************************/
		if(i.getImgngStdyPrcdrRfrnc() != null ) {

			if(i.getImgngStdyPrcdrRfrnc().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyPrcdrRfrnc()==null) {} else {
			imagingstudy.setProcedureReference(new org.hl7.fhir.r4.model.Reference(i.getImgngStdyPrcdrRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_RsnCd_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgCd() != null ) {

			String[] arrayi0 = i.getImgngStdyRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getReasonCode().size() < i0+1) { imagingstudy.addReasonCode(); }
				String[] arrayi1 = i.getImgngStdyRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getReasonCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_RsnCd_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImgngStdyRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getReasonCode().size() < i0+1) { imagingstudy.addReasonCode(); }
				String[] arrayi1 = i.getImgngStdyRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getReasonCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_RsnCd_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgSys() != null ) {

			String[] arrayi0 = i.getImgngStdyRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getReasonCode().size() < i0+1) { imagingstudy.addReasonCode(); }
				String[] arrayi1 = i.getImgngStdyRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getReasonCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdyRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getReasonCode().size() < i0+1) { imagingstudy.addReasonCode(); }
				String[] arrayi1 = i.getImgngStdyRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getReasonCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdyRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdyRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getReasonCode().size() < i0+1) { imagingstudy.addReasonCode(); }
				String[] arrayi1 = i.getImgngStdyRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getReasonCode().get(i0).getCoding().size() < i1+1) { imagingstudy.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_RsnCd_Txt ********************************************************************************/
		if(i.getImgngStdyRsnCdTxt() != null ) {

			String[] arrayi0 = i.getImgngStdyRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getReasonCode().size() < i0+1) { imagingstudy.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_RsnRfrnc ********************************************************************************/
		if(i.getImgngStdyRsnRfrnc() != null ) {

				for( String currListStrSplit : i.getImgngStdyRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			imagingstudy.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ImgngStdy_Referrer ********************************************************************************/
		if(i.getImgngStdyReferrer() != null ) {

			if(i.getImgngStdyReferrer().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyReferrer()==null) {} else {
			imagingstudy.setReferrer(new org.hl7.fhir.r4.model.Reference(i.getImgngStdyReferrer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_Series_BodySite_Cd ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteCd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesBodySiteCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getBodySite().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_BodySite_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteDsply() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesBodySiteDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getBodySite().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_BodySite_Sys ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteSys() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesBodySiteSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getBodySite().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_BodySite_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesBodySiteUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getBodySite().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Series_BodySite_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesBodySiteVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesBodySiteVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getBodySite().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Dscrptn ********************************************************************************/
		if(i.getImgngStdySeriesDscrptn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Endpoint ********************************************************************************/
		if(i.getImgngStdySeriesEndpoint() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesEndpoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {imagingstudy.getSeries().get(i0).addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_Nmbr ********************************************************************************/
		if(i.getImgngStdySeriesInstanceNmbr() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).setNumber(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_SopCls_Cd ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsCd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceSopClsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceSopClsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).getSopClass().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_SopCls_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsDsply() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceSopClsDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceSopClsDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).getSopClass().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_SopCls_Sys ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsSys() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceSopClsSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceSopClsSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).getSopClass().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_SopCls_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceSopClsUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceSopClsUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).getSopClass().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_SopCls_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesInstanceSopClsVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceSopClsVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceSopClsVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).getSopClass().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_Ttl ********************************************************************************/
		if(i.getImgngStdySeriesInstanceTtl() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Instance_Uid ********************************************************************************/
		if(i.getImgngStdySeriesInstanceUid() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesInstanceUid().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesInstanceUid().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getInstance().size() < i1+1) { imagingstudy.getSeries().get(i0).addInstance(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getInstance().get(i1).setUid(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Laterality_Cd ********************************************************************************/
		if(i.getImgngStdySeriesLateralityCd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesLateralityCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getLaterality().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Laterality_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesLateralityDsply() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesLateralityDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getLaterality().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Laterality_Sys ********************************************************************************/
		if(i.getImgngStdySeriesLateralitySys() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesLateralitySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getLaterality().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Laterality_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesLateralityUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesLateralityUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getLaterality().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Series_Laterality_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesLateralityVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesLateralityVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getLaterality().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Modality_Cd ********************************************************************************/
		if(i.getImgngStdySeriesModalityCd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesModalityCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getModality().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Modality_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesModalityDsply() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesModalityDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getModality().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Modality_Sys ********************************************************************************/
		if(i.getImgngStdySeriesModalitySys() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesModalitySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getModality().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Modality_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesModalityUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesModalityUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getModality().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Series_Modality_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesModalityVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesModalityVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).getModality().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Series_Nmbr ********************************************************************************/
		if(i.getImgngStdySeriesNmbr() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesNmbr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).setNumber(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Series_NmbrOfInstances ********************************************************************************/
		if(i.getImgngStdySeriesNmbrOfInstances() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesNmbrOfInstances().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).setNumberOfInstances(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Actor ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrActor() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).setActor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgCd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					String[] arrayi2 = i.getImgngStdySeriesPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().size() < i2+1) { imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgDsply() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					String[] arrayi2 = i.getImgngStdySeriesPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().size() < i2+1) { imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgSys() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					String[] arrayi2 = i.getImgngStdySeriesPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().size() < i2+1) { imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					String[] arrayi2 = i.getImgngStdySeriesPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().size() < i2+1) { imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionCdgVrsn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					String[] arrayi2 = i.getImgngStdySeriesPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().size() < i2+1) { imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ImgngStdy_Series_Prfrmr_Function_Txt ********************************************************************************/
		if(i.getImgngStdySeriesPrfrmrFunctionTxt() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				String[] arrayi1 = i.getImgngStdySeriesPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(imagingstudy.getSeries().get(i0).getPerformer().size() < i1+1) { imagingstudy.getSeries().get(i0).addPerformer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {imagingstudy.getSeries().get(i0).getPerformer().get(i1).getFunction().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImgngStdy_Series_Spcmn ********************************************************************************/
		if(i.getImgngStdySeriesSpcmn() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesSpcmn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {imagingstudy.getSeries().get(i0).addSpecimen(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImgngStdy_Series_Strted ********************************************************************************/
		if(i.getImgngStdySeriesStrted() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesStrted().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).setStarted(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImgngStdy_Series_Uid ********************************************************************************/
		if(i.getImgngStdySeriesUid() != null ) {

			String[] arrayi0 = i.getImgngStdySeriesUid().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(imagingstudy.getSeries().size() < i0+1) { imagingstudy.addSeries(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {imagingstudy.getSeries().get(i0).setUid(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImgngStdy_Strted ********************************************************************************/
		if(i.getImgngStdyStrted() != null ) {

			if(i.getImgngStdyStrted().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyStrted()==null) {} else {
			imagingstudy.setStarted(i.getImgngStdyStrted().replace("[","").replace("]","").equals("NULL") | i.getImgngStdyStrted()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getImgngStdyStrted().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_Sts ********************************************************************************/
		if(i.getImgngStdySts() != null ) {

			if(i.getImgngStdySts().replace("[","").replace("]","").equals("NULL") | i.getImgngStdySts()==null) {} else {
			imagingstudy.setStatus(new org.hl7.fhir.r4.model.ImagingStudy.ImagingStudyStatusEnumFactory().fromCode(i.getImgngStdySts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImgngStdy_Sbjct ********************************************************************************/
		if(i.getImgngStdySbjct() != null ) {

			if(i.getImgngStdySbjct().replace("[","").replace("]","").equals("NULL") | i.getImgngStdySbjct()==null) {} else {
			imagingstudy.setSubject(new org.hl7.fhir.r4.model.Reference(i.getImgngStdySbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return imagingstudy;
	}
}
