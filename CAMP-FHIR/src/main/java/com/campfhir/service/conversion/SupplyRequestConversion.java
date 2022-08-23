package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyRequest;
public class SupplyRequestConversion 
{
	public org.hl7.fhir.r4.model.SupplyRequest SupplyRequests(SupplyRequest s) throws ParseException
	{
		org.hl7.fhir.r4.model.SupplyRequest supplyrequest = new org.hl7.fhir.r4.model.SupplyRequest();

		/******************** id ********************************************************************************/
		supplyrequest.setId(s.getId());

		/******************** SpplyRqst_AthredOn ********************************************************************************/
		if(s.getSpplyRqstAthredOn() != null ) {

			if(s.getSpplyRqstAthredOn().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstAthredOn()==null) {} else {
			supplyrequest.setAuthoredOn(s.getSpplyRqstAthredOn().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyRqstAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getCategory().getCoding().size() < i0+1) { supplyrequest.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getCategory().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getCategory().getCoding().size() < i0+1) { supplyrequest.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getCategory().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getCategory().getCoding().size() < i0+1) { supplyrequest.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getCategory().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getCategory().getCoding().size() < i0+1) { supplyrequest.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getCategory().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getCategory().getCoding().size() < i0+1) { supplyrequest.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getCategory().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Ctgry_Txt ********************************************************************************/
		if(s.getSpplyRqstCtgryTxt() != null ) {

			if(s.getSpplyRqstCtgryTxt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstCtgryTxt()==null) {} else {
			supplyrequest.getCategory().setText(s.getSpplyRqstCtgryTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_DeliverFrom ********************************************************************************/
		if(s.getSpplyRqstDeliverFrom() != null ) {

			if(s.getSpplyRqstDeliverFrom().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstDeliverFrom()==null) {} else {
			supplyrequest.setDeliverFrom(new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstDeliverFrom().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_DeliverTo ********************************************************************************/
		if(s.getSpplyRqstDeliverTo() != null ) {

			if(s.getSpplyRqstDeliverTo().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstDeliverTo()==null) {} else {
			supplyrequest.setDeliverTo(new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstDeliverTo().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_Id_Assigner ********************************************************************************/
		if(s.getSpplyRqstIdAssigner() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Id_Prd_End ********************************************************************************/
		if(s.getSpplyRqstIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Id_Prd_Strt ********************************************************************************/
		if(s.getSpplyRqstIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Id_Sys ********************************************************************************/
		if(s.getSpplyRqstIdSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				String[] arrayi1 = s.getSpplyRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplyrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				String[] arrayi1 = s.getSpplyRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplyrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				String[] arrayi1 = s.getSpplyRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplyrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				String[] arrayi1 = s.getSpplyRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplyrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpplyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				String[] arrayi1 = s.getSpplyRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplyrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Id_Typ_Txt ********************************************************************************/
		if(s.getSpplyRqstIdTypTxt() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Id_Use ********************************************************************************/
		if(s.getSpplyRqstIdUse() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Id_Vl ********************************************************************************/
		if(s.getSpplyRqstIdVl() != null ) {

			String[] arrayi0 = s.getSpplyRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getIdentifier().size() < i0+1) { supplyrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getItemCodeableConcept().getCoding().size() < i0+1) { supplyrequest.getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getItemCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getItemCodeableConcept().getCoding().size() < i0+1) { supplyrequest.getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getItemCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getItemCodeableConcept().getCoding().size() < i0+1) { supplyrequest.getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getItemCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getItemCodeableConcept().getCoding().size() < i0+1) { supplyrequest.getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getItemCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getItemCodeableConcept().getCoding().size() < i0+1) { supplyrequest.getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getItemCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_ItmCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptTxt() != null ) {

			if(s.getSpplyRqstItmCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstItmCdbleCncptTxt()==null) {} else {
			supplyrequest.getItemCodeableConcept().setText(s.getSpplyRqstItmCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_ItmRfrnc ********************************************************************************/
		if(s.getSpplyRqstItmRfrnc() != null ) {

			if(s.getSpplyRqstItmRfrnc().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstItmRfrnc()==null) {} else {
			supplyrequest.setItem(new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstItmRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(s.getSpplyRqstOccrnceDtTimeTyp() != null ) {

			if(s.getSpplyRqstOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceDtTimeTyp()==null) {} else {
			supplyrequest.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(s.getSpplyRqstOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrncePrd_End ********************************************************************************/
		if(s.getSpplyRqstOccrncePrdEnd() != null ) {

			if(s.getSpplyRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrncePrdEnd()==null) {} else {
			supplyrequest.getOccurrencePeriod().setEnd(s.getSpplyRqstOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyRqstOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrncePrd_Strt ********************************************************************************/
		if(s.getSpplyRqstOccrncePrdStrt() != null ) {

			if(s.getSpplyRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrncePrdStrt()==null) {} else {
			supplyrequest.getOccurrencePeriod().setStart(s.getSpplyRqstOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyRqstOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplyrequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getOccurrenceTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplyrequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getOccurrenceTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplyrequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getOccurrenceTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplyrequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getOccurrenceTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplyrequest.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getOccurrenceTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdTxt() != null ) {

			if(s.getSpplyRqstOccrnceTmgCdTxt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgCdTxt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getCode().setText(s.getSpplyRqstOccrnceTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgEvnt() != null ) {

				for( String currListStrSplit : s.getSpplyRqstOccrnceTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplyrequest.getOccurrenceTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationCd() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsDurationCd()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setCode(s.getSpplyRqstOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationCmprtr() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsDurationCmprtr()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyRqstOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationSys() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsDurationSys()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setSystem(s.getSpplyRqstOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationUnt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsDurationUnt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setUnit(s.getSpplyRqstOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationVl() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsDurationVl()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((s.getSpplyRqstOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsPrdEnd() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsPrdEnd()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsPeriod().setEnd(s.getSpplyRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyRqstOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsPrdStrt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsPrdStrt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsPeriod().setStart(s.getSpplyRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyRqstOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiCd() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngHiCd()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setCode(s.getSpplyRqstOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiCmprtr() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngHiCmprtr()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyRqstOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiSys() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngHiSys()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setSystem(s.getSpplyRqstOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiUnt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngHiUnt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setUnit(s.getSpplyRqstOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiVl() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngHiVl()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((s.getSpplyRqstOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwCd() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngLwCd()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setCode(s.getSpplyRqstOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwCmprtr() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngLwCmprtr()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyRqstOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwSys() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngLwSys()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setSystem(s.getSpplyRqstOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwUnt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngLwUnt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setUnit(s.getSpplyRqstOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwVl() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptBndsRngLwVl()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((s.getSpplyRqstOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptCnt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptCnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptCnt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setCount(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptCntMx() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptCntMx()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setCountMax(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptDuration() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptDuration().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptDuration()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setDuration((Double.parseDouble((s.getSpplyRqstOccrnceTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptDurationMx() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptDurationMx()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setDurationMax((Double.parseDouble((s.getSpplyRqstOccrnceTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_DurationUnt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptDurationUnt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptDurationUnt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(s.getSpplyRqstOccrnceTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptFrqncy() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptFrqncy()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setFrequency(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptFrqncyMx() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptFrqncyMx()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setFrequencyMax(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptOff() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptOff().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptOff()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setOffset(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptPrd() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptPrd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptPrd()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setPeriod((new java.math.BigDecimal((s.getSpplyRqstOccrnceTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptPrdMx() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptPrdMx()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((s.getSpplyRqstOccrnceTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_PrdUnt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptPrdUnt() != null ) {

			if(s.getSpplyRqstOccrnceTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstOccrnceTmgRptPrdUnt()==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(s.getSpplyRqstOccrnceTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : s.getSpplyRqstOccrnceTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplyrequest.getOccurrenceTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getCode().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdTxt() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlBooleanTyp() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				String[] arrayi1 = s.getSpplyRqstPrmtrVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { supplyrequest.getParameter().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getParameter().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlQnty_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntySys() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyUnt() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyVl() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiUnt() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiVl() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwUnt() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwVl() != null ) {

			String[] arrayi0 = s.getSpplyRqstPrmtrVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getParameter().size() < i0+1) { supplyrequest.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getParameter().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SpplyRqst_Priority ********************************************************************************/
		if(s.getSpplyRqstPriority() != null ) {

			if(s.getSpplyRqstPriority().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstPriority()==null) {} else {
			supplyrequest.setPriority(new org.hl7.fhir.r4.model.SupplyRequest.RequestPriorityEnumFactory().fromCode(s.getSpplyRqstPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_Qnty_Cd ********************************************************************************/
		if(s.getSpplyRqstQntyCd() != null ) {

			if(s.getSpplyRqstQntyCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstQntyCd()==null) {} else {
			supplyrequest.getQuantity().setCode(s.getSpplyRqstQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_Qnty_Cmprtr ********************************************************************************/
		if(s.getSpplyRqstQntyCmprtr() != null ) {

			if(s.getSpplyRqstQntyCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstQntyCmprtr()==null) {} else {
			supplyrequest.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyRqstQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_Qnty_Sys ********************************************************************************/
		if(s.getSpplyRqstQntySys() != null ) {

			if(s.getSpplyRqstQntySys().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstQntySys()==null) {} else {
			supplyrequest.getQuantity().setSystem(s.getSpplyRqstQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_Qnty_Unt ********************************************************************************/
		if(s.getSpplyRqstQntyUnt() != null ) {

			if(s.getSpplyRqstQntyUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstQntyUnt()==null) {} else {
			supplyrequest.getQuantity().setUnit(s.getSpplyRqstQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyRqst_Qnty_Vl ********************************************************************************/
		if(s.getSpplyRqstQntyVl() != null ) {

			if(s.getSpplyRqstQntyVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstQntyVl()==null) {} else {
			supplyrequest.getQuantity().setValue((new java.math.BigDecimal((s.getSpplyRqstQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getReasonCode().size() < i0+1) { supplyrequest.addReasonCode(); }
				String[] arrayi1 = s.getSpplyRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { supplyrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getReasonCode().size() < i0+1) { supplyrequest.addReasonCode(); }
				String[] arrayi1 = s.getSpplyRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { supplyrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getReasonCode().size() < i0+1) { supplyrequest.addReasonCode(); }
				String[] arrayi1 = s.getSpplyRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { supplyrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getReasonCode().size() < i0+1) { supplyrequest.addReasonCode(); }
				String[] arrayi1 = s.getSpplyRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { supplyrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpplyRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getReasonCode().size() < i0+1) { supplyrequest.addReasonCode(); }
				String[] arrayi1 = s.getSpplyRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplyrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { supplyrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplyrequest.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyRqst_RsnCd_Txt ********************************************************************************/
		if(s.getSpplyRqstRsnCdTxt() != null ) {

			String[] arrayi0 = s.getSpplyRqstRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplyrequest.getReasonCode().size() < i0+1) { supplyrequest.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplyrequest.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyRqst_RsnRfrnc ********************************************************************************/
		if(s.getSpplyRqstRsnRfrnc() != null ) {

				for( String currListStrSplit : s.getSpplyRqstRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplyrequest.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SpplyRqst_Rqster ********************************************************************************/
		if(s.getSpplyRqstRqster() != null ) {

			if(s.getSpplyRqstRqster().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstRqster()==null) {} else {
			supplyrequest.setRequester(new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstRqster().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_Sts ********************************************************************************/
		if(s.getSpplyRqstSts() != null ) {

			if(s.getSpplyRqstSts().replace("[","").replace("]","").equals("NULL") | s.getSpplyRqstSts()==null) {} else {
			supplyrequest.setStatus(new org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestStatusEnumFactory().fromCode(s.getSpplyRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyRqst_Supplier ********************************************************************************/
		if(s.getSpplyRqstSupplier() != null ) {

				for( String currListStrSplit : s.getSpplyRqstSupplier().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplyrequest.addSupplier(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return supplyrequest;
	}
}
