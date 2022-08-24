package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyDelivery;
public class SupplyDeliveryConversion 
{
	public org.hl7.fhir.r4.model.SupplyDelivery SupplyDeliverys(SupplyDelivery s) throws ParseException
	{
		org.hl7.fhir.r4.model.SupplyDelivery supplydelivery = new org.hl7.fhir.r4.model.SupplyDelivery();

		/******************** id ********************************************************************************/
		supplydelivery.setId(s.getId());

		/******************** SpplyDlvry_BasedOn ********************************************************************************/
		if(s.getSpplyDlvryBasedOn() != null ) {

				for( String currListStrSplit : s.getSpplyDlvryBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplydelivery.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SpplyDlvry_Destination ********************************************************************************/
		if(s.getSpplyDlvryDestination() != null ) {

			if(s.getSpplyDlvryDestination().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryDestination()==null) {} else {
			supplydelivery.setDestination(new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryDestination().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_Id_Assigner ********************************************************************************/
		if(s.getSpplyDlvryIdAssigner() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_Id_Prd_End ********************************************************************************/
		if(s.getSpplyDlvryIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_Id_Prd_Strt ********************************************************************************/
		if(s.getSpplyDlvryIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_Id_Sys ********************************************************************************/
		if(s.getSpplyDlvryIdSys() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				String[] arrayi1 = s.getSpplyDlvryIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplydelivery.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplydelivery.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplydelivery.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				String[] arrayi1 = s.getSpplyDlvryIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplydelivery.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplydelivery.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplydelivery.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				String[] arrayi1 = s.getSpplyDlvryIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplydelivery.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplydelivery.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplydelivery.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyDlvry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				String[] arrayi1 = s.getSpplyDlvryIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplydelivery.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplydelivery.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplydelivery.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				String[] arrayi1 = s.getSpplyDlvryIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(supplydelivery.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { supplydelivery.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {supplydelivery.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SpplyDlvry_Id_Typ_Txt ********************************************************************************/
		if(s.getSpplyDlvryIdTypTxt() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_Id_Use ********************************************************************************/
		if(s.getSpplyDlvryIdUse() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_Id_Vl ********************************************************************************/
		if(s.getSpplyDlvryIdVl() != null ) {

			String[] arrayi0 = s.getSpplyDlvryIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getIdentifier().size() < i0+1) { supplydelivery.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_OccrnceDtTimeTyp ********************************************************************************/
		if(s.getSpplyDlvryOccrnceDtTimeTyp() != null ) {

			if(s.getSpplyDlvryOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceDtTimeTyp()==null) {} else {
			supplydelivery.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(s.getSpplyDlvryOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrncePrd_End ********************************************************************************/
		if(s.getSpplyDlvryOccrncePrdEnd() != null ) {

			if(s.getSpplyDlvryOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrncePrdEnd()==null) {} else {
			supplydelivery.getOccurrencePeriod().setEnd(s.getSpplyDlvryOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyDlvryOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrncePrd_Strt ********************************************************************************/
		if(s.getSpplyDlvryOccrncePrdStrt() != null ) {

			if(s.getSpplyDlvryOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrncePrdStrt()==null) {} else {
			supplydelivery.getOccurrencePeriod().setStart(s.getSpplyDlvryOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyDlvryOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplydelivery.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getOccurrenceTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyDlvryOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplydelivery.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getOccurrenceTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyDlvryOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplydelivery.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getOccurrenceTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplydelivery.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getOccurrenceTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyDlvryOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { supplydelivery.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getOccurrenceTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdTxt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgCdTxt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgCdTxt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getCode().setText(s.getSpplyDlvryOccrnceTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Evnt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgEvnt() != null ) {

				for( String currListStrSplit : s.getSpplyDlvryOccrnceTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplydelivery.getOccurrenceTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsDurationCd() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsDurationCd()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsDuration().setCode(s.getSpplyDlvryOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsDurationCmprtr() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsDurationCmprtr()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyDlvryOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsDurationSys() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsDurationSys()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsDuration().setSystem(s.getSpplyDlvryOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsDurationUnt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsDurationUnt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsDuration().setUnit(s.getSpplyDlvryOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsDurationVl() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsDurationVl()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((s.getSpplyDlvryOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsPeriod().setEnd(s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsPeriod().setStart(s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCd() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngHiCd()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setCode(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiSys() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngHiSys()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setSystem(s.getSpplyDlvryOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiUnt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngHiUnt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setUnit(s.getSpplyDlvryOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiVl() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngHiVl()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((s.getSpplyDlvryOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCd() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngLwCd()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setCode(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwSys() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngLwSys()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setSystem(s.getSpplyDlvryOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwUnt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngLwUnt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setUnit(s.getSpplyDlvryOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwVl() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptBndsRngLwVl()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((s.getSpplyDlvryOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptCnt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptCnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptCnt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setCount(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptCntMx() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptCntMx()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setCountMax(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptDuration() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptDuration().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptDuration()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setDuration((Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptDurationMx() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptDurationMx()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setDurationMax((Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_DurationUnt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptDurationUnt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptDurationUnt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(s.getSpplyDlvryOccrnceTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptFrqncy() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptFrqncy()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setFrequency(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptFrqncyMx() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptFrqncyMx()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setFrequencyMax(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptOff() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptOff().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptOff()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setOffset(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptPrd() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptPrd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptPrd()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setPeriod((new java.math.BigDecimal((s.getSpplyDlvryOccrnceTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptPrdMx() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptPrdMx()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((s.getSpplyDlvryOccrnceTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_PrdUnt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptPrdUnt() != null ) {

			if(s.getSpplyDlvryOccrnceTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryOccrnceTmgRptPrdUnt()==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(s.getSpplyDlvryOccrnceTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : s.getSpplyDlvryOccrnceTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplydelivery.getOccurrenceTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SpplyDlvry_PartOf ********************************************************************************/
		if(s.getSpplyDlvryPartOf() != null ) {

				for( String currListStrSplit : s.getSpplyDlvryPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplydelivery.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SpplyDlvry_Pnt ********************************************************************************/
		if(s.getSpplyDlvryPnt() != null ) {

			if(s.getSpplyDlvryPnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryPnt()==null) {} else {
			supplydelivery.setPatient(new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_Receiver ********************************************************************************/
		if(s.getSpplyDlvryReceiver() != null ) {

				for( String currListStrSplit : s.getSpplyDlvryReceiver().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			supplydelivery.addReceiver(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** SpplyDlvry_Sts ********************************************************************************/
		if(s.getSpplyDlvrySts() != null ) {

			if(s.getSpplyDlvrySts().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySts()==null) {} else {
			supplydelivery.setStatus(new org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliveryStatusEnumFactory().fromCode(s.getSpplyDlvrySts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().size() < i0+1) { supplydelivery.getSuppliedItem().getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().size() < i0+1) { supplydelivery.getSuppliedItem().getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().size() < i0+1) { supplydelivery.getSuppliedItem().getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().size() < i0+1) { supplydelivery.getSuppliedItem().getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().size() < i0+1) { supplydelivery.getSuppliedItem().getItemCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getSuppliedItem().getItemCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptTxt() != null ) {

			if(s.getSpplyDlvrySuppliedItmItmCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmItmCdbleCncptTxt()==null) {} else {
			supplydelivery.getSuppliedItem().getItemCodeableConcept().setText(s.getSpplyDlvrySuppliedItmItmCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_ItmRfrnc ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmRfrnc() != null ) {

			if(s.getSpplyDlvrySuppliedItmItmRfrnc().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmItmRfrnc()==null) {} else {
			supplydelivery.getSuppliedItem().setItem(new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvrySuppliedItmItmRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Cd ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyCd() != null ) {

			if(s.getSpplyDlvrySuppliedItmQntyCd().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmQntyCd()==null) {} else {
			supplydelivery.getSuppliedItem().getQuantity().setCode(s.getSpplyDlvrySuppliedItmQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Cmprtr ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyCmprtr() != null ) {

			if(s.getSpplyDlvrySuppliedItmQntyCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmQntyCmprtr()==null) {} else {
			supplydelivery.getSuppliedItem().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpplyDlvrySuppliedItmQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Sys ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntySys() != null ) {

			if(s.getSpplyDlvrySuppliedItmQntySys().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmQntySys()==null) {} else {
			supplydelivery.getSuppliedItem().getQuantity().setSystem(s.getSpplyDlvrySuppliedItmQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Unt ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyUnt() != null ) {

			if(s.getSpplyDlvrySuppliedItmQntyUnt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmQntyUnt()==null) {} else {
			supplydelivery.getSuppliedItem().getQuantity().setUnit(s.getSpplyDlvrySuppliedItmQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Vl ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyVl() != null ) {

			if(s.getSpplyDlvrySuppliedItmQntyVl().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySuppliedItmQntyVl()==null) {} else {
			supplydelivery.getSuppliedItem().getQuantity().setValue((new java.math.BigDecimal((s.getSpplyDlvrySuppliedItmQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** SpplyDlvry_Supplier ********************************************************************************/
		if(s.getSpplyDlvrySupplier() != null ) {

			if(s.getSpplyDlvrySupplier().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvrySupplier()==null) {} else {
			supplydelivery.setSupplier(new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvrySupplier().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SpplyDlvry_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvryTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getType().getCoding().size() < i0+1) { supplydelivery.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvryTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpplyDlvryTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getType().getCoding().size() < i0+1) { supplydelivery.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvryTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpplyDlvryTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getType().getCoding().size() < i0+1) { supplydelivery.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvryTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpplyDlvryTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getType().getCoding().size() < i0+1) { supplydelivery.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SpplyDlvry_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvryTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpplyDlvryTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(supplydelivery.getType().getCoding().size() < i0+1) { supplydelivery.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {supplydelivery.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SpplyDlvry_Typ_Txt ********************************************************************************/
		if(s.getSpplyDlvryTypTxt() != null ) {

			if(s.getSpplyDlvryTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSpplyDlvryTypTxt()==null) {} else {
			supplydelivery.getType().setText(s.getSpplyDlvryTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return supplydelivery;
	}
}
