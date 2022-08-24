package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BodyStructure;
public class BodyStructureConversion 
{
	public org.hl7.fhir.r4.model.BodyStructure BodyStructures(BodyStructure b) throws ParseException
	{
		org.hl7.fhir.r4.model.BodyStructure bodystructure = new org.hl7.fhir.r4.model.BodyStructure();

		/******************** id ********************************************************************************/
		bodystructure.setId(b.getId());

		/******************** BodyStrctr_Active ********************************************************************************/
		if(b.getBodyStrctrActive() != null ) {

			if(b.getBodyStrctrActive().replace("[","").replace("]","").equals("NULL") | b.getBodyStrctrActive()==null) {} else {
			bodystructure.setActive(Boolean.parseBoolean(b.getBodyStrctrActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** BodyStrctr_Dscrptn ********************************************************************************/
		if(b.getBodyStrctrDscrptn() != null ) {

			if(b.getBodyStrctrDscrptn().replace("[","").replace("]","").equals("NULL") | b.getBodyStrctrDscrptn()==null) {} else {
			bodystructure.setDescription(b.getBodyStrctrDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** BodyStrctr_Id_Assigner ********************************************************************************/
		if(b.getBodyStrctrIdAssigner() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Id_Prd_End ********************************************************************************/
		if(b.getBodyStrctrIdPrdEnd() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Id_Prd_Strt ********************************************************************************/
		if(b.getBodyStrctrIdPrdStrt() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Id_Sys ********************************************************************************/
		if(b.getBodyStrctrIdSys() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgCd() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				String[] arrayi1 = b.getBodyStrctrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { bodystructure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgDsply() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				String[] arrayi1 = b.getBodyStrctrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { bodystructure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgSys() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				String[] arrayi1 = b.getBodyStrctrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { bodystructure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				String[] arrayi1 = b.getBodyStrctrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { bodystructure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** BodyStrctr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				String[] arrayi1 = b.getBodyStrctrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { bodystructure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_Id_Typ_Txt ********************************************************************************/
		if(b.getBodyStrctrIdTypTxt() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Id_Use ********************************************************************************/
		if(b.getBodyStrctrIdUse() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Id_Vl ********************************************************************************/
		if(b.getBodyStrctrIdVl() != null ) {

			String[] arrayi0 = b.getBodyStrctrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getIdentifier().size() < i0+1) { bodystructure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Image_CntntTyp ********************************************************************************/
		if(b.getBodyStrctrImageCntntTyp() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Image_Creation ********************************************************************************/
		if(b.getBodyStrctrImageCreation() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Image_Data ********************************************************************************/
		if(b.getBodyStrctrImageData() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** BodyStrctr_Image_Hash ********************************************************************************/
		if(b.getBodyStrctrImageHash() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** BodyStrctr_Image_Lnguage ********************************************************************************/
		if(b.getBodyStrctrImageLnguage() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Image_Sz ********************************************************************************/
		if(b.getBodyStrctrImageSz() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Image_Ttl ********************************************************************************/
		if(b.getBodyStrctrImageTtl() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Image_Url ********************************************************************************/
		if(b.getBodyStrctrImageUrl() != null ) {

			String[] arrayi0 = b.getBodyStrctrImageUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getImage().size() < i0+1) { bodystructure.addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getImage().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Lctn_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrLctnCdgCd() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocation().getCoding().size() < i0+1) { bodystructure.getLocation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getLocation().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Lctn_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrLctnCdgDsply() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocation().getCoding().size() < i0+1) { bodystructure.getLocation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getLocation().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Lctn_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrLctnCdgSys() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocation().getCoding().size() < i0+1) { bodystructure.getLocation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getLocation().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrLctnCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocation().getCoding().size() < i0+1) { bodystructure.getLocation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getLocation().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Lctn_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrLctnCdgVrsn() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocation().getCoding().size() < i0+1) { bodystructure.getLocation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getLocation().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Lctn_Txt ********************************************************************************/
		if(b.getBodyStrctrLctnTxt() != null ) {

			if(b.getBodyStrctrLctnTxt().replace("[","").replace("]","").equals("NULL") | b.getBodyStrctrLctnTxt()==null) {} else {
			bodystructure.getLocation().setText(b.getBodyStrctrLctnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgCd() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnQualifierCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocationQualifier().size() < i0+1) { bodystructure.addLocationQualifier(); }
				String[] arrayi1 = b.getBodyStrctrLctnQualifierCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getLocationQualifier().get(i0).getCoding().size() < i1+1) { bodystructure.getLocationQualifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getLocationQualifier().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgDsply() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnQualifierCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocationQualifier().size() < i0+1) { bodystructure.addLocationQualifier(); }
				String[] arrayi1 = b.getBodyStrctrLctnQualifierCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getLocationQualifier().get(i0).getCoding().size() < i1+1) { bodystructure.getLocationQualifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getLocationQualifier().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgSys() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnQualifierCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocationQualifier().size() < i0+1) { bodystructure.addLocationQualifier(); }
				String[] arrayi1 = b.getBodyStrctrLctnQualifierCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getLocationQualifier().get(i0).getCoding().size() < i1+1) { bodystructure.getLocationQualifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getLocationQualifier().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_LctnQualifier_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnQualifierCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocationQualifier().size() < i0+1) { bodystructure.addLocationQualifier(); }
				String[] arrayi1 = b.getBodyStrctrLctnQualifierCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getLocationQualifier().get(i0).getCoding().size() < i1+1) { bodystructure.getLocationQualifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getLocationQualifier().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgVrsn() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnQualifierCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocationQualifier().size() < i0+1) { bodystructure.addLocationQualifier(); }
				String[] arrayi1 = b.getBodyStrctrLctnQualifierCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(bodystructure.getLocationQualifier().get(i0).getCoding().size() < i1+1) { bodystructure.getLocationQualifier().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {bodystructure.getLocationQualifier().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** BodyStrctr_LctnQualifier_Txt ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierTxt() != null ) {

			String[] arrayi0 = b.getBodyStrctrLctnQualifierTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getLocationQualifier().size() < i0+1) { bodystructure.addLocationQualifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getLocationQualifier().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Morphology_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgCd() != null ) {

			String[] arrayi0 = b.getBodyStrctrMorphologyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getMorphology().getCoding().size() < i0+1) { bodystructure.getMorphology().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getMorphology().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Morphology_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgDsply() != null ) {

			String[] arrayi0 = b.getBodyStrctrMorphologyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getMorphology().getCoding().size() < i0+1) { bodystructure.getMorphology().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getMorphology().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Morphology_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgSys() != null ) {

			String[] arrayi0 = b.getBodyStrctrMorphologyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getMorphology().getCoding().size() < i0+1) { bodystructure.getMorphology().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getMorphology().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Morphology_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBodyStrctrMorphologyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getMorphology().getCoding().size() < i0+1) { bodystructure.getMorphology().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getMorphology().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** BodyStrctr_Morphology_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgVrsn() != null ) {

			String[] arrayi0 = b.getBodyStrctrMorphologyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(bodystructure.getMorphology().getCoding().size() < i0+1) { bodystructure.getMorphology().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {bodystructure.getMorphology().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** BodyStrctr_Morphology_Txt ********************************************************************************/
		if(b.getBodyStrctrMorphologyTxt() != null ) {

			if(b.getBodyStrctrMorphologyTxt().replace("[","").replace("]","").equals("NULL") | b.getBodyStrctrMorphologyTxt()==null) {} else {
			bodystructure.getMorphology().setText(b.getBodyStrctrMorphologyTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** BodyStrctr_Pnt ********************************************************************************/
		if(b.getBodyStrctrPnt() != null ) {

			if(b.getBodyStrctrPnt().replace("[","").replace("]","").equals("NULL") | b.getBodyStrctrPnt()==null) {} else {
			bodystructure.setPatient(new org.hl7.fhir.r4.model.Reference(b.getBodyStrctrPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return bodystructure;
	}
}
