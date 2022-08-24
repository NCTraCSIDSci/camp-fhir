package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPackaged;
public class MedicinalProductPackagedConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductPackaged MedicinalProductPackageds(MedicinalProductPackaged m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductPackaged medicinalproductpackaged = new org.hl7.fhir.r4.model.MedicinalProductPackaged();

		/******************** id ********************************************************************************/
		medicinalproductpackaged.setId(m.getId());

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Use ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdImmediatePackagingVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdImmediatePackagingVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getImmediatePackaging().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().size() < i1+1) { medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Use ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedBatchIdOuterPackagingVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedBatchIdOuterPackagingVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getBatchIdentifier().size() < i0+1) { medicinalproductpackaged.addBatchIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getBatchIdentifier().get(i0).getOuterPackaging().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_Dscrptn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedDscrptn() != null ) {

			if(m.getMdcnlPrdctPckgedDscrptn().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctPckgedDscrptn()==null) {} else {
			medicinalproductpackaged.setDescription(m.getMdcnlPrdctPckgedDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctPckged_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getIdentifier().size() < i0+1) { medicinalproductpackaged.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproductpackaged.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getLegalStatusOfSupply().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproductpackaged.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getLegalStatusOfSupply().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproductpackaged.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getLegalStatusOfSupply().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproductpackaged.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getLegalStatusOfSupply().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproductpackaged.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getLegalStatusOfSupply().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedLegalStsOfSpplyTxt() != null ) {

			if(m.getMdcnlPrdctPckgedLegalStsOfSpplyTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctPckgedLegalStsOfSpplyTxt()==null) {} else {
			medicinalproductpackaged.getLegalStatusOfSupply().setText(m.getMdcnlPrdctPckgedLegalStsOfSpplyTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctPckged_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctPckgedManufacturer() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctPckgedManufacturer().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductpackaged.addManufacturer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctPckged_MarketingAthztn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingAthztn() != null ) {

			if(m.getMdcnlPrdctPckgedMarketingAthztn().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctPckgedMarketingAthztn()==null) {} else {
			medicinalproductpackaged.setMarketingAuthorization(new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedMarketingAthztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getCountry().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsDtRngEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsDtRngEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getDateRange().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsDtRngStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsDtRngStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getDateRange().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getJurisdiction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_RestoreDt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsRestoreDt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsRestoreDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).setRestoreDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedMarketingStsStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMarketingStsStsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedMarketingStsStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getMarketingStatus().size() < i0+1) { medicinalproductpackaged.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getMarketingStatus().get(i0).getStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addAlternateMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addAlternateMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addAlternateMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addAlternateMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addAlternateMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmAlternateMtrlTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmAlternateMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addAlternateMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getAlternateMaterial().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Dvc ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmDvc() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmDvc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).addDevice(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_MnfctredItm ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMnfctredItm() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMnfctredItm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).addManufacturedItem(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmManufacturer() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmManufacturer().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).addManufacturer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addMaterial(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmMtrlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmMtrlTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmMtrlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getMaterial().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addMaterial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getMaterial().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addOtherCharacteristics(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addOtherCharacteristics(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addOtherCharacteristics(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addOtherCharacteristics(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addOtherCharacteristics(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addOtherCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getOtherCharacteristics().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Color ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsColor() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsColor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addColor(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getDepth().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getDepth().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getDepth().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getDepth().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getDepth().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getExternalDiameter().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getExternalDiameter().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getExternalDiameter().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getExternalDiameter().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getExternalDiameter().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getHeight().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getHeight().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getHeight().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getHeight().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getHeight().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getImage().get(i1).setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImprint() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImprint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().addImprint(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getNominalVolume().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getNominalVolume().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getNominalVolume().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getNominalVolume().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getNominalVolume().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getScoring().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Shape ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().setShape(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWeight().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWeight().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWeight().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWeight().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWeight().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWidth().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWidth().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWidth().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWidth().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getPhysicalCharacteristics().getWidth().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntySys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmQntyVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getIdentifier().setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getPeriod().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getPeriod().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getPeriod().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getPeriod().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getPeriod().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).addSpecialPrecautionsForStorage(); }
						String[] arrayi3 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().size() < i3+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).addSpecialPrecautionsForStorage(); }
						String[] arrayi3 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().size() < i3+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).addSpecialPrecautionsForStorage(); }
						String[] arrayi3 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().size() < i3+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).addSpecialPrecautionsForStorage(); }
						String[] arrayi3 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().size() < i3+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).addSpecialPrecautionsForStorage(); }
						String[] arrayi3 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().size() < i3+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).addSpecialPrecautionsForStorage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getSpecialPrecautionsForStorage().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					String[] arrayi2 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().size() < i2+1) { medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).addShelfLifeStorage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getShelfLifeStorage().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				String[] arrayi1 = m.getMdcnlPrdctPckgedPckgItmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpackaged.getPackageItem().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPckgedPckgItmTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPckgedPckgItmTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpackaged.getPackageItem().size() < i0+1) { medicinalproductpackaged.addPackageItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpackaged.getPackageItem().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPckged_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctPckgedSbjct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctPckgedSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductpackaged.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return medicinalproductpackaged;
	}
}
