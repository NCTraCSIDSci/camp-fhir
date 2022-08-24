package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MolecularSequence;
public class MolecularSequenceConversion 
{
	public org.hl7.fhir.r4.model.MolecularSequence MolecularSequences(MolecularSequence m) throws ParseException
	{
		org.hl7.fhir.r4.model.MolecularSequence molecularsequence = new org.hl7.fhir.r4.model.MolecularSequence();

		/******************** id ********************************************************************************/
		molecularsequence.setId(m.getId());

		/******************** MoleclrSqnc_CoordinateSys ********************************************************************************/
		if(m.getMoleclrSqncCoordinateSys() != null ) {

			if(m.getMoleclrSqncCoordinateSys().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncCoordinateSys()==null) {} else {
			molecularsequence.setCoordinateSystem(Integer.parseInt(m.getMoleclrSqncCoordinateSys().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Dvc ********************************************************************************/
		if(m.getMoleclrSqncDvc() != null ) {

			if(m.getMoleclrSqncDvc().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncDvc()==null) {} else {
			molecularsequence.setDevice(new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncDvc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Id_Assigner ********************************************************************************/
		if(m.getMoleclrSqncIdAssigner() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Id_Prd_End ********************************************************************************/
		if(m.getMoleclrSqncIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Id_Prd_Strt ********************************************************************************/
		if(m.getMoleclrSqncIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Id_Sys ********************************************************************************/
		if(m.getMoleclrSqncIdSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				String[] arrayi1 = m.getMoleclrSqncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { molecularsequence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				String[] arrayi1 = m.getMoleclrSqncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { molecularsequence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				String[] arrayi1 = m.getMoleclrSqncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { molecularsequence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				String[] arrayi1 = m.getMoleclrSqncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { molecularsequence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				String[] arrayi1 = m.getMoleclrSqncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { molecularsequence.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Id_Typ_Txt ********************************************************************************/
		if(m.getMoleclrSqncIdTypTxt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Id_Use ********************************************************************************/
		if(m.getMoleclrSqncIdUse() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Id_Vl ********************************************************************************/
		if(m.getMoleclrSqncIdVl() != null ) {

			String[] arrayi0 = m.getMoleclrSqncIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getIdentifier().size() < i0+1) { molecularsequence.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_ObservedSeq ********************************************************************************/
		if(m.getMoleclrSqncObservedSeq() != null ) {

			if(m.getMoleclrSqncObservedSeq().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncObservedSeq()==null) {} else {
			molecularsequence.setObservedSeq(m.getMoleclrSqncObservedSeq().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_Pnt ********************************************************************************/
		if(m.getMoleclrSqncPnt() != null ) {

			if(m.getMoleclrSqncPnt().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncPnt()==null) {} else {
			molecularsequence.setPatient(new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Prfrmr ********************************************************************************/
		if(m.getMoleclrSqncPrfrmr() != null ) {

			if(m.getMoleclrSqncPrfrmr().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncPrfrmr()==null) {} else {
			molecularsequence.setPerformer(new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncPrfrmr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Pointer ********************************************************************************/
		if(m.getMoleclrSqncPointer() != null ) {

				for( String currListStrSplit : m.getMoleclrSqncPointer().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			molecularsequence.addPointer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MoleclrSqnc_Quality_End ********************************************************************************/
		if(m.getMoleclrSqncQualityEnd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setEnd(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Quality_Fscore ********************************************************************************/
		if(m.getMoleclrSqncQualityFscore() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityFscore().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setFScore((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_GtFp ********************************************************************************/
		if(m.getMoleclrSqncQualityGtFp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityGtFp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setGtFP((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getMethod().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgDsply() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getMethod().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getMethod().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getMethod().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getMethod().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Mthd_Txt ********************************************************************************/
		if(m.getMoleclrSqncQualityMthdTxt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Quality_Precision ********************************************************************************/
		if(m.getMoleclrSqncQualityPrecision() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityPrecision().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setPrecision((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_QueryFp ********************************************************************************/
		if(m.getMoleclrSqncQualityQueryFp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityQueryFp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setQueryFP((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_QueryTp ********************************************************************************/
		if(m.getMoleclrSqncQualityQueryTp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityQueryTp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setQueryTP((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_Recall ********************************************************************************/
		if(m.getMoleclrSqncQualityRecall() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRecall().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setRecall((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_Fmsr ********************************************************************************/
		if(m.getMoleclrSqncQualityRocFmsr() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocFmsr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addFMeasure((new java.math.BigDecimal((currListStrSplit.replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_NumFn ********************************************************************************/
		if(m.getMoleclrSqncQualityRocNumFn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocNumFn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addNumFN(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_NumFp ********************************************************************************/
		if(m.getMoleclrSqncQualityRocNumFp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocNumFp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addNumFP(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_NumTp ********************************************************************************/
		if(m.getMoleclrSqncQualityRocNumTp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocNumTp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addNumTP(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_Precision ********************************************************************************/
		if(m.getMoleclrSqncQualityRocPrecision() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocPrecision().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addPrecision((new java.math.BigDecimal((currListStrSplit.replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_Score ********************************************************************************/
		if(m.getMoleclrSqncQualityRocScore() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocScore().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addScore(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Roc_Sensitivity ********************************************************************************/
		if(m.getMoleclrSqncQualityRocSensitivity() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityRocSensitivity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {molecularsequence.getQuality().get(i0).getRoc().addSensitivity((new java.math.BigDecimal((currListStrSplit.replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_Score_Cd ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityScoreCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getScore().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Quality_Score_Cmprtr ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreCmprtr() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityScoreCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getScore().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Quality_Score_Sys ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityScoreSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getScore().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Quality_Score_Unt ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreUnt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityScoreUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getScore().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Quality_Score_Vl ********************************************************************************/
		if(m.getMoleclrSqncQualityScoreVl() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityScoreVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getScore().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStandardSqncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityStandardSqncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getStandardSequence().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgDsply() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStandardSqncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityStandardSqncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getStandardSequence().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStandardSqncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityStandardSqncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getStandardSequence().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStandardSqncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityStandardSqncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getStandardSequence().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncCdgVrsn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStandardSqncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				String[] arrayi1 = m.getMoleclrSqncQualityStandardSqncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().size() < i1+1) { molecularsequence.getQuality().get(i0).getStandardSequence().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getQuality().get(i0).getStandardSequence().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_Quality_StandardSqnc_Txt ********************************************************************************/
		if(m.getMoleclrSqncQualityStandardSqncTxt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStandardSqncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).getStandardSequence().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Quality_Strt ********************************************************************************/
		if(m.getMoleclrSqncQualityStrt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setStart(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Quality_TruthFn ********************************************************************************/
		if(m.getMoleclrSqncQualityTruthFn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityTruthFn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setTruthFN((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_TruthTp ********************************************************************************/
		if(m.getMoleclrSqncQualityTruthTp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityTruthTp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setTruthTP((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MoleclrSqnc_Quality_Typ ********************************************************************************/
		if(m.getMoleclrSqncQualityTyp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncQualityTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getQuality().size() < i0+1) { molecularsequence.addQuality(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getQuality().get(i0).setType(new org.hl7.fhir.r4.model.MolecularSequence.QualityTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Qnty_Cd ********************************************************************************/
		if(m.getMoleclrSqncQntyCd() != null ) {

			if(m.getMoleclrSqncQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncQntyCd()==null) {} else {
			molecularsequence.getQuantity().setCode(m.getMoleclrSqncQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_Qnty_Cmprtr ********************************************************************************/
		if(m.getMoleclrSqncQntyCmprtr() != null ) {

			if(m.getMoleclrSqncQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncQntyCmprtr()==null) {} else {
			molecularsequence.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMoleclrSqncQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Qnty_Sys ********************************************************************************/
		if(m.getMoleclrSqncQntySys() != null ) {

			if(m.getMoleclrSqncQntySys().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncQntySys()==null) {} else {
			molecularsequence.getQuantity().setSystem(m.getMoleclrSqncQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_Qnty_Unt ********************************************************************************/
		if(m.getMoleclrSqncQntyUnt() != null ) {

			if(m.getMoleclrSqncQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncQntyUnt()==null) {} else {
			molecularsequence.getQuantity().setUnit(m.getMoleclrSqncQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_Qnty_Vl ********************************************************************************/
		if(m.getMoleclrSqncQntyVl() != null ) {

			if(m.getMoleclrSqncQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncQntyVl()==null) {} else {
			molecularsequence.getQuantity().setValue((new java.math.BigDecimal((m.getMoleclrSqncQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MoleclrSqnc_ReadCvg ********************************************************************************/
		if(m.getMoleclrSqncReadCvg() != null ) {

			if(m.getMoleclrSqncReadCvg().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncReadCvg()==null) {} else {
			molecularsequence.setReadCoverage(Integer.parseInt(m.getMoleclrSqncReadCvg().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqChromosomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getChromosome().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getChromosome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getChromosome().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgDsply() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqChromosomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getChromosome().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getChromosome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getChromosome().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqChromosomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getChromosome().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getChromosome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getChromosome().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqChromosomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getChromosome().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getChromosome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getChromosome().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeCdgVrsn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqChromosomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getChromosome().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getChromosome().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getChromosome().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_Chromosome_Txt ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqChromosomeTxt() != null ) {

			if(m.getMoleclrSqncRfrncSeqChromosomeTxt().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqChromosomeTxt()==null) {} else {
			molecularsequence.getReferenceSeq().getChromosome().setText(m.getMoleclrSqncRfrncSeqChromosomeTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_GenomeBuild ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqGenomeBuild() != null ) {

			if(m.getMoleclrSqncRfrncSeqGenomeBuild().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqGenomeBuild()==null) {} else {
			molecularsequence.getReferenceSeq().setGenomeBuild(m.getMoleclrSqncRfrncSeqGenomeBuild().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_Orientation ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqOrientation() != null ) {

			if(m.getMoleclrSqncRfrncSeqOrientation().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqOrientation()==null) {} else {
			molecularsequence.getReferenceSeq().setOrientation(new org.hl7.fhir.r4.model.MolecularSequence.OrientationTypeEnumFactory().fromCode(m.getMoleclrSqncRfrncSeqOrientation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getReferenceSeqId().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getReferenceSeqId().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getReferenceSeqId().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getReferenceSeqId().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRfrncSeqRfrncSeqIdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().size() < i0+1) { molecularsequence.getReferenceSeq().getReferenceSeqId().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getReferenceSeq().getReferenceSeqId().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqId_Txt ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqIdTxt() != null ) {

			if(m.getMoleclrSqncRfrncSeqRfrncSeqIdTxt().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqRfrncSeqIdTxt()==null) {} else {
			molecularsequence.getReferenceSeq().getReferenceSeqId().setText(m.getMoleclrSqncRfrncSeqRfrncSeqIdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqPointer ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqPointer() != null ) {

			if(m.getMoleclrSqncRfrncSeqRfrncSeqPointer().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqRfrncSeqPointer()==null) {} else {
			molecularsequence.getReferenceSeq().setReferenceSeqPointer(new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncRfrncSeqRfrncSeqPointer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_RfrncSeqStrg ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqRfrncSeqStrg() != null ) {

			if(m.getMoleclrSqncRfrncSeqRfrncSeqStrg().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqRfrncSeqStrg()==null) {} else {
			molecularsequence.getReferenceSeq().setReferenceSeqString(m.getMoleclrSqncRfrncSeqRfrncSeqStrg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_Strand ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqStrand() != null ) {

			if(m.getMoleclrSqncRfrncSeqStrand().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqStrand()==null) {} else {
			molecularsequence.getReferenceSeq().setStrand(new org.hl7.fhir.r4.model.MolecularSequence.StrandTypeEnumFactory().fromCode(m.getMoleclrSqncRfrncSeqStrand().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_WindowEnd ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqWindowEnd() != null ) {

			if(m.getMoleclrSqncRfrncSeqWindowEnd().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqWindowEnd()==null) {} else {
			molecularsequence.getReferenceSeq().setWindowEnd(Integer.parseInt(m.getMoleclrSqncRfrncSeqWindowEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_RfrncSeq_WindowStrt ********************************************************************************/
		if(m.getMoleclrSqncRfrncSeqWindowStrt() != null ) {

			if(m.getMoleclrSqncRfrncSeqWindowStrt().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncRfrncSeqWindowStrt()==null) {} else {
			molecularsequence.getReferenceSeq().setWindowStart(Integer.parseInt(m.getMoleclrSqncRfrncSeqWindowStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Repository_DatasetId ********************************************************************************/
		if(m.getMoleclrSqncRepositoryDataId() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRepositoryDataId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getRepository().size() < i0+1) { molecularsequence.addRepository(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getRepository().get(i0).setDatasetId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Repository_Nm ********************************************************************************/
		if(m.getMoleclrSqncRepositoryNm() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRepositoryNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getRepository().size() < i0+1) { molecularsequence.addRepository(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getRepository().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Repository_ReadsetId ********************************************************************************/
		if(m.getMoleclrSqncRepositoryReadId() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRepositoryReadId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getRepository().size() < i0+1) { molecularsequence.addRepository(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getRepository().get(i0).setReadsetId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Repository_Typ ********************************************************************************/
		if(m.getMoleclrSqncRepositoryTyp() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRepositoryTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getRepository().size() < i0+1) { molecularsequence.addRepository(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getRepository().get(i0).setType(new org.hl7.fhir.r4.model.MolecularSequence.RepositoryTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Repository_Url ********************************************************************************/
		if(m.getMoleclrSqncRepositoryUrl() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRepositoryUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getRepository().size() < i0+1) { molecularsequence.addRepository(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getRepository().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Repository_VariantsetId ********************************************************************************/
		if(m.getMoleclrSqncRepositoryVariantId() != null ) {

			String[] arrayi0 = m.getMoleclrSqncRepositoryVariantId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getRepository().size() < i0+1) { molecularsequence.addRepository(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getRepository().get(i0).setVariantsetId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Spcmn ********************************************************************************/
		if(m.getMoleclrSqncSpcmn() != null ) {

			if(m.getMoleclrSqncSpcmn().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncSpcmn()==null) {} else {
			molecularsequence.setSpecimen(new org.hl7.fhir.r4.model.Reference(m.getMoleclrSqncSpcmn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_StrctrVariant_Exact ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantExact() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantExact().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).setExact(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_Inner_End ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantInnerEnd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantInnerEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).getInner().setEnd(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_Inner_Strt ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantInnerStrt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantInnerStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).getInner().setStart(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_Length ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantLength() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantLength().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).setLength(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_Outer_End ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantOuterEnd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantOuterEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).getOuter().setEnd(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_Outer_Strt ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantOuterStrt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantOuterStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).getOuter().setStart(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Cd ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgCd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantVariantTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				String[] arrayi1 = m.getMoleclrSqncStrctrVariantVariantTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().size() < i1+1) { molecularsequence.getStructureVariant().get(i0).getVariantType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantVariantTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				String[] arrayi1 = m.getMoleclrSqncStrctrVariantVariantTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().size() < i1+1) { molecularsequence.getStructureVariant().get(i0).getVariantType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Sys ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgSys() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantVariantTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				String[] arrayi1 = m.getMoleclrSqncStrctrVariantVariantTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().size() < i1+1) { molecularsequence.getStructureVariant().get(i0).getVariantType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantVariantTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				String[] arrayi1 = m.getMoleclrSqncStrctrVariantVariantTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().size() < i1+1) { molecularsequence.getStructureVariant().get(i0).getVariantType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantVariantTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				String[] arrayi1 = m.getMoleclrSqncStrctrVariantVariantTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().size() < i1+1) { molecularsequence.getStructureVariant().get(i0).getVariantType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {molecularsequence.getStructureVariant().get(i0).getVariantType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MoleclrSqnc_StrctrVariant_VariantTyp_Txt ********************************************************************************/
		if(m.getMoleclrSqncStrctrVariantVariantTypTxt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncStrctrVariantVariantTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getStructureVariant().size() < i0+1) { molecularsequence.addStructureVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getStructureVariant().get(i0).getVariantType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Typ ********************************************************************************/
		if(m.getMoleclrSqncTyp() != null ) {

			if(m.getMoleclrSqncTyp().replace("[","").replace("]","").equals("NULL") | m.getMoleclrSqncTyp()==null) {} else {
			molecularsequence.setType(new org.hl7.fhir.r4.model.MolecularSequence.SequenceTypeEnumFactory().fromCode(m.getMoleclrSqncTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MoleclrSqnc_Variant_Cigar ********************************************************************************/
		if(m.getMoleclrSqncVariantCigar() != null ) {

			String[] arrayi0 = m.getMoleclrSqncVariantCigar().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getVariant().size() < i0+1) { molecularsequence.addVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getVariant().get(i0).setCigar(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Variant_End ********************************************************************************/
		if(m.getMoleclrSqncVariantEnd() != null ) {

			String[] arrayi0 = m.getMoleclrSqncVariantEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getVariant().size() < i0+1) { molecularsequence.addVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getVariant().get(i0).setEnd(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Variant_ObservedAllele ********************************************************************************/
		if(m.getMoleclrSqncVariantObservedAllele() != null ) {

			String[] arrayi0 = m.getMoleclrSqncVariantObservedAllele().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getVariant().size() < i0+1) { molecularsequence.addVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getVariant().get(i0).setObservedAllele(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Variant_RfrncAllele ********************************************************************************/
		if(m.getMoleclrSqncVariantRfrncAllele() != null ) {

			String[] arrayi0 = m.getMoleclrSqncVariantRfrncAllele().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getVariant().size() < i0+1) { molecularsequence.addVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getVariant().get(i0).setReferenceAllele(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MoleclrSqnc_Variant_Strt ********************************************************************************/
		if(m.getMoleclrSqncVariantStrt() != null ) {

			String[] arrayi0 = m.getMoleclrSqncVariantStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getVariant().size() < i0+1) { molecularsequence.addVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getVariant().get(i0).setStart(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MoleclrSqnc_Variant_VariantPointer ********************************************************************************/
		if(m.getMoleclrSqncVariantVariantPointer() != null ) {

			String[] arrayi0 = m.getMoleclrSqncVariantVariantPointer().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(molecularsequence.getVariant().size() < i0+1) { molecularsequence.addVariant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {molecularsequence.getVariant().get(i0).setVariantPointer(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return molecularsequence;
	}
}
