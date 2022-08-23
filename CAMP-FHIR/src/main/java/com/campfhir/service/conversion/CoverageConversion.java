package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Coverage;
public class CoverageConversion 
{
	public org.hl7.fhir.r4.model.Coverage Coverages(Coverage c) throws ParseException
	{
		org.hl7.fhir.r4.model.Coverage coverage = new org.hl7.fhir.r4.model.Coverage();

		/******************** id ********************************************************************************/
		coverage.setId(c.getId());

		/******************** Cvg_Beneficiary ********************************************************************************/
		if(c.getCvgBeneficiary() != null ) {

			if(c.getCvgBeneficiary().replace("[","").replace("]","").equals("NULL") | c.getCvgBeneficiary()==null) {} else {
			coverage.setBeneficiary(new org.hl7.fhir.r4.model.Reference(c.getCvgBeneficiary().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_Cls__Nm ********************************************************************************/
		if(c.getCvgClsNm() != null ) {

			String[] arrayi0 = c.getCvgClsNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getClass_().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Cls__Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgClsTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgClsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				String[] arrayi1 = c.getCvgClsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getClass_().get(i0).getType().getCoding().size() < i1+1) { coverage.getClass_().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getClass_().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Cls__Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgClsTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgClsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				String[] arrayi1 = c.getCvgClsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getClass_().get(i0).getType().getCoding().size() < i1+1) { coverage.getClass_().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getClass_().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Cls__Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgClsTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgClsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				String[] arrayi1 = c.getCvgClsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getClass_().get(i0).getType().getCoding().size() < i1+1) { coverage.getClass_().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getClass_().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Cls__Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgClsTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgClsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				String[] arrayi1 = c.getCvgClsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getClass_().get(i0).getType().getCoding().size() < i1+1) { coverage.getClass_().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getClass_().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cvg_Cls__Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgClsTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgClsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				String[] arrayi1 = c.getCvgClsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getClass_().get(i0).getType().getCoding().size() < i1+1) { coverage.getClass_().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getClass_().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Cls__Typ_Txt ********************************************************************************/
		if(c.getCvgClsTypTxt() != null ) {

			String[] arrayi0 = c.getCvgClsTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getClass_().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Cls__Vl ********************************************************************************/
		if(c.getCvgClsVl() != null ) {

			String[] arrayi0 = c.getCvgClsVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getClass_().size() < i0+1) { coverage.addClass_(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getClass_().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Cnct ********************************************************************************/
		if(c.getCvgCnct() != null ) {

				for( String currListStrSplit : c.getCvgCnct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			coverage.addContract(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Prd_End ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionPrdEnd() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Prd_Strt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionPrdStrt() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					String[] arrayi2 = c.getCvgCstToBeneficiaryExceptionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().size() < i2+1) { coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					String[] arrayi2 = c.getCvgCstToBeneficiaryExceptionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().size() < i2+1) { coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					String[] arrayi2 = c.getCvgCstToBeneficiaryExceptionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().size() < i2+1) { coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					String[] arrayi2 = c.getCvgCstToBeneficiaryExceptionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().size() < i2+1) { coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					String[] arrayi2 = c.getCvgCstToBeneficiaryExceptionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().size() < i2+1) { coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Exception_Typ_Txt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryExceptionTypTxt() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryExceptionTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryExceptionTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getException().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).addException(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getException().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getType().getCoding().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getType().getCoding().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getType().getCoding().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getType().getCoding().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				String[] arrayi1 = c.getCvgCstToBeneficiaryTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getCostToBeneficiary().get(i0).getType().getCoding().size() < i1+1) { coverage.getCostToBeneficiary().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getCostToBeneficiary().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_CstToBeneficiary_Typ_Txt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryTypTxt() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlMoney_Crncy ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlMoneyCrncy() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlMoneyCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueMoney().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlMoney_Vl ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlMoneyVl() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlMoneyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueMoney().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Cd ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyCd() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Sys ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntySys() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Unt ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_CstToBeneficiary_VlQnty_Vl ********************************************************************************/
		if(c.getCvgCstToBeneficiaryVlQntyVl() != null ) {

			String[] arrayi0 = c.getCvgCstToBeneficiaryVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getCostToBeneficiary().size() < i0+1) { coverage.addCostToBeneficiary(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getCostToBeneficiary().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Cvg_Dependent ********************************************************************************/
		if(c.getCvgDependent() != null ) {

			if(c.getCvgDependent().replace("[","").replace("]","").equals("NULL") | c.getCvgDependent()==null) {} else {
			coverage.setDependent(c.getCvgDependent().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cvg_Id_Assigner ********************************************************************************/
		if(c.getCvgIdAssigner() != null ) {

			String[] arrayi0 = c.getCvgIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_Id_Prd_End ********************************************************************************/
		if(c.getCvgIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCvgIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_Id_Prd_Strt ********************************************************************************/
		if(c.getCvgIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCvgIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_Id_Sys ********************************************************************************/
		if(c.getCvgIdSys() != null ) {

			String[] arrayi0 = c.getCvgIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				String[] arrayi1 = c.getCvgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverage.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				String[] arrayi1 = c.getCvgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverage.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				String[] arrayi1 = c.getCvgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverage.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				String[] arrayi1 = c.getCvgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverage.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cvg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				String[] arrayi1 = c.getCvgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(coverage.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { coverage.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {coverage.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cvg_Id_Typ_Txt ********************************************************************************/
		if(c.getCvgIdTypTxt() != null ) {

			String[] arrayi0 = c.getCvgIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Id_Use ********************************************************************************/
		if(c.getCvgIdUse() != null ) {

			String[] arrayi0 = c.getCvgIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_Id_Vl ********************************************************************************/
		if(c.getCvgIdVl() != null ) {

			String[] arrayi0 = c.getCvgIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getIdentifier().size() < i0+1) { coverage.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Network ********************************************************************************/
		if(c.getCvgNetwork() != null ) {

			if(c.getCvgNetwork().replace("[","").replace("]","").equals("NULL") | c.getCvgNetwork()==null) {} else {
			coverage.setNetwork(c.getCvgNetwork().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cvg_Ordr ********************************************************************************/
		if(c.getCvgOrdr() != null ) {

			if(c.getCvgOrdr().replace("[","").replace("]","").equals("NULL") | c.getCvgOrdr()==null) {} else {
			coverage.setOrder(Integer.parseInt(c.getCvgOrdr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_Payor ********************************************************************************/
		if(c.getCvgPayor() != null ) {

				for( String currListStrSplit : c.getCvgPayor().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			coverage.addPayor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cvg_Prd_End ********************************************************************************/
		if(c.getCvgPrdEnd() != null ) {

			if(c.getCvgPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCvgPrdEnd()==null) {} else {
			coverage.getPeriod().setEnd(c.getCvgPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCvgPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_Prd_Strt ********************************************************************************/
		if(c.getCvgPrdStrt() != null ) {

			if(c.getCvgPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCvgPrdStrt()==null) {} else {
			coverage.getPeriod().setStart(c.getCvgPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCvgPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCvgPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_PolicyHolder ********************************************************************************/
		if(c.getCvgPolicyHolder() != null ) {

			if(c.getCvgPolicyHolder().replace("[","").replace("]","").equals("NULL") | c.getCvgPolicyHolder()==null) {} else {
			coverage.setPolicyHolder(new org.hl7.fhir.r4.model.Reference(c.getCvgPolicyHolder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_Rltnship_Cdg_Cd ********************************************************************************/
		if(c.getCvgRltnshipCdgCd() != null ) {

			String[] arrayi0 = c.getCvgRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getRelationship().getCoding().size() < i0+1) { coverage.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getRelationship().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Rltnship_Cdg_Dsply ********************************************************************************/
		if(c.getCvgRltnshipCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getRelationship().getCoding().size() < i0+1) { coverage.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getRelationship().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Rltnship_Cdg_Sys ********************************************************************************/
		if(c.getCvgRltnshipCdgSys() != null ) {

			String[] arrayi0 = c.getCvgRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getRelationship().getCoding().size() < i0+1) { coverage.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getRelationship().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgRltnshipCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getRelationship().getCoding().size() < i0+1) { coverage.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getRelationship().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgRltnshipCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getRelationship().getCoding().size() < i0+1) { coverage.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getRelationship().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Rltnship_Txt ********************************************************************************/
		if(c.getCvgRltnshipTxt() != null ) {

			if(c.getCvgRltnshipTxt().replace("[","").replace("]","").equals("NULL") | c.getCvgRltnshipTxt()==null) {} else {
			coverage.getRelationship().setText(c.getCvgRltnshipTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cvg_Sts ********************************************************************************/
		if(c.getCvgSts() != null ) {

			if(c.getCvgSts().replace("[","").replace("]","").equals("NULL") | c.getCvgSts()==null) {} else {
			coverage.setStatus(new org.hl7.fhir.r4.model.Coverage.CoverageStatusEnumFactory().fromCode(c.getCvgSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_Subrogation ********************************************************************************/
		if(c.getCvgSubrogation() != null ) {

			if(c.getCvgSubrogation().replace("[","").replace("]","").equals("NULL") | c.getCvgSubrogation()==null) {} else {
			coverage.setSubrogation(Boolean.parseBoolean(c.getCvgSubrogation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_Subscriber ********************************************************************************/
		if(c.getCvgSubscriber() != null ) {

			if(c.getCvgSubscriber().replace("[","").replace("]","").equals("NULL") | c.getCvgSubscriber()==null) {} else {
			coverage.setSubscriber(new org.hl7.fhir.r4.model.Reference(c.getCvgSubscriber().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cvg_SubscriberId ********************************************************************************/
		if(c.getCvgSubscriberId() != null ) {

			if(c.getCvgSubscriberId().replace("[","").replace("]","").equals("NULL") | c.getCvgSubscriberId()==null) {} else {
			coverage.setSubscriberId(c.getCvgSubscriberId().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgTypCdgCd() != null ) {

			String[] arrayi0 = c.getCvgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getType().getCoding().size() < i0+1) { coverage.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCvgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getType().getCoding().size() < i0+1) { coverage.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgTypCdgSys() != null ) {

			String[] arrayi0 = c.getCvgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getType().getCoding().size() < i0+1) { coverage.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCvgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getType().getCoding().size() < i0+1) { coverage.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCvgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(coverage.getType().getCoding().size() < i0+1) { coverage.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {coverage.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cvg_Typ_Txt ********************************************************************************/
		if(c.getCvgTypTxt() != null ) {

			if(c.getCvgTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCvgTypTxt()==null) {} else {
			coverage.getType().setText(c.getCvgTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return coverage;
	}
}
