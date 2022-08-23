package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Flag;
public class FlagConversion 
{
	public org.hl7.fhir.r4.model.Flag Flags(Flag f) throws ParseException
	{
		org.hl7.fhir.r4.model.Flag flag = new org.hl7.fhir.r4.model.Flag();

		/******************** id ********************************************************************************/
		flag.setId(f.getId());

		/******************** Flag_Athr ********************************************************************************/
		if(f.getFlagAthr() != null ) {

			if(f.getFlagAthr().replace("[","").replace("]","").equals("NULL") | f.getFlagAthr()==null) {} else {
			flag.setAuthor(new org.hl7.fhir.r4.model.Reference(f.getFlagAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Flag_Ctgry_Cdg_Cd ********************************************************************************/
		if(f.getFlagCtgryCdgCd() != null ) {

			String[] arrayi0 = f.getFlagCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCategory().size() < i0+1) { flag.addCategory(); }
				String[] arrayi1 = f.getFlagCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getCategory().get(i0).getCoding().size() < i1+1) { flag.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Ctgry_Cdg_Dsply ********************************************************************************/
		if(f.getFlagCtgryCdgDsply() != null ) {

			String[] arrayi0 = f.getFlagCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCategory().size() < i0+1) { flag.addCategory(); }
				String[] arrayi1 = f.getFlagCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getCategory().get(i0).getCoding().size() < i1+1) { flag.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Ctgry_Cdg_Sys ********************************************************************************/
		if(f.getFlagCtgryCdgSys() != null ) {

			String[] arrayi0 = f.getFlagCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCategory().size() < i0+1) { flag.addCategory(); }
				String[] arrayi1 = f.getFlagCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getCategory().get(i0).getCoding().size() < i1+1) { flag.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(f.getFlagCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFlagCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCategory().size() < i0+1) { flag.addCategory(); }
				String[] arrayi1 = f.getFlagCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getCategory().get(i0).getCoding().size() < i1+1) { flag.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Flag_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(f.getFlagCtgryCdgVrsn() != null ) {

			String[] arrayi0 = f.getFlagCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCategory().size() < i0+1) { flag.addCategory(); }
				String[] arrayi1 = f.getFlagCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getCategory().get(i0).getCoding().size() < i1+1) { flag.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Ctgry_Txt ********************************************************************************/
		if(f.getFlagCtgryTxt() != null ) {

			String[] arrayi0 = f.getFlagCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCategory().size() < i0+1) { flag.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Cd_Cdg_Cd ********************************************************************************/
		if(f.getFlagCdCdgCd() != null ) {

			String[] arrayi0 = f.getFlagCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCode().getCoding().size() < i0+1) { flag.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Cd_Cdg_Dsply ********************************************************************************/
		if(f.getFlagCdCdgDsply() != null ) {

			String[] arrayi0 = f.getFlagCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCode().getCoding().size() < i0+1) { flag.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Cd_Cdg_Sys ********************************************************************************/
		if(f.getFlagCdCdgSys() != null ) {

			String[] arrayi0 = f.getFlagCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCode().getCoding().size() < i0+1) { flag.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Cd_Cdg_UsrSltd ********************************************************************************/
		if(f.getFlagCdCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFlagCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCode().getCoding().size() < i0+1) { flag.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Flag_Cd_Cdg_Vrsn ********************************************************************************/
		if(f.getFlagCdCdgVrsn() != null ) {

			String[] arrayi0 = f.getFlagCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getCode().getCoding().size() < i0+1) { flag.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Cd_Txt ********************************************************************************/
		if(f.getFlagCdTxt() != null ) {

			if(f.getFlagCdTxt().replace("[","").replace("]","").equals("NULL") | f.getFlagCdTxt()==null) {} else {
			flag.getCode().setText(f.getFlagCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Flag_Enc ********************************************************************************/
		if(f.getFlagEnc() != null ) {

			if(f.getFlagEnc().replace("[","").replace("]","").equals("NULL") | f.getFlagEnc()==null) {} else {
			flag.setEncounter(new org.hl7.fhir.r4.model.Reference(f.getFlagEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Flag_Id_Assigner ********************************************************************************/
		if(f.getFlagIdAssigner() != null ) {

			String[] arrayi0 = f.getFlagIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Flag_Id_Prd_End ********************************************************************************/
		if(f.getFlagIdPrdEnd() != null ) {

			String[] arrayi0 = f.getFlagIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Flag_Id_Prd_Strt ********************************************************************************/
		if(f.getFlagIdPrdStrt() != null ) {

			String[] arrayi0 = f.getFlagIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Flag_Id_Sys ********************************************************************************/
		if(f.getFlagIdSys() != null ) {

			String[] arrayi0 = f.getFlagIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Id_Typ_Cdg_Cd ********************************************************************************/
		if(f.getFlagIdTypCdgCd() != null ) {

			String[] arrayi0 = f.getFlagIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				String[] arrayi1 = f.getFlagIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { flag.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(f.getFlagIdTypCdgDsply() != null ) {

			String[] arrayi0 = f.getFlagIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				String[] arrayi1 = f.getFlagIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { flag.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Id_Typ_Cdg_Sys ********************************************************************************/
		if(f.getFlagIdTypCdgSys() != null ) {

			String[] arrayi0 = f.getFlagIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				String[] arrayi1 = f.getFlagIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { flag.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(f.getFlagIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFlagIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				String[] arrayi1 = f.getFlagIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { flag.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Flag_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(f.getFlagIdTypCdgVrsn() != null ) {

			String[] arrayi0 = f.getFlagIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				String[] arrayi1 = f.getFlagIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(flag.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { flag.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {flag.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Flag_Id_Typ_Txt ********************************************************************************/
		if(f.getFlagIdTypTxt() != null ) {

			String[] arrayi0 = f.getFlagIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Id_Use ********************************************************************************/
		if(f.getFlagIdUse() != null ) {

			String[] arrayi0 = f.getFlagIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Flag_Id_Vl ********************************************************************************/
		if(f.getFlagIdVl() != null ) {

			String[] arrayi0 = f.getFlagIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(flag.getIdentifier().size() < i0+1) { flag.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {flag.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Flag_Prd_End ********************************************************************************/
		if(f.getFlagPrdEnd() != null ) {

			if(f.getFlagPrdEnd().replace("[","").replace("]","").equals("NULL") | f.getFlagPrdEnd()==null) {} else {
			flag.getPeriod().setEnd(f.getFlagPrdEnd().replace("[","").replace("]","").equals("NULL") | f.getFlagPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(f.getFlagPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Flag_Prd_Strt ********************************************************************************/
		if(f.getFlagPrdStrt() != null ) {

			if(f.getFlagPrdStrt().replace("[","").replace("]","").equals("NULL") | f.getFlagPrdStrt()==null) {} else {
			flag.getPeriod().setStart(f.getFlagPrdStrt().replace("[","").replace("]","").equals("NULL") | f.getFlagPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(f.getFlagPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Flag_Sts ********************************************************************************/
		if(f.getFlagSts() != null ) {

			if(f.getFlagSts().replace("[","").replace("]","").equals("NULL") | f.getFlagSts()==null) {} else {
			flag.setStatus(new org.hl7.fhir.r4.model.Flag.FlagStatusEnumFactory().fromCode(f.getFlagSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Flag_Sbjct ********************************************************************************/
		if(f.getFlagSbjct() != null ) {

			if(f.getFlagSbjct().replace("[","").replace("]","").equals("NULL") | f.getFlagSbjct()==null) {} else {
			flag.setSubject(new org.hl7.fhir.r4.model.Reference(f.getFlagSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return flag;
	}
}
