package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Location;
public class LocationConversion 
{
	public org.hl7.fhir.r4.model.Location Locations(Location l) throws ParseException
	{
		org.hl7.fhir.r4.model.Location location = new org.hl7.fhir.r4.model.Location();

		/******************** id ********************************************************************************/
		location.setId(l.getId());

		/******************** Lctn_Addr_City ********************************************************************************/
		if(l.getLctnAddrCity() != null ) {

			if(l.getLctnAddrCity().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrCity()==null) {} else {
			location.getAddress().setCity(l.getLctnAddrCity().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Addr_Cntry ********************************************************************************/
		if(l.getLctnAddrCntry() != null ) {

			if(l.getLctnAddrCntry().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrCntry()==null) {} else {
			location.getAddress().setCountry(l.getLctnAddrCntry().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Addr_District ********************************************************************************/
		if(l.getLctnAddrDistrict() != null ) {

			if(l.getLctnAddrDistrict().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrDistrict()==null) {} else {
			location.getAddress().setDistrict(l.getLctnAddrDistrict().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Addr_Line ********************************************************************************/
		if(l.getLctnAddrLine() != null ) {

				for( String currListStrSplit : l.getLctnAddrLine().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			location.getAddress().addLine(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Lctn_Addr_Prd_End ********************************************************************************/
		if(l.getLctnAddrPrdEnd() != null ) {

			if(l.getLctnAddrPrdEnd().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrPrdEnd()==null) {} else {
			location.getAddress().getPeriod().setEnd(l.getLctnAddrPrdEnd().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLctnAddrPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Addr_Prd_Strt ********************************************************************************/
		if(l.getLctnAddrPrdStrt() != null ) {

			if(l.getLctnAddrPrdStrt().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrPrdStrt()==null) {} else {
			location.getAddress().getPeriod().setStart(l.getLctnAddrPrdStrt().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLctnAddrPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Addr_PostalCd ********************************************************************************/
		if(l.getLctnAddrPostalCd() != null ) {

			if(l.getLctnAddrPostalCd().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrPostalCd()==null) {} else {
			location.getAddress().setPostalCode(l.getLctnAddrPostalCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Addr_State ********************************************************************************/
		if(l.getLctnAddrState() != null ) {

			if(l.getLctnAddrState().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrState()==null) {} else {
			location.getAddress().setState(l.getLctnAddrState().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Addr_Txt ********************************************************************************/
		if(l.getLctnAddrTxt() != null ) {

			if(l.getLctnAddrTxt().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrTxt()==null) {} else {
			location.getAddress().setText(l.getLctnAddrTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Addr_Typ ********************************************************************************/
		if(l.getLctnAddrTyp() != null ) {

			if(l.getLctnAddrTyp().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrTyp()==null) {} else {
			location.getAddress().setType(new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory().fromCode(l.getLctnAddrTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Addr_Use ********************************************************************************/
		if(l.getLctnAddrUse() != null ) {

			if(l.getLctnAddrUse().replace("[","").replace("]","").equals("NULL") | l.getLctnAddrUse()==null) {} else {
			location.getAddress().setUse(new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory().fromCode(l.getLctnAddrUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Alias ********************************************************************************/
		if(l.getLctnAlias() != null ) {

				for( String currListStrSplit : l.getLctnAlias().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			location.addAlias(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Lctn_AvailabilityExceptions ********************************************************************************/
		if(l.getLctnAvailabilityExceptions() != null ) {

			if(l.getLctnAvailabilityExceptions().replace("[","").replace("]","").equals("NULL") | l.getLctnAvailabilityExceptions()==null) {} else {
			location.setAvailabilityExceptions(l.getLctnAvailabilityExceptions().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Dscrptn ********************************************************************************/
		if(l.getLctnDscrptn() != null ) {

			if(l.getLctnDscrptn().replace("[","").replace("]","").equals("NULL") | l.getLctnDscrptn()==null) {} else {
			location.setDescription(l.getLctnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Endpoint ********************************************************************************/
		if(l.getLctnEndpoint() != null ) {

				for( String currListStrSplit : l.getLctnEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			location.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Lctn_HoursOfOprtn_AllDay ********************************************************************************/
		if(l.getLctnHoursOfOprtnAllDay() != null ) {

			String[] arrayi0 = l.getLctnHoursOfOprtnAllDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getHoursOfOperation().size() < i0+1) { location.addHoursOfOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getHoursOfOperation().get(i0).setAllDay(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_HoursOfOprtn_ClosingTime ********************************************************************************/
		if(l.getLctnHoursOfOprtnClosingTime() != null ) {

			String[] arrayi0 = l.getLctnHoursOfOprtnClosingTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getHoursOfOperation().size() < i0+1) { location.addHoursOfOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getHoursOfOperation().get(i0).setClosingTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_HoursOfOprtn_OpeningTime ********************************************************************************/
		if(l.getLctnHoursOfOprtnOpeningTime() != null ) {

			String[] arrayi0 = l.getLctnHoursOfOprtnOpeningTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getHoursOfOperation().size() < i0+1) { location.addHoursOfOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getHoursOfOperation().get(i0).setOpeningTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_Id_Assigner ********************************************************************************/
		if(l.getLctnIdAssigner() != null ) {

			String[] arrayi0 = l.getLctnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Id_Prd_End ********************************************************************************/
		if(l.getLctnIdPrdEnd() != null ) {

			String[] arrayi0 = l.getLctnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Id_Prd_Strt ********************************************************************************/
		if(l.getLctnIdPrdStrt() != null ) {

			String[] arrayi0 = l.getLctnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Id_Sys ********************************************************************************/
		if(l.getLctnIdSys() != null ) {

			String[] arrayi0 = l.getLctnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLctnIdTypCdgCd() != null ) {

			String[] arrayi0 = l.getLctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				String[] arrayi1 = l.getLctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { location.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLctnIdTypCdgDsply() != null ) {

			String[] arrayi0 = l.getLctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				String[] arrayi1 = l.getLctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { location.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLctnIdTypCdgSys() != null ) {

			String[] arrayi0 = l.getLctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				String[] arrayi1 = l.getLctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { location.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLctnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				String[] arrayi1 = l.getLctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { location.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Lctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLctnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = l.getLctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				String[] arrayi1 = l.getLctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { location.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Id_Typ_Txt ********************************************************************************/
		if(l.getLctnIdTypTxt() != null ) {

			String[] arrayi0 = l.getLctnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_Id_Use ********************************************************************************/
		if(l.getLctnIdUse() != null ) {

			String[] arrayi0 = l.getLctnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Id_Vl ********************************************************************************/
		if(l.getLctnIdVl() != null ) {

			String[] arrayi0 = l.getLctnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getIdentifier().size() < i0+1) { location.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_ManagingOrgnztn ********************************************************************************/
		if(l.getLctnManagingOrgnztn() != null ) {

			if(l.getLctnManagingOrgnztn().replace("[","").replace("]","").equals("NULL") | l.getLctnManagingOrgnztn()==null) {} else {
			location.setManagingOrganization(new org.hl7.fhir.r4.model.Reference(l.getLctnManagingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Mode ********************************************************************************/
		if(l.getLctnMode() != null ) {

			if(l.getLctnMode().replace("[","").replace("]","").equals("NULL") | l.getLctnMode()==null) {} else {
			location.setMode(new org.hl7.fhir.r4.model.Location.LocationModeEnumFactory().fromCode(l.getLctnMode().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Nm ********************************************************************************/
		if(l.getLctnNm() != null ) {

			if(l.getLctnNm().replace("[","").replace("]","").equals("NULL") | l.getLctnNm()==null) {} else {
			location.setName(l.getLctnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_OprtnalSts_Cd ********************************************************************************/
		if(l.getLctnOprtnalStsCd() != null ) {

			if(l.getLctnOprtnalStsCd().replace("[","").replace("]","").equals("NULL") | l.getLctnOprtnalStsCd()==null) {} else {
			location.getOperationalStatus().setCode(l.getLctnOprtnalStsCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_OprtnalSts_Dsply ********************************************************************************/
		if(l.getLctnOprtnalStsDsply() != null ) {

			if(l.getLctnOprtnalStsDsply().replace("[","").replace("]","").equals("NULL") | l.getLctnOprtnalStsDsply()==null) {} else {
			location.getOperationalStatus().setDisplay(l.getLctnOprtnalStsDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_OprtnalSts_Sys ********************************************************************************/
		if(l.getLctnOprtnalStsSys() != null ) {

			if(l.getLctnOprtnalStsSys().replace("[","").replace("]","").equals("NULL") | l.getLctnOprtnalStsSys()==null) {} else {
			location.getOperationalStatus().setSystem(l.getLctnOprtnalStsSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_OprtnalSts_UsrSltd ********************************************************************************/
		if(l.getLctnOprtnalStsUsrSltd() != null ) {

			if(l.getLctnOprtnalStsUsrSltd().replace("[","").replace("]","").equals("NULL") | l.getLctnOprtnalStsUsrSltd()==null) {} else {
			location.getOperationalStatus().setUserSelected(Boolean.parseBoolean(l.getLctnOprtnalStsUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_OprtnalSts_Vrsn ********************************************************************************/
		if(l.getLctnOprtnalStsVrsn() != null ) {

			if(l.getLctnOprtnalStsVrsn().replace("[","").replace("]","").equals("NULL") | l.getLctnOprtnalStsVrsn()==null) {} else {
			location.getOperationalStatus().setVersion(l.getLctnOprtnalStsVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_PartOf ********************************************************************************/
		if(l.getLctnPartOf() != null ) {

			if(l.getLctnPartOf().replace("[","").replace("]","").equals("NULL") | l.getLctnPartOf()==null) {} else {
			location.setPartOf(new org.hl7.fhir.r4.model.Reference(l.getLctnPartOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_PhysclTyp_Cdg_Cd ********************************************************************************/
		if(l.getLctnPhysclTypCdgCd() != null ) {

			String[] arrayi0 = l.getLctnPhysclTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getPhysicalType().getCoding().size() < i0+1) { location.getPhysicalType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getPhysicalType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_PhysclTyp_Cdg_Dsply ********************************************************************************/
		if(l.getLctnPhysclTypCdgDsply() != null ) {

			String[] arrayi0 = l.getLctnPhysclTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getPhysicalType().getCoding().size() < i0+1) { location.getPhysicalType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getPhysicalType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_PhysclTyp_Cdg_Sys ********************************************************************************/
		if(l.getLctnPhysclTypCdgSys() != null ) {

			String[] arrayi0 = l.getLctnPhysclTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getPhysicalType().getCoding().size() < i0+1) { location.getPhysicalType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getPhysicalType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_PhysclTyp_Cdg_UsrSltd ********************************************************************************/
		if(l.getLctnPhysclTypCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLctnPhysclTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getPhysicalType().getCoding().size() < i0+1) { location.getPhysicalType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getPhysicalType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_PhysclTyp_Cdg_Vrsn ********************************************************************************/
		if(l.getLctnPhysclTypCdgVrsn() != null ) {

			String[] arrayi0 = l.getLctnPhysclTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getPhysicalType().getCoding().size() < i0+1) { location.getPhysicalType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getPhysicalType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_PhysclTyp_Txt ********************************************************************************/
		if(l.getLctnPhysclTypTxt() != null ) {

			if(l.getLctnPhysclTypTxt().replace("[","").replace("]","").equals("NULL") | l.getLctnPhysclTypTxt()==null) {} else {
			location.getPhysicalType().setText(l.getLctnPhysclTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Lctn_Position_Altitude ********************************************************************************/
		if(l.getLctnPositionAltitude() != null ) {

			if(l.getLctnPositionAltitude().replace("[","").replace("]","").equals("NULL") | l.getLctnPositionAltitude()==null) {} else {
			location.getPosition().setAltitude((new java.math.BigDecimal((l.getLctnPositionAltitude().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Lctn_Position_Latitude ********************************************************************************/
		if(l.getLctnPositionLatitude() != null ) {

			if(l.getLctnPositionLatitude().replace("[","").replace("]","").equals("NULL") | l.getLctnPositionLatitude()==null) {} else {
			location.getPosition().setLatitude((Double.parseDouble((l.getLctnPositionLatitude().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Lctn_Position_Longitude ********************************************************************************/
		if(l.getLctnPositionLongitude() != null ) {

			if(l.getLctnPositionLongitude().replace("[","").replace("]","").equals("NULL") | l.getLctnPositionLongitude()==null) {} else {
			location.getPosition().setLongitude((new java.math.BigDecimal((l.getLctnPositionLongitude().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Lctn_Sts ********************************************************************************/
		if(l.getLctnSts() != null ) {

			if(l.getLctnSts().replace("[","").replace("]","").equals("NULL") | l.getLctnSts()==null) {} else {
			location.setStatus(new org.hl7.fhir.r4.model.Location.LocationStatusEnumFactory().fromCode(l.getLctnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Lctn_Tlcm_Prd_End ********************************************************************************/
		if(l.getLctnTlcmPrdEnd() != null ) {

			String[] arrayi0 = l.getLctnTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getTelecom().size() < i0+1) { location.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLctnTlcmPrdStrt() != null ) {

			String[] arrayi0 = l.getLctnTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getTelecom().size() < i0+1) { location.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Tlcm_Rnk ********************************************************************************/
		if(l.getLctnTlcmRnk() != null ) {

			String[] arrayi0 = l.getLctnTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getTelecom().size() < i0+1) { location.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Tlcm_Sys ********************************************************************************/
		if(l.getLctnTlcmSys() != null ) {

			String[] arrayi0 = l.getLctnTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getTelecom().size() < i0+1) { location.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Tlcm_Use ********************************************************************************/
		if(l.getLctnTlcmUse() != null ) {

			String[] arrayi0 = l.getLctnTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getTelecom().size() < i0+1) { location.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Lctn_Tlcm_Vl ********************************************************************************/
		if(l.getLctnTlcmVl() != null ) {

			String[] arrayi0 = l.getLctnTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getTelecom().size() < i0+1) { location.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Lctn_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLctnTypCdgCd() != null ) {

			String[] arrayi0 = l.getLctnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getType().size() < i0+1) { location.addType(); }
				String[] arrayi1 = l.getLctnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getType().get(i0).getCoding().size() < i1+1) { location.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLctnTypCdgDsply() != null ) {

			String[] arrayi0 = l.getLctnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getType().size() < i0+1) { location.addType(); }
				String[] arrayi1 = l.getLctnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getType().get(i0).getCoding().size() < i1+1) { location.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLctnTypCdgSys() != null ) {

			String[] arrayi0 = l.getLctnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getType().size() < i0+1) { location.addType(); }
				String[] arrayi1 = l.getLctnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getType().get(i0).getCoding().size() < i1+1) { location.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLctnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLctnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getType().size() < i0+1) { location.addType(); }
				String[] arrayi1 = l.getLctnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getType().get(i0).getCoding().size() < i1+1) { location.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Lctn_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLctnTypCdgVrsn() != null ) {

			String[] arrayi0 = l.getLctnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getType().size() < i0+1) { location.addType(); }
				String[] arrayi1 = l.getLctnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(location.getType().get(i0).getCoding().size() < i1+1) { location.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {location.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Lctn_Typ_Txt ********************************************************************************/
		if(l.getLctnTypTxt() != null ) {

			String[] arrayi0 = l.getLctnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(location.getType().size() < i0+1) { location.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {location.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return location;
	}
}
