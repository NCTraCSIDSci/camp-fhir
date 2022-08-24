package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Substance;
public class SubstanceConversion 
{
	public org.hl7.fhir.r4.model.Substance Substances(Substance s) throws ParseException
	{
		org.hl7.fhir.r4.model.Substance substance = new org.hl7.fhir.r4.model.Substance();

		/******************** id ********************************************************************************/
		substance.setId(s.getId());

		/******************** Sbstnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSbstncCtgryCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCategory().size() < i0+1) { substance.addCategory(); }
				String[] arrayi1 = s.getSbstncCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getCategory().get(i0).getCoding().size() < i1+1) { substance.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncCtgryCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCategory().size() < i0+1) { substance.addCategory(); }
				String[] arrayi1 = s.getSbstncCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getCategory().get(i0).getCoding().size() < i1+1) { substance.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSbstncCtgryCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCategory().size() < i0+1) { substance.addCategory(); }
				String[] arrayi1 = s.getSbstncCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getCategory().get(i0).getCoding().size() < i1+1) { substance.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCategory().size() < i0+1) { substance.addCategory(); }
				String[] arrayi1 = s.getSbstncCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getCategory().get(i0).getCoding().size() < i1+1) { substance.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Sbstnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncCtgryCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCategory().size() < i0+1) { substance.addCategory(); }
				String[] arrayi1 = s.getSbstncCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getCategory().get(i0).getCoding().size() < i1+1) { substance.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Ctgry_Txt ********************************************************************************/
		if(s.getSbstncCtgryTxt() != null ) {

			String[] arrayi0 = s.getSbstncCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCategory().size() < i0+1) { substance.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSbstncCdCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCode().getCoding().size() < i0+1) { substance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCode().getCoding().size() < i0+1) { substance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSbstncCdCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCode().getCoding().size() < i0+1) { substance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCode().getCoding().size() < i0+1) { substance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getCode().getCoding().size() < i0+1) { substance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Cd_Txt ********************************************************************************/
		if(s.getSbstncCdTxt() != null ) {

			if(s.getSbstncCdTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncCdTxt()==null) {} else {
			substance.getCode().setText(s.getSbstncCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Sbstnc_Dscrptn ********************************************************************************/
		if(s.getSbstncDscrptn() != null ) {

			if(s.getSbstncDscrptn().replace("[","").replace("]","").equals("NULL") | s.getSbstncDscrptn()==null) {} else {
			substance.setDescription(s.getSbstncDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Sbstnc_Id_Assigner ********************************************************************************/
		if(s.getSbstncIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Id_Prd_End ********************************************************************************/
		if(s.getSbstncIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Id_Sys ********************************************************************************/
		if(s.getSbstncIdSys() != null ) {

			String[] arrayi0 = s.getSbstncIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				String[] arrayi1 = s.getSbstncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { substance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				String[] arrayi1 = s.getSbstncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { substance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				String[] arrayi1 = s.getSbstncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { substance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				String[] arrayi1 = s.getSbstncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { substance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Sbstnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				String[] arrayi1 = s.getSbstncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { substance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Id_Use ********************************************************************************/
		if(s.getSbstncIdUse() != null ) {

			String[] arrayi0 = s.getSbstncIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Id_Vl ********************************************************************************/
		if(s.getSbstncIdVl() != null ) {

			String[] arrayi0 = s.getSbstncIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIdentifier().size() < i0+1) { substance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Cd ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrCd() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Cmprtr ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Sys ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrSys() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Unt ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrUnt() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Dnmntr_Vl ********************************************************************************/
		if(s.getSbstncIgrdntQntyDnmntrVl() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Cd ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrCd() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Cmprtr ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Sys ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrSys() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Unt ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrUnt() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_Qnty_Nmrtr_Vl ********************************************************************************/
		if(s.getSbstncIgrdntQntyNmrtrVl() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntQntyNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getQuantity().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				String[] arrayi1 = s.getSbstncIgrdntSbstncCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().size() < i1+1) { substance.getIngredient().get(i0).getSubstanceCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				String[] arrayi1 = s.getSbstncIgrdntSbstncCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().size() < i1+1) { substance.getIngredient().get(i0).getSubstanceCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				String[] arrayi1 = s.getSbstncIgrdntSbstncCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().size() < i1+1) { substance.getIngredient().get(i0).getSubstanceCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				String[] arrayi1 = s.getSbstncIgrdntSbstncCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().size() < i1+1) { substance.getIngredient().get(i0).getSubstanceCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				String[] arrayi1 = s.getSbstncIgrdntSbstncCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().size() < i1+1) { substance.getIngredient().get(i0).getSubstanceCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getIngredient().get(i0).getSubstanceCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncCdbleCncpt_Txt ********************************************************************************/
		if(s.getSbstncIgrdntSbstncCdbleCncptTxt() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).getSubstanceCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Igrdnt_SbstncRfrnc ********************************************************************************/
		if(s.getSbstncIgrdntSbstncRfrnc() != null ) {

			String[] arrayi0 = s.getSbstncIgrdntSbstncRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getIngredient().size() < i0+1) { substance.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getIngredient().get(i0).setSubstance(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Expiry ********************************************************************************/
		if(s.getSbstncInstanceExpiry() != null ) {

			String[] arrayi0 = s.getSbstncInstanceExpiry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).setExpiry(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Id_Assigner ********************************************************************************/
		if(s.getSbstncInstanceIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Id_Prd_End ********************************************************************************/
		if(s.getSbstncInstanceIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Id_Prd_Strt ********************************************************************************/
		if(s.getSbstncInstanceIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Id_Sys ********************************************************************************/
		if(s.getSbstncInstanceIdSys() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				String[] arrayi1 = s.getSbstncInstanceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getInstance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substance.getInstance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getInstance().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				String[] arrayi1 = s.getSbstncInstanceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getInstance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substance.getInstance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getInstance().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				String[] arrayi1 = s.getSbstncInstanceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getInstance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substance.getInstance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getInstance().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				String[] arrayi1 = s.getSbstncInstanceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getInstance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substance.getInstance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getInstance().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Sbstnc_Instance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncInstanceIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				String[] arrayi1 = s.getSbstncInstanceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substance.getInstance().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substance.getInstance().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substance.getInstance().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Sbstnc_Instance_Id_Typ_Txt ********************************************************************************/
		if(s.getSbstncInstanceIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Instance_Id_Use ********************************************************************************/
		if(s.getSbstncInstanceIdUse() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Id_Vl ********************************************************************************/
		if(s.getSbstncInstanceIdVl() != null ) {

			String[] arrayi0 = s.getSbstncInstanceIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Instance_Qnty_Cd ********************************************************************************/
		if(s.getSbstncInstanceQntyCd() != null ) {

			String[] arrayi0 = s.getSbstncInstanceQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Instance_Qnty_Cmprtr ********************************************************************************/
		if(s.getSbstncInstanceQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSbstncInstanceQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Sbstnc_Instance_Qnty_Sys ********************************************************************************/
		if(s.getSbstncInstanceQntySys() != null ) {

			String[] arrayi0 = s.getSbstncInstanceQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Instance_Qnty_Unt ********************************************************************************/
		if(s.getSbstncInstanceQntyUnt() != null ) {

			String[] arrayi0 = s.getSbstncInstanceQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Sbstnc_Instance_Qnty_Vl ********************************************************************************/
		if(s.getSbstncInstanceQntyVl() != null ) {

			String[] arrayi0 = s.getSbstncInstanceQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substance.getInstance().size() < i0+1) { substance.addInstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substance.getInstance().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Sbstnc_Sts ********************************************************************************/
		if(s.getSbstncSts() != null ) {

			if(s.getSbstncSts().replace("[","").replace("]","").equals("NULL") | s.getSbstncSts()==null) {} else {
			substance.setStatus(new org.hl7.fhir.r4.model.Substance.FHIRSubstanceStatusEnumFactory().fromCode(s.getSbstncSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return substance;
	}
}
