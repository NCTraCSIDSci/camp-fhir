package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationStatement;
public class MedicationStatementConversion 
{
	public org.hl7.fhir.r4.model.MedicationStatement MedicationStatements(MedicationStatement m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationStatement medicationstatement = new org.hl7.fhir.r4.model.MedicationStatement();

		/******************** id ********************************************************************************/
		medicationstatement.setId(m.getId());

		/******************** MdctnStmnt_BasedOn ********************************************************************************/
		if(m.getMdctnStmntBasedOn() != null ) {

				for( String currListStrSplit : m.getMdctnStmntBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationstatement.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnStmnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getCategory().getCoding().size() < i0+1) { medicationstatement.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getCategory().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getCategory().getCoding().size() < i0+1) { medicationstatement.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getCategory().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getCategory().getCoding().size() < i0+1) { medicationstatement.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getCategory().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getCategory().getCoding().size() < i0+1) { medicationstatement.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getCategory().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntCtgryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getCategory().getCoding().size() < i0+1) { medicationstatement.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getCategory().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnStmntCtgryTxt() != null ) {

			if(m.getMdctnStmntCtgryTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntCtgryTxt()==null) {} else {
			medicationstatement.getCategory().setText(m.getMdctnStmntCtgryTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnStmnt_Cntxt ********************************************************************************/
		if(m.getMdctnStmntCntxt() != null ) {

			if(m.getMdctnStmntCntxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntCntxt()==null) {} else {
			medicationstatement.setContext(new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntCntxt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_DtAsserted ********************************************************************************/
		if(m.getMdctnStmntDtAsserted() != null ) {

			if(m.getMdctnStmntDtAsserted().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntDtAsserted()==null) {} else {
			medicationstatement.setDateAsserted(m.getMdctnStmntDtAsserted().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntDtAsserted()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnStmntDtAsserted().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_DerivedFrom ********************************************************************************/
		if(m.getMdctnStmntDerivedFrom() != null ) {

				for( String currListStrSplit : m.getMdctnStmntDerivedFrom().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationstatement.addDerivedFrom(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { medicationstatement.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnStmntDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { medicationstatement.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnStmntDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { medicationstatement.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnStmntDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { medicationstatement.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnStmntDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { medicationstatement.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnStmntDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgAddtnlInstrctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { medicationstatement.getDosage().get(i0).addAdditionalInstruction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getAdditionalInstruction().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdBooleanTyp() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgAsNdCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getAsNeededCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntySys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtDoseRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntySys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnStmntDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnStmntDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnStmntDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnStmntDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnStmntDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnStmnt_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgDoseAndRtTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getDoseAndRate().size() < i1+1) { medicationstatement.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getDoseAndRate().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerAdministration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerAdministration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerAdministration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerAdministration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerAdmnstnVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerAdministration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerLifetime().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerLifetime().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerLifetime().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerLifetime().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerLifetimeVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerLifetime().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgMxDosePerPrdNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgMthdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Mthd_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgMthdTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_PntInstrctn ********************************************************************************/
		if(m.getMdctnStmntDsgPntInstrctn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).setPatientInstruction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getRoute().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getRoute().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getRoute().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getRoute().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgRouteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getRoute().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Route_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgRouteTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getRoute().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Sqnc ********************************************************************************/
		if(m.getMdctnStmntDsgSqnc() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getSite().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getSite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getSite().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getSite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getSite().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getSite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getSite().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getSite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgSiteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getSite().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getSite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Site_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgSiteTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getSite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				String[] arrayi1 = m.getMdctnStmntDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationstatement.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgEvnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationstatement.getDosage().get(i0).getTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptCnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptCntMx() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptDuration() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptDurationMx() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_DurationUnt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptFrqncy() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptOff() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptPrd() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptPrdMx() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_PrdUnt ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnStmntDsgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = m.getMdctnStmntDsgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getDosage().size() < i0+1) { medicationstatement.addDosage(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationstatement.getDosage().get(i0).getTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_EfctiveDtTimeTyp ********************************************************************************/
		if(m.getMdctnStmntEfctiveDtTimeTyp() != null ) {

			if(m.getMdctnStmntEfctiveDtTimeTyp().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntEfctiveDtTimeTyp()==null) {} else {
			medicationstatement.setEffective(new org.hl7.fhir.r4.model.DateTimeType(m.getMdctnStmntEfctiveDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_EfctivePrd_End ********************************************************************************/
		if(m.getMdctnStmntEfctivePrdEnd() != null ) {

			if(m.getMdctnStmntEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntEfctivePrdEnd()==null) {} else {
			medicationstatement.getEffectivePeriod().setEnd(m.getMdctnStmntEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnStmntEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_EfctivePrd_Strt ********************************************************************************/
		if(m.getMdctnStmntEfctivePrdStrt() != null ) {

			if(m.getMdctnStmntEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntEfctivePrdStrt()==null) {} else {
			medicationstatement.getEffectivePeriod().setStart(m.getMdctnStmntEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnStmntEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_Id_Assigner ********************************************************************************/
		if(m.getMdctnStmntIdAssigner() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Id_Prd_End ********************************************************************************/
		if(m.getMdctnStmntIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnStmntIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Id_Sys ********************************************************************************/
		if(m.getMdctnStmntIdSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				String[] arrayi1 = m.getMdctnStmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationstatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				String[] arrayi1 = m.getMdctnStmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationstatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				String[] arrayi1 = m.getMdctnStmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationstatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				String[] arrayi1 = m.getMdctnStmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationstatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				String[] arrayi1 = m.getMdctnStmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationstatement.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnStmntIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Id_Use ********************************************************************************/
		if(m.getMdctnStmntIdUse() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Id_Vl ********************************************************************************/
		if(m.getMdctnStmntIdVl() != null ) {

			String[] arrayi0 = m.getMdctnStmntIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getIdentifier().size() < i0+1) { medicationstatement.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_InfoSrc ********************************************************************************/
		if(m.getMdctnStmntInfoSrc() != null ) {

			if(m.getMdctnStmntInfoSrc().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntInfoSrc()==null) {} else {
			medicationstatement.setInformationSource(new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntInfoSrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationstatement.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getMedicationCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationstatement.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getMedicationCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationstatement.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getMedicationCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationstatement.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getMedicationCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationstatement.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getMedicationCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnStmntMdctnCdbleCncptTxt() != null ) {

			if(m.getMdctnStmntMdctnCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntMdctnCdbleCncptTxt()==null) {} else {
			medicationstatement.getMedicationCodeableConcept().setText(m.getMdctnStmntMdctnCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnStmnt_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnStmntMdctnRfrnc() != null ) {

			if(m.getMdctnStmntMdctnRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntMdctnRfrnc()==null) {} else {
			medicationstatement.setMedication(new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntMdctnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnStmntNtAthrRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnStmntNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getNote().size() < i0+1) { medicationstatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnStmntNtAthrStrgTyp() != null ) {

			String[] arrayi0 = m.getMdctnStmntNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getNote().size() < i0+1) { medicationstatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_Nt_Txt ********************************************************************************/
		if(m.getMdctnStmntNtTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getNote().size() < i0+1) { medicationstatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Nt_Time ********************************************************************************/
		if(m.getMdctnStmntNtTime() != null ) {

			String[] arrayi0 = m.getMdctnStmntNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getNote().size() < i0+1) { medicationstatement.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnStmnt_PartOf ********************************************************************************/
		if(m.getMdctnStmntPartOf() != null ) {

				for( String currListStrSplit : m.getMdctnStmntPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationstatement.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnStmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getReasonCode().size() < i0+1) { medicationstatement.addReasonCode(); }
				String[] arrayi1 = m.getMdctnStmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationstatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getReasonCode().size() < i0+1) { medicationstatement.addReasonCode(); }
				String[] arrayi1 = m.getMdctnStmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationstatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getReasonCode().size() < i0+1) { medicationstatement.addReasonCode(); }
				String[] arrayi1 = m.getMdctnStmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationstatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getReasonCode().size() < i0+1) { medicationstatement.addReasonCode(); }
				String[] arrayi1 = m.getMdctnStmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationstatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getReasonCode().size() < i0+1) { medicationstatement.addReasonCode(); }
				String[] arrayi1 = m.getMdctnStmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationstatement.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_RsnCd_Txt ********************************************************************************/
		if(m.getMdctnStmntRsnCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getReasonCode().size() < i0+1) { medicationstatement.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_RsnRfrnc ********************************************************************************/
		if(m.getMdctnStmntRsnRfrnc() != null ) {

				for( String currListStrSplit : m.getMdctnStmntRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationstatement.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnStmnt_Sts ********************************************************************************/
		if(m.getMdctnStmntSts() != null ) {

			if(m.getMdctnStmntSts().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntSts()==null) {} else {
			medicationstatement.setStatus(new org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatusEnumFactory().fromCode(m.getMdctnStmntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnStmnt_StsRsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnStmntStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getStatusReason().size() < i0+1) { medicationstatement.addStatusReason(); }
				String[] arrayi1 = m.getMdctnStmntStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationstatement.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getStatusReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_StsRsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnStmntStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getStatusReason().size() < i0+1) { medicationstatement.addStatusReason(); }
				String[] arrayi1 = m.getMdctnStmntStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationstatement.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getStatusReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_StsRsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnStmntStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getStatusReason().size() < i0+1) { medicationstatement.addStatusReason(); }
				String[] arrayi1 = m.getMdctnStmntStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationstatement.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getStatusReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnStmntStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getStatusReason().size() < i0+1) { medicationstatement.addStatusReason(); }
				String[] arrayi1 = m.getMdctnStmntStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationstatement.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getStatusReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnStmnt_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnStmntStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnStmntStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getStatusReason().size() < i0+1) { medicationstatement.addStatusReason(); }
				String[] arrayi1 = m.getMdctnStmntStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationstatement.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationstatement.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationstatement.getStatusReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnStmnt_StsRsn_Txt ********************************************************************************/
		if(m.getMdctnStmntStsRsnTxt() != null ) {

			String[] arrayi0 = m.getMdctnStmntStsRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationstatement.getStatusReason().size() < i0+1) { medicationstatement.addStatusReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationstatement.getStatusReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnStmnt_Sbjct ********************************************************************************/
		if(m.getMdctnStmntSbjct() != null ) {

			if(m.getMdctnStmntSbjct().replace("[","").replace("]","").equals("NULL") | m.getMdctnStmntSbjct()==null) {} else {
			medicationstatement.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMdctnStmntSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return medicationstatement;
	}
}
