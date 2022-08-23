package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationDispense;
public class MedicationDispenseConversion 
{
	public org.hl7.fhir.r4.model.MedicationDispense MedicationDispenses(MedicationDispense m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationDispense medicationdispense = new org.hl7.fhir.r4.model.MedicationDispense();

		/******************** id ********************************************************************************/
		medicationdispense.setId(m.getId());

		/******************** MdctnDispns_AthrizingPrescription ********************************************************************************/
		if(m.getMdctnDispnsAthrizingPrescription() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsAthrizingPrescription().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.addAuthorizingPrescription(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getCategory().getCoding().size() < i0+1) { medicationdispense.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getCategory().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getCategory().getCoding().size() < i0+1) { medicationdispense.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getCategory().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getCategory().getCoding().size() < i0+1) { medicationdispense.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getCategory().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getCategory().getCoding().size() < i0+1) { medicationdispense.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getCategory().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsCtgryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getCategory().getCoding().size() < i0+1) { medicationdispense.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getCategory().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnDispnsCtgryTxt() != null ) {

			if(m.getMdctnDispnsCtgryTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsCtgryTxt()==null) {} else {
			medicationdispense.getCategory().setText(m.getMdctnDispnsCtgryTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_Cntxt ********************************************************************************/
		if(m.getMdctnDispnsCntxt() != null ) {

			if(m.getMdctnDispnsCntxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsCntxt()==null) {} else {
			medicationdispense.setContext(new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsCntxt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_DaysSpply_Cd ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyCd() != null ) {

			if(m.getMdctnDispnsDaysSpplyCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsDaysSpplyCd()==null) {} else {
			medicationdispense.getDaysSupply().setCode(m.getMdctnDispnsDaysSpplyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_DaysSpply_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyCmprtr() != null ) {

			if(m.getMdctnDispnsDaysSpplyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsDaysSpplyCmprtr()==null) {} else {
			medicationdispense.getDaysSupply().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnDispnsDaysSpplyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_DaysSpply_Sys ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplySys() != null ) {

			if(m.getMdctnDispnsDaysSpplySys().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsDaysSpplySys()==null) {} else {
			medicationdispense.getDaysSupply().setSystem(m.getMdctnDispnsDaysSpplySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_DaysSpply_Unt ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyUnt() != null ) {

			if(m.getMdctnDispnsDaysSpplyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsDaysSpplyUnt()==null) {} else {
			medicationdispense.getDaysSupply().setUnit(m.getMdctnDispnsDaysSpplyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_DaysSpply_Vl ********************************************************************************/
		if(m.getMdctnDispnsDaysSpplyVl() != null ) {

			if(m.getMdctnDispnsDaysSpplyVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsDaysSpplyVl()==null) {} else {
			medicationdispense.getDaysSupply().setValue((new java.math.BigDecimal((m.getMdctnDispnsDaysSpplyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnDispns_Destination ********************************************************************************/
		if(m.getMdctnDispnsDestination() != null ) {

			if(m.getMdctnDispnsDestination().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsDestination()==null) {} else {
			medicationdispense.setDestination(new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsDestination().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_DetectedIssue ********************************************************************************/
		if(m.getMdctnDispnsDetectedIssue() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsDetectedIssue().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.addDetectedIssue(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAddtnlInstrctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdBooleanTyp() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getAsNeededCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntySys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnDoseAndRtTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerAdministration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerAdministration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerAdministration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerAdministration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerAdministration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerLifetime().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerLifetime().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerLifetime().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerLifetime().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerLifetime().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnMthdTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnPntInstrctn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).setPatientInstruction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Route_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnRouteTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getRoute().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Sqnc ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSqnc() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Site_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnSiteTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getSite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnDispnsDsgInstrctnTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgEvnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptCnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptCntMx() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptDuration() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptDurationMx() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_DurationUnt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptFrqncy() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptOff() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptPrd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptPrdMx() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_PrdUnt ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptPrdUnt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_DsgInstrctn_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnDispnsDsgInstrctnTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = m.getMdctnDispnsDsgInstrctnTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getDosageInstruction().size() < i0+1) { medicationdispense.addDosageInstruction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationdispense.getDosageInstruction().get(i0).getTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_EvntHis ********************************************************************************/
		if(m.getMdctnDispnsEvntHis() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsEvntHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.addEventHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_Id_Assigner ********************************************************************************/
		if(m.getMdctnDispnsIdAssigner() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Id_Prd_End ********************************************************************************/
		if(m.getMdctnDispnsIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnDispnsIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Id_Sys ********************************************************************************/
		if(m.getMdctnDispnsIdSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				String[] arrayi1 = m.getMdctnDispnsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationdispense.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				String[] arrayi1 = m.getMdctnDispnsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationdispense.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				String[] arrayi1 = m.getMdctnDispnsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationdispense.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				String[] arrayi1 = m.getMdctnDispnsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationdispense.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				String[] arrayi1 = m.getMdctnDispnsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationdispense.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Id_Use ********************************************************************************/
		if(m.getMdctnDispnsIdUse() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Id_Vl ********************************************************************************/
		if(m.getMdctnDispnsIdVl() != null ) {

			String[] arrayi0 = m.getMdctnDispnsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getIdentifier().size() < i0+1) { medicationdispense.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Lctn ********************************************************************************/
		if(m.getMdctnDispnsLctn() != null ) {

			if(m.getMdctnDispnsLctn().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsLctn()==null) {} else {
			medicationdispense.setLocation(new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getMedicationCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getMedicationCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getMedicationCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getMedicationCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getMedicationCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnDispnsMdctnCdbleCncptTxt() != null ) {

			if(m.getMdctnDispnsMdctnCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsMdctnCdbleCncptTxt()==null) {} else {
			medicationdispense.getMedicationCodeableConcept().setText(m.getMdctnDispnsMdctnCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnDispnsMdctnRfrnc() != null ) {

			if(m.getMdctnDispnsMdctnRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsMdctnRfrnc()==null) {} else {
			medicationdispense.setMedication(new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsMdctnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnDispnsNtAthrRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnDispnsNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getNote().size() < i0+1) { medicationdispense.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnDispnsNtAthrStrgTyp() != null ) {

			String[] arrayi0 = m.getMdctnDispnsNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getNote().size() < i0+1) { medicationdispense.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Nt_Txt ********************************************************************************/
		if(m.getMdctnDispnsNtTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getNote().size() < i0+1) { medicationdispense.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Nt_Time ********************************************************************************/
		if(m.getMdctnDispnsNtTime() != null ) {

			String[] arrayi0 = m.getMdctnDispnsNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getNote().size() < i0+1) { medicationdispense.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_PartOf ********************************************************************************/
		if(m.getMdctnDispnsPartOf() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_Prfrmr_Actor ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrActor() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getPerformer().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				String[] arrayi1 = m.getMdctnDispnsPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationdispense.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getPerformer().get(i0).getFunction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				String[] arrayi1 = m.getMdctnDispnsPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationdispense.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getPerformer().get(i0).getFunction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				String[] arrayi1 = m.getMdctnDispnsPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationdispense.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getPerformer().get(i0).getFunction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				String[] arrayi1 = m.getMdctnDispnsPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationdispense.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getPerformer().get(i0).getFunction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				String[] arrayi1 = m.getMdctnDispnsPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationdispense.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getPerformer().get(i0).getFunction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Prfrmr_Function_Txt ********************************************************************************/
		if(m.getMdctnDispnsPrfrmrFunctionTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getPerformer().size() < i0+1) { medicationdispense.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getPerformer().get(i0).getFunction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Qnty_Cd ********************************************************************************/
		if(m.getMdctnDispnsQntyCd() != null ) {

			if(m.getMdctnDispnsQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsQntyCd()==null) {} else {
			medicationdispense.getQuantity().setCode(m.getMdctnDispnsQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdctnDispnsQntyCmprtr() != null ) {

			if(m.getMdctnDispnsQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsQntyCmprtr()==null) {} else {
			medicationdispense.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnDispnsQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_Qnty_Sys ********************************************************************************/
		if(m.getMdctnDispnsQntySys() != null ) {

			if(m.getMdctnDispnsQntySys().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsQntySys()==null) {} else {
			medicationdispense.getQuantity().setSystem(m.getMdctnDispnsQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_Qnty_Unt ********************************************************************************/
		if(m.getMdctnDispnsQntyUnt() != null ) {

			if(m.getMdctnDispnsQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsQntyUnt()==null) {} else {
			medicationdispense.getQuantity().setUnit(m.getMdctnDispnsQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_Qnty_Vl ********************************************************************************/
		if(m.getMdctnDispnsQntyVl() != null ) {

			if(m.getMdctnDispnsQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsQntyVl()==null) {} else {
			medicationdispense.getQuantity().setValue((new java.math.BigDecimal((m.getMdctnDispnsQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnDispns_Receiver ********************************************************************************/
		if(m.getMdctnDispnsReceiver() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsReceiver().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.addReceiver(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_Sts ********************************************************************************/
		if(m.getMdctnDispnsSts() != null ) {

			if(m.getMdctnDispnsSts().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsSts()==null) {} else {
			medicationdispense.setStatus(new org.hl7.fhir.r4.model.MedicationDispense.MedicationDispenseStatusEnumFactory().fromCode(m.getMdctnDispnsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsStsRsnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getStatusReasonCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getStatusReasonCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getStatusReasonCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsStsRsnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getStatusReasonCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getStatusReasonCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getStatusReasonCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsStsRsnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getStatusReasonCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getStatusReasonCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getStatusReasonCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsStsRsnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getStatusReasonCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getStatusReasonCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getStatusReasonCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsStsRsnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getStatusReasonCodeableConcept().getCoding().size() < i0+1) { medicationdispense.getStatusReasonCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getStatusReasonCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_StsRsnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnDispnsStsRsnCdbleCncptTxt() != null ) {

			if(m.getMdctnDispnsStsRsnCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsStsRsnCdbleCncptTxt()==null) {} else {
			medicationdispense.getStatusReasonCodeableConcept().setText(m.getMdctnDispnsStsRsnCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_StsRsnRfrnc ********************************************************************************/
		if(m.getMdctnDispnsStsRsnRfrnc() != null ) {

			if(m.getMdctnDispnsStsRsnRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsStsRsnRfrnc()==null) {} else {
			medicationdispense.setStatusReason(new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsStsRsnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_Sbjct ********************************************************************************/
		if(m.getMdctnDispnsSbjct() != null ) {

			if(m.getMdctnDispnsSbjct().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsSbjct()==null) {} else {
			medicationdispense.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMdctnDispnsSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getReason().size() < i0+1) { medicationdispense.getSubstitution().addReason(); }
				String[] arrayi1 = m.getMdctnDispnsSubstitutionRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getSubstitution().getReason().get(i0).getCoding().size() < i1+1) { medicationdispense.getSubstitution().getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getSubstitution().getReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getReason().size() < i0+1) { medicationdispense.getSubstitution().addReason(); }
				String[] arrayi1 = m.getMdctnDispnsSubstitutionRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getSubstitution().getReason().get(i0).getCoding().size() < i1+1) { medicationdispense.getSubstitution().getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getSubstitution().getReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getReason().size() < i0+1) { medicationdispense.getSubstitution().addReason(); }
				String[] arrayi1 = m.getMdctnDispnsSubstitutionRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getSubstitution().getReason().get(i0).getCoding().size() < i1+1) { medicationdispense.getSubstitution().getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getSubstitution().getReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getReason().size() < i0+1) { medicationdispense.getSubstitution().addReason(); }
				String[] arrayi1 = m.getMdctnDispnsSubstitutionRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getSubstitution().getReason().get(i0).getCoding().size() < i1+1) { medicationdispense.getSubstitution().getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getSubstitution().getReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnDispns_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getReason().size() < i0+1) { medicationdispense.getSubstitution().addReason(); }
				String[] arrayi1 = m.getMdctnDispnsSubstitutionRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationdispense.getSubstitution().getReason().get(i0).getCoding().size() < i1+1) { medicationdispense.getSubstitution().getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationdispense.getSubstitution().getReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnDispns_Substitution_Rsn_Txt ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionRsnTxt() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getReason().size() < i0+1) { medicationdispense.getSubstitution().addReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getSubstitution().getReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Substitution_ResponsibleParty ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionResponsibleParty() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsSubstitutionResponsibleParty().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.getSubstitution().addResponsibleParty(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getType().getCoding().size() < i0+1) { medicationdispense.getSubstitution().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getSubstitution().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getType().getCoding().size() < i0+1) { medicationdispense.getSubstitution().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getSubstitution().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getType().getCoding().size() < i0+1) { medicationdispense.getSubstitution().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getSubstitution().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getType().getCoding().size() < i0+1) { medicationdispense.getSubstitution().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getSubstitution().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsSubstitutionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getSubstitution().getType().getCoding().size() < i0+1) { medicationdispense.getSubstitution().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getSubstitution().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Substitution_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionTypTxt() != null ) {

			if(m.getMdctnDispnsSubstitutionTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsSubstitutionTypTxt()==null) {} else {
			medicationdispense.getSubstitution().getType().setText(m.getMdctnDispnsSubstitutionTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_Substitution_WasSubstituted ********************************************************************************/
		if(m.getMdctnDispnsSubstitutionWasSubstituted() != null ) {

			if(m.getMdctnDispnsSubstitutionWasSubstituted().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsSubstitutionWasSubstituted()==null) {} else {
			medicationdispense.getSubstitution().setWasSubstituted(Boolean.parseBoolean(m.getMdctnDispnsSubstitutionWasSubstituted().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_SprtingInfo ********************************************************************************/
		if(m.getMdctnDispnsSprtingInfo() != null ) {

				for( String currListStrSplit : m.getMdctnDispnsSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationdispense.addSupportingInformation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnDispns_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnDispnsTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getType().getCoding().size() < i0+1) { medicationdispense.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnDispnsTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnDispnsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getType().getCoding().size() < i0+1) { medicationdispense.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnDispnsTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnDispnsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getType().getCoding().size() < i0+1) { medicationdispense.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnDispnsTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnDispnsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getType().getCoding().size() < i0+1) { medicationdispense.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnDispns_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnDispnsTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnDispnsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationdispense.getType().getCoding().size() < i0+1) { medicationdispense.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationdispense.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnDispns_Typ_Txt ********************************************************************************/
		if(m.getMdctnDispnsTypTxt() != null ) {

			if(m.getMdctnDispnsTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsTypTxt()==null) {} else {
			medicationdispense.getType().setText(m.getMdctnDispnsTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnDispns_WhenHandedOver ********************************************************************************/
		if(m.getMdctnDispnsWhenHandedOver() != null ) {

			if(m.getMdctnDispnsWhenHandedOver().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsWhenHandedOver()==null) {} else {
			medicationdispense.setWhenHandedOver(m.getMdctnDispnsWhenHandedOver().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsWhenHandedOver()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnDispnsWhenHandedOver().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnDispns_WhenPrepared ********************************************************************************/
		if(m.getMdctnDispnsWhenPrepared() != null ) {

			if(m.getMdctnDispnsWhenPrepared().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsWhenPrepared()==null) {} else {
			medicationdispense.setWhenPrepared(m.getMdctnDispnsWhenPrepared().replace("[","").replace("]","").equals("NULL") | m.getMdctnDispnsWhenPrepared()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnDispnsWhenPrepared().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return medicationdispense;
	}
}
