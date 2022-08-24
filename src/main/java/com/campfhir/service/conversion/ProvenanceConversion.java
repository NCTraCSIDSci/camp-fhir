package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Provenance;
public class ProvenanceConversion 
{
	public org.hl7.fhir.r4.model.Provenance Provenances(Provenance p) throws ParseException
	{
		org.hl7.fhir.r4.model.Provenance provenance = new org.hl7.fhir.r4.model.Provenance();

		/******************** id ********************************************************************************/
		provenance.setId(p.getId());

		/******************** Provnce_Actvty_Cdg_Cd ********************************************************************************/
		if(p.getProvnceActvtyCdgCd() != null ) {

			String[] arrayi0 = p.getProvnceActvtyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getActivity().getCoding().size() < i0+1) { provenance.getActivity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getActivity().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Actvty_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceActvtyCdgDsply() != null ) {

			String[] arrayi0 = p.getProvnceActvtyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getActivity().getCoding().size() < i0+1) { provenance.getActivity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getActivity().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Actvty_Cdg_Sys ********************************************************************************/
		if(p.getProvnceActvtyCdgSys() != null ) {

			String[] arrayi0 = p.getProvnceActvtyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getActivity().getCoding().size() < i0+1) { provenance.getActivity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getActivity().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Actvty_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceActvtyCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceActvtyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getActivity().getCoding().size() < i0+1) { provenance.getActivity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getActivity().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Actvty_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceActvtyCdgVrsn() != null ) {

			String[] arrayi0 = p.getProvnceActvtyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getActivity().getCoding().size() < i0+1) { provenance.getActivity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getActivity().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Actvty_Txt ********************************************************************************/
		if(p.getProvnceActvtyTxt() != null ) {

			if(p.getProvnceActvtyTxt().replace("[","").replace("]","").equals("NULL") | p.getProvnceActvtyTxt()==null) {} else {
			provenance.getActivity().setText(p.getProvnceActvtyTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Provnce_Agnt_OnBehalfOf ********************************************************************************/
		if(p.getProvnceAgntOnBehalfOf() != null ) {

			String[] arrayi0 = p.getProvnceAgntOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getAgent().get(i0).setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(p.getProvnceAgntRoleCdgCd() != null ) {

			String[] arrayi0 = p.getProvnceAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getRole().size() < i1+1) { provenance.getAgent().get(i0).addRole(); }
					String[] arrayi2 = p.getProvnceAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { provenance.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceAgntRoleCdgDsply() != null ) {

			String[] arrayi0 = p.getProvnceAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getRole().size() < i1+1) { provenance.getAgent().get(i0).addRole(); }
					String[] arrayi2 = p.getProvnceAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { provenance.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(p.getProvnceAgntRoleCdgSys() != null ) {

			String[] arrayi0 = p.getProvnceAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getRole().size() < i1+1) { provenance.getAgent().get(i0).addRole(); }
					String[] arrayi2 = p.getProvnceAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { provenance.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceAgntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getRole().size() < i1+1) { provenance.getAgent().get(i0).addRole(); }
					String[] arrayi2 = p.getProvnceAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { provenance.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Provnce_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceAgntRoleCdgVrsn() != null ) {

			String[] arrayi0 = p.getProvnceAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getRole().size() < i1+1) { provenance.getAgent().get(i0).addRole(); }
					String[] arrayi2 = p.getProvnceAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getAgent().get(i0).getRole().get(i1).getCoding().size() < i2+1) { provenance.getAgent().get(i0).getRole().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getAgent().get(i0).getRole().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Agnt_Role_Txt ********************************************************************************/
		if(p.getProvnceAgntRoleTxt() != null ) {

			String[] arrayi0 = p.getProvnceAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getRole().size() < i1+1) { provenance.getAgent().get(i0).addRole(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getAgent().get(i0).getRole().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(p.getProvnceAgntTypCdgCd() != null ) {

			String[] arrayi0 = p.getProvnceAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getType().getCoding().size() < i1+1) { provenance.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getAgent().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceAgntTypCdgDsply() != null ) {

			String[] arrayi0 = p.getProvnceAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getType().getCoding().size() < i1+1) { provenance.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getAgent().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(p.getProvnceAgntTypCdgSys() != null ) {

			String[] arrayi0 = p.getProvnceAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getType().getCoding().size() < i1+1) { provenance.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getAgent().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceAgntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getType().getCoding().size() < i1+1) { provenance.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getAgent().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Provnce_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceAgntTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getProvnceAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				String[] arrayi1 = p.getProvnceAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getAgent().get(i0).getType().getCoding().size() < i1+1) { provenance.getAgent().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getAgent().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Agnt_Typ_Txt ********************************************************************************/
		if(p.getProvnceAgntTypTxt() != null ) {

			String[] arrayi0 = p.getProvnceAgntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getAgent().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Agnt_Who ********************************************************************************/
		if(p.getProvnceAgntWho() != null ) {

			String[] arrayi0 = p.getProvnceAgntWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getAgent().size() < i0+1) { provenance.addAgent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getAgent().get(i0).setWho(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Entity_Agnt_OnBehalfOf ********************************************************************************/
		if(p.getProvnceEntityAgntOnBehalfOf() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgCd() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).addRole(); }
						String[] arrayi3 = p.getProvnceEntityAgntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().size() < i3+1) { provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgDsply() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).addRole(); }
						String[] arrayi3 = p.getProvnceEntityAgntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().size() < i3+1) { provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgSys() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).addRole(); }
						String[] arrayi3 = p.getProvnceEntityAgntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().size() < i3+1) { provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).addRole(); }
						String[] arrayi3 = p.getProvnceEntityAgntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().size() < i3+1) { provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgVrsn() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).addRole(); }
						String[] arrayi3 = p.getProvnceEntityAgntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().size() < i3+1) { provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Role_Txt ********************************************************************************/
		if(p.getProvnceEntityAgntRoleTxt() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getRole().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).addRole(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getRole().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgCd() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgDsply() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgSys() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					String[] arrayi2 = p.getProvnceEntityAgntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().size() < i2+1) { provenance.getEntity().get(i0).getAgent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Typ_Txt ********************************************************************************/
		if(p.getProvnceEntityAgntTypTxt() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Entity_Agnt_Who ********************************************************************************/
		if(p.getProvnceEntityAgntWho() != null ) {

			String[] arrayi0 = p.getProvnceEntityAgntWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				String[] arrayi1 = p.getProvnceEntityAgntWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getEntity().get(i0).getAgent().size() < i1+1) { provenance.getEntity().get(i0).addAgent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getEntity().get(i0).getAgent().get(i1).setWho(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Provnce_Entity_Role ********************************************************************************/
		if(p.getProvnceEntityRole() != null ) {

			String[] arrayi0 = p.getProvnceEntityRole().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getEntity().get(i0).setRole(new org.hl7.fhir.r4.model.Provenance.ProvenanceEntityRoleEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Entity_What ********************************************************************************/
		if(p.getProvnceEntityWhat() != null ) {

			String[] arrayi0 = p.getProvnceEntityWhat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getEntity().size() < i0+1) { provenance.addEntity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getEntity().get(i0).setWhat(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Lctn ********************************************************************************/
		if(p.getProvnceLctn() != null ) {

			if(p.getProvnceLctn().replace("[","").replace("]","").equals("NULL") | p.getProvnceLctn()==null) {} else {
			provenance.setLocation(new org.hl7.fhir.r4.model.Reference(p.getProvnceLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Provnce_OccurredDtTimeTyp ********************************************************************************/
		if(p.getProvnceOccurredDtTimeTyp() != null ) {

			if(p.getProvnceOccurredDtTimeTyp().replace("[","").replace("]","").equals("NULL") | p.getProvnceOccurredDtTimeTyp()==null) {} else {
			provenance.setOccurred(new org.hl7.fhir.r4.model.DateTimeType(p.getProvnceOccurredDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Provnce_OccurredPrd_End ********************************************************************************/
		if(p.getProvnceOccurredPrdEnd() != null ) {

			if(p.getProvnceOccurredPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getProvnceOccurredPrdEnd()==null) {} else {
			provenance.getOccurredPeriod().setEnd(p.getProvnceOccurredPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getProvnceOccurredPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getProvnceOccurredPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Provnce_OccurredPrd_Strt ********************************************************************************/
		if(p.getProvnceOccurredPrdStrt() != null ) {

			if(p.getProvnceOccurredPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getProvnceOccurredPrdStrt()==null) {} else {
			provenance.getOccurredPeriod().setStart(p.getProvnceOccurredPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getProvnceOccurredPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getProvnceOccurredPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Provnce_Policy ********************************************************************************/
		if(p.getProvncePolicy() != null ) {

				for( String currListStrSplit : p.getProvncePolicy().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			provenance.addPolicy(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Provnce_Rsn_Cdg_Cd ********************************************************************************/
		if(p.getProvnceRsnCdgCd() != null ) {

			String[] arrayi0 = p.getProvnceRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getReason().size() < i0+1) { provenance.addReason(); }
				String[] arrayi1 = p.getProvnceRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getReason().get(i0).getCoding().size() < i1+1) { provenance.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Rsn_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceRsnCdgDsply() != null ) {

			String[] arrayi0 = p.getProvnceRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getReason().size() < i0+1) { provenance.addReason(); }
				String[] arrayi1 = p.getProvnceRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getReason().get(i0).getCoding().size() < i1+1) { provenance.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Rsn_Cdg_Sys ********************************************************************************/
		if(p.getProvnceRsnCdgSys() != null ) {

			String[] arrayi0 = p.getProvnceRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getReason().size() < i0+1) { provenance.addReason(); }
				String[] arrayi1 = p.getProvnceRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getReason().get(i0).getCoding().size() < i1+1) { provenance.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getReason().size() < i0+1) { provenance.addReason(); }
				String[] arrayi1 = p.getProvnceRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getReason().get(i0).getCoding().size() < i1+1) { provenance.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Provnce_Rsn_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceRsnCdgVrsn() != null ) {

			String[] arrayi0 = p.getProvnceRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getReason().size() < i0+1) { provenance.addReason(); }
				String[] arrayi1 = p.getProvnceRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getReason().get(i0).getCoding().size() < i1+1) { provenance.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Rsn_Txt ********************************************************************************/
		if(p.getProvnceRsnTxt() != null ) {

			String[] arrayi0 = p.getProvnceRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getReason().size() < i0+1) { provenance.addReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Recorded ********************************************************************************/
		if(p.getProvnceRecorded() != null ) {

			if(p.getProvnceRecorded().replace("[","").replace("]","").equals("NULL") | p.getProvnceRecorded()==null) {} else {
			provenance.setRecorded(p.getProvnceRecorded().replace("[","").replace("]","").equals("NULL") | p.getProvnceRecorded()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getProvnceRecorded().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Provnce_Signature_Data ********************************************************************************/
		if(p.getProvnceSignatureData() != null ) {

			String[] arrayi0 = p.getProvnceSignatureData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getSignature().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Provnce_Signature_OnBehalfOf ********************************************************************************/
		if(p.getProvnceSignatureOnBehalfOf() != null ) {

			String[] arrayi0 = p.getProvnceSignatureOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getSignature().get(i0).setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Signature_SigFrmat ********************************************************************************/
		if(p.getProvnceSignatureSigFrmat() != null ) {

			String[] arrayi0 = p.getProvnceSignatureSigFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getSignature().get(i0).setSigFormat(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Signature_TarFrmat ********************************************************************************/
		if(p.getProvnceSignatureTarFrmat() != null ) {

			String[] arrayi0 = p.getProvnceSignatureTarFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getSignature().get(i0).setTargetFormat(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Provnce_Signature_Typ_Cd ********************************************************************************/
		if(p.getProvnceSignatureTypCd() != null ) {

			String[] arrayi0 = p.getProvnceSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				String[] arrayi1 = p.getProvnceSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getSignature().get(i0).getType().size() < i1+1) { provenance.getSignature().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getSignature().get(i0).getType().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Signature_Typ_Dsply ********************************************************************************/
		if(p.getProvnceSignatureTypDsply() != null ) {

			String[] arrayi0 = p.getProvnceSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				String[] arrayi1 = p.getProvnceSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getSignature().get(i0).getType().size() < i1+1) { provenance.getSignature().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getSignature().get(i0).getType().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Signature_Typ_Sys ********************************************************************************/
		if(p.getProvnceSignatureTypSys() != null ) {

			String[] arrayi0 = p.getProvnceSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				String[] arrayi1 = p.getProvnceSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getSignature().get(i0).getType().size() < i1+1) { provenance.getSignature().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getSignature().get(i0).getType().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Signature_Typ_UsrSltd ********************************************************************************/
		if(p.getProvnceSignatureTypUsrSltd() != null ) {

			String[] arrayi0 = p.getProvnceSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				String[] arrayi1 = p.getProvnceSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getSignature().get(i0).getType().size() < i1+1) { provenance.getSignature().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getSignature().get(i0).getType().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Provnce_Signature_Typ_Vrsn ********************************************************************************/
		if(p.getProvnceSignatureTypVrsn() != null ) {

			String[] arrayi0 = p.getProvnceSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				String[] arrayi1 = p.getProvnceSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(provenance.getSignature().get(i0).getType().size() < i1+1) { provenance.getSignature().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {provenance.getSignature().get(i0).getType().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Provnce_Signature_When ********************************************************************************/
		if(p.getProvnceSignatureWhen() != null ) {

			String[] arrayi0 = p.getProvnceSignatureWhen().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getSignature().get(i0).setWhen(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Provnce_Signature_Who ********************************************************************************/
		if(p.getProvnceSignatureWho() != null ) {

			String[] arrayi0 = p.getProvnceSignatureWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(provenance.getSignature().size() < i0+1) { provenance.addSignature(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {provenance.getSignature().get(i0).setWho(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return provenance;
	}
}
