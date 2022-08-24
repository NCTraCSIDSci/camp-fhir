package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationKnowledge;
public class MedicationKnowledgeConversion 
{
	public org.hl7.fhir.r4.model.MedicationKnowledge MedicationKnowledges(MedicationKnowledge m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationKnowledge medicationknowledge = new org.hl7.fhir.r4.model.MedicationKnowledge();

		/******************** id ********************************************************************************/
		medicationknowledge.setId(m.getId());

		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addAdditionalInstruction(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addAdditionalInstruction(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addAdditionalInstruction(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addAdditionalInstruction(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addAdditionalInstruction(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addAdditionalInstruction(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAdditionalInstruction().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getAsNeededCodeableConcept().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseQuantity().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseQuantity().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseQuantity().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseQuantity().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getHigh().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getHigh().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getHigh().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getHigh().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getLow().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getLow().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getLow().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getDoseRange().getLow().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateQuantity().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateQuantity().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateQuantity().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateQuantity().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getHigh().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getHigh().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getHigh().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getHigh().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getLow().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getLow().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getLow().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRange().getLow().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getDenominator().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getDenominator().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getDenominator().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getNumerator().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getNumerator().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getNumerator().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getRateRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		return MedicationKnowledges_Extended( m, medicationknowledge);
	}
		public org.hl7.fhir.r4.model.MedicationKnowledge MedicationKnowledges_Extended(MedicationKnowledge m, org.hl7.fhir.r4.model.MedicationKnowledge medicationknowledge) throws ParseException
		{
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							String[] arrayi4 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().size() < i4+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).addDoseAndRate(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getDoseAndRate().get(i3).getType().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerAdministration().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerAdministration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerAdministration().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerAdministration().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerAdministration().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerLifetime().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerLifetime().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerLifetime().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerLifetime().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerLifetime().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getDenominator().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getDenominator().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getDenominator().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getDenominator().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getNumerator().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getNumerator().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getNumerator().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMaxDosePerPeriod().getNumerator().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Mthd_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgMthdTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getMethod().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_PntInstrctn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).setPatientInstruction(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Route_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgRouteTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getRoute().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Sqnc ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSqnc() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).setSequence(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Site_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgSiteTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getSite().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						String[] arrayi3 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().size() < i3+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getCode().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsDuration().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		return MedicationKnowledges_Extended2( m, medicationknowledge);
	}
		public org.hl7.fhir.r4.model.MedicationKnowledge MedicationKnowledges_Extended2(MedicationKnowledge m, org.hl7.fhir.r4.model.MedicationKnowledge medicationknowledge) throws ParseException
		{
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsDuration().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsDuration().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsPeriod().setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsPeriod().setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setCount(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setCountMax(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setDuration((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_DurationUnt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setFrequency(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setOffset(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_PrdUnt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addDosage(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgDsgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).addDosage(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getDosage().get(i1).getDosage().get(i2).getTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
//		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Cd ********************************************************************************/
//		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgCd() != null ) {
//
//			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
//					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getType().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		
//		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Dsply ********************************************************************************/
//		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgDsply() != null ) {
//
//			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
//					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getType().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		
//		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Sys ********************************************************************************/
//		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgSys() != null ) {
//
//			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
//					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getType().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		
//		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
//					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getType().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		
//		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Cdg_Vrsn ********************************************************************************/
//		if(m.getMdctnKnldgAdmnGdlnsDsgTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
//					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsDsgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getType().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}

		
		/******************** MdctnKnldg_AdmnGdlns_Dsg_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsDsgTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsDsgTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				}
			}

		
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getIndicationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_IndctnRfrnc ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsIndctnRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsIndctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).setIndication(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					String[] arrayi2 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().size() < i2+1) { medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_CrctrstcQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsCrctrstcQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).getCharacteristicQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnKnldg_AdmnGdlns_PntCrctrstcs_Vl ********************************************************************************/
		if(m.getMdctnKnldgAdmnGdlnsPntCrctrstcsVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getAdministrationGuidelines().size() < i0+1) { medicationknowledge.addAdministrationGuidelines(); }
				String[] arrayi1 = m.getMdctnKnldgAdmnGdlnsPntCrctrstcsVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().size() < i1+1) { medicationknowledge.getAdministrationGuidelines().get(i0).addPatientCharacteristics(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationknowledge.getAdministrationGuidelines().get(i0).getPatientCharacteristics().get(i1).addValue(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Amnt_Cd ********************************************************************************/
		if(m.getMdctnKnldgAmntCd() != null ) {

			if(m.getMdctnKnldgAmntCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgAmntCd()==null) {} else {
			medicationknowledge.getAmount().setCode(m.getMdctnKnldgAmntCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Amnt_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgAmntCmprtr() != null ) {

			if(m.getMdctnKnldgAmntCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgAmntCmprtr()==null) {} else {
			medicationknowledge.getAmount().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnKnldgAmntCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnKnldg_Amnt_Sys ********************************************************************************/
		if(m.getMdctnKnldgAmntSys() != null ) {

			if(m.getMdctnKnldgAmntSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgAmntSys()==null) {} else {
			medicationknowledge.getAmount().setSystem(m.getMdctnKnldgAmntSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Amnt_Unt ********************************************************************************/
		if(m.getMdctnKnldgAmntUnt() != null ) {

			if(m.getMdctnKnldgAmntUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgAmntUnt()==null) {} else {
			medicationknowledge.getAmount().setUnit(m.getMdctnKnldgAmntUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Amnt_Vl ********************************************************************************/
		if(m.getMdctnKnldgAmntVl() != null ) {

			if(m.getMdctnKnldgAmntVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgAmntVl()==null) {} else {
			medicationknowledge.getAmount().setValue((new java.math.BigDecimal((m.getMdctnKnldgAmntVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnKnldg_AssociatedMdctn ********************************************************************************/
		if(m.getMdctnKnldgAssociatedMdctn() != null ) {

				for( String currListStrSplit : m.getMdctnKnldgAssociatedMdctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationknowledge.addAssociatedMedication(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnKnldg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCode().getCoding().size() < i0+1) { medicationknowledge.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCode().getCoding().size() < i0+1) { medicationknowledge.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCode().getCoding().size() < i0+1) { medicationknowledge.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCode().getCoding().size() < i0+1) { medicationknowledge.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCode().getCoding().size() < i0+1) { medicationknowledge.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Cd_Txt ********************************************************************************/
		if(m.getMdctnKnldgCdTxt() != null ) {

			if(m.getMdctnKnldgCdTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgCdTxt()==null) {} else {
			medicationknowledge.getCode().setText(m.getMdctnKnldgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Cntraindctn ********************************************************************************/
		if(m.getMdctnKnldgCntraindctn() != null ) {

				for( String currListStrSplit : m.getMdctnKnldgCntraindctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationknowledge.addContraindication(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnKnldg_Cst_Cst_Crncy ********************************************************************************/
		if(m.getMdctnKnldgCstCstCrncy() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCstCstCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCost().size() < i0+1) { medicationknowledge.addCost(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCost().get(i0).getCost().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Cst_Cst_Vl ********************************************************************************/
		if(m.getMdctnKnldgCstCstVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgCstCstVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getCost().size() < i0+1) { medicationknowledge.addCost(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getCost().get(i0).getCost().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_Cst_Src ********************************************************************************/
		if(m.getMdctnKnldgCstSrc() != null ) {

			

		}
//		/******************** MdctnKnldg_Cst_Typ_Cdg_Cd ********************************************************************************/
//		if(m.getMdctnKnldgCstTypCdgCd() != null ) {
//
//				String[] arrayi1 = m.getMdctnKnldgCstTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicationknowledge.getType().getCoding().size() < i1+1) { medicationknowledge.getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		
//		/******************** MdctnKnldg_Cst_Typ_Cdg_Dsply ********************************************************************************/
//		if(m.getMdctnKnldgCstTypCdgDsply() != null ) {
//
//				String[] arrayi1 = m.getMdctnKnldgCstTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicationknowledge.getType().getCoding().size() < i1+1) { medicationknowledge.getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		
//		/******************** MdctnKnldg_Cst_Typ_Cdg_Sys ********************************************************************************/
//		if(m.getMdctnKnldgCstTypCdgSys() != null ) {
//
//				String[] arrayi1 = m.getMdctnKnldgCstTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicationknowledge.getType().getCoding().size() < i1+1) { medicationknowledge.getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		
//		/******************** MdctnKnldg_Cst_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(m.getMdctnKnldgCstTypCdgUsrSltd() != null ) {
//
//				String[] arrayi1 = m.getMdctnKnldgCstTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicationknowledge.getType().getCoding().size() < i1+1) { medicationknowledge.getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		
//		/******************** MdctnKnldg_Cst_Typ_Cdg_Vrsn ********************************************************************************/
//		if(m.getMdctnKnldgCstTypCdgVrsn() != null ) {
//
//				String[] arrayi1 = m.getMdctnKnldgCstTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicationknowledge.getType().getCoding().size() < i1+1) { medicationknowledge.getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		
//		/******************** MdctnKnldg_Cst_Typ_Txt ********************************************************************************/
//		if(m.getMdctnKnldgCstTypTxt() != null ) {
//
//			
//
//		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDoseFrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDoseForm().getCoding().size() < i0+1) { medicationknowledge.getDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDoseForm().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDoseFrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDoseForm().getCoding().size() < i0+1) { medicationknowledge.getDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDoseForm().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDoseFrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDoseForm().getCoding().size() < i0+1) { medicationknowledge.getDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDoseForm().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDoseFrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDoseForm().getCoding().size() < i0+1) { medicationknowledge.getDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDoseForm().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_DoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDoseFrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDoseForm().getCoding().size() < i0+1) { medicationknowledge.getDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDoseForm().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DoseFrm_Txt ********************************************************************************/
		if(m.getMdctnKnldgDoseFrmTxt() != null ) {

			if(m.getMdctnKnldgDoseFrmTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgDoseFrmTxt()==null) {} else {
			medicationknowledge.getDoseForm().setText(m.getMdctnKnldgDoseFrmTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlBase64BinaryTyp ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlBase64binaryTyp() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlBase64binaryTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).setValue(new org.hl7.fhir.r4.model.Base64BinaryType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				String[] arrayi1 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntySys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlQnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_DrugCrctrstc_VlStrgTyp ********************************************************************************/
		if(m.getMdctnKnldgDrugCrctrstcVlStrgTyp() != null ) {

			String[] arrayi0 = m.getMdctnKnldgDrugCrctrstcVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getDrugCharacteristic().size() < i0+1) { medicationknowledge.addDrugCharacteristic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getDrugCharacteristic().get(i0).setValue(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_IsActive ********************************************************************************/
		if(m.getMdctnKnldgIgrdntIsActive() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntIsActive().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).setIsActive(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				String[] arrayi1 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				String[] arrayi1 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				String[] arrayi1 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				String[] arrayi1 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				String[] arrayi1 = m.getMdctnKnldgIgrdntItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getItemCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_ItmRfrnc ********************************************************************************/
		if(m.getMdctnKnldgIgrdntItmRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntItmRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).setItem(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnKnldgIgrdntStrNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIgrdntStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIngredient().size() < i0+1) { medicationknowledge.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIngredient().get(i0).getStrength().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIntendedRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIntendedRoute().size() < i0+1) { medicationknowledge.addIntendedRoute(); }
				String[] arrayi1 = m.getMdctnKnldgIntendedRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIntendedRoute().get(i0).getCoding().size() < i1+1) { medicationknowledge.getIntendedRoute().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIntendedRoute().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIntendedRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIntendedRoute().size() < i0+1) { medicationknowledge.addIntendedRoute(); }
				String[] arrayi1 = m.getMdctnKnldgIntendedRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIntendedRoute().get(i0).getCoding().size() < i1+1) { medicationknowledge.getIntendedRoute().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIntendedRoute().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIntendedRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIntendedRoute().size() < i0+1) { medicationknowledge.addIntendedRoute(); }
				String[] arrayi1 = m.getMdctnKnldgIntendedRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIntendedRoute().get(i0).getCoding().size() < i1+1) { medicationknowledge.getIntendedRoute().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIntendedRoute().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIntendedRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIntendedRoute().size() < i0+1) { medicationknowledge.addIntendedRoute(); }
				String[] arrayi1 = m.getMdctnKnldgIntendedRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIntendedRoute().get(i0).getCoding().size() < i1+1) { medicationknowledge.getIntendedRoute().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIntendedRoute().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_IntendedRoute_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIntendedRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIntendedRoute().size() < i0+1) { medicationknowledge.addIntendedRoute(); }
				String[] arrayi1 = m.getMdctnKnldgIntendedRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getIntendedRoute().get(i0).getCoding().size() < i1+1) { medicationknowledge.getIntendedRoute().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getIntendedRoute().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_IntendedRoute_Txt ********************************************************************************/
		if(m.getMdctnKnldgIntendedRouteTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgIntendedRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getIntendedRoute().size() < i0+1) { medicationknowledge.addIntendedRoute(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getIntendedRoute().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Cd ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsAreaUnderCurveCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsAreaUnderCurveCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addAreaUnderCurve(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsAreaUnderCurveCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsAreaUnderCurveCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addAreaUnderCurve(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().get(i1).setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Sys ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsAreaUnderCurveSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsAreaUnderCurveSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addAreaUnderCurve(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Unt ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsAreaUnderCurveUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsAreaUnderCurveUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addAreaUnderCurve(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().get(i1).setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_AreaUnderCurve_Vl ********************************************************************************/
		if(m.getMdctnKnldgKineticsAreaUnderCurveVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsAreaUnderCurveVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsAreaUnderCurveVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addAreaUnderCurve(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getAreaUnderCurve().get(i1).setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Cd ********************************************************************************/
		if(m.getMdctnKnldgKineticsHalfLifePrdCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsHalfLifePrdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getKinetics().get(i0).getHalfLifePeriod().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgKineticsHalfLifePrdCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsHalfLifePrdCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getKinetics().get(i0).getHalfLifePeriod().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Sys ********************************************************************************/
		if(m.getMdctnKnldgKineticsHalfLifePrdSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsHalfLifePrdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getKinetics().get(i0).getHalfLifePeriod().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Unt ********************************************************************************/
		if(m.getMdctnKnldgKineticsHalfLifePrdUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsHalfLifePrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getKinetics().get(i0).getHalfLifePeriod().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Kinetics_HalfLifePrd_Vl ********************************************************************************/
		if(m.getMdctnKnldgKineticsHalfLifePrdVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsHalfLifePrdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getKinetics().get(i0).getHalfLifePeriod().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Cd ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Cd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsLethalDose50Cd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsLethalDose50Cd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getLethalDose50().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addLethalDose50(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getLethalDose50().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Cmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsLethalDose50Cmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsLethalDose50Cmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getLethalDose50().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addLethalDose50(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getLethalDose50().get(i1).setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Sys ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Sys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsLethalDose50Sys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsLethalDose50Sys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getLethalDose50().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addLethalDose50(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getLethalDose50().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Unt ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Unt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsLethalDose50Unt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsLethalDose50Unt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getLethalDose50().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addLethalDose50(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getLethalDose50().get(i1).setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Kinetics_LethalDose50_Vl ********************************************************************************/
		if(m.getMdctnKnldgKineticsLethalDose50Vl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgKineticsLethalDose50Vl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getKinetics().size() < i0+1) { medicationknowledge.addKinetics(); }
				String[] arrayi1 = m.getMdctnKnldgKineticsLethalDose50Vl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getKinetics().get(i0).getLethalDose50().size() < i1+1) { medicationknowledge.getKinetics().get(i0).addLethalDose50(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getKinetics().get(i0).getLethalDose50().get(i1).setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnKnldg_Manufacturer ********************************************************************************/
		if(m.getMdctnKnldgManufacturer() != null ) {

			if(m.getMdctnKnldgManufacturer().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgManufacturer()==null) {} else {
			medicationknowledge.setManufacturer(new org.hl7.fhir.r4.model.Reference(m.getMdctnKnldgManufacturer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getClassification().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).addClassification(); }
					String[] arrayi2 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().size() < i2+1) { medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getClassification().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).addClassification(); }
					String[] arrayi2 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().size() < i2+1) { medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getClassification().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).addClassification(); }
					String[] arrayi2 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().size() < i2+1) { medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getClassification().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).addClassification(); }
					String[] arrayi2 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().size() < i2+1) { medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getClassification().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).addClassification(); }
					String[] arrayi2 = m.getMdctnKnldgMedicineClsfctnClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().size() < i2+1) { medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Clsfctn_Txt ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnClsfctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnClsfctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnClsfctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getClassification().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).addClassification(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getClassification().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				String[] arrayi1 = m.getMdctnKnldgMedicineClsfctnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMedicineClassification().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MedicineClsfctn_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgMedicineClsfctnTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMedicineClsfctnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMedicineClassification().size() < i0+1) { medicationknowledge.addMedicineClassification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getMedicineClassification().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Nm ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmNm() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				String[] arrayi1 = m.getMdctnKnldgMonitoringPrgrmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonitoringProgram().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				String[] arrayi1 = m.getMdctnKnldgMonitoringPrgrmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonitoringProgram().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				String[] arrayi1 = m.getMdctnKnldgMonitoringPrgrmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonitoringProgram().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				String[] arrayi1 = m.getMdctnKnldgMonitoringPrgrmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonitoringProgram().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				String[] arrayi1 = m.getMdctnKnldgMonitoringPrgrmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonitoringProgram().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_MonitoringPrgrm_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgMonitoringPrgrmTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonitoringPrgrmTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonitoringProgram().size() < i0+1) { medicationknowledge.addMonitoringProgram(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getMonitoringProgram().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Monograph_Src ********************************************************************************/
		if(m.getMdctnKnldgMonographSrc() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographSrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getMonograph().get(i0).setSource(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				String[] arrayi1 = m.getMdctnKnldgMonographTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonograph().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonograph().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonograph().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				String[] arrayi1 = m.getMdctnKnldgMonographTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonograph().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonograph().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonograph().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				String[] arrayi1 = m.getMdctnKnldgMonographTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonograph().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonograph().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonograph().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				String[] arrayi1 = m.getMdctnKnldgMonographTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonograph().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonograph().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonograph().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_Monograph_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgMonographTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				String[] arrayi1 = m.getMdctnKnldgMonographTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getMonograph().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getMonograph().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getMonograph().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Monograph_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgMonographTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgMonographTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getMonograph().size() < i0+1) { medicationknowledge.addMonograph(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getMonograph().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Packaging_Qnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyCd() != null ) {

			if(m.getMdctnKnldgPackagingQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPackagingQntyCd()==null) {} else {
			medicationknowledge.getPackaging().getQuantity().setCode(m.getMdctnKnldgPackagingQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Packaging_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyCmprtr() != null ) {

			if(m.getMdctnKnldgPackagingQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPackagingQntyCmprtr()==null) {} else {
			medicationknowledge.getPackaging().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnKnldgPackagingQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnKnldg_Packaging_Qnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntySys() != null ) {

			if(m.getMdctnKnldgPackagingQntySys().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPackagingQntySys()==null) {} else {
			medicationknowledge.getPackaging().getQuantity().setSystem(m.getMdctnKnldgPackagingQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Packaging_Qnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyUnt() != null ) {

			if(m.getMdctnKnldgPackagingQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPackagingQntyUnt()==null) {} else {
			medicationknowledge.getPackaging().getQuantity().setUnit(m.getMdctnKnldgPackagingQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_Packaging_Qnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgPackagingQntyVl() != null ) {

			if(m.getMdctnKnldgPackagingQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPackagingQntyVl()==null) {} else {
			medicationknowledge.getPackaging().getQuantity().setValue((new java.math.BigDecimal((m.getMdctnKnldgPackagingQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPackagingTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getPackaging().getType().getCoding().size() < i0+1) { medicationknowledge.getPackaging().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getPackaging().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPackagingTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getPackaging().getType().getCoding().size() < i0+1) { medicationknowledge.getPackaging().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getPackaging().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPackagingTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getPackaging().getType().getCoding().size() < i0+1) { medicationknowledge.getPackaging().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getPackaging().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPackagingTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getPackaging().getType().getCoding().size() < i0+1) { medicationknowledge.getPackaging().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getPackaging().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Packaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPackagingTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getPackaging().getType().getCoding().size() < i0+1) { medicationknowledge.getPackaging().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getPackaging().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Packaging_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgPackagingTypTxt() != null ) {

			if(m.getMdctnKnldgPackagingTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPackagingTypTxt()==null) {} else {
			medicationknowledge.getPackaging().getType().setText(m.getMdctnKnldgPackagingTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_PreparationInstrctn ********************************************************************************/
		if(m.getMdctnKnldgPreparationInstrctn() != null ) {

			if(m.getMdctnKnldgPreparationInstrctn().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgPreparationInstrctn()==null) {} else {
			medicationknowledge.setPreparationInstruction(m.getMdctnKnldgPreparationInstrctn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPrdctTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getProductType().size() < i0+1) { medicationknowledge.addProductType(); }
				String[] arrayi1 = m.getMdctnKnldgPrdctTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getProductType().get(i0).getCoding().size() < i1+1) { medicationknowledge.getProductType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getProductType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPrdctTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getProductType().size() < i0+1) { medicationknowledge.addProductType(); }
				String[] arrayi1 = m.getMdctnKnldgPrdctTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getProductType().get(i0).getCoding().size() < i1+1) { medicationknowledge.getProductType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getProductType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPrdctTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getProductType().size() < i0+1) { medicationknowledge.addProductType(); }
				String[] arrayi1 = m.getMdctnKnldgPrdctTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getProductType().get(i0).getCoding().size() < i1+1) { medicationknowledge.getProductType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getProductType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPrdctTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getProductType().size() < i0+1) { medicationknowledge.addProductType(); }
				String[] arrayi1 = m.getMdctnKnldgPrdctTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getProductType().get(i0).getCoding().size() < i1+1) { medicationknowledge.getProductType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getProductType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_PrdctTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPrdctTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getProductType().size() < i0+1) { medicationknowledge.addProductType(); }
				String[] arrayi1 = m.getMdctnKnldgPrdctTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getProductType().get(i0).getCoding().size() < i1+1) { medicationknowledge.getProductType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getProductType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_PrdctTyp_Txt ********************************************************************************/
		if(m.getMdctnKnldgPrdctTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgPrdctTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getProductType().size() < i0+1) { medicationknowledge.addProductType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getProductType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsPrdCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsPrdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getPeriod().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsPrdCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsPrdCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getPeriod().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsPrdSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsPrdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getPeriod().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Unt ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsPrdUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getPeriod().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Prd_Vl ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsPrdVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsPrdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getPeriod().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntySys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Unt ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Regulatory_MxDispns_Qnty_Vl ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryMxDispnsQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryMxDispnsQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).getMaxDispense().getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnKnldg_Regulatory_RegulatoryAthrity ********************************************************************************/
		if(m.getMdctnKnldgRegulatoryRegulatoryAthrity() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatoryRegulatoryAthrity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRegulatory().get(i0).setRegulatoryAuthority(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySchdlSchdlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySchdlSchdlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSchedule().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSchedule(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySchdlSchdlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySchdlSchdlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySchdlSchdlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSchedule().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSchedule(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySchdlSchdlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySchdlSchdlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySchdlSchdlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSchedule().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSchedule(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySchdlSchdlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSchedule().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSchedule(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySchdlSchdlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySchdlSchdlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySchdlSchdlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSchedule().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSchedule(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySchdlSchdlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Schdl_Schdl_Txt ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySchdlSchdlTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySchdlSchdlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySchdlSchdlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSchedule().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSchedule(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSchedule().get(i1).getSchedule().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Allowed ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionAllowed() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionAllowed().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionAllowed().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).setAllowed(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySubstitutionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySubstitutionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySubstitutionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySubstitutionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					String[] arrayi2 = m.getMdctnKnldgRegulatorySubstitutionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().size() < i2+1) { medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnKnldg_Regulatory_Substitution_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgRegulatorySubstitutionTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRegulatorySubstitutionTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRegulatory().size() < i0+1) { medicationknowledge.addRegulatory(); }
				String[] arrayi1 = m.getMdctnKnldgRegulatorySubstitutionTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRegulatory().get(i0).getSubstitution().size() < i1+1) { medicationknowledge.getRegulatory().get(i0).addSubstitution(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRegulatory().get(i0).getSubstitution().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Rfrnc ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).addReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				String[] arrayi1 = m.getMdctnKnldgRltedMdctnKnldgTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				String[] arrayi1 = m.getMdctnKnldgRltedMdctnKnldgTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				String[] arrayi1 = m.getMdctnKnldgRltedMdctnKnldgTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				String[] arrayi1 = m.getMdctnKnldgRltedMdctnKnldgTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				String[] arrayi1 = m.getMdctnKnldgRltedMdctnKnldgTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().size() < i1+1) { medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnKnldg_RltedMdctnKnldg_Typ_Txt ********************************************************************************/
		if(m.getMdctnKnldgRltedMdctnKnldgTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnKnldgRltedMdctnKnldgTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationknowledge.getRelatedMedicationKnowledge().size() < i0+1) { medicationknowledge.addRelatedMedicationKnowledge(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationknowledge.getRelatedMedicationKnowledge().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnKnldg_Sts ********************************************************************************/
		if(m.getMdctnKnldgSts() != null ) {

			if(m.getMdctnKnldgSts().replace("[","").replace("]","").equals("NULL") | m.getMdctnKnldgSts()==null) {} else {
			medicationknowledge.setStatus(new org.hl7.fhir.r4.model.MedicationKnowledge.MedicationKnowledgeStatusEnumFactory().fromCode(m.getMdctnKnldgSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnKnldg_Synonym ********************************************************************************/
		if(m.getMdctnKnldgSynonym() != null ) {

				for( String currListStrSplit : m.getMdctnKnldgSynonym().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationknowledge.addSynonym(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		return medicationknowledge;
	}
}
