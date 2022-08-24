package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchStudy;
public class ResearchStudyConversion 
{
	public org.hl7.fhir.r4.model.ResearchStudy ResearchStudys(ResearchStudy r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchStudy researchstudy = new org.hl7.fhir.r4.model.ResearchStudy();

		/******************** id ********************************************************************************/
		researchstudy.setId(r.getId());

		/******************** RsrchStdy_Arm_Dscrptn ********************************************************************************/
		if(r.getRsrchStdyArmDscrptn() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getArm().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Arm_Nm ********************************************************************************/
		if(r.getRsrchStdyArmNm() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getArm().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				String[] arrayi1 = r.getRsrchStdyArmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getArm().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getArm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getArm().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				String[] arrayi1 = r.getRsrchStdyArmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getArm().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getArm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getArm().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				String[] arrayi1 = r.getRsrchStdyArmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getArm().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getArm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getArm().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Arm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				String[] arrayi1 = r.getRsrchStdyArmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getArm().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getArm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getArm().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				String[] arrayi1 = r.getRsrchStdyArmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getArm().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getArm().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getArm().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Arm_Typ_Txt ********************************************************************************/
		if(r.getRsrchStdyArmTypTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyArmTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getArm().size() < i0+1) { researchstudy.addArm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getArm().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Ctgry_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCategory().size() < i0+1) { researchstudy.addCategory(); }
				String[] arrayi1 = r.getRsrchStdyCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCategory().get(i0).getCoding().size() < i1+1) { researchstudy.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Ctgry_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCategory().size() < i0+1) { researchstudy.addCategory(); }
				String[] arrayi1 = r.getRsrchStdyCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCategory().get(i0).getCoding().size() < i1+1) { researchstudy.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Ctgry_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCategory().size() < i0+1) { researchstudy.addCategory(); }
				String[] arrayi1 = r.getRsrchStdyCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCategory().get(i0).getCoding().size() < i1+1) { researchstudy.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCategory().size() < i0+1) { researchstudy.addCategory(); }
				String[] arrayi1 = r.getRsrchStdyCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCategory().get(i0).getCoding().size() < i1+1) { researchstudy.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCategory().size() < i0+1) { researchstudy.addCategory(); }
				String[] arrayi1 = r.getRsrchStdyCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCategory().get(i0).getCoding().size() < i1+1) { researchstudy.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Ctgry_Txt ********************************************************************************/
		if(r.getRsrchStdyCtgryTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCategory().size() < i0+1) { researchstudy.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Cndtn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCondition().size() < i0+1) { researchstudy.addCondition(); }
				String[] arrayi1 = r.getRsrchStdyCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCondition().get(i0).getCoding().size() < i1+1) { researchstudy.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCondition().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Cndtn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCondition().size() < i0+1) { researchstudy.addCondition(); }
				String[] arrayi1 = r.getRsrchStdyCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCondition().get(i0).getCoding().size() < i1+1) { researchstudy.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCondition().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Cndtn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCondition().size() < i0+1) { researchstudy.addCondition(); }
				String[] arrayi1 = r.getRsrchStdyCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCondition().get(i0).getCoding().size() < i1+1) { researchstudy.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCondition().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCondition().size() < i0+1) { researchstudy.addCondition(); }
				String[] arrayi1 = r.getRsrchStdyCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCondition().get(i0).getCoding().size() < i1+1) { researchstudy.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCondition().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCondition().size() < i0+1) { researchstudy.addCondition(); }
				String[] arrayi1 = r.getRsrchStdyCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getCondition().get(i0).getCoding().size() < i1+1) { researchstudy.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getCondition().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Cndtn_Txt ********************************************************************************/
		if(r.getRsrchStdyCndtnTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyCndtnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getCondition().size() < i0+1) { researchstudy.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getCondition().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Cntct_Nm ********************************************************************************/
		if(r.getRsrchStdyCntctNm() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				String[] arrayi1 = r.getRsrchStdyCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getContact().get(i0).getTelecom().size() < i1+1) { researchstudy.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				String[] arrayi1 = r.getRsrchStdyCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getContact().get(i0).getTelecom().size() < i1+1) { researchstudy.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmRnk() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				String[] arrayi1 = r.getRsrchStdyCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getContact().get(i0).getTelecom().size() < i1+1) { researchstudy.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Cntct_Tlcm_Sys ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				String[] arrayi1 = r.getRsrchStdyCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getContact().get(i0).getTelecom().size() < i1+1) { researchstudy.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Cntct_Tlcm_Use ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmUse() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				String[] arrayi1 = r.getRsrchStdyCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getContact().get(i0).getTelecom().size() < i1+1) { researchstudy.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmVl() != null ) {

			String[] arrayi0 = r.getRsrchStdyCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getContact().size() < i0+1) { researchstudy.addContact(); }
				String[] arrayi1 = r.getRsrchStdyCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getContact().get(i0).getTelecom().size() < i1+1) { researchstudy.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Dscrptn ********************************************************************************/
		if(r.getRsrchStdyDscrptn() != null ) {

			if(r.getRsrchStdyDscrptn().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyDscrptn()==null) {} else {
			researchstudy.setDescription(r.getRsrchStdyDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchStdy_Enrollment ********************************************************************************/
		if(r.getRsrchStdyEnrollment() != null ) {

				for( String currListStrSplit : r.getRsrchStdyEnrollment().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchstudy.addEnrollment(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RsrchStdy_Focus_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyFocusCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyFocusCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getFocus().size() < i0+1) { researchstudy.addFocus(); }
				String[] arrayi1 = r.getRsrchStdyFocusCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getFocus().get(i0).getCoding().size() < i1+1) { researchstudy.getFocus().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getFocus().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Focus_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyFocusCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyFocusCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getFocus().size() < i0+1) { researchstudy.addFocus(); }
				String[] arrayi1 = r.getRsrchStdyFocusCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getFocus().get(i0).getCoding().size() < i1+1) { researchstudy.getFocus().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getFocus().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Focus_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyFocusCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyFocusCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getFocus().size() < i0+1) { researchstudy.addFocus(); }
				String[] arrayi1 = r.getRsrchStdyFocusCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getFocus().get(i0).getCoding().size() < i1+1) { researchstudy.getFocus().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getFocus().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Focus_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyFocusCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyFocusCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getFocus().size() < i0+1) { researchstudy.addFocus(); }
				String[] arrayi1 = r.getRsrchStdyFocusCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getFocus().get(i0).getCoding().size() < i1+1) { researchstudy.getFocus().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getFocus().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Focus_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyFocusCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyFocusCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getFocus().size() < i0+1) { researchstudy.addFocus(); }
				String[] arrayi1 = r.getRsrchStdyFocusCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getFocus().get(i0).getCoding().size() < i1+1) { researchstudy.getFocus().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getFocus().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Focus_Txt ********************************************************************************/
		if(r.getRsrchStdyFocusTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyFocusTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getFocus().size() < i0+1) { researchstudy.addFocus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getFocus().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Id_Assigner ********************************************************************************/
		if(r.getRsrchStdyIdAssigner() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Id_Prd_End ********************************************************************************/
		if(r.getRsrchStdyIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchStdyIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Id_Sys ********************************************************************************/
		if(r.getRsrchStdyIdSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				String[] arrayi1 = r.getRsrchStdyIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				String[] arrayi1 = r.getRsrchStdyIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				String[] arrayi1 = r.getRsrchStdyIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				String[] arrayi1 = r.getRsrchStdyIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				String[] arrayi1 = r.getRsrchStdyIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchStdyIdTypTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Id_Use ********************************************************************************/
		if(r.getRsrchStdyIdUse() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Id_Vl ********************************************************************************/
		if(r.getRsrchStdyIdVl() != null ) {

			String[] arrayi0 = r.getRsrchStdyIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getIdentifier().size() < i0+1) { researchstudy.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Keyword_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyKeywordCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getKeyword().size() < i0+1) { researchstudy.addKeyword(); }
				String[] arrayi1 = r.getRsrchStdyKeywordCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getKeyword().get(i0).getCoding().size() < i1+1) { researchstudy.getKeyword().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getKeyword().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Keyword_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyKeywordCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getKeyword().size() < i0+1) { researchstudy.addKeyword(); }
				String[] arrayi1 = r.getRsrchStdyKeywordCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getKeyword().get(i0).getCoding().size() < i1+1) { researchstudy.getKeyword().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getKeyword().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Keyword_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyKeywordCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getKeyword().size() < i0+1) { researchstudy.addKeyword(); }
				String[] arrayi1 = r.getRsrchStdyKeywordCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getKeyword().get(i0).getCoding().size() < i1+1) { researchstudy.getKeyword().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getKeyword().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Keyword_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyKeywordCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getKeyword().size() < i0+1) { researchstudy.addKeyword(); }
				String[] arrayi1 = r.getRsrchStdyKeywordCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getKeyword().get(i0).getCoding().size() < i1+1) { researchstudy.getKeyword().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getKeyword().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Keyword_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyKeywordCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getKeyword().size() < i0+1) { researchstudy.addKeyword(); }
				String[] arrayi1 = r.getRsrchStdyKeywordCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getKeyword().get(i0).getCoding().size() < i1+1) { researchstudy.getKeyword().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getKeyword().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Keyword_Txt ********************************************************************************/
		if(r.getRsrchStdyKeywordTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyKeywordTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getKeyword().size() < i0+1) { researchstudy.addKeyword(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getKeyword().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Lctn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyLctnCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyLctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getLocation().size() < i0+1) { researchstudy.addLocation(); }
				String[] arrayi1 = r.getRsrchStdyLctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getLocation().get(i0).getCoding().size() < i1+1) { researchstudy.getLocation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getLocation().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Lctn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyLctnCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyLctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getLocation().size() < i0+1) { researchstudy.addLocation(); }
				String[] arrayi1 = r.getRsrchStdyLctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getLocation().get(i0).getCoding().size() < i1+1) { researchstudy.getLocation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getLocation().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Lctn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyLctnCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyLctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getLocation().size() < i0+1) { researchstudy.addLocation(); }
				String[] arrayi1 = r.getRsrchStdyLctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getLocation().get(i0).getCoding().size() < i1+1) { researchstudy.getLocation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getLocation().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyLctnCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyLctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getLocation().size() < i0+1) { researchstudy.addLocation(); }
				String[] arrayi1 = r.getRsrchStdyLctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getLocation().get(i0).getCoding().size() < i1+1) { researchstudy.getLocation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getLocation().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Lctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyLctnCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyLctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getLocation().size() < i0+1) { researchstudy.addLocation(); }
				String[] arrayi1 = r.getRsrchStdyLctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getLocation().get(i0).getCoding().size() < i1+1) { researchstudy.getLocation().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getLocation().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Lctn_Txt ********************************************************************************/
		if(r.getRsrchStdyLctnTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyLctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getLocation().size() < i0+1) { researchstudy.addLocation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getLocation().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRsrchStdyNtAthrRfrnc() != null ) {

			String[] arrayi0 = r.getRsrchStdyNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getNote().size() < i0+1) { researchstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRsrchStdyNtAthrStrgTyp() != null ) {

			String[] arrayi0 = r.getRsrchStdyNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getNote().size() < i0+1) { researchstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Nt_Txt ********************************************************************************/
		if(r.getRsrchStdyNtTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getNote().size() < i0+1) { researchstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Nt_Time ********************************************************************************/
		if(r.getRsrchStdyNtTime() != null ) {

			String[] arrayi0 = r.getRsrchStdyNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getNote().size() < i0+1) { researchstudy.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Objective_Nm ********************************************************************************/
		if(r.getRsrchStdyObjectiveNm() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getObjective().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				String[] arrayi1 = r.getRsrchStdyObjectiveTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getObjective().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getObjective().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getObjective().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				String[] arrayi1 = r.getRsrchStdyObjectiveTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getObjective().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getObjective().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getObjective().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				String[] arrayi1 = r.getRsrchStdyObjectiveTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getObjective().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getObjective().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getObjective().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Objective_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				String[] arrayi1 = r.getRsrchStdyObjectiveTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getObjective().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getObjective().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getObjective().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				String[] arrayi1 = r.getRsrchStdyObjectiveTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(researchstudy.getObjective().get(i0).getType().getCoding().size() < i1+1) { researchstudy.getObjective().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {researchstudy.getObjective().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RsrchStdy_Objective_Typ_Txt ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypTxt() != null ) {

			String[] arrayi0 = r.getRsrchStdyObjectiveTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getObjective().size() < i0+1) { researchstudy.addObjective(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getObjective().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_PartOf ********************************************************************************/
		if(r.getRsrchStdyPartOf() != null ) {

				for( String currListStrSplit : r.getRsrchStdyPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchstudy.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RsrchStdy_Prd_End ********************************************************************************/
		if(r.getRsrchStdyPrdEnd() != null ) {

			if(r.getRsrchStdyPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPrdEnd()==null) {} else {
			researchstudy.getPeriod().setEnd(r.getRsrchStdyPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchStdyPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchStdy_Prd_Strt ********************************************************************************/
		if(r.getRsrchStdyPrdStrt() != null ) {

			if(r.getRsrchStdyPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPrdStrt()==null) {} else {
			researchstudy.getPeriod().setStart(r.getRsrchStdyPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRsrchStdyPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchStdy_Phase_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyPhaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPhase().getCoding().size() < i0+1) { researchstudy.getPhase().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPhase().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Phase_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyPhaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPhase().getCoding().size() < i0+1) { researchstudy.getPhase().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPhase().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Phase_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyPhaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPhase().getCoding().size() < i0+1) { researchstudy.getPhase().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPhase().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Phase_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyPhaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPhase().getCoding().size() < i0+1) { researchstudy.getPhase().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPhase().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_Phase_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyPhaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPhase().getCoding().size() < i0+1) { researchstudy.getPhase().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPhase().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Phase_Txt ********************************************************************************/
		if(r.getRsrchStdyPhaseTxt() != null ) {

			if(r.getRsrchStdyPhaseTxt().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPhaseTxt()==null) {} else {
			researchstudy.getPhase().setText(r.getRsrchStdyPhaseTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyPrimaryPrpseTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPrimaryPurposeType().getCoding().size() < i0+1) { researchstudy.getPrimaryPurposeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPrimaryPurposeType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyPrimaryPrpseTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPrimaryPurposeType().getCoding().size() < i0+1) { researchstudy.getPrimaryPurposeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPrimaryPurposeType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyPrimaryPrpseTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPrimaryPurposeType().getCoding().size() < i0+1) { researchstudy.getPrimaryPurposeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPrimaryPurposeType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyPrimaryPrpseTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPrimaryPurposeType().getCoding().size() < i0+1) { researchstudy.getPrimaryPurposeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPrimaryPurposeType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyPrimaryPrpseTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getPrimaryPurposeType().getCoding().size() < i0+1) { researchstudy.getPrimaryPurposeType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getPrimaryPurposeType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Txt ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypTxt() != null ) {

			if(r.getRsrchStdyPrimaryPrpseTypTxt().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPrimaryPrpseTypTxt()==null) {} else {
			researchstudy.getPrimaryPurposeType().setText(r.getRsrchStdyPrimaryPrpseTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchStdy_PrincipalInvestigator ********************************************************************************/
		if(r.getRsrchStdyPrincipalInvestigator() != null ) {

			if(r.getRsrchStdyPrincipalInvestigator().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyPrincipalInvestigator()==null) {} else {
			researchstudy.setPrincipalInvestigator(new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyPrincipalInvestigator().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchStdy_Protocol ********************************************************************************/
		if(r.getRsrchStdyProtocol() != null ) {

				for( String currListStrSplit : r.getRsrchStdyProtocol().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchstudy.addProtocol(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RsrchStdy_RsnStopped_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgCd() != null ) {

			String[] arrayi0 = r.getRsrchStdyRsnStoppedCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getReasonStopped().getCoding().size() < i0+1) { researchstudy.getReasonStopped().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getReasonStopped().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RsnStopped_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyRsnStoppedCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getReasonStopped().getCoding().size() < i0+1) { researchstudy.getReasonStopped().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getReasonStopped().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RsnStopped_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgSys() != null ) {

			String[] arrayi0 = r.getRsrchStdyRsnStoppedCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getReasonStopped().getCoding().size() < i0+1) { researchstudy.getReasonStopped().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getReasonStopped().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RsnStopped_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRsrchStdyRsnStoppedCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getReasonStopped().getCoding().size() < i0+1) { researchstudy.getReasonStopped().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getReasonStopped().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_RsnStopped_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgVrsn() != null ) {

			String[] arrayi0 = r.getRsrchStdyRsnStoppedCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getReasonStopped().getCoding().size() < i0+1) { researchstudy.getReasonStopped().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getReasonStopped().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RsnStopped_Txt ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedTxt() != null ) {

			if(r.getRsrchStdyRsnStoppedTxt().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyRsnStoppedTxt()==null) {} else {
			researchstudy.getReasonStopped().setText(r.getRsrchStdyRsnStoppedTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RsrchStdy_RltedArtfct_Citation ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctCitation() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDsply() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocData() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocHash() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocSz() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctLbl() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctRsrc() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Typ ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctTyp() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RsrchStdy_RltedArtfct_Url ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctUrl() != null ) {

			String[] arrayi0 = r.getRsrchStdyRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(researchstudy.getRelatedArtifact().size() < i0+1) { researchstudy.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {researchstudy.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RsrchStdy_Site ********************************************************************************/
		if(r.getRsrchStdySite() != null ) {

				for( String currListStrSplit : r.getRsrchStdySite().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			researchstudy.addSite(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RsrchStdy_Sponsor ********************************************************************************/
		if(r.getRsrchStdySponsor() != null ) {

			if(r.getRsrchStdySponsor().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdySponsor()==null) {} else {
			researchstudy.setSponsor(new org.hl7.fhir.r4.model.Reference(r.getRsrchStdySponsor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchStdy_Sts ********************************************************************************/
		if(r.getRsrchStdySts() != null ) {

			if(r.getRsrchStdySts().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdySts()==null) {} else {
			researchstudy.setStatus(new org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyStatusEnumFactory().fromCode(r.getRsrchStdySts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RsrchStdy_Ttl ********************************************************************************/
		if(r.getRsrchStdyTtl() != null ) {

			if(r.getRsrchStdyTtl().replace("[","").replace("]","").equals("NULL") | r.getRsrchStdyTtl()==null) {} else {
			researchstudy.setTitle(r.getRsrchStdyTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return researchstudy;
	}
}
