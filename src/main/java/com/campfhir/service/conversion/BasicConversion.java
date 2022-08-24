package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Basic;
public class BasicConversion 
{
	public org.hl7.fhir.r4.model.Basic Basics(Basic b) throws ParseException
	{
		org.hl7.fhir.r4.model.Basic basic = new org.hl7.fhir.r4.model.Basic();

		/******************** id ********************************************************************************/
		basic.setId(b.getId());

		/******************** Basic_Athr ********************************************************************************/
		if(b.getBasicAthr() != null ) {

			if(b.getBasicAthr().replace("[","").replace("]","").equals("NULL") | b.getBasicAthr()==null) {} else {
			basic.setAuthor(new org.hl7.fhir.r4.model.Reference(b.getBasicAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Basic_Cd_Cdg_Cd ********************************************************************************/
		if(b.getBasicCdCdgCd() != null ) {

			String[] arrayi0 = b.getBasicCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getCode().getCoding().size() < i0+1) { basic.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Cd_Cdg_Dsply ********************************************************************************/
		if(b.getBasicCdCdgDsply() != null ) {

			String[] arrayi0 = b.getBasicCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getCode().getCoding().size() < i0+1) { basic.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Cd_Cdg_Sys ********************************************************************************/
		if(b.getBasicCdCdgSys() != null ) {

			String[] arrayi0 = b.getBasicCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getCode().getCoding().size() < i0+1) { basic.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Cd_Cdg_UsrSltd ********************************************************************************/
		if(b.getBasicCdCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBasicCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getCode().getCoding().size() < i0+1) { basic.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Basic_Cd_Cdg_Vrsn ********************************************************************************/
		if(b.getBasicCdCdgVrsn() != null ) {

			String[] arrayi0 = b.getBasicCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getCode().getCoding().size() < i0+1) { basic.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Cd_Txt ********************************************************************************/
		if(b.getBasicCdTxt() != null ) {

			if(b.getBasicCdTxt().replace("[","").replace("]","").equals("NULL") | b.getBasicCdTxt()==null) {} else {
			basic.getCode().setText(b.getBasicCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Basic_Created ********************************************************************************/
		if(b.getBasicCreated() != null ) {

			if(b.getBasicCreated().replace("[","").replace("]","").equals("NULL") | b.getBasicCreated()==null) {} else {
			basic.setCreated(b.getBasicCreated().replace("[","").replace("]","").equals("NULL") | b.getBasicCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(b.getBasicCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Basic_Id_Assigner ********************************************************************************/
		if(b.getBasicIdAssigner() != null ) {

			String[] arrayi0 = b.getBasicIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Basic_Id_Prd_End ********************************************************************************/
		if(b.getBasicIdPrdEnd() != null ) {

			String[] arrayi0 = b.getBasicIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Basic_Id_Prd_Strt ********************************************************************************/
		if(b.getBasicIdPrdStrt() != null ) {

			String[] arrayi0 = b.getBasicIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Basic_Id_Sys ********************************************************************************/
		if(b.getBasicIdSys() != null ) {

			String[] arrayi0 = b.getBasicIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Id_Typ_Cdg_Cd ********************************************************************************/
		if(b.getBasicIdTypCdgCd() != null ) {

			String[] arrayi0 = b.getBasicIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				String[] arrayi1 = b.getBasicIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(basic.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { basic.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {basic.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Basic_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(b.getBasicIdTypCdgDsply() != null ) {

			String[] arrayi0 = b.getBasicIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				String[] arrayi1 = b.getBasicIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(basic.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { basic.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {basic.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Basic_Id_Typ_Cdg_Sys ********************************************************************************/
		if(b.getBasicIdTypCdgSys() != null ) {

			String[] arrayi0 = b.getBasicIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				String[] arrayi1 = b.getBasicIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(basic.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { basic.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {basic.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Basic_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(b.getBasicIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = b.getBasicIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				String[] arrayi1 = b.getBasicIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(basic.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { basic.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {basic.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Basic_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(b.getBasicIdTypCdgVrsn() != null ) {

			String[] arrayi0 = b.getBasicIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				String[] arrayi1 = b.getBasicIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(basic.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { basic.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {basic.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Basic_Id_Typ_Txt ********************************************************************************/
		if(b.getBasicIdTypTxt() != null ) {

			String[] arrayi0 = b.getBasicIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Id_Use ********************************************************************************/
		if(b.getBasicIdUse() != null ) {

			String[] arrayi0 = b.getBasicIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Basic_Id_Vl ********************************************************************************/
		if(b.getBasicIdVl() != null ) {

			String[] arrayi0 = b.getBasicIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(basic.getIdentifier().size() < i0+1) { basic.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {basic.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Basic_Sbjct ********************************************************************************/
		if(b.getBasicSbjct() != null ) {

			if(b.getBasicSbjct().replace("[","").replace("]","").equals("NULL") | b.getBasicSbjct()==null) {} else {
			basic.setSubject(new org.hl7.fhir.r4.model.Reference(b.getBasicSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return basic;
	}
}
